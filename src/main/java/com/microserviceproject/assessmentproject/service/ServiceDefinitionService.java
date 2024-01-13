package com.microserviceproject.assessmentproject.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.microserviceproject.assessmentproject.dto.ServiceDefinitionDto;
import com.microserviceproject.assessmentproject.modal.ServiceDefinition;
import org.springframework.stereotype.Service;

@Service
public interface ServiceDefinitionService {

    ServiceDefinition saveServiceDefinition(ServiceDefinition serviceDefinition) throws JsonProcessingException;

    ServiceDefinitionDto getServiceDefinitionById(String id);

  //  public ResponseEntity saveServiceDefinition(ServiceDefinition serviceDefinition) throws IOException;

}
