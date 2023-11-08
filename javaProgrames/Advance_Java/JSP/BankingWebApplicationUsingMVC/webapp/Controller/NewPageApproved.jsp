<%@ page import="java.sql.Date" %>
<%@ page import="com.example.bankingwebapplicationusingmvc.service.BankingServices" %><%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 07-11-2023
  Time: 18:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="details" class="com.example.bankingwebapplicationusingmvc.model.AccountDetails" scope="application"/>
<%
    String approveUserId =(String) session.getAttribute("approveUserId");
%>
<%
    long value=session.getCreationTime();
    Date approvedAt = new java.sql.Date(value);
    String approvedBy = (String) session.getAttribute("approvedBy");

%>

<jsp:setProperty name="details" property="appUserId" value="<%=approveUserId%>"></jsp:setProperty>
<jsp:setProperty name="details" property="approvedAt" value="<%=approvedAt%>"/>
<jsp:setProperty name="details" property="approvedBy" value="<%=approvedBy%>"/>
<html>
<head>
    <title>New Page Approve</title>
</head>
<body>
<%
    BankingServices bankingServices = new BankingServices();
    if (bankingServices.approvedNew(details)!=0)
    {

       response.sendRedirect("AdminController.jsp");
    }else{
        out.println("NotApproved");


    }
%>


</body>
</html>
