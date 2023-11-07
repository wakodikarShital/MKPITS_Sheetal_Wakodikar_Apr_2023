<%@ page import="com.example.bankingwebapplicationusingmvc.service.BankingServices" %>
<%@ page import="java.sql.ResultSet" %><%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 07-11-2023
  Time: 00:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="transactions" class="com.example.bankingwebapplicationusingmvc.model.Transactions" scope="application"/>
<jsp:useBean id="details" class="com.example.bankingwebapplicationusingmvc.model.AccountDetails" scope="application"/>

<%
    String userId =(String) session.getAttribute("UserId");
%>
<jsp:setProperty name="transactions" property="customerUserId" value="<%=userId%>"/>
<jsp:setProperty name="details" property="customerUserId" value="<%=userId%>"/>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    BankingServices bankingServices = new BankingServices();
    ResultSet resultSet =bankingServices.balance_And_Statement(transactions);
%>
<h2><center><%="User Id : " + userId%></center></h2>
<table border="1px" cellspacing="5px" cellpadding="5px" align="center">
    <tr>
        <th>Transaction Date</th>
        <th>Amount</th>
        <th>Transaction Type</th>
    </tr>
<%
    while (resultSet.next())
    {
%>
    <tr>
       <td><%=resultSet.getDate(1)%></td>
        <td><%=resultSet.getDouble(2)%></td>
        <td><%=resultSet.getString(3)%></td>
    </tr>
<%
    }
%>
</table>
<%--//------------------------ total balance--------------------------------------------%>
<%
    ResultSet resultSet1=bankingServices.totalBalance(details);
    while (resultSet1.next())
    {
%>
    <h2><center><%="Balance : " + resultSet1.getDouble(1)%></center></h2>
<%
    }
%>

</body>
</html>
