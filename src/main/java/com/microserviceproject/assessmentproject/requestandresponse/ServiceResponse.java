package com.microserviceproject.assessmentproject.requestandresponse;

import com.microserviceproject.assessmentproject.modal.Pagination;
import com.microserviceproject.assessmentproject.modal.Service;
import com.microserviceproject.assessmentproject.modal.ServiceDefinition;

import java.util.List;
import java.util.Objects;

public class ServiceResponse {

        private String apiId;
        private String ver;
        private long ts;
        private String resMsgId;
        private String msgId;
        private List<Service> service;
        private Pagination pagination;



        public ServiceResponse() {
        }

        public ServiceResponse(String apiId, String ver, long ts, String resMsgId, String msgId,
                                         List<Service> service, Pagination pagination) {
            this.apiId = apiId;
            this.ver = ver;
            this.ts = ts;
            this.resMsgId = resMsgId;
            this.msgId = msgId;
            this.service = service;
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

        public List<Service> getService() {
            return service;
        }

        public void setService(List<Service> service) {
            this.service = service;
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
            com.microserviceproject.assessmentproject.requestandresponse.ServiceResponse that = (com.microserviceproject.assessmentproject.requestandresponse.ServiceResponse) o;
            return ts == that.ts &&
                    Objects.equals(apiId, that.apiId) &&
                    Objects.equals(ver, that.ver) &&
                    Objects.equals(resMsgId, that.resMsgId) &&
                    Objects.equals(msgId, that.msgId) &&
                    Objects.equals(service, that.service) &&
                    Objects.equals(pagination, that.pagination);
        }

        @Override
        public int hashCode() {
            return Objects.hash(apiId, ver, ts, resMsgId, msgId, service, pagination);
        }
    }


