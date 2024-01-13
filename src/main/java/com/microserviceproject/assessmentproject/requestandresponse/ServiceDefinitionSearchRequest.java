package com.microserviceproject.assessmentproject.requestandresponse;


import com.microserviceproject.assessmentproject.criteria.ServiceDefinitionCriteria;
import com.microserviceproject.assessmentproject.modal.Pagination;

import java.util.Objects;

public class ServiceDefinitionSearchRequest {

    private String apiId;
    private String ver;
    private long ts;
    private String resMsgId;
    private String msgId;
    private ServiceDefinitionCriteria serviceDefinitionCriteria;
    private Pagination pagination;
    private String status;



    public ServiceDefinitionSearchRequest() {
    }

    public ServiceDefinitionSearchRequest(String apiId, String ver, long ts, String resMsgId, String msgId,
                        ServiceDefinitionCriteria serviceDefinitionCriteria, Pagination pagination, String status) {
        this.apiId = apiId;
        this.ver = ver;
        this.ts = ts;
        this.resMsgId = resMsgId;
        this.msgId = msgId;
        this.serviceDefinitionCriteria = serviceDefinitionCriteria;
        this.pagination = pagination;
        this.status = status;
    }

    public String getApiId() {
        return apiId;
    }

    public void setApiId(String apiId) {
        this.apiId = apiId;
    }

    public String getVer() {
        return ver;
    }

    public void setVer(String ver) {
        this.ver = ver;
    }

    public long getTs() {
        return ts;
    }

    public void setTs(long ts) {
        this.ts = ts;
    }

    public String getResMsgId() {
        return resMsgId;
    }

    public void setResMsgId(String resMsgId) {
        this.resMsgId = resMsgId;
    }

    public String getMsgId() {
        return msgId;
    }

    public void setMsgId(String msgId) {
        this.msgId = msgId;
    }

    public ServiceDefinitionCriteria getServiceDefinitionCriteria() {
        return serviceDefinitionCriteria;
    }

    public void setServiceDefinitionCriteria(ServiceDefinitionCriteria serviceDefinitionCriteria) {
        this.serviceDefinitionCriteria = serviceDefinitionCriteria;
    }

    public Pagination getPagination() {
        return pagination;
    }

    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ServiceDefinitionSearchRequest that = (ServiceDefinitionSearchRequest) o;
        return ts == that.ts &&
                Objects.equals(apiId, that.apiId) &&
                Objects.equals(ver, that.ver) &&
                Objects.equals(resMsgId, that.resMsgId) &&
                Objects.equals(msgId, that.msgId) &&
                Objects.equals(serviceDefinitionCriteria, that.serviceDefinitionCriteria) &&
                Objects.equals(pagination, that.pagination) &&
                Objects.equals(status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(apiId, ver, ts, resMsgId, msgId, serviceDefinitionCriteria, pagination, status);
    }
}

