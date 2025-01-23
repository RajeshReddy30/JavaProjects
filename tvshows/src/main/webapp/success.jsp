<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>TV Show </title>
<style>
.table {
    width: 80%;
    margin: 20px auto;
    border-collapse: collapse;
    border: 1px solid #000;
}

.table th, .table td {
    border: 1px solid #000;
    padding: 10px;
    text-align: left;
}

.table th {
    background-color: #f2f2f2;
}

.table-striped tbody tr:nth-child(odd) {
    background-color: #f9f9f9;
}

.table-hover tbody tr:hover {
    background-color: #dcdcdc;
}

h1 {
    text-align: center;
    font-size: 24px;
    margin-bottom: 20px;
}
</style>
</head>
<body>
<div>
    <h1>TV Show </h1>
</div>
<table class="table table-bordered table-striped table-hover">
    <thead>
        <tr>
            <th>TV Show Name</th>
            <th>Viewer Name</th>
            <th>Viewing Time</th>
            <th>Action Type</th>
            <th>Created By</th>
            <th>Action</th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td>${details.showName}</td>
            <td>${details.viewerName}</td>
            <td>${details.viewingTime}</td>
            <td>${details.actionType}</td>
            <td>${details.createdBy}</td>
            
            <td> <a href="delete?id=${details.id}" class="btn btn-danger btn-sm">Delete</a>
    <a href="update?id=${details.id}" class="btn btn-success btn-sm">Update</a></td>
        </tr>
    </tbody>
</table>
</body>
</html>

