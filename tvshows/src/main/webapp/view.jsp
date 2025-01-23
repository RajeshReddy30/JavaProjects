<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>TV Show Details</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<div class="container my-4">
    <h1 class="text-center">TV Show Details</h1>
    <form action="view" method="get">
        <div class="d-flex justify-content-end mb-3">
            <input type="submit" value="Submit" class="btn btn-primary">
        </div>
        <table class="table table-bordered table-striped table-hover">
            <thead class="table-light">
                <tr>
                    <th>TV Show Name</th>
                    <th>viewerName</th>
                    <th>viewingTime</th>
                    <th>actionType </th>
                   
                    <th>Created By</th>
                    <th>Created On</th>
                    
                </tr>
            </thead>
            <tbody>
                <c:forEach var="details" items="${views}">
                    <tr>
                        <td>${details.showName}</td>
                        <td>${details.viewerName}</td>
                        <td>${details.viewingTime}</td>
                        
                        <td>${details.createdBy}</td>
                        <td>${details.createdOn}</td>
                        <td>
    <a href="delete?id=${details.id}" class="btn btn-danger btn-sm">Delete</a>
    <a href="update?id=${details.id}" class="btn btn-success btn-sm">Update</a>
</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </form>
</div>
</body>
</html>
