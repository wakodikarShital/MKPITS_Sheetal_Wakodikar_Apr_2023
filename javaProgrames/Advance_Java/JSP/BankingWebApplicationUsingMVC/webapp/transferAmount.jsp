<%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 07-11-2023
  Time: 01:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Transfer Amount</title>
</head>
<body>

<form action="Controller/TransferAmountController.jsp">
    <h2>Transfer Amount</h2>
    UserId : <input type="text" name="userId">
    Amount : <input type="number" name="transferInAmount">
    <input type="submit" value="Submit" >
</form>

</body>
</html>
