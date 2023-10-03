import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
       //Loading a driver
        // forName method throws the file not found exception
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Loading");
            // For connection established
            Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/student_managment_system","root","Shital@123");
            System.out.println("Connection Established from database");
            //create a statement with the help of createStatement() method createStatement() returns the object of Statement interface
            Statement statement =connection.createStatement();
            //we write here any statement or any query
            ResultSet resultSet=statement.executeQuery("select * from Student_Details");
            while(resultSet.next()){
                System.out.println(resultSet.getString(1)+" "+resultSet.getString(2)+" "+resultSet.getString(3)+" "+resultSet.getString(4));

            }


        }catch (Exception e){
            System.out.println(e);
        }
    }
}