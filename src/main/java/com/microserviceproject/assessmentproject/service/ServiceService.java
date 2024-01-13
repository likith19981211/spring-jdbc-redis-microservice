package com.microserviceproject.assessmentproject.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.microserviceproject.assessmentproject.dto.ServiceDto;
import com.microserviceproject.assessmentproject.modal.ServiceDefinition;
import org.springframework.stereotype.Service;

@Service
public interface ServiceService {

//    com.microserviceproject.assessmentproject.modal.Service saveService(com.microserviceproject.assessmentproject.modal.Service service);

    ServiceDto getServiceById(String id);

    com.microserviceproject.assessmentproject.modal.Service saveService(com.microserviceproject.assessmentproject.modal.Service service) throws JsonProcessingException;

    //  public ResponseEntity saveServiceDefinition(ServiceDefinition serviceDefinition) throws IOException;

}

