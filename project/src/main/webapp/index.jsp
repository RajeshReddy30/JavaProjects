<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Registration & Login Page</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: silver;
            margin: 0;
            padding: 0;
        }

        header {
            background-color: #333;
            color: white;
            text-align: center;
            padding: 15px;
        }

        footer {
            background-color: #333;
            color: white;
            text-align: center;
            padding: 10px;
            position: fixed;
            bottom: 0;
            width: 100%;
        }

        .container {
            text-align: center;
            margin-top: 100px;
        }

        .button {
            background-color: #4CAF50;
            color: white;
            padding: 14px 20px;
            margin: 10px;
            border: none;
            cursor: pointer;
            font-size: 16px;
            border-radius: 5px;
        }

        .button:hover {
            background-color: #45a049;
        }
    </style>
</head>
<body>

<header>
    <h1>Welcome to Our Website</h1>
</header>

<div class="container">
    <h2>Choose an action</h2>
    <button class="button" onclick="window.location.href='signup.jsp'">Sign Up</button>
    <button class="button" onclick="window.location.href='signin.jsp'">Sign In</button>
     <button class="button" onclick="window.location.href='admin.jsp'">Admin</button>
</div>

<footer>
    <p>&copy; 2024 Your Website. All rights reserved.</p>
</footer>

</body>
</html>