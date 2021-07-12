package com.diogeneskonorath.rentingroomapp.entities;

public class Room {
    private String tenantName, tenantEmail;

    public Room(String tenantName, String tenantEmail) {
        this.tenantName = tenantName;
        this.tenantEmail = tenantEmail;
    }

    public String getTenantName() {
        return tenantName;
    }

    public void setTenantName(String tenantName) {
        this.tenantName = tenantName;
    }

    public String getTenantEmail() {
        return tenantEmail;
    }

    public void setTenantEmail(String tenantEmail) {
        this.tenantEmail = tenantEmail;
    }

    @Override
    public String toString() {
        return "tenantName: " + tenantName +
                ", tenantEmail: " + tenantEmail;
    }
}
