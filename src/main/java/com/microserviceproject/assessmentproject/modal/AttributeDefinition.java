package com.microserviceproject.assessmentproject.modal;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.util.List;
import java.util.Map;

@Table("attribute_definition")
public class AttributeDefinition {

    @Id
    private String id;

    @Column("tenant_id")
    private String tenantId;

    private String code;

    @Column("data_type")
    private String dataType;

    private List<String> values;

    @Column("is_active")
    private boolean isActive = true;

    private boolean required;

    @Column("reg_ex")
    private String regEx;

    private String order;

    @Column("audit_details")
    private AuditDetails auditDetails;

    @Column("additional_details")
    private Map<String, Object> additionalDetails;

    public AttributeDefinition() {
    }

    public AttributeDefinition(String tenantId, String code, String dataType, List<String> values,
                               boolean isActive, boolean required, String regEx, String order,
                               AuditDetails auditDetails, Map<String, Object> additionalDetails) {
        this.tenantId = tenantId;
        this.code = code;
        this.dataType = dataType;
        this.values = values;
        this.isActive = isActive;
        this.required = required;
        this.regEx = regEx;
        this.order = order;
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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public List<String> getValues() {
        return values;
    }

    public void setValues(List<String> values) {
        this.values = values;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public boolean isRequired() {
        return required;
    }

    public void setRequired(boolean required) {
        this.required = required;
    }

    public String getRegEx() {
        return regEx;
    }

    public void setRegEx(String regEx) {
        this.regEx = regEx;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
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

