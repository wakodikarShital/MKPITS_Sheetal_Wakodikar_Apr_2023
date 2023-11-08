<%@ page import="com.example.bankingwebapplicationusingmvc.service.BankingServices" %>
<%@ page import="java.sql.ResultSet" %><%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 07-11-2023
  Time: 15:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="details" class="com.example.bankingwebapplicationusingmvc.model.AccountDetails" scope="application"/>
<%
    String userId = request.getParameter("id");
    session.setAttribute("approveUserId" ,userId);
%>

<jsp:setProperty name="details" property="customerUserId" value="<%=userId%>" ></jsp:setProperty>




<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="2px" align="center">

    <tr>
        <th>customerUserId</th>
        <th>Name</th>
        <th>address</th>
        <th>city</th>
        <th>accountBalance</th>
        <th>is_Approved</th>
        <th>created_On</th>
    </tr>

<%
    BankingServices bankingServices = new BankingServices();
    ResultSet resultSet=bankingServices.displayPerticularCustomerRecords(details);

    if(resultSet.next())
    {
%>
    <tr>
        <td><%=resultSet.getString(1)%></td>
        <td><%=resultSet.getString(2)%></td>
        <td><%=resultSet.getString(3)%></td>
        <td><%=resultSet.getString(4)%></td>
        <td><%=resultSet.getDouble(5)%></td>
        <td><%=resultSet.getString(6)%></td>
        <td><%=resultSet.getDate(7)%></td>
    </tr>
<%
    }
    else
    {
%>
    <h2>Unable to fetch</h2>
    <%
        }
    %>
    <button><a href="NewPageApproved.jsp">Accept</a></button>
    <button><a href="../adminLogin.jsp">Reject</a></button>

</table>
</body>
</html>
