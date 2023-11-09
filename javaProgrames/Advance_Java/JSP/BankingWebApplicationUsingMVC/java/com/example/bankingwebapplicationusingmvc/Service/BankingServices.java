package com.example.bankingwebapplicationusingmvc.service;

import com.example.bankingwebapplicationusingmvc.model.AccountDetails;
import com.example.bankingwebapplicationusingmvc.model.Admin;
import com.example.bankingwebapplicationusingmvc.model.Transactions;

import java.sql.*;

public class BankingServices {
    Connection connection;
    PreparedStatement preparedStatement;

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

    public int insertRecords(AccountDetails details,String activity){
        int result=0;

        try{
            PreparedStatement preparedStatement= connection.prepareStatement("insert into account_details(customerUserId,IdPassword,customerName,address,city,accountBalance,created_On) values(?,?,?,?,?,?,?) ");
            preparedStatement.setString(1,details.getCustomerUserId());
            preparedStatement.setString(2,details.getPassword());
            preparedStatement.setString(3,details.getCustomerName());
            preparedStatement.setString(4,details.getAddress());
            preparedStatement.setString(5,details.getCity());
            preparedStatement.setDouble(6,details.getBalance());
            preparedStatement.setTimestamp(7,details.getCreatedOn());
            result= preparedStatement.executeUpdate();

//            ----------------------------------------------- for log maintain---------------------------------------------
            preparedStatement=connection.prepareStatement("insert into log values(?,?,?) ");
            preparedStatement.setTimestamp(1,details.getCreatedOn());
            preparedStatement.setString(2,activity);
            preparedStatement.setString(3,details.getCustomerUserId());
            preparedStatement.executeUpdate();



        }catch (Exception e){
            System.out.println(e);
        }


        return  result;

    }

    public ResultSet logIn(AccountDetails details,String activity){
        ResultSet resultSet=null;
        try {

            PreparedStatement preparedStatement = connection.prepareStatement("select * from account_details where customerUserId=? and IdPassword=? and is_Approved='true'");
            preparedStatement.setString(1,details.getCustomerUserId());
            preparedStatement.setString(2,details.getPassword());
            resultSet= preparedStatement.executeQuery();



            //            ----------------------------------------------- for log maintain---------------------------------------------
            preparedStatement=connection.prepareStatement("insert into log values(?,?,?) ");
            preparedStatement.setTimestamp(1,details.getCreatedOn());
            preparedStatement.setString(2,activity);
            preparedStatement.setString(3,details.getCustomerUserId());
            preparedStatement.executeUpdate();




        }catch (Exception exception){
            System.out.println(exception);
        }
        return resultSet;
    }

    public int depositAmount(Transactions transactions){
        int result=0;

        try{

            //---------------------------------- record insert of deposit----------------------------------------------

            preparedStatement = connection.prepareStatement("insert into transactions values(?,?,?,?)");
            preparedStatement.setString(1,transactions.getCustomerUserId());
            preparedStatement.setTimestamp(2,transactions.getTaransactionDate());
            preparedStatement.setDouble(3,transactions.getAmount());
            preparedStatement.setString(4,transactions.getTransactionType());
            result=preparedStatement.executeUpdate();

            //---------------------------------- record update of deposit----------------------------------------------

            preparedStatement = connection.prepareStatement("update account_details set accountBalance=accountBalance+? where customerUserId=?");
            preparedStatement.setDouble(1,transactions.getAmount());
            preparedStatement.setString(2,transactions.getCustomerUserId());
            result=preparedStatement.executeUpdate();

            //---------------------------------- maintain log-----------------------------------------------------------
            preparedStatement=connection.prepareStatement("insert into log values(?,?,?) ");
            preparedStatement.setTimestamp(1,transactions.getTaransactionDate());
            preparedStatement.setString(2,transactions.getTransactionType());
            preparedStatement.setString(3,transactions.getCustomerUserId());
            preparedStatement.executeUpdate();




        }catch(Exception exception){
            System.out.println(exception);
        }
        return result;
    }

