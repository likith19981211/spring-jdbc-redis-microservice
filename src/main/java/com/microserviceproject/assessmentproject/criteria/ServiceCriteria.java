package com.microserviceproject.assessmentproject.criteria;

import java.util.List;
import java.util.Map;

public class ServiceCriteria {

    private String tenantId;
    private List<String> ids;
    private List<String> serviceDefIds;
    private List<String> referenceIds;
    private String accountId;
    private String clientId;
    private Map<String, Object> value;

    // Constructors, getters, and setters

    public ServiceCriteria() {
        // Default constructor
    }

    public ServiceCriteria(String tenantId, List<String> ids, List<String> serviceDefIds, List<String> referenceIds,
                           String accountId, String clientId, Map<String, Object> value) {
        this.tenantId = tenantId;
        this.ids = ids;
        this.serviceDefIds = serviceDefIds;
        this.referenceIds = referenceIds;
        this.accountId = accountId;
        this.clientId = clientId;
        this.value = value;
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public List<String> getIds() {
        return ids;
    }

    public void setIds(List<String> ids) {
        this.ids = ids;
    }

    public List<String> getServiceDefIds() {
        return serviceDefIds;
    }

    public void setServiceDefIds(List<String> serviceDefIds) {
        this.serviceDefIds = serviceDefIds;
    }

    public List<String> getReferenceIds() {
        return referenceIds;
    }

    public void setReferenceIds(List<String> referenceIds) {
        this.referenceIds = referenceIds;
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

    public Map<String, Object> getValue() {
        return value;
    }

    public void setValue(Map<String, Object> value) {
        this.value = value;
    }
}

