<%@ page import="com.example.studentinformationusingjspactiontag.Service.StudentService" %><%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 03-11-2023
  Time: 15:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<jsp:useBean id="student1" class="com.example.studentinformationusingjspactiontag.Model.Student" scope="application" />

<%---------------------------------------------- we gives the input ----------------------------------------%>

<%--Set property--%>

<jsp:setProperty name="student1" property="rollNo" param="rollNo"/>
<jsp:setProperty name="student1" property="name" param="name"/>
<jsp:setProperty name="student1" property="pin" param="pin"/>
<jsp:setProperty name="student1" property="city" param="city"/>

<%
    StudentService studentService = new StudentService();
    if (studentService.insertRecord(student1)!=0)
    {
%>
<%="Record Inseted"%>
<%
}
    else
{
%>
<%="Not Inserted"%>
<%
    }
%>


<html>
<head>
    <title>Title</title>
</head>
<body>
    <a href="StudentRecordDisplay.jsp">Display Record</a>
</body>
</html>
