<%@ page import="com.example.studentinformationusingjspactiontag.Service.StudentService" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.ResultSetMetaData" %><%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 03-11-2023
  Time: 16:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="student1" class="com.example.studentinformationusingjspactiontag.Model.Student" scope="application" />
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1px">
    <tr>
  <%  StudentService studentService = new StudentService();
    ResultSet resultSet =studentService.displayRecord();
    ResultSetMetaData resultSetMetaData = resultSet.getMetaData();

    for (int coloumIndex=1;coloumIndex<=resultSetMetaData.getColumnCount();coloumIndex++){
        %>
            <th><%=resultSetMetaData.getColumnName(coloumIndex)%></th>

 <%
    }

%>
    </tr>
    <%
        while (resultSet.next())
        {
    %>
    <tr>
        <td><%=resultSet.getString(1)%></td>
        <td><%=resultSet.getString(2)%></td>
        <td><%=resultSet.getString(3)%></td>
        <td><%=resultSet.getString(4)%></td>
    </tr>
    <%
        }
    %>





</table>
</body>
</html>
