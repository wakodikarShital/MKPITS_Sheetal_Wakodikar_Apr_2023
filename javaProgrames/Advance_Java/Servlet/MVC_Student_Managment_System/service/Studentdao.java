/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import StudentModel.Student;
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 *
 * @author LENOVO
 */
public class Studentdao {
    
   static Connection connection;
    
    //----------- connection statblish from database -----------------------
    public static void connection(){
       try{
             Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Loading");
             connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_managment_system","root","Shital@123");
            System.out.println("Connection Established from database");
        }catch(Exception e){
            out.println(e);
        }
        
    }
    int value =1;
    public  int insert(Student student){
         Studentdao.connection();
         try{
         PreparedStatement preparedStatement = connection.prepareStatement("insert into student_details values(?,?,?,?)");
         preparedStatement.setString(1,student.getRollno());
         preparedStatement.setString(2,student.getNameOfStudent());
         preparedStatement.setString(3,student.getPin());
         preparedStatement.setString(4,student.getCity());
         int value = preparedStatement.executeUpdate();
         }catch(Exception e){
             out.println(e);
         }   
         
         return value;
    }
    
    
}
