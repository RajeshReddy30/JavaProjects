<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="ISO-8859-1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Cricket Team Details</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f9;
            margin: 0;
            padding: 0;
        }
        header {
            background-color: #007BFF;
            color: white;
            padding: 10px 20px;
            text-align: center;
        }
        nav {
            display: flex;
            justify-content: center;
            background-color: #444;
            padding: 10px 0;
        }
        nav a {
            color: white;
            padding: 10px 20px;
            text-decoration: none;
            text-transform: uppercase;
            font-weight: bold;
        }
        nav a:hover {
            background-color: #555;
        }
        .container {
            width: 50%;
            margin: 20px auto;
            background-color: white;
            padding: 20px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            border-radius: 8px;
        }
        label {
            font-size: 16px;
            font-weight: 600;
            display: block;
            margin: 10px 0 5px;
        }
        input[type="text"], input[type="number"], input[type="submit"], input[type="reset"] {
            width: 100%;
            padding: 10px;
            font-size: 14px;
            border: 1px solid #ddd;
            border-radius: 5px;
            margin-bottom: 10px;
            box-sizing: border-box;
        }
        input[type="submit"] {
            background-color: #5cb85c;
            color: white;
            cursor: pointer;
        }
        input[type="submit"]:hover {
            background-color: #4cae4c;
        }
        input[type="reset"] {
            background-color: #FF4136;
            color: white;
            cursor: pointer;
        }
        input[type="reset"]:hover {
            background-color: #FF2D1F;
        }
        footer {
            background-color: #007BFF;
            color: white;
            padding: 20px 0;
            text-align: center;
            position: relative;
            bottom: 0;
            width: 100%;
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
    <h1>Cricket Team Information</h1>
</header>

<nav>
    <a href="#">Home</a>
    
</nav>

<div class="container">
    <form action="cricket" method="post">
       
        <label for="teamName">Team Name:</label>
        <input type="text" id="teamName" name="teamName" placeholder="Enter Team Name" required><br>

        <label for="teamBoard">Team Board:</label>
        <input type="text" id="teamBoard" name="teamBoard" placeholder="Enter Team Board" required><br>

        <label for="captain">Captain:</label>
        <input type="text" id="captain" name="captain" placeholder="Enter Captain's Name" required><br>

        <label for="coach">Coach:</label>
        <input type="text" id="coach" name="coach" placeholder="Enter Coach's Name" required><br>

        <label for="matchesPlayed">Matches Played:</label>
        <input type="number" id="matchesPlayed" name="matchesPlayed" placeholder="Enter Matches Played" required><br>

        <label for="matchesWon">Matches Won:</label>
        <input type="number" id="matchesWon" name="matchesWon" placeholder="Enter Matches Won" required><br>

        <label for="worldCupsWon">World Cups Won:</label>
        <input type="number" id="worldCupsWon" name="worldCupsWon" placeholder="Enter World Cups Won" required><br>

        <input type="submit" value="Submit">
        <input type="reset" value="Reset">
    </form>
</div>

<footer>
    <p>&copy; 2024 Cricket Team Info. All rights reserved.</p>
    <p><a href="#">Privacy Policy</a> | <a href="#">Terms of Service</a></p>
</footer>

</body>
</html>



