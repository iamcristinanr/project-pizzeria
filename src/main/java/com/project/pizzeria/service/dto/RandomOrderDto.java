package com.project.pizzeria.service.dto;

public class RandomOrderDto {
    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    private String idCustomer;
    private String method;
}
