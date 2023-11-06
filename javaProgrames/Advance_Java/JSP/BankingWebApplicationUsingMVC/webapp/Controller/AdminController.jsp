<%@ page import="com.example.bankingwebapplicationusingmvc.service.BankingServices" %>
<%@ page import="java.sql.ResultSet" %><%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 06-11-2023
  Time: 00:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<jsp:useBean id="admin" class="com.example.bankingwebapplicationusingmvc.model.Admin" scope="application"/>
<jsp:setProperty name="admin" property="adminUserId" param="userId"/>
<jsp:setProperty name="admin" property="password" param="password"/>

<%
    String approvedBy = request.getParameter("userId");
    session.setAttribute("approvedBy" , approvedBy);
%>
<html>
<head>
    <title>Admin Login</title>
</head>
<body>

    <%

        BankingServices bankingServices = new BankingServices();

        ResultSet resultSet =bankingServices.adminLogin(admin);
        ResultSet resultSet1=bankingServices.displayRecords();

        if (resultSet.next())
        {
    %>
    <h2><center><%="Welcome : " + resultSet.getString(1)%></center></h2>
        <table border="1px" align="center">
            <tr>
                <th>customerUserId</th>
                <th>customerName</th>
                <th>address</th>
                <th>city</th>
                <th>accountBalance</th>
                <th>is_Approved</th>
                <th>created_On</th>
            </tr>
            <%
               while (resultSet1.next())
               {
            %>
            <tr><td><%=resultSet1.getString(1)%></td>
                <td><%=resultSet1.getString(2)%></td>
                <td><%=resultSet1.getString(3)%></td>
                <td><%=resultSet1.getString(4)%></td>
                <td><%=resultSet1.getDouble(5)%></td>
                <td><%=resultSet1.getString(6)%></td>
                <td><%=resultSet1.getDate(7)%></td>
            </tr>

<%
    }

%>
          <button><a href="http://localhost:8080/BankingWebApplicationUsingMVC_war_exploded/forApproved.jsp">For Approved</a></button>
<%

    }
        else
        {
%>
<h2><center><%="Your Id Password is wrong"%></center></h2>
<%
    }
%>

        </table>
</body>
</html>
