<%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 03-11-2023
  Time: 14:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%--bean loading--%>

<jsp:useBean id="student" class="com.example.studentinformationusingjspactiontag.Model.Student" scope="application" />

<%---------------------------------------------- we gives the input ----------------------------------------%>

<%--Set property--%>

<jsp:setProperty name="student" property="rollNo" value="303"/>
<jsp:setProperty name="student" property="name" value="shitu"/>
<jsp:setProperty name="student" property="pin" value="11548"/>
<jsp:setProperty name="student" property="city" value="nagpur"/>

<%--Get property--%>

<table border="1px">
    <tr><td>Roll No</td><td><jsp:getProperty name="student" property="rollNo"/></td></tr>
    <tr><td>Name</td><td><jsp:getProperty name="student" property="name" /><td></tr>
    <tr><td>pin</td><td><jsp:getProperty name="student" property="pin"/><td></tr>
    <tr><td>city</td><td><jsp:getProperty name="student" property="city"/><td></tr>
</table>


<%----------------------------------------------------- input From user -----------------------------------------%>

<%--Set property--%>

<jsp:setProperty name="student" property="rollNo" param="rollNo"/>
<jsp:setProperty name="student" property="name" param="name"/>
<jsp:setProperty name="student" property="pin" param="pin"/>
<jsp:setProperty name="student" property="city" param="city"/>

<%--Get property--%>

<table border="1px">
    <tr><td>Roll No</td><td><jsp:getProperty name="student" property="rollNo"/></td></tr>
    <tr><td>Name</td><td><jsp:getProperty name="student" property="name" /><td></tr>
    <tr><td>pin</td><td><jsp:getProperty name="student" property="pin"/><td></tr>
    <tr><td>city</td><td><jsp:getProperty name="student" property="city"/><td></tr>
</table>





<html>
<head>
    <title>Title</title>
</head>
<body>

</body>
</html>
