<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="ISO-8859-1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>TV Show </title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f8f9fa;
        }

        header {
            background-color: #004f6c;
            color: white;
            padding: 15px;
            text-align: center;
        }

        header button {
            background-color: #28a745;
            color: white;
            border: none;
            padding: 10px 20px;
            border-radius: 5px;
            cursor: pointer;
        }

        header button:hover {
            background-color: #218838;
        }

        footer {
            background-color: #004f6c;
            color: white;
            padding: 20px;
            text-align: center;
        }

        footer a {
            color: white;
            text-decoration: none;
        }

        footer a:hover {
            text-decoration: underline;
        }

        .container {
            margin-top: 30px;
        }

        .form-label {
            font-weight: bold;
        }
    </style>
</head>

<body>

<header>
    <h1>TV Show </h1>
    <button onclick="location.href='index.jsp'">Home</button>
</header>

<div class="container mt-5">
    <form action="submit" method="post">
        <div class="mb-3">
            <label for="showName" class="form-label">TV Show Name</label>
            <input type="text" id="showName" name="showName" class="form-control" placeholder="Enter TV Show Name">
        </div>
        <div class="mb-3">
            <label for="viewerName" class="form-label">Viewer Name</label>
            <input type="text" id="viewerName" name="viewerName" class="form-control" placeholder="Enter Viewer Name">
        </div>
        <div class="mb-3">
            <label for="viewingTime" class="form-label">Viewing Time (minutes)</label>
            <input type="number" id="viewingTime" name="viewingTime" class="form-control" placeholder="Enter Viewing Time">
        </div>
        <div class="mb-3">
            <label for="actionType" class="form-label">Action Type</label>
            <input type="text" id="actionType" name="actionType" class="form-control" placeholder="Enter Action Type ">
        </div>
        <div class="mb-3">
            <label for="createdBy" class="form-label">Created By</label>
            <input type="text" id="createdBy" name="createdBy" class="form-control" placeholder="Enter created by ">
        </div>
        <div class="mb-3">
            <label for="createdOn" class="form-label">Created On</label>
            <input type="datetime-local" id="createdOn" name="createdOn" class="form-control" placeholder="Enter created on ">
        </div>
        <div>
            <button type="submit" class="btn btn-success w-45">Submit </button>
        </div>
    </form>
</div>

<footer>
    <p>&copy; 2024 TVShow. All rights reserved.</p>
    <p>
        <a href="#">Privacy Policy</a> | <a href="#">Terms of Service</a>
    </p>
    <p>Contact: 9014812209</p>
</footer>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
