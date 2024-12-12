<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Player Action Details</title>
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
    <h1>Player Action Details</h1>
</div>
<table class="table table-bordered table-striped table-hover">
    <thead>
        <tr>
            <th>Player Name</th>
            <th>Player Score</th>
            <th>Player Level</th>
            <th>Action Type</th>
            <th>Action Time</th>
        </tr>
    </thead>
    <tbody>
        <!-- Assuming that "details" is an object of PlayerActionDto -->
        <tr>
            <td>${details.playerName}</td>
            <td>${details.playerScore}</td>
            <td>${details.playerLevel}</td>
            <td>${details.actionType}</td>
            <td>${details.actionTimestamp}</td>
        </tr>
    </tbody>
</table>
</body>
</html>
