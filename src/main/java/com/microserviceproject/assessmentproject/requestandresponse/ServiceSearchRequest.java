package com.microserviceproject.assessmentproject.requestandresponse;


import com.microserviceproject.assessmentproject.criteria.ServiceCriteria;
import com.microserviceproject.assessmentproject.criteria.ServiceDefinitionCriteria;
import com.microserviceproject.assessmentproject.modal.Pagination;

import java.util.Objects;

public class ServiceSearchRequest {

    private String apiId;
    private String ver;
    private long ts;
    private String resMsgId;
    private String msgId;
    private ServiceCriteria serviceCriteria;
    private Pagination pagination;
    private String status;



    public ServiceSearchRequest() {
    }

    public ServiceSearchRequest(String apiId, String ver, long ts, String resMsgId, String msgId,
                                          ServiceCriteria serviceCriteria, Pagination pagination, String status) {
        this.apiId = apiId;
        this.ver = ver;
        this.ts = ts;
        this.resMsgId = resMsgId;
        this.msgId = msgId;
        this.serviceCriteria = serviceCriteria;
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

    public ServiceCriteria getServiceCriteria() {
        return serviceCriteria;
    }

    public void setServiceCriteria(ServiceCriteria serviceCriteria) {
        this.serviceCriteria = serviceCriteria;
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
        ServiceSearchRequest that = (ServiceSearchRequest) o;
        return ts == that.ts &&
                Objects.equals(apiId, that.apiId) &&
                Objects.equals(ver, that.ver) &&
                Objects.equals(resMsgId, that.resMsgId) &&
                Objects.equals(msgId, that.msgId) &&
                Objects.equals(serviceCriteria, that.serviceCriteria) &&
                Objects.equals(pagination, that.pagination) &&
                Objects.equals(status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(apiId, ver, ts, resMsgId, msgId, serviceCriteria, pagination, status);
    }
}


