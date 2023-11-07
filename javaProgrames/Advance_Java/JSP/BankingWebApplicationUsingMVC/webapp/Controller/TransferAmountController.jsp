<%@ page import="java.sql.Date" %>
<%@ page import="com.example.bankingwebapplicationusingmvc.service.BankingServices" %><%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 07-11-2023
  Time: 01:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="details" class="com.example.bankingwebapplicationusingmvc.model.AccountDetails" scope="application"/>
<jsp:useBean id="transactions" class="com.example.bankingwebapplicationusingmvc.model.Transactions" scope="application"/>

<%
    String logInUserId =(String) session.getAttribute("UserId");
    long value=session.getCreationTime();
    Date transactionDate=new java.sql.Date(value);
    String transferIn = "Transfer In";
    String transferOut = "Transfer Out";
%>

<%------------------------------ transferIn-----------------------------------------------%>
<jsp:setProperty name="transactions" property="customerUserId" param="userId" />
<jsp:setProperty name="transactions" property="taransactionDate" value="<%=transactionDate%>" />
<jsp:setProperty name="transactions" property="amount" param="transferInAmount" />
<jsp:setProperty name="transactions" property="transactionType" value="<%=transferIn%>" />

<%------------------------------ transferOut-----------------------------------------------%>
<jsp:setProperty name="transactions" property="logUserId" value="<%=logInUserId%>" />
<jsp:setProperty name="transactions" property="taransactionDate" value="<%=transactionDate%>" />
<jsp:setProperty name="transactions" property="amount" param="transferInAmount" />
<jsp:setProperty name="transactions" property="transactionTypeTransferOut" value="<%=transferOut%>" />






<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    BankingServices bankingServices = new BankingServices();

    if (bankingServices.transferAmount(transactions)!=0)
    {
%>
<center><h2><%="Amount Transfer Successfully"%></h2></center>
<%
}
else
{
%>
<center><h2><%="Amount Not Transfer Successfully"%></h2></center>
<%
    }
%>
</body>
</html>
