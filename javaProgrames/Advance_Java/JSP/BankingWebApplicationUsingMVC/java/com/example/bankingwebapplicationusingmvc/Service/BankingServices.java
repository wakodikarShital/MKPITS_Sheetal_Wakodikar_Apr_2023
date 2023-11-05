package com.example.bankingwebapplicationusingmvc.Service;

import com.example.bankingwebapplicationusingmvc.Model.AccountDetails;
import com.example.bankingwebapplicationusingmvc.Model.Transactions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BankingServices {
    Connection connection;

    public BankingServices(){
        try{

            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Loading");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Bank_managment_System", "root", "Shital@123");
            System.out.println("Connection Established from database");

        }catch(Exception e){
            System.out.println(e);
        }
    }

    public int insertRecords(AccountDetails details){
        int result=0;

        try{
            PreparedStatement preparedStatement= connection.prepareStatement("insert into Account_details(customerUserId,IdPassword,customerName,address,city,accountBalance) values(?,?,?,?,?,?) ");
            preparedStatement.setString(1,details.getCustomerUserId());
            preparedStatement.setString(2,details.getPassword());
            preparedStatement.setString(3,details.getCustomerName());
            preparedStatement.setString(4,details.getAddress());
            preparedStatement.setString(5,details.getCity());
            preparedStatement.setDouble(6,details.getBalance());
           result= preparedStatement.executeUpdate();

        }catch (Exception e){
            System.out.println(e);
        }


    return  result;

    }

    public ResultSet logIn(AccountDetails details){
        ResultSet resultSet=null;
        try {

            PreparedStatement preparedStatement = connection.prepareStatement("select * from Account_details where customerUserId=? and IdPassword=?");
            preparedStatement.setString(1,details.getCustomerUserId());
            preparedStatement.setString(2,details.getPassword());
            resultSet= preparedStatement.executeQuery();

        }catch (Exception exception){
            System.out.println(exception);
        }
        return resultSet;
    }

    public int depositAmount(Transactions transactions){
        int result=0;
        try{
            PreparedStatement preparedStatement = connection.prepareStatement("insert into transactions values(?,?,?,?)");
            preparedStatement.setString(1,transactions.getCustomerUserId());
            preparedStatement.setDate(2,transactions.getTaransactionDate());
            preparedStatement.setDouble(3,transactions.getAmount());
            preparedStatement.setString(4,transactions.getTransactionType());
            result=preparedStatement.executeUpdate();

        }catch(Exception exception){
            System.out.println(exception);
        }
        return result;
    }


}
