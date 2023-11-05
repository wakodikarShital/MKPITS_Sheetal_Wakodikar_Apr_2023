<%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 05-11-2023
  Time: 19:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login from</title>
</head>
<body>
<form action="Controller/LoginFormController.jsp">
    <label>User id :</label><input type="text" name="userId">
    <label>Password :</label><input type="text" name="password">
    <input type="submit" value="Log In">
    <a href="index.jsp">Create Account</a>

</form>
</body>
</html>
