package com.microserviceproject.assessmentproject.requestandresponse;

import com.microserviceproject.assessmentproject.modal.Pagination;
import com.microserviceproject.assessmentproject.modal.ServiceDefinition;

import java.util.List;
import java.util.Objects;

public class ServiceDefinitionResponse {

    private String apiId;
    private String ver;
    private long ts;
    private String resMsgId;
    private String msgId;
    private List<ServiceDefinition> serviceDefinition;
    private Pagination pagination;



    public ServiceDefinitionResponse() {
    }

    public ServiceDefinitionResponse(String apiId, String ver, long ts, String resMsgId, String msgId,
                        List<ServiceDefinition> serviceDefinition, Pagination pagination) {
        this.apiId = apiId;
        this.ver = ver;
        this.ts = ts;
        this.resMsgId = resMsgId;
        this.msgId = msgId;
        this.serviceDefinition = serviceDefinition;
        this.pagination = pagination;
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

    public List<ServiceDefinition> getServiceDefinition() {
        return serviceDefinition;
    }

    public void setServiceDefinition(List<ServiceDefinition> serviceDefinition) {
        this.serviceDefinition = serviceDefinition;
    }

    public Pagination getPagination() {
        return pagination;
    }

    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ServiceDefinitionResponse that = (ServiceDefinitionResponse) o;
        return ts == that.ts &&
                Objects.equals(apiId, that.apiId) &&
                Objects.equals(ver, that.ver) &&
                Objects.equals(resMsgId, that.resMsgId) &&
                Objects.equals(msgId, that.msgId) &&
                Objects.equals(serviceDefinition, that.serviceDefinition) &&
                Objects.equals(pagination, that.pagination);
    }

    @Override
    public int hashCode() {
        return Objects.hash(apiId, ver, ts, resMsgId, msgId, serviceDefinition, pagination);
    }
}

