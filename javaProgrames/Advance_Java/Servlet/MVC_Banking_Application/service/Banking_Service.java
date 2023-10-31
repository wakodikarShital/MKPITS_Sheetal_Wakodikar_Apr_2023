/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import Model.Account_Details;
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author LENOVO
 */
public class Banking_Service {
    
     static Connection connection;
     ResultSet resultSet=null;
    
    //----------- connection statblish from database -----------------------
    public static void connection(){
       try{
             Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Loading");
             connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank_details","root","Shital@123");
            System.out.println("Connection Established from database");
        }catch(Exception e){
            out.println(e);
        }
        
    }
    
    //------------------- Insert Record -------------------------------------------------------------
    //--- PreparedStatement throws sql exception ----------------------------------------------------
    //--- Drivermanager throws class not found exception --------------------------------------------
    public int insertData(Account_Details bankingApplication){
             Banking_Service.connection();
        int value=1 ;
        try{
        PreparedStatement preparedStatement = connection.prepareStatement("insert into account_details values(?,?,?,?,?,?)");
        preparedStatement.setString(1,bankingApplication.getCustomerId());
        preparedStatement.setString(2,bankingApplication.getPassword());
        preparedStatement.setString(3,bankingApplication.getCustomerName());
        preparedStatement.setString(4,bankingApplication.getAddress());
        preparedStatement.setString(5,bankingApplication.getCity());
        preparedStatement.setDouble(6,bankingApplication.getAccountBalance());
         value=preparedStatement.executeUpdate();
        }catch(Exception e){
            out.println(e);
        }
        
       return value; 
        
    }
    
    //-------------------find existing account in or not -------------------------------------------------------------
    public ResultSet findRecord(Account_Details accountDetails){
        Banking_Service.connection();
        
        try{
             PreparedStatement preparedStatement = connection.prepareStatement("select * from account_details where customerUserId=? and password=? ");
             preparedStatement.setString(1,accountDetails.getCustomerId());
             preparedStatement.setString(2,accountDetails.getPassword());
              resultSet = preparedStatement.executeQuery();
             
             
        }catch(Exception e){
            System.out.println(e);
        }
       return  resultSet;
    }
    
    
    
}
