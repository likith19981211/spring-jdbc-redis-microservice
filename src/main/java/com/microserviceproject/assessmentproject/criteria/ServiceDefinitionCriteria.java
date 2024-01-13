package com.microserviceproject.assessmentproject.criteria;

import java.util.List;

public class ServiceDefinitionCriteria {

    private String tenantId;
    private List<String> ids;
    private List<String> code;
    private String clientId;


    public ServiceDefinitionCriteria() {
    }

    public ServiceDefinitionCriteria(String tenantId, List<String> ids, List<String> code, String clientId) {
        this.tenantId = tenantId;
        this.ids = ids;
        this.code = code;
        this.clientId = clientId;
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

    public List<String> getCode() {
        return code;
    }

    public void setCode(List<String> code) {
        this.code = code;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }
}

