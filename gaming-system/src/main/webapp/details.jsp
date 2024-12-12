<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="ISO-8859-1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Player Action Form</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f8f9fa;
            color: #212529;
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
    </style>
</head>

<body>

<header>
    <h1>Player Action Form</h1>
    <button onclick="location.href='index.jsp'">Home</button>
</header>

<div class="container mt-5">
    <form action="submit" method="post">
        <div class="mb-3">
            <label for="playerName" class="form-label">Player Name</label>
            <input type="text" id="playerName" name="playerName" class="form-control" placeholder="Enter Player's Name">
        </div>
        <div class="mb-3">
            <label for="playerScore" class="form-label">Player Score</label>
            <input type="number" id="playerScore" name="playerScore" class="form-control" placeholder="Enter Player's Score">
        </div>
        <div class="mb-3">
            <label for="playerLevel" class="form-label">Player Level</label>
            <input type="number" id="playerLevel" name="playerLevel" class="form-control" placeholder="Enter Player's Level">
        </div>
        <div class="mb-3">
            <label for="actionType" class="form-label">Action Type</label>
            <input type="text" id="actionType" name="actionType" class="form-control" placeholder="Enter Action Type">
        </div>
        <div>
            <button type="submit" class="btn btn-success w-45">Submit Action</button>
        </div>
    </form>
</div>

<footer class="d-flex justify-content-between align-items-center">
    <div id="localDateTime" class="ms-3"></div>
    <div class="text-center flex-grow-1">
        <p>&copy; 2024 GamingSystem. All rights reserved.</p>
        <p>
            <a href="#">Privacy Policy</a> | <a href="#">Terms of Service</a>
        </p>
    </div>
    <div class="text-center me-3">
        <p>Contact: 9014812209</p>
    </div>
</footer>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
