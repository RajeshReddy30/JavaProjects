<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
/* Add borders to the table and cells */
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
</style>
</head>
<body>
<div align="center">><h1>Application Details</h1></div>
 <table class="table table-bordered table-striped table-hover">
        <thead class="table-dark">
            <tr>
                <th>Application Name</th>
                <th>App Size</th>
                <th>Description</th>
                <th>Offered By</th>
                <th>Rating</th>
            </tr>
        </thead>
        <tbody>
            <tr>
                <td>${appName}</td>
                <td>${appSize}</td>
                <td>${appDescr}</td>
                <td>${appofferBy}</td>
                <td>${appRates}</td>
            </tr>
        </tbody>
    </table>
</body>
</html>