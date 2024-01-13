package com.microserviceproject.assessmentproject.response;

public class Employment {
    private String title;
    private String keySkill;

    public Employment(String title, String keySkill) {
        this.title = title;
        this.keySkill = keySkill;
    }

    public Employment() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getKeySkill() {
        return keySkill;
    }

    public void setKeySkill(String keySkill) {
        this.keySkill = keySkill;
    }
}
