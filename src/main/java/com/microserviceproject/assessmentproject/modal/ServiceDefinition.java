package com.microserviceproject.assessmentproject.modal;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import javax.management.Attribute;
import java.io.Serializable;
import java.util.List;


@Table("service_definition")
public class ServiceDefinition implements Serializable {

    @Id
    private String id;

    @Column("tenant_id")
    private String tenantId;

    private String code;

    @Column("is_active")
    private boolean isActive = true;

    @Column("attributes")
    private List<AttributeDefinition> attributes;

//    @Column("attributes")
//    @JsonInclude(JsonInclude.Include.NON_NULL)
//    private String attributes;


    @Column("audit_details")
    private AuditDetails auditDetails;

    @Column("additional_details")
    private String additionalDetails;

    @Column("client_id")
    private String clientId;

    public ServiceDefinition() {
    }

    public ServiceDefinition(String tenantId, String code, List<AttributeDefinition> attributes,
                             AuditDetails auditDetails, String additionalDetails, String clientId) {
        this.tenantId = tenantId;
        this.code = code;
        this.attributes = attributes;
        this.auditDetails = auditDetails;
        this.additionalDetails = additionalDetails;
        this.clientId = clientId;
    }

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

    public List<AttributeDefinition> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<AttributeDefinition> attributes) {
        this.attributes = attributes;
    }

    public AuditDetails getAuditDetails() {
        return auditDetails;
    }

    public void setAuditDetails(AuditDetails auditDetails) {
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
}
