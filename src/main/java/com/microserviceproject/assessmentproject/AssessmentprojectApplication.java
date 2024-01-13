package com.microserviceproject.assessmentproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class AssessmentprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(AssessmentprojectApplication.class, args);
	}

}
