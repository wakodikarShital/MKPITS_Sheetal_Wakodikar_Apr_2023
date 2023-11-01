<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<%--<h1><%= "Hello World!" %>--%>
<%--</h1>--%>
<%--<br/>--%>
<form action="Form.jsp">
    Roll No : <input type="text" name="rollNo">
    Name : <input type="text" name="name">
    pin : <input type="text" name="pin">
    City : <input type="text" name="city">
    <input type="submit" name="submit">



</form>
<br/>
<a href="hello-servlet">Hello Servlet</a>
</body>
</html>