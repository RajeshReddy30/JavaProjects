<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Meta App Details</title>
<style>
/* Table Styling */
.table {
    width: 80%;
    margin: 20px auto;
    border-collapse: collapse;
    border: 1px solid #000; /* Black border for the table */
}

.table th, .table td {
    border: 1px solid #000; /* Black border for cells */
    padding: 10px;
    text-align: left;
}

.table th {
    background-color: #f2f2f2; /* Light gray background for headers */
}

.table-striped tbody tr:nth-child(odd) {
    background-color: #f9f9f9; /* Alternating row colors */
}

.table-hover tbody tr:hover {
    background-color: #dcdcdc; /* Highlight row on hover */
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
    <h1>Application Details</h1>
</div>
<table class="table table-bordered table-striped table-hover">
    <thead>
        <tr>
            <th>Application Name</th>
            <th>App Size</th>
            <th>Description</th>           
            <th>Rating</th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td>${appDetails.appName}</td>
            <td>${appDetails.appSize}</td>
            <td>${appDetails.appDesc}</td>
            <td>${appDetails.appRate}</td>
        </tr>
    </tbody>
</table>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>