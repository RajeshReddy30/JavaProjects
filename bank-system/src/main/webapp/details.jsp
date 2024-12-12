<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="ISO-8859-1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Payment Form</title>
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
    <h1>Bank Payment Form</h1>
    <button onclick="location.href='index.jsp'">Home</button>
</header>

<div class="container mt-5">
    <form action="submit" method="post">
        <div class="mb-3">
            <label for="accountHolderName" class="form-label">Account Holder Name</label>
            <input type="text" id="accountHolderName" name="accountHolderName" class="form-control" placeholder="Enter Account Holder's Name">
        </div>
        <div class="mb-3">
            <label for="accountNumber" class="form-label">Account Number</label>
            <input type="number" id="accountNumber" name="accountNumber" class="form-control" placeholder="Enter Account Number">
        </div>

        <div class="mb-3">
            <label for="transactionAmount" class="form-label">Transaction Amount</label>
            <input type="number" id="transactionAmount" name="transactionAmount" class="form-control" placeholder="Enter Amount">
        </div>

        <div class="mb-3">
            <label for="transactionId" class="form-label">Transaction ID</label>
            <input type="text" id="transactionId" name="transactionId" class="form-control" placeholder="Enter Transaction ID">
        </div>

        <div class="mb-3">
            <label for="paymentMethod" class="form-label">Payment Method</label>
            <input type="text" id="paymentMethod" name="paymentMethod" class="form-control" placeholder="Enter Payment Method">
        </div>

        <div class="mb-3">
            <label for="transactionDate" class="form-label">Transaction Date</label>
            <input type="datetime-local" id="transactionDate" name="transactionDate" class="form-control">
        </div>

        <div class="mb-3">
            <label for="initiatedBy" class="form-label">Initiated By</label>
            <input type="text" id="initiatedBy" name="initiatedBy" class="form-control" placeholder="Enter Your Name">
        </div>

        <div>
            <button type="submit" class="btn btn-success w-45">Submit</button>
        </div>
    </form>
</div>

<footer class="d-flex justify-content-between align-items-center">
    <div id="localDateTime" class="ms-3"></div>
    <div class="text-center flex-grow-1">
        <p>&copy; 2024 BankingSystem. All rights reserved.</p>
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
