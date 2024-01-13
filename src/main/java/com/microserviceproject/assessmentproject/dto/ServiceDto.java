package com.microserviceproject.assessmentproject.dto;

import com.microserviceproject.assessmentproject.modal.AttributeValue;
import com.microserviceproject.assessmentproject.modal.AuditDetails;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class ServiceDto implements Serializable {

    @Id
    private String id;

    @Column("tenant_id")
    private String tenantId;

    @Column("service_def_id")
    private String serviceDefId;

    @Column("reference_id")
    private String referenceId;

    @Column("account_id")
    private String accountId;

    @Column("client_id")
    private String clientId;

    private String attributes;

    @Column("audit_details")
    private String auditDetails;

    @Column("additional_details")
    private String additionalDetails;

    public ServiceDto() {
    }

    public ServiceDto(String tenantId, String serviceDefId, String referenceId, String accountId, String clientId,
                   String attributes, String auditDetails, String additionalDetails) {
        this.tenantId = tenantId;
        this.serviceDefId = serviceDefId;
        this.referenceId = referenceId;
        this.accountId = accountId;
        this.clientId = clientId;
        this.attributes = attributes;
        this.auditDetails = auditDetails;
        this.additionalDetails = additionalDetails;
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

    public String getServiceDefId() {
        return serviceDefId;
    }

    public void setServiceDefId(String serviceDefId) {
        this.serviceDefId = serviceDefId;
    }

    public String getReferenceId() {
        return referenceId;
    }

    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
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
}


