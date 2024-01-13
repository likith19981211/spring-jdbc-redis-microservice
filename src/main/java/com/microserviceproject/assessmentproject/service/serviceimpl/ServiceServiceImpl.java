package com.microserviceproject.assessmentproject.service.serviceimpl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.microserviceproject.assessmentproject.dto.ServiceDto;
import com.microserviceproject.assessmentproject.exception.ServiceNotFoundException;
import com.microserviceproject.assessmentproject.modal.Service;
import com.microserviceproject.assessmentproject.repository.ServiceRepository;
import com.microserviceproject.assessmentproject.service.ServiceService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.web.reactive.function.client.WebClient;

@Repository
public class ServiceServiceImpl implements ServiceService {

    @Autowired
    private ServiceRepository serviceRepository;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private ModelMapper mapper;

    @Autowired
    private WebClient webClient;

    public ServiceServiceImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    @Override
    public Service saveService(Service service) throws JsonProcessingException {
        try {
            String sql = "INSERT INTO service (id, tenantid, servicedefid, referenceid, accountid, clientid, attributes, auditdetails, additionaldetails) values (?, ?, ?,?,?, ?, ?, ?,?)";
            ObjectMapper mapper = new ObjectMapper();
            String auditDetailsJson = mapper.writeValueAsString(service.getAuditDetails());
            String attributesJson = mapper.writeValueAsString(service.getAttributes());
            String additionalDetailsJson = mapper.writeValueAsString(service.getAdditionalDetails());
            System.out.println(attributesJson);
            jdbcTemplate.update(sql, service.getId(),service.getTenantId(),
                    service.getServiceDefId(),
                    service.getReferenceId(), service.getAccountId(), service.getClientId(),
                    attributesJson, auditDetailsJson,additionalDetailsJson
            );
            return null;
        }catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    @Override
    @Cacheable(value = "Service", key = "#id")
    public ServiceDto getServiceById(String id) {
        String sql = "SELECT * FROM service WHERE id = ?";
        try {
            return jdbcTemplate.queryForObject(sql, new Object[]{id}, new BeanPropertyRowMapper<>(ServiceDto.class));
        } catch (EmptyResultDataAccessException e) {
             throw new ServiceNotFoundException("Service Not Found");
        }
    }


}

