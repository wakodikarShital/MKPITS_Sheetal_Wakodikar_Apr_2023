package com.example.studentinformationusingjspactiontag.Service;

import com.example.studentinformationusingjspactiontag.Model.Student;

import java.sql.*;

public class StudentService {

    Connection connection;

    public StudentService() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Loading");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_managment_system", "root", "Shital@123");
            System.out.println("Connection Established from database");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public int insertRecord(Student student1) {

        int result=0;

        try {

            PreparedStatement preparedStatement = connection.prepareStatement("insert into student_details values(?,?,?,?)");
            preparedStatement.setString(1, student1.getRollNo());
            preparedStatement.setString(2, student1.getName());
            preparedStatement.setString(3, student1.getPin());
            preparedStatement.setString(4, student1.getCity());
            result=preparedStatement.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
        return result;
    }

    public ResultSet displayRecord(){
        ResultSet resultSet=null;
        try {
            Statement statement = connection.createStatement();
            resultSet=statement.executeQuery("select * from student_details");

        }catch(Exception e){
            System.out.println(e);
        }
       return  resultSet;
    }

}
