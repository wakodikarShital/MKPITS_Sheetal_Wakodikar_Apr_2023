<%@ page import="com.example.bankingwebapplicationusingmvc.Service.BankingServices" %>
<%@ page import="java.sql.ResultSet" %><%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 05-11-2023
  Time: 19:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="details" class="com.example.bankingwebapplicationusingmvc.Model.AccountDetails" scope="application"/>

<jsp:setProperty name="details" property="customerUserId" param="userId"/>
<jsp:setProperty name="details" property="password" param="password"/>
<%
    String userId = request.getParameter("userId");
    session.setAttribute("UserId",userId);
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%

    BankingServices bankingServices = new BankingServices();
    ResultSet resultSet =bankingServices.logIn(details);

    if (resultSet.next())
    {
%>
        <h2><center><%="Successfully Login !!"%></center></h2>
        <h2><center><%="Welcome : " + details.getCustomerUserId()%></center></h2>
    <table align="center" border="1px" >

        <tr><td><h3><center><a href="http://localhost:8080/BankingWebApplicationUsingMVC_war_exploded/depositeAmount.jsp">Deposite</a></center></h3></td><td><h3><center><%=""%></center></h3></td></tr>

<%
    }
    else
    {
%>
        <h2><center><%=" Your Id Password is wrong "%></center></h2>
<%
    }
%>
    </table>
</body>
</html>
