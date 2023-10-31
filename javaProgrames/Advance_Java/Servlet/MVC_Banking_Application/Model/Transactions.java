/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Date;

/**
 *
 * @author LENOVO
 */
public class Transactions {
    private String userId;
    private Date transactionDate;
    private int  depositAmount;
    private String transactionType;

    public Transactions() {
        
    }

    public Transactions(String userId, Date transactionDate, int depositAmount, String transactionType) {
        this.userId = userId;
        this.transactionDate = transactionDate;
        this.depositAmount = depositAmount;
        this.transactionType = transactionType;
    }
    
    //------------ getter-----------

    public String getUserId() {
        return userId;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public int getDepositAmount() {
        return depositAmount;
    }

    public String getTransactionType() {
        return transactionType;
    }
    
    
    //------------ setter---------------

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public void setDepositAmount(int depositAmount) {
        this.depositAmount = depositAmount;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }
    
    
    
    
    
}
