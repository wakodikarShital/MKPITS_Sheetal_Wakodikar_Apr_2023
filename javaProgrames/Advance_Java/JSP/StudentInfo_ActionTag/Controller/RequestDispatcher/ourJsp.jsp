<%@ page import="java.util.ArrayList" %>
<%@ page import="com.example.studentinformationusingjspactiontag.Model.Student" %><%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 04-11-2023
  Time: 12:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>

<%
    ArrayList<Student> studentArrayList = (ArrayList<Student>) request.getAttribute("listRecord");

    for (Student listData:studentArrayList) {
        %>

    <tr>
        <td><%=listData.getRollNo()%></td><td><%=listData.getName()%></td><td><%=listData.getPin()%></td><td><%=listData.getCity()%></td>

    </tr>

<%

    }

%>

</table>
</body>
</html>
