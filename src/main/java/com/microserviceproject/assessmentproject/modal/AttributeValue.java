package com.microserviceproject.assessmentproject.modal;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.util.Map;

@Table("attribute_value")
public class AttributeValue {

    @Id
    private String id;

    @Column("attribute_code")
    private String attributeCode;

    private Object value;

    @Column("audit_details")
    private AuditDetails auditDetails;

    @Column("additional_details")
    private Map<String, Object> additionalDetails;

    public AttributeValue() {
    }

    public AttributeValue(String attributeCode, Object value, AuditDetails auditDetails,
                          Map<String, Object> additionalDetails) {
        this.attributeCode = attributeCode;
        this.value = value;
        this.auditDetails = auditDetails;
        this.additionalDetails = additionalDetails;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAttributeCode() {
        return attributeCode;
    }

    public void setAttributeCode(String attributeCode) {
        this.attributeCode = attributeCode;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
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

