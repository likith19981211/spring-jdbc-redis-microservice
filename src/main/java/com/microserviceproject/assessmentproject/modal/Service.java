package com.microserviceproject.assessmentproject.modal;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

@Table("service")
public class Service implements Serializable {

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

    private List<AttributeValue> attributes;

    @Column("audit_details")
    private AuditDetails auditDetails;

    @Column("additional_details")
    private Map<String, Object> additionalDetails;

    public Service() {
    }

    public Service(String tenantId, String serviceDefId, String referenceId, String accountId, String clientId,
                   List<AttributeValue> attributes, AuditDetails auditDetails, Map<String, Object> additionalDetails) {
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

    public List<AttributeValue> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<AttributeValue> attributes) {
        this.attributes = attributes;
    }

    public AuditDetails getAuditDetails() {
        return auditDetails;
    }

    public void setAuditDetails(AuditDetails auditDetails) {
        this.auditDetails = auditDetails;
    }

    public Map<String, Object> getAdditionalDetails() {
        return additionalDetails;
    }

    public void setAdditionalDetails(Map<String, Object> additionalDetails) {
        this.additionalDetails = additionalDetails;
    }
}

