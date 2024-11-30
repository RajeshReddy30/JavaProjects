<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Gadget List</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container my-5">
    <h1 class="text-center mb-4">Gadget List</h1>
    <div class="d-flex justify-content-end mb-3">
        <form action="view" method="get">
            <input type="submit" value="view">
        </form>
    </div>
    <table class="table table-bordered table-striped table-hover">
        <thead class="table-dark">
            <tr>
                <th>Id</th>
                <th>Gadget Id</th>
                <th>Gadget Name</th>
                <th>Gadget Type</th>
                <th>ACTION</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="read" items="${read}">
                <tr>
                    <td>${read.id}</td>
                    <td>${read.gadgetId}</td>
                    <td>${read.gadgetName}</td>
                    <td>${read.gadgetType}</td>
                    <td>
                       <a href="delete?id=${read.id}" ><input type="button" class="btn btn-warning" value="Delete"></a>
                       <a href="update?id=${read.id}"><input type="button" class="btn btn-primary" value="Update"></a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>