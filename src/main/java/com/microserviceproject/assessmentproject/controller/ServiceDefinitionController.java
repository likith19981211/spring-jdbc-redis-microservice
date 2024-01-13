package com.microserviceproject.assessmentproject.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.microserviceproject.assessmentproject.dto.ServiceDefinitionDto;
import com.microserviceproject.assessmentproject.modal.ServiceDefinition;
import com.microserviceproject.assessmentproject.repository.ServiceDefinitionRepository;
import com.microserviceproject.assessmentproject.service.ServiceDefinitionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/service/definition/v1")
public class ServiceDefinitionController {

    private final ServiceDefinitionRepository serviceDefinitionRepository;

    private final JdbcTemplate jdbcTemplate;

    private final ServiceDefinitionService serviceDefinitionService;

    public ServiceDefinitionController(ServiceDefinitionRepository serviceDefinitionRepository, JdbcTemplate jdbcTemplate, ServiceDefinitionService serviceDefinitionService) {
        this.serviceDefinitionRepository = serviceDefinitionRepository;
        this.jdbcTemplate = jdbcTemplate;
        this.serviceDefinitionService = serviceDefinitionService;
    }

    @PostMapping("/_create")
    public ResponseEntity<ServiceDefinition> saveServiceDefinition(@RequestBody ServiceDefinition serviceDefinition) throws JsonProcessingException {
        ServiceDefinition savedDefinition = serviceDefinitionService.saveServiceDefinition(serviceDefinition);
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(savedDefinition);
    }

    @PostMapping("/_search/{id}")
    public ResponseEntity<ServiceDefinitionDto> getServiceDefinition(@PathVariable String id) {
        ServiceDefinitionDto foundDefinition = serviceDefinitionService.getServiceDefinitionById(id);

        if (foundDefinition != null) {
            return ResponseEntity.status(HttpStatus.ACCEPTED).body(foundDefinition);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

}
