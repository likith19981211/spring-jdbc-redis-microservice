package com.microserviceproject.assessmentproject.dto;

import com.microserviceproject.assessmentproject.modal.AttributeDefinition;
import com.microserviceproject.assessmentproject.modal.AuditDetails;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import javax.management.Attribute;
import java.io.Serializable;
import java.util.List;


public class ServiceDefinitionDto implements Serializable{

    @Id
    private String id;

    @Column("tenant_id")
    private String tenantId;

    private String code;

    @Column("is_active")
    private boolean isActive = true;

    @Column("attributes")
    private String attributes;

//    @Column("attributes")
//    @JsonInclude(JsonInclude.Include.NON_NULL)
//    private String attributes;


    @Column("audit_details")
    private String auditDetails;

    @Column("additional_details")
    private String additionalDetails;

    @Column("client_id")
    private String clientId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public String getAttributes() {
        return attributes;
    }

    public void setAttributes(String attributes) {
        this.attributes = attributes;
    }

    public String getAuditDetails() {
        return auditDetails;
    }

    public void setAuditDetails(String auditDetails) {
        this.auditDetails = auditDetails;
    }

    public String getAdditionalDetails() {
        return additionalDetails;
    }

    public void setAdditionalDetails(String additionalDetails) {
        this.additionalDetails = additionalDetails;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public ServiceDefinitionDto() {
    }

    public ServiceDefinitionDto(String tenantId, String code, String attributes,
                             String auditDetails, String additionalDetails, String clientId) {
        this.tenantId = tenantId;
        this.code = code;
        this.attributes = attributes;
        this.auditDetails = auditDetails;
        this.additionalDetails = additionalDetails;
        this.clientId = clientId;
    }

}
