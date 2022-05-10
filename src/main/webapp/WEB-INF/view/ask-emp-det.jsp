<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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

<form:form action="/employee/showDetails" modelAttribute="employee">
    name: <form:input path="name"/>
    <br><br>
    surname: <form:input path="surname"/>
    <br><br>
    salary: <form:input path="salary"/>
    <br><br>
    department <form:input path="department"/>
    <br><br>
    <input type="submit" value="OK">
</form:form>

</body>
</html>
