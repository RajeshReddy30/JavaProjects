<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@  taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>home page</title>
</head>
<body>
<form action="GetName">
<input type="submit" value="GetName">
</form>

    <c:forEach items="${lists}" var="name">
    <p>${name}</p>
    </c:forEach>
</body>
</html>