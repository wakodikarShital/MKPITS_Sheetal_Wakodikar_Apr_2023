<%@ page import="com.example.studentinformationusingjspactiontag.Service.StudentService" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.ResultSetMetaData" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.example.studentinformationusingjspactiontag.Model.Student" %>
<%@ page import="jakarta.ws.rs.core.Request" %><%--
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
<%
    StudentService studentService = new StudentService();
    ResultSet resultSet=studentService.displayRecord();
    ArrayList<Student> studentArrayList = new ArrayList<>();

    while(resultSet.next())
    {
        studentArrayList.add(new Student(resultSet.getString(1),resultSet.getString(2),resultSet.getString(3),resultSet.getString(4)));

    }

    request.setAttribute("listRecord" , studentArrayList);
    RequestDispatcher requestDispatcher = request.getRequestDispatcher("ourJsp.jsp");
    requestDispatcher.forward(request,response);




%>

<%--<table border="1px">--%>
<%--    <tr>--%>
<%--  <%  StudentService studentService = new StudentService();--%>
<%--    ResultSet resultSet =studentService.displayRecord();--%>
<%--    ResultSetMetaData resultSetMetaData = resultSet.getMetaData();--%>

<%--    for (int coloumIndex=1;coloumIndex<=resultSetMetaData.getColumnCount();coloumIndex++){--%>
<%--        %>--%>
<%--            <th><%=resultSetMetaData.getColumnName(coloumIndex)%></th>--%>

<%-- <%--%>
<%--    }--%>

<%--%>--%>
<%--    </tr>--%>
<%--    <%--%>
<%--        while (resultSet.next())--%>
<%--        {--%>
<%--    %>--%>
<%--    <tr>--%>
<%--        <td><%=resultSet.getString(1)%></td>--%>
<%--        <td><%=resultSet.getString(2)%></td>--%>
<%--        <td><%=resultSet.getString(3)%></td>--%>
<%--        <td><%=resultSet.getString(4)%></td>--%>
<%--    </tr>--%>
<%--    <%--%>
<%--        }--%>
<%--    %>--%>





<%--</table>--%>
</body>
</html>