    public int withdrawAmount(Transactions transactions){
        int withdrawResult=0;
        try{

            //---------------------------------- record insert of withdraw----------------------------------------------

            preparedStatement = connection.prepareStatement("insert into transactions values(?,?,?,?)");
            preparedStatement.setString(1,transactions.getCustomerUserId());
            preparedStatement.setTimestamp(2,transactions.getTaransactionDate());
            preparedStatement.setDouble(3,transactions.getAmount());
            preparedStatement.setString(4,transactions.getTransactionType());
            withdrawResult=preparedStatement.executeUpdate();

            //---------------------------------- record update of withdraw----------------------------------------------

            preparedStatement = connection.prepareStatement("update account_details set accountBalance=accountBalance-? where customerUserId=?");
            preparedStatement.setDouble(1,transactions.getAmount());
            preparedStatement.setString(2,transactions.getCustomerUserId());
            withdrawResult=preparedStatement.executeUpdate();

            //---------------------------------- maintain log-----------------------------------------------------------
            preparedStatement=connection.prepareStatement("insert into log values(?,?,?) ");
            preparedStatement.setTimestamp(1,transactions.getTaransactionDate());
            preparedStatement.setString(2,transactions.getTransactionType());
            preparedStatement.setString(3,transactions.getCustomerUserId());
            preparedStatement.executeUpdate();

        }catch (Exception exception){
            System.out.println(exception);
        }

        return  withdrawResult;
    }



    public int transferAmount(Transactions transactions){
        int updatebalance=0;

        try{
//            -------------------------------------- transferIn (amount debit)--------------------------------------------------
            preparedStatement= connection.prepareStatement("insert into transactions values(?,?,?,?)");
            preparedStatement.setString(1,transactions.getCustomerUserId());
            preparedStatement.setTimestamp(2,transactions.getTaransactionDate());
            preparedStatement.setDouble(3,transactions.getAmount());
            preparedStatement.setString(4,transactions.getTransactionType());
            updatebalance=preparedStatement.executeUpdate();

            //            -------------------------------------- update account balance in account_details --------------------------------------------------
            preparedStatement=connection.prepareStatement("update account_details set accountBalance =accountBalance+? where customerUserId=?");
            preparedStatement.setDouble(1,transactions.getAmount());
            preparedStatement.setString(2,transactions.getCustomerUserId());
            updatebalance=preparedStatement.executeUpdate();

//            ------------------------------------------- for log transferIn-----------------------------------------------------
            preparedStatement=connection.prepareStatement("insert into log values(?,?,?) ");
            preparedStatement.setTimestamp(1,transactions.getTaransactionDate());
            preparedStatement.setString(2,transactions.getTransactionType());
            preparedStatement.setString(3,transactions.getCustomerUserId());
            preparedStatement.executeUpdate();


//            -------------------------------------- transferOut (amount credited)--------------------------------------------------

            preparedStatement=connection.prepareStatement("insert into transactions values(?,?,?,?)");
            preparedStatement.setString(1,transactions.getLogUserId());
            preparedStatement.setTimestamp(2,transactions.getTaransactionDate());
            preparedStatement.setDouble(3,transactions.getAmount());
            preparedStatement.setString(4,transactions.getTransactionTypeTransferOut());
            updatebalance=preparedStatement.executeUpdate();


            //            -------------------------------------- update account balance in account_details --------------------------------------------------

            preparedStatement=connection.prepareStatement("update account_details set accountBalance =accountBalance-? where customerUserId=?");
            preparedStatement.setDouble(1,transactions.getAmount());
            preparedStatement.setString(2,transactions.getLogUserId());
            updatebalance=preparedStatement.executeUpdate();

//            ------------------------------------------- for log transferOut-----------------------------------------------------
            preparedStatement=connection.prepareStatement("insert into log values(?,?,?) ");
            preparedStatement.setTimestamp(1,transactions.getTaransactionDate());
            preparedStatement.setString(2,transactions.getTransactionTypeTransferOut());
            preparedStatement.setString(3,transactions.getLogUserId());
            preparedStatement.executeUpdate();

        }catch (Exception exception){
            System.out.println(exception);
        }

        return updatebalance;
    }





