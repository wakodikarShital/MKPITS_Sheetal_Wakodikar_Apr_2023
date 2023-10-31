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

    //---------------------- deposit amount--------------------------------------------------------------------

    public int depositAmount(Transactions transactions){
        Banking_Service.connection();
        int updateAmount=0;
        try{
            //----------------------- insert deposite amount -----------------------------------------------
            PreparedStatement preparedStatement = connection.prepareStatement("insert into transactions values(?,?,?,?)");
            preparedStatement.setString(1,transactions.getUserId());
            preparedStatement.setDate(2,transactions.getTransactionDate());
            preparedStatement.setDouble(3,transactions.getDepositAmount());
            preparedStatement.setString(4,transactions.getTransactionType());
            int value2=preparedStatement.executeUpdate();

            //----------------------- update deposite amount -----------------------------------------------
            preparedStatement =connection.prepareStatement(" update Account_details set accountBalance =accountBalance+? where customerUserId=? ");
            preparedStatement.setDouble(1,transactions.getDepositAmount());
            preparedStatement.setString(2,transactions.getUserId());
            updateAmount = preparedStatement.executeUpdate();


        }catch(Exception e){
            System.out.println(e);
        }


        return updateAmount;
    }


    //---------------------- withdraw amount--------------------------------------------------------------------

    public int withdrawAmount(Transactions transactions){
        Banking_Service.connection();
        int updateAmount=0;
        try{
            //----------------------- insert deposite amount -----------------------------------------------
            PreparedStatement preparedStatement = connection.prepareStatement("insert into transactions values(?,?,?,?)");
            preparedStatement.setString(1,transactions.getUserId());
            preparedStatement.setDate(2,transactions.getTransactionDate());
            preparedStatement.setDouble(3,transactions.getDepositAmount());
            preparedStatement.setString(4,transactions.getTransactionType());
            int value2=preparedStatement.executeUpdate();

            //----------------------- update deposite amount -----------------------------------------------
            preparedStatement =connection.prepareStatement(" update Account_details set accountBalance =accountBalance-? where customerUserId=? ");
            preparedStatement.setDouble(1,transactions.getDepositAmount());
            preparedStatement.setString(2,transactions.getUserId());
            updateAmount = preparedStatement.executeUpdate();


        }catch(Exception e){
            System.out.println(e);
        }


        return updateAmount;
    }

    //--------------------------- Transfer In _ Amount debited --------------------------------------------------
    public int debitedAmount(Transactions transactions){
        Banking_Service.connection();
        int updateBalance=0;
        try{
            //----------------------- insert into transaction -------------------------------------------
            PreparedStatement preparedStatement = connection.prepareStatement("insert into transactions values(?,?,?,?)");
            preparedStatement.setString(1, transactions.getUserId());
            preparedStatement.setDate(2,transactions.getTransactionDate());
            preparedStatement.setDouble(3,transactions.getDepositAmount());
            preparedStatement.setString(4,transactions.getTransactionType());
            int amountdebited = preparedStatement.executeUpdate();

            //----------------------------- update account_details balance ------------------------------------
            preparedStatement = connection.prepareStatement(" update Account_details set accountBalance =accountBalance+? where customerUserId=?");
            preparedStatement.setDouble(1,transactions.getDepositAmount());
            preparedStatement.setString(2, transactions.getUserId());
            updateBalance = preparedStatement.executeUpdate();


        }catch(Exception e){
            System.out.println(e);
        }

        return updateBalance;
    }

    //--------------------------- Transfer out _ Amount credited --------------------------------------------------
    public int creditedAmount(Transactions transactions1){
        Banking_Service.connection();
        int updateBalance2=0;

        try{
            //----------------------- insert into transaction -------------------------------------------
            PreparedStatement preparedStatement = connection.prepareStatement("insert into transactions values(?,?,?,?)");
            preparedStatement.setString(1, transactions1.getUserId());
            preparedStatement.setDate(2,transactions1.getTransactionDate());
            preparedStatement.setDouble(3,transactions1.getDepositAmount());
            preparedStatement.setString(4,transactions1.getTransactionType());
            int amountCredited = preparedStatement.executeUpdate();

            //----------------------------- update account_details balance ------------------------------------
            preparedStatement = connection.prepareStatement(" update Account_details set accountBalance =accountBalance-? where customerUserId=?");
            preparedStatement.setDouble(1,transactions1.getDepositAmount());
            preparedStatement.setString(2, transactions1.getUserId());
            updateBalance2 = preparedStatement.executeUpdate();


        }catch(Exception e){
            System.out.println(e);
        }

        return updateBalance2;
    }

    //-------------------------------------- Statement ---------------------------------

    public ResultSet statement(Transactions transactions ){
        Banking_Service.connection();
        try{
            PreparedStatement  preparedStatement =connection.prepareStatement(" select transactionDate,ammount,transactionType from transactions where customerUserId = ?");
            preparedStatement.setString(1,transactions.getUserId());
            resultSet=preparedStatement.executeQuery();
        }catch(Exception e){
            System.out.println(e);
        }

        return resultSet;
    }

}

