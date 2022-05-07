<%--
  Created by IntelliJ IDEA.
  User: a123
  Date: 6.05.22
  Time: 19:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ask employee's details</title>
</head>
<body>
<h2>Dear Employee, Please enter your details...</h2>
<br>
<br>
<form action="/showDetails" method="get">
    <input type="text" name="employeeName" placeholder="Write your name"/>
    <input type="submit"/>
</form>

</body>
</html>
