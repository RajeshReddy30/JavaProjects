<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Parking Management System - Registration</title>
    <style>
        body {
            font-family: Arial, sans-serif;
        }
        form {
            width: 300px;
            margin: auto;
        }
        label {
            display: block;
            margin-top: 10px;
        }
        input[type="text"], input[type="email"], input[type="password"], input[type="tel"], input[type="date"], select {
            width: 100%;
            padding: 8px;
            margin-top: 5px;
        }
        input[type="submit"] {
            margin-top: 20px;
            padding: 10px;
            width: 100%;
            background-color: #4CAF50;
            color: white;
            border: none;
            cursor: pointer;
        }
        input[type="submit"]:hover {
            background-color: #45a049;
        }
    </style>
</head>
<body>
    <h2 style="text-align: center;">Register</h2>
    <form action="registerUser" method="post">
        <label for="username">Username:</label>
        <input type="text" id="username" name="username" required><br><br>

        <label for="email">Email:</label>
        <input type="email" id="email" name="email" required><br><br>

        <label for="phone">Phone Number:</label>
        <input type="tel" id="phone" name="phone" pattern="[0-9]{10}" required title="Please enter a 10-digit phone number"><br><br>

        <label for="dob">Date of Birth:</label>
        <input type="date" id="dob" name="dob" required><br><br>

        <label for="address">Address:</label>
        <input type="text" id="address" name="address" required><br><br>

        <label for="password">Password:</label>
        <input type="password" id="password" name="password" required><br><br>

        <label for="confirmPassword">Confirm Password:</label>
        <input type="password" id="confirmPassword" name="confirmPassword" required><br><br>

        <label for="vehicleType">Vehicle Type:</label>
        <select id="vehicleType" name="vehicleType" required>
            <option value="">Select Vehicle Type</option>
            <option value="Car">Car</option>
            <option value="Bike">Bike</option>
            <option value="Truck">Truck</option>
        </select><br><br>

        <label for="preferredParking">Preferred Parking Location:</label>
        <input type="text" id="preferredParking" name="preferredParking"><br><br>

        <input type="submit" value="Register">
    </form>
    <br>
    <a href="login.jsp">Already have an account? Login here</a>
</body>
</html>
