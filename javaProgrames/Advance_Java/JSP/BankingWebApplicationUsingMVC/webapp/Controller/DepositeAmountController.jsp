<%@ page import="java.util.Date" %>
<%@ page import="com.example.bankingwebapplicationusingmvc.Service.BankingServices" %><%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 05-11-2023
  Time: 20:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="transactions" class="com.example.bankingwebapplicationusingmvc.Model.Transactions" scope="session"/>

<%
    String userId =(String) session.getAttribute("UserId");
    long value=session.getCreationTime();
    Date transactionDate=new java.sql.Date(value);
    String transactionType="Deposit";
%>

<jsp:setProperty name="transactions" property="customerUserId" value="<%=userId%>"/>
<jsp:setProperty name="transactions" property="taransactionDate" value="<%=transactionDate%>"/>
<jsp:setProperty name="transactions" property="amount" param="depositeAmount" />
<jsp:setProperty name="transactions" property="transactionType" value="<%=transactionType%>"/>

<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    BankingServices bankingServices = new BankingServices();

    if (bankingServices.depositAmount(transactions)!=0)
    {
%>
<center><h2><%="Amount Deposited Successfully"%></h2></center>
<%
    }
    else
    {
%>
<center><h2><%="Amount Not Deposited Successfully"%></h2></center>
<%
    }
%>

</body>
</html>
