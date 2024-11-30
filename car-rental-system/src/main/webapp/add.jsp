<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ page import="java.util.Date" %>


<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Car Rental Form</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            display: flex;
            flex-direction: column;
            height: 100vh;
        }
        nav {
            background-color: #333;
            padding: 10px 20px;
        }
        nav a {
            color: white;
            text-decoration: none;
            margin-right: 15px;
            font-size: 16px;
        }
        nav a:hover {
            text-decoration: underline;
        }
        .content {
            flex-grow: 1;
            padding: 20px;
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
        form {
            max-width: 500px;
            margin: 0 auto;
            padding: 20px;
            border: 1px solid #ccc;
            border-radius: 8px;
            background-color: #f9f9f9;
        }
        label {
            display: block;
            margin-bottom: 8px;
            font-weight: bold;
        }
        input[type="text"], input[type="number"], input[type="date"], input[type="email"], input[type="checkbox"] {
            width: 100%;
            padding: 10px;
            margin-bottom: 15px;
            border: 1px solid #ccc;
            border-radius: 4px;
        }
        input[type="submit"] {
            background-color: #333;
            color: white;
            padding: 10px 20px;
            border: none;
            border-radius: 4px;
            cursor: pointer;
        }
        input[type="submit"]:hover {
            background-color: #555;
        }
        input[type="reset"] {
            background-color: #337;
            color: white;
            padding: 10px 20px;
            border: none;
            border-radius: 4px;
            cursor: pointer;
        }
        input[type="reset"]:hover {
            background-color: #556;
        }
    </style>
</head>
<body>

    <nav>
        <a href="index.jsp">Home</a>
    </nav>

    <div class="content">
        <h1>Car Rental Form</h1>
        <form action="CarRental" method="post">
           

            <label for="customerName">Customer Name</label>
            <input type="text" id="customerName" name="customerName" required>

            <label for="customerEmail">Customer Email</label>
            <input type="email" id="customerEmail" name="customerEmail" required>

            <label for="carModel">Car Model</label>
            <input type="text" id="carModel" name="carModel" required>

            <label for="carLicensePlate">Car License Plate</label>
            <input type="text" id="carLicensePlate" name="carLicensePlate" required>

            <label for="rentalStartDate">Rental Start Date</label>
            <input type="date" id="rentalStartDate" name="rentalStartDate" required>

            <label for="rentalEndDate">Rental End Date</label>
            <input type="date" id="rentalEndDate" name="rentalEndDate" required>

            <label for="rentalCost">Rental Cost</label>
            <input type="number" id="rentalCost" name="rentalCost" step="0.01" required>

            

            <input type="submit" value="Save Rental">
            <input type="reset" value="Reset">
        </form>
    </div>

   

</body>
</html>
