<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    <title>Show employee's details</title>
</head>
<body>
<h2>Dear employee, you are welcome!</h2>
<br>
<br>
<br>
Your name: ${employee.name}
<br>
Your surname: ${employee.surname}
<br>
Your salary: ${employee.salary}
<br>
Your department: ${employee.department}
<br>
Your english level: ${employee.englishLevel}
<br>
Your car: ${employee.carBrand}
<br>
Your operating system: ${employee.operatingSystem}
<br>
Your foreign language(s):
<ul>
    <c:forEach var="language" items="${employee.languages}">
        <li>${language}</li>
    </c:forEach>
</ul>
Your possible place(s) of work:
<ul>
    <c:forEach var="place" items="${employee.possiblePlacesOfWork}">
        <li>${place}</li>
    </c:forEach>
</ul>
</body>
</html>
