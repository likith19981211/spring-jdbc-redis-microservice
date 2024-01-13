package com.microserviceproject.assessmentproject.response;

public class Subscription {
    private String plan;
    private String status;
    private String paymentMethod;
    private String term;

    public Subscription(String plan, String status, String paymentMethod, String term) {
        this.plan = plan;
        this.status = status;
        this.paymentMethod = paymentMethod;
        this.term = term;
    }

    public Subscription() {
    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }
}
