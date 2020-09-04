<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<h3>Email</h3>
<form:form action="/email" method="post" modelAttribute="Email">
<fieldset>
    <form:select path="language">
    <form:option value="VietNam"> Việt Nam </form:option>
    <form:option value="English">English</form:option>
    <form:option value="japan">Japan</form:option>
    </form:select><br>
    <form:select path="page"> Email per page
    <form:option value="5"> 5 page</form:option>
    <form:option value="10">10 page</form:option>
    <form:option value="20">20 page</form:option>
    <form:option value="50">50 page</form:option>
    </form:select><br>
    <form:label path="filter">Filter</form:label>
        <form:checkbox path="filter"/><br>
    <form:label path="sign">signature</form:label>
        <form:textarea path="sign"/><br>
    <input type="submit" value="Save">
    <input type="button" value="Cancel">
    </form:form>
</body>
</html>