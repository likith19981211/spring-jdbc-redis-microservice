package com.microserviceproject.assessmentproject.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.microserviceproject.assessmentproject.dto.ServiceDto;
import com.microserviceproject.assessmentproject.modal.Service;
import com.microserviceproject.assessmentproject.modal.ServiceDefinition;
import com.microserviceproject.assessmentproject.service.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/service/v1")
public class ServiceController {

    @Autowired
    private ServiceService serviceService;



    @PostMapping("/_create")
    public ResponseEntity<Service> saveService(@RequestBody Service service) throws JsonProcessingException {
        Service savedService = serviceService.saveService(service);
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(savedService);
    }

    @PostMapping("/_search/{id}")
    public ResponseEntity<ServiceDto> getService(@PathVariable String id) {
        ServiceDto service  = serviceService.getServiceById(id);

        if (service != null) {
            return ResponseEntity.status(HttpStatus.ACCEPTED).body(service);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }
}
