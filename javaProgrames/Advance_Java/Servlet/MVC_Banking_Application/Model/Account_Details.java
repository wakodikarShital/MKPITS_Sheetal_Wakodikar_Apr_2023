/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author LENOVO
 */
public class Account_Details {
    
    private String customerId;
    private String password;
    private String customerName;
    private String address;
    private String city;
    private int accountBalance;
    
    public Account_Details(){
        
    }
    
    public Account_Details(String customerId,String password,String customerName,String address,String city,int accountBalance){
        
        this.customerId=customerId;
        this.password=password;
        this.customerName=customerName;
        this.address=address;
        this.city=city;
        this.accountBalance=accountBalance;
        
        
        
    }
    
    //-------- getter ----------------------------------------------------

    public String getCustomerId() {
        return customerId;
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

    public int getAccountBalance() {
        return accountBalance;
    }
    
    
    //-------- setter -------------------------------------------------------------

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }
    
    
    
}
