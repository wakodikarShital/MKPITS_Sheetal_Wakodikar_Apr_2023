<%@ page import="com.example.bankingwebapplicationusingmvc.Service.BankingServices" %><%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 03-11-2023
  Time: 23:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="details" class="com.example.bankingwebapplicationusingmvc.Model.AccountDetails" scope="application"/>

<jsp:setProperty name="details" property="customerUserId" param="userId"/>
<jsp:setProperty name="details" property="password" param="password"/>
<jsp:setProperty name="details" property="customerName" param="name"/>
<jsp:setProperty name="details" property="address" param="address"/>
<jsp:setProperty name="details" property="city" param="city"/>
<jsp:setProperty name="details" property="balance" param='balance' />



<html>
<head>
    <title>Title</title>
</head>
<body>

<%
    BankingServices bankingServices = new BankingServices();
    if (bankingServices.insertRecords(details)!=0)
    {
%>
    <h2><center><%="Record Successfully Inserted"%></center></h2>
<%
    }
    else
    {
%>
    <h2><center><%="Record Not Inserted"%></center></h2>
<%
    }
%>






</body>
</html>
