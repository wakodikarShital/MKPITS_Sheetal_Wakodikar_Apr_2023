<%@ page import="java.sql.Date" %>
<%@ page import="com.example.bankingwebapplicationusingmvc.service.BankingServices" %><%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 06-11-2023
  Time: 23:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="transactions" class="com.example.bankingwebapplicationusingmvc.model.Transactions" scope="application"/>

<%
    String userId =(String) session.getAttribute("UserId");
    long value=session.getCreationTime();
    Date transactionDate=new java.sql.Date(value);
    String transactionTypeWithdraw="withdraw";
%>

<jsp:setProperty name="transactions" property="customerUserId" value="<%=userId%>"/>
<jsp:setProperty name="transactions" property="taransactionDate" value="<%=transactionDate%>"/>
<jsp:setProperty name="transactions" property="amount" param="withdrawAmount" />
<jsp:setProperty name="transactions" property="transactionType" value="<%=transactionTypeWithdraw%>"/>


<html>
<head>
    <title></title>
</head>
<body>

<%
    BankingServices bankingServices = new BankingServices();

    if (bankingServices.withdrawAmount(transactions)!=0)
    {
%>
<center><h2><%="Amount Withdraw Successfully"%></h2></center>
<%
}
else
{
%>
<center><h2><%="Amount Not Withdraw Successfully"%></h2></center>
<%
    }
%>

</body>
</html>
