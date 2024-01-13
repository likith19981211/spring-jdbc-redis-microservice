package com.microserviceproject.assessmentproject.service.serviceimpl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.microserviceproject.assessmentproject.dto.ServiceDefinitionDto;
import com.microserviceproject.assessmentproject.exception.ServiceDefinitionNotFoundException;
import com.microserviceproject.assessmentproject.exception.ServiceNotFoundException;
import com.microserviceproject.assessmentproject.modal.AuditDetails;
import com.microserviceproject.assessmentproject.modal.ServiceDefinition;
import com.microserviceproject.assessmentproject.repository.ServiceDefinitionRepository;
import com.microserviceproject.assessmentproject.response.AdditionalDetailsResponse;
import com.microserviceproject.assessmentproject.service.ServiceDefinitionService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.web.reactive.function.client.WebClient;

@Repository
public class ServiceDefinitionServiceImpl implements ServiceDefinitionService {

    @Autowired
    private ServiceDefinitionRepository serviceDefinitionRepository;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private ModelMapper mapper;

    @Autowired
    private WebClient webClient;

    public ServiceDefinitionServiceImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    @Override
    public ServiceDefinition saveServiceDefinition(ServiceDefinition serviceDefinition) throws JsonProcessingException {
        try {
            String sql = "INSERT INTO service_definition (id, tenant_id, code, is_active, client_id, additional_details, attributes, audit_details ) values (?, ?, ?,?,?, ?, ?, ?)";
            ObjectMapper mapper = new ObjectMapper();
            String auditDetailsJson = mapper.writeValueAsString(serviceDefinition.getAuditDetails());
            String attributesJson = mapper.writeValueAsString(serviceDefinition.getAttributes());

            AdditionalDetailsResponse addDetails = webClient.get().uri("/users?size=1")
                    .retrieve()
                    .bodyToMono(AdditionalDetailsResponse.class)
                    .block();
            String addressData = addDetails.getAddress().toString();
            String additionalDetailsData = mapper.writeValueAsString(addDetails.getAddress());
            System.out.println(addressData);
            jdbcTemplate.update(sql, serviceDefinition.getId(),serviceDefinition.getTenantId(),
                    serviceDefinition.getCode(),
                    serviceDefinition.isActive(), serviceDefinition.getClientId(),
                    additionalDetailsData, attributesJson, auditDetailsJson
            );
            return null;
        }catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    @Override
    @Cacheable(value = "ServiceDefinition", key = "#id")
    public ServiceDefinitionDto getServiceDefinitionById(String id) {

        String sql = "SELECT * FROM service_definition WHERE id = ?";

        try {
            return jdbcTemplate.queryForObject(sql, new Object[]{id}, new BeanPropertyRowMapper<>(ServiceDefinitionDto.class));
        } catch (EmptyResultDataAccessException e) {
            throw new ServiceDefinitionNotFoundException("Service Definition Not Found");

        }
    }
}

