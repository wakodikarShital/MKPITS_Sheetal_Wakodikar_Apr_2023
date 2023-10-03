package MyDataBaseConnectivity;

import java.sql.*;

public class DataBaseConnectivity {
    static Connection connection;
    public static void dataBaseConnection(){

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Loading");
           connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/student_managment_system","root","Shital@123");
            System.out.println("Connection Established from database");


        }catch (Exception e){
            System.out.println(e);
        }
    }

    public static void getOutputDisplay()  {
            dataBaseConnection();
          try{
              Statement statement= connection.createStatement();
              ResultSet resultSet = statement.executeQuery("select * from Student_Details");
              while(resultSet.next()){
                  System.out.println(resultSet.getString(1)+" "+resultSet.getString(2)+" "+resultSet.getString(3)+" "+resultSet.getString(4));

              }

          }catch (Exception e){
              System.out.println(e);
          }
    }

    public static void insertData(String rollNo,String nameOfStudent, String pin , String city){
        dataBaseConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("insert into Student_Details values(?,?,?,?)");
            preparedStatement.setString(1,rollNo);
            preparedStatement.setString(2,nameOfStudent);
            preparedStatement.setString(3,pin);
            preparedStatement.setString(4,city);
            int returnValue=preparedStatement.executeUpdate();
            if(returnValue!=0){
                System.out.println("insert data");
            }else {
                System.out.println("Data not inserted");
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }

    public static void deleteData(String rollNo) {
        dataBaseConnection();
        try {
            Statement statement = connection.createStatement();
            int deleteValue = statement.executeUpdate("delete from Student_Details where roll_no =" + rollNo + "");
            if (deleteValue!=0){
                System.out.println("Deleted Successfully");
            }else {
                System.out.println("Unable to delete record");
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }

    public static void updateData(String rollNo,String nameOfStudent, String pin , String city){
        dataBaseConnection();
        try {
            Statement statement = connection.createStatement();
            statement.executeUpdate("update Student_Details set nameOfStudent = "+nameOfStudent+",pin = "+pin+",city = "+city+", where rollNo="+rollNo+"");
//            System.out.println(updateValue);
        }catch (Exception e){
            System.out.println(e);
        }
    }





}