    public ResultSet balance_And_Statement(Transactions transactions,String statement_And_Balance,Timestamp timestamp){
        ResultSet resultSet=null;
        try {
            preparedStatement = connection.prepareStatement("select transactionDate,ammount,transactionType from transactions where customerUserId=?");
            preparedStatement.setString(1,transactions.getCustomerUserId());
            resultSet=preparedStatement.executeQuery();

//            ------------------------------------- For log----------------------------------------
            preparedStatement=connection.prepareStatement("insert into log values(?,?,?) ");
            preparedStatement.setTimestamp(1,timestamp);
            preparedStatement.setString(2,statement_And_Balance);
            preparedStatement.setString(3,transactions.getCustomerUserId());
            preparedStatement.executeUpdate();


        }catch (Exception exception){
            System.out.println(exception);
        }

        return resultSet;
    }
    public ResultSet totalBalance(AccountDetails accountDetails){
        ResultSet resultSet=null;
        try {
            preparedStatement=connection.prepareStatement("select accountBalance from account_details where customerUserId=?");
            preparedStatement.setString(1,accountDetails.getCustomerUserId());
            resultSet=preparedStatement.executeQuery();
        }catch (Exception exception){
            System.out.println(exception);
        }
        return resultSet;
    }



    //--------------------------------------------------Admin Approved Log In check-----------------------------------------------------

    public ResultSet adminLogin(Admin admin,String admin_LogIn,Timestamp timestamp){
        ResultSet resultSet=null;
        try{
            PreparedStatement preparedStatement = connection.prepareStatement("select * from admins where userId=? and password=?");
            preparedStatement.setString(1,admin.getAdminUserId());
            preparedStatement.setString(2,admin.getPassword());
            resultSet= preparedStatement.executeQuery();

            preparedStatement=connection.prepareStatement("insert into log values(?,?,?) ");
            preparedStatement.setTimestamp(1,timestamp);
            preparedStatement.setString(2,admin_LogIn);
            preparedStatement.setString(3,admin.getAdminUserId());
            preparedStatement.executeUpdate();



        }catch(Exception exception){
            System.out.println(exception);
        }
        return resultSet;
    }

    public ResultSet displayRecords(){
        ResultSet resultSet1=null;
        try{
            Statement statement=connection.createStatement();
            resultSet1=statement.executeQuery("select customerUserId,customerName,address,city,accountBalance,is_Approved,created_On from Account_details where is_Approved='false'");

        }catch(Exception e){
            System.out.println(e);
        }
        return  resultSet1;
    }

    public ResultSet displayPerticularCustomerRecords(AccountDetails accountDetails){
        ResultSet resultSet=null;
        try {
            preparedStatement = connection.prepareStatement("select customerUserId,customerName,address,city,accountBalance,is_Approved,created_On from account_details where customerUserId=?");
            preparedStatement.setString(1,accountDetails.getCustomerUserId());
            resultSet=preparedStatement.executeQuery();
        }catch (Exception exception){
            System.out.println(exception);
        }

        return resultSet;

    }

    //------------------------------------------------- old approved ------------------------------------------

    public int approved(AccountDetails accountDetails){
        int result=0;
        try {


            PreparedStatement preparedStatement = connection.prepareStatement("update account_details set is_Approved = 'true' , approved_At =? ,approved_By=? where customerUserId=?");

            preparedStatement.setTimestamp(1,accountDetails.getApprovedAt());
            preparedStatement.setString(2,accountDetails.getApprovedBy());
            preparedStatement.setString(3,accountDetails.getAppUserId());
            result=preparedStatement.executeUpdate();

        }catch (Exception e){
            System.out.println(e);
        }



        return result;
    }

    //------------------------------------------------- new approved--------------------------------------------------

    public int approvedNew(AccountDetails accountDetails,String approvedBy,String approveType){
        int result=0;
        try {


            PreparedStatement preparedStatement = connection.prepareStatement("update account_details set is_Approved = 'true' , approved_At =? ,approved_By=? where customerUserId=?");

            preparedStatement.setTimestamp(1,accountDetails.getApprovedAt());
            preparedStatement.setString(2,approvedBy);
            preparedStatement.setString(3,accountDetails.getAppUserId());
            result=preparedStatement.executeUpdate();

//            -------------------------------------------- for log---------------------------------------------

            preparedStatement=connection.prepareStatement("insert into log values(?,?,?) ");
            preparedStatement.setTimestamp(1,accountDetails.getApprovedAt());
            preparedStatement.setString(2,approveType);
            preparedStatement.setString(3,accountDetails.getAppUserId());
            preparedStatement.executeUpdate();

        }catch (Exception e){
            System.out.println(e);
        }



        return result;
    }




}
