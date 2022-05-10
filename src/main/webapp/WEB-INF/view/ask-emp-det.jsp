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
    <form:errors path="name"/>
    <br><br>
    surname: <form:input path="surname"/>
    <form:errors path="surname"/>
    <br><br>
    salary: <form:input path="salary"/>
    <form:errors path="salary"/>
    <br><br>
    department <form:select path="department">
    <form:option value="Information Tecgnology" label="IT"/>
    <form:option value="Human Resources" label="HR"/>
    <form:option value="Sales" label="Sales"/>
    </form:select>
    <br><br>
    english level <form:select path="englishLevel">
    <form:options items="${employee.englishLevels}"/>
    </form:select>
    <br><br>
    Which car do you want?
    <form:radiobutton path="carBrand" value="BMW"/> BMW
    <form:radiobutton path="carBrand" value="Audi"/> Audi
    <form:radiobutton path="carBrand" value="Mercedes"/> Mercedes
    <br><br>
    What operating system do you have?
    <form:radiobuttons path="operatingSystem" items="${employee.operatingSystems}"/>
    <br><br>
    Foreign language(s): 
    <form:checkbox path="languages" value="English"/> ENG
    <form:checkbox path="languages" value="Deutch"/> DE
    <form:checkbox path="languages" value="French"/> FR
    <br><br>
    Possible place(s) of work:
    <form:checkboxes path="possiblePlacesOfWork" items="${employee.possiblePlacesOfWorkMap}"/>
    <br><br>
    phone number: <form:input path="phoneNumber"/>
    <form:errors path="phoneNumber"/>
    <br><br>
    <input type="submit" value="OK">
</form:form>

</body>
</html>
