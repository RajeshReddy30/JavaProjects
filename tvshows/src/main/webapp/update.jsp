<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Update TV Show</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<div class="container my-4">
    <h1 class="text-center">Update TV Show</h1>
    <form action="update" method="post">
        <input type="hidden" name="id" value="${message.id}" />
        <div class="mb-3">
            <label for="tvShowId" class="form-label">TV Show Name</label>
            <input type="number" id="tvShowId" name="tvShowId" class="form-control" value="${message.showName}" required />
        </div>
        <div class="mb-3">
            <label for="title" class="form-label">viewerName</label>
            <input type="text" id="title" name="title" class="form-control" value="${message.viewerName}" required />
        </div>
        <div class="mb-3">
            <label for="genre" class="form-label">viewingTime</label>
            <input type="text" id="genre" name="genre" class="form-control" value="${message.viewingTime}" required />
        </div>
        <div class="mb-3">
            <label for="releaseYear" class="form-label">createdBy</label>
            <input type="text" id="releaseYear" name="releaseYear" class="form-control" value="${message.createdBy}" required />
        </div>
        <div class="mb-3">
            <label for="rating" class="form-label">createdOn</label>
            <input type="number" id="rating" name="rating" class="form-control" value="${message.createdOn}" required />
        </div>
       
       
        <div class="d-flex justify-content-end">
            <button type="submit" class="btn btn-success">Update</button>
            
        </div>
    </form>
</div>
</body>
</html>
