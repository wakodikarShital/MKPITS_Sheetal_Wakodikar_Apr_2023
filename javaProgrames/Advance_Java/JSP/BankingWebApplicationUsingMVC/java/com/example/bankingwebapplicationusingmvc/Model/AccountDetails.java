package com.example.bankingwebapplicationusingmvc.Model;

public class AccountDetails {
    private String customerUserId;

    private String password;
    private String customerName;
    private String address;
    private String city;
    private double balance;

    public AccountDetails() {
    }

    public AccountDetails(String customerUserId, String customerName, String password, String address, String city, double balance) {
        this.customerUserId = customerUserId;
        this.customerName = customerName;
        this.password = password;
        this.address = address;
        this.city = city;
        this.balance = balance;
    }

    //--------------getter--------------------------------------
    public String getCustomerUserId() {
        return customerUserId;
    }



    public String getPassword() {
        return password;
    }
    public String getCustomerName() {
        return customerName;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public double getBalance() {
        return balance;
    }

    //---------------setter-=--------------------------------------


    public void setCustomerUserId(String customerUserId) {
        this.customerUserId = customerUserId;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
