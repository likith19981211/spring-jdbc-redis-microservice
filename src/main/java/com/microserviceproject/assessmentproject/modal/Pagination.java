package com.microserviceproject.assessmentproject.modal;

public class Pagination {

    private int limit;
    private int offSet;
    private int totalCount;
    private String sortBy;
    private String order;

    // Constructors, getters, and setters

    public Pagination() {
        // Default constructor
    }

    public Pagination(int limit, int offSet, int totalCount, String sortBy, String order) {
        this.limit = limit;
        this.offSet = offSet;
        this.totalCount = totalCount;
        this.sortBy = sortBy;
        this.order = order;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getOffSet() {
        return offSet;
    }

    public void setOffSet(int offSet) {
        this.offSet = offSet;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public String getSortBy() {
        return sortBy;
    }

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }
}

