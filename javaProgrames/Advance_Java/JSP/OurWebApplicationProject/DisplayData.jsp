<%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 02-11-2023
  Time: 11:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.sql.*" %>
<%
    Connection connection;

    Class.forName("com.mysql.cj.jdbc.Driver");
    System.out.println("Driver Loading");
    connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_managment_system","root","Shital@123");
    System.out.println("Connection Established from database");

   Statement statement = connection.createStatement();
   ResultSet resultSet=statement.executeQuery("select * from student_details");


%>



<html>
<head>
    <title>Display Student Record</title>
</head>
<body>
        <table border="1px" >
            <tr>
            <th>Roll No</th>
            <th>Name</th>
            <th>Pin</th>
            <th>City</th>
            </tr>

    <%
        while (resultSet.next()){
            %>
            <tr>
                <td><%= resultSet.getString(1)%></td>
                <td><%= resultSet.getString(2)%></td>
                <td><%= resultSet.getString(3)%></td>
                <td><%= resultSet.getString(4)%></td>
            </tr>
    <%
        }
    %>
        </table>
</body>
</html>
