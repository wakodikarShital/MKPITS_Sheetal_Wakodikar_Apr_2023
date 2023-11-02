<%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 02-11-2023
  Time: 15:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.sql.*" %>
<%
        String customerUserId = request.getParameter("customer_id");
        String password = request.getParameter("password");
        String customerName = request.getParameter("customer_name");
         String address = request.getParameter("address");
        String city = request.getParameter("city");
        int balance = Integer.parseInt(request.getParameter("balance"));


        Connection connection;
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver Loading");
       connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank_details","root","Shital@123");
        System.out.println("Connection Established from database");
        PreparedStatement preparedStatement=connection.prepareStatement("insert into account_details values(?,?,?,?,?,?)");
        preparedStatement.setString(1,customerUserId);
        preparedStatement.setString(2,password);
        preparedStatement.setString(3,customerName);
        preparedStatement.setString(4,address);
        preparedStatement.setString(5,city);
        preparedStatement.setDouble(6,balance);
        int result=preparedStatement.executeUpdate();

%>



<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    if (result!=0)
    {
%>
   <%="Inserted"%>
<%
    }
    else
    {
%>
<%="Not Inserted"%>
<%
}
%>
</body>
</html>
