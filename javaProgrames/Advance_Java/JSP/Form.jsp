<%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 01-11-2023
  Time: 15:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.sql.*" %>
<%@ page import="java.io.PrintWriter" %>

<%
    String rollNo = request.getParameter("rollNo");
    String name = request.getParameter("name");
    String pin = request.getParameter("pin");
    String city = request.getParameter("city");

    Class.forName("com.mysql.cj.jdbc.Driver");
    System.out.println("Driver Loading");
    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_managment_system","root","Shital@123");
    System.out.println("Connection Established from database");

    PreparedStatement preparedStatement = connection.prepareStatement("insert into student_details values(?,?,?,?) ");
    preparedStatement.setString(1,rollNo);
    preparedStatement.setString(2,name);
    preparedStatement.setString(3,pin);
    preparedStatement.setString(4,city);
    int result =preparedStatement.executeUpdate();
    PrintWriter printWriter=response.getWriter();
    if (result!=0){
        printWriter.println("Record Inseted");
    }else{
        printWriter.println("Record not inserted");

    }


%>



<html>
<head>
    <title>Title</title>
</head>
<body>

</body>
</html>
