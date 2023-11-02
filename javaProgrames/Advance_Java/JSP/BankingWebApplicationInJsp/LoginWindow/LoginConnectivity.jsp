<%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 02-11-2023
  Time: 17:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.sql.*" %>
<%
    String customerUserId = request.getParameter("customer_id");
    String password = request.getParameter("password");

    Connection connection;
    Class.forName("com.mysql.cj.jdbc.Driver");
    System.out.println("Driver Loading");
    connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank_details","root","Shital@123");
    System.out.println("Connection Established from database");
    PreparedStatement preparedStatement=connection.prepareStatement("select * from account_details where customerUserId=? and password=? ");
    preparedStatement.setString(1,customerUserId);
    preparedStatement.setString(2,password);
    ResultSet resultSet=preparedStatement.executeQuery();
%>


<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        if (resultSet.next())
        {
    %>
        <%="Welcome : " + customerUserId%>
    <%
    }
        else
        {
    %>
    <%="Unable to fetch"%>
    <%

        }
    %>


</body>
</html>
