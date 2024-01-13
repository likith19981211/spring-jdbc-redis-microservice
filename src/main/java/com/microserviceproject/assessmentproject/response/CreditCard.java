package com.microserviceproject.assessmentproject.response;


public class CreditCard {
    private String ccNumber;

    public CreditCard(String ccNumber) {
        this.ccNumber = ccNumber;
    }

    public CreditCard() {
    }

    public String getCcNumber() {
        return ccNumber;
    }

    public void setCcNumber(String ccNumber) {
        this.ccNumber = ccNumber;
    }
}
