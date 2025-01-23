<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Admin Page</title>
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
            max-width: 400px;
            margin: 50px auto;
            padding: 20px;
            background-color: white;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }

        .container h2 {
            text-align: center;
        }

        .input-field {
            width: 100%;
            padding: 8px;
            margin: 8px 0;
            border-radius: 4px;
            border: 1px solid #ccc;
        }

        .button {
            width: 100%;
            padding: 14px;
            background-color: #4CAF50;
            color: white;
            border: none;
            cursor: pointer;
            font-size: 16px;
            border-radius: 5px;
        }

        .button:hover {
            background-color: #45a049;
        }

        .back-button {
            padding: 10px 20px;
            background-color: #f44336;
            color: white;
            border: none;
            cursor: pointer;
            font-size: 14px;
            border-radius: 5px;
        }

        .back-button:hover {
            background-color: #d32f2f;
        }

        .error-message {
            color: red;
            font-size: 12px;
        }

        label {
            font-weight: bold;
        }

        .required {
            color: red;
        }

        .button-container {
            display: flex;
            justify-content: space-between;
            margin-top: 10px;
        }

        .button-container button {
            width: 48%;
            font-size: 14px;
        }

        .signup-link {
            text-align: center;
            margin-top: 20px;
        }

        .signup-link a {
            color: #4CAF50;
            text-decoration: none;
            font-size: 16px;
        }

        .signup-link a:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>

<header>
    <h1>Admin Page</h1>
</header>

<div class="container">
    <h2>Sign In</h2>
    <!-- Display Error Message if Login Fails -->
		<c:if test="${not empty check}">
			<div class="error-message">${check}</div>
		</c:if>
    <form id="loginForm" action="admin" method="POST">
        <div>
            <label for="email">Email <span class="required">*</span></label>
            <input type="email" id="email" name="email" class="input-field" placeholder="Enter Email" required minlength="5" maxlength="50">
            <small class="error-message" id="emailError"></small><br>
        </div>
        <div>
            <label for="password">Password <span class="required">*</span></label>
            <input type="password" id="password" name="password" class="input-field" placeholder="Enter Password" required minlength="8" maxlength="20">
            <small class="error-message" id="passwordError"></small><br>
        </div>
        <div class="button-container">
            <button type="submit" class="button">Sign In</button>
            <button class="back-button" type="reset" form="loginForm">Reset</button>
        </div>
    </form>

</div>

<footer>
    <p>&copy; 2024 Your Website. All rights reserved.</p>
</footer>

<script>
    document.getElementById('loginForm').onsubmit = function(event) {
        let valid = true;

        document.getElementById('emailError').textContent = '';
        document.getElementById('passwordError').textContent = '';

        const email = document.getElementById('email').value;
        const emailPattern = /^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$/;
        if (!email.match(emailPattern)) {
            document.getElementById('emailError').textContent = 'Please enter a valid email address.';
            valid = false;
        }

        const password = document.getElementById('password').value;
        const passwordPattern = /^(?=.*[A-Za-z])(?=.*\d)[A-Za-z\d@$!%*?&]{8,20}$/;
        if (!password.match(passwordPattern)) {
            document.getElementById('passwordError').textContent = 'Password must be between 8 and 20 characters and contain both letters and numbers.';
            valid = false;
        }

        if (!valid) {
            event.preventDefault();
        }
    }
</script>

</body>
</html>