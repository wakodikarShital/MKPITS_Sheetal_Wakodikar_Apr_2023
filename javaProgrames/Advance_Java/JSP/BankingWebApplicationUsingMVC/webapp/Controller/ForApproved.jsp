<%@ page import="java.sql.Date" %>
<%@ page import="com.example.bankingwebapplicationusingmvc.service.BankingServices" %>
<%@ page import="java.sql.ResultSet" %><%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 06-11-2023
  Time: 16:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="details" class="com.example.bankingwebapplicationusingmvc.model.AccountDetails" scope="application"/>
<%
    long value=session.getCreationTime();
    Date approvedAt = new java.sql.Date(value);
    String approvedBy = (String) session.getAttribute("approvedBy");

%>
<jsp:setProperty name="details" property="appUserId" param="userId"/>
<jsp:setProperty name="details" property="approvedAt" value="<%=approvedAt%>"/>
<jsp:setProperty name="details" property="approvedBy" value="<%=approvedBy%>"/>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>

    </tr>
<%
    BankingServices bankingServices=new BankingServices();


    if(bankingServices.approved(details)!=0){
%>
    <center><h2><%="Approved"%></h2></center>

<%

    }
    else
    {


%>
    <center><h2><%="Not Approved"%></h2></center>
<%
    }
%>

    </table>
</body>
</html>
