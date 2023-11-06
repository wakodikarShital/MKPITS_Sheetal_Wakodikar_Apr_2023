package com.example.bankingwebapplicationusingmvc.model;

public class Admin {
    private String adminUserId;
    private String password;


    public Admin() {
    }

    public Admin(String adminUserId, String password) {
        this.adminUserId = adminUserId;
        this.password = password;
    }

    public String getAdminUserId() {
        return adminUserId;
    }

    public void setAdminUserId(String adminUserId) {
        this.adminUserId = adminUserId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
