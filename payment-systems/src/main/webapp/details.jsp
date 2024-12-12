<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
    background-color: #007BFF;
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
    background-color: #007BFF;
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
    <h1>Payment Form</h1>
    <button onclick="location.href='index.jsp'">HOME</button>
</header>

<div class="container mt-5">
    <form action="save" method="post">
        <div class="mb-3">
            <label for="receiverName" class="form-label">Receiver's Name</label>
            <input type="text" id="receiverName" name="receiverName" class="form-control" placeholder="Enter Receiver's Name">
        </div>

        <div class="mb-3">
            <label for="receiverPhoneNumber" class="form-label">Receiver's Phone Number</label>
            <input type="tel" id="receiverPhoneNumber" name="receiverPhoneNumber" class="form-control" placeholder="Enter Phone Number">
        </div>

        <div class="mb-3">
            <label for="amount" class="form-label">Amount</label>
            <input type="number" id="amount" name="amount" class="form-control" placeholder="Enter Amount">
        </div>

        <div class="mb-3">
            <label for="transactionId" class="form-label">Transaction ID</label>
            <input type="text" id="transactionId" name="transactionId" class="form-control" placeholder="Enter Transaction ID">
        </div>

        <div class="mb-3">
            <label for="paymentMethod" class="form-label">Payment Method</label>
            <input type="text" id="paymentMethod" name="paymentMethod" class="form-control" placeholder="Enter Method">
        </div>

        <div class="mb-3">
            <label for="transactionDate" class="form-label">Transaction Date</label>
            <input type="datetime-local" id="transactionDate" name="transactionDate" class="form-control">
        </div>

        <div class="mb-3">
            <label for="createdBy" class="form-label">Created By</label>
            <input type="text" id="createdBy" name="createdBy" class="form-control" placeholder="Enter Your Name">
        </div>

        <div>
            <button type="submit" class="btn btn-success w-45">Submit</button>
        </div>
    </form>
</div>

<footer class="d-flex justify-content-between align-items-center">
    <div id="localDateTime" class="ms-3"></div>
    <div class="text-center flex-grow-1">
        <p>&copy; 2024 PaymentSystem. All rights reserved.</p>
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

