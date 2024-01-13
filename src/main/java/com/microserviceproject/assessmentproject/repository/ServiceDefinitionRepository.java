package com.microserviceproject.assessmentproject.repository;

import com.microserviceproject.assessmentproject.modal.ServiceDefinition;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceDefinitionRepository extends CrudRepository<ServiceDefinition, String> {
    //ServiceDefinition saveServiceDefinition(ServiceDefinition serviceDefinition);

    @Query("Select * from service_definition where id = :id")
    ServiceDefinition findServiceDefinitionById(String id);
}
