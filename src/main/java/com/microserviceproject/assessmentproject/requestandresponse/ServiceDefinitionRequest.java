package com.microserviceproject.assessmentproject.requestandresponse;

import com.microserviceproject.assessmentproject.criteria.ServiceDefinitionCriteria;
import com.microserviceproject.assessmentproject.modal.Pagination;
import com.microserviceproject.assessmentproject.modal.ServiceDefinition;

import java.util.Objects;

public class ServiceDefinitionRequest {

    private String apiId;
    private String ver;
    private long ts;
    private String resMsgId;
    private String msgId;
    private ServiceDefinition serviceDefinition;



    public ServiceDefinitionRequest() {
    }

    public ServiceDefinitionRequest(String apiId, String ver, long ts, String resMsgId, String msgId,
                                          ServiceDefinition serviceDefinition) {
        this.apiId = apiId;
        this.ver = ver;
        this.ts = ts;
        this.resMsgId = resMsgId;
        this.msgId = msgId;
        this.serviceDefinition = serviceDefinition;
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

    public ServiceDefinition getServiceDefinition() {
        return serviceDefinition;
    }

    public void setServiceDefinition(ServiceDefinition serviceDefinition) {
        this.serviceDefinition = serviceDefinition;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ServiceDefinitionRequest that = (ServiceDefinitionRequest) o;
        return ts == that.ts &&
                Objects.equals(apiId, that.apiId) &&
                Objects.equals(ver, that.ver) &&
                Objects.equals(resMsgId, that.resMsgId) &&
                Objects.equals(msgId, that.msgId) &&
                Objects.equals(serviceDefinition, that.serviceDefinition);
    }

    @Override
    public int hashCode() {
        return Objects.hash(apiId, ver, ts, resMsgId, msgId, serviceDefinition);
    }
}


