package com.example.bankingwebapplicationusingmvc.Model;

import java.util.Date;

public class Transactions {
    private String customerUserId;
    private Date taransactionDate;
    private double amount;
    private String transactionType;

    public Transactions(String customerUserId) {
        this.customerUserId = customerUserId;
    }

    public Transactions(String customerUserId, Date taransactionDate, double amount, String transactionType) {
        this.customerUserId = customerUserId;
        this.taransactionDate = taransactionDate;

        this.amount = amount;
        this.transactionType = transactionType;
    }

    public String getCustomerUserId() {
        return customerUserId;
    }

    public void setCustomerUserId(String customerUserId) {
        this.customerUserId = customerUserId;
    }

    public java.sql.Date getTaransactionDate() {
        return (java.sql.Date) taransactionDate;
    }

    public void setTaransactionDate(Date taransactionDate) {
        this.taransactionDate = taransactionDate;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }
}
