package com.microserviceproject.assessmentproject.repository;

import com.microserviceproject.assessmentproject.modal.Service;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceRepository extends CrudRepository<Service, String> {
}
