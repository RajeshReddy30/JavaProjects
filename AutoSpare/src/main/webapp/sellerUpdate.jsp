<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Update Page</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: silver;
            margin: 0;
            padding: 0;
        }

        header {
            background-color: #2ecc71;
            color: white;
            text-align: center;
            padding: 15px;
            position: relative;
        }

        .signin {
            position: absolute;
            top: 15px;
            right: 20px;
            padding: 10px;
            background-color: blue;
            color: white;
            border: none;
            cursor: pointer;
            font-size: 16px;
            border-radius: 5px;
        }

        .signin:hover {
            background-color: #3b69e5;
        }

        footer {
            background-color: #2ecc71;
            color: white;
            text-align: center;
            padding: 10px;
            position: fixed;
            bottom: 0;
            width: 100%;
        }

        .container {
            max-width: 800px;
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

        .form-group {
            display: flex;
            justify-content: space-between;
            flex-wrap: wrap;
        }

        .form-group > div {
            width: 48%;
        }

        .form-group > div.full-width {
            width: 100%;
        }

        .button {
            width: 100%;
            padding: 12px;
            background-color: #4CAF50;
            color: white;
            border: none;
            cursor: pointer;
            font-size: 16px;
            border-radius: 5px;
            margin-top: 10px;
        }

        .button:hover {
            background-color: #45a049;
        }

        .back-button {
            width: 100%;
            padding: 14px;
            background-color: #f44336;
            color: white;
            border: none;
            cursor: pointer;
            font-size: 16px;
            border-radius: 5px;
            margin-top: 10px;
        }

        .back-button:hover {
            background-color: #d32f2f;
        }

        .error-message {
            color: red;
            font-size: 13px;
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
            margin-top: 15px;
        }

        .button-container button {
            width: 48%;
            font-size: 16px;
        }

        .already-account {
            text-align: center;
            margin-top: 20px;
        }

        .already-account a {
            color: #4CAF50;
            text-decoration: none;
            font-size: 16px;
        }

        .already-account a:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>

<header>
    <h1>Update Page</h1>
</header>

<div class="container">
    <h2>Company Update Form</h2>
    <form id="registerForm" action="update" method="POST"> 
        <div class="form-group">
            <input type="hidden" id="id" name="id" value="${updateResult.id}" required>
            
            <div>
                <label for="name">Company Name <span class="required">*</span></label>
                <input type="text" id="name" name="name" class="input-field" value="${updateResult.name}" required>
            </div>

            <div>
                <label for="email">Email <span class="required">*</span></label>
                <input type="email" id="email" name="email" class="input-field" value="${updateResult.email}" required>
            </div>
        </div>

        <div class="form-group">
            <div>
                <label for="contactNumber">Contact Number <span class="required">*</span></label>
                <input type="tel" id="contactNumber" name="contactNumber" class="input-field" value="${updateResult.contactNumber}" required>
            </div>

            <div>
                <label for="address">Address <span class="required">*</span></label>
                <input type="text" id="address" name="address" class="input-field" value="${updateResult.address}" required>
            </div>
        </div>

        <div class="form-group">
            <div>
                <label for="gstNumber">GST Number <span class="required">*</span></label>
                <input type="text" id="gstNumber" name="gstNumber" class="input-field" value="${updateResult.gstNumber}" required pattern="^[A-Za-z0-9]{15}$">
            </div>

            <div>
                <label for="companyType">Company Type <span class="required">*</span></label>
                <input type="text" id="companyType" name="companyType" class="input-field" value="${updateResult.companyType}" required>
            </div>
        </div>

        <div class="form-group">
            <div>
                <label for="country">Country <span class="required">*</span></label>
                <input type="text" id="country" name="country" class="input-field" value="${updateResult.country}" required>
            </div>

            <div>
                <label for="state">State <span class="required">*</span></label>
                <input type="text" id="state" name="state" class="input-field" value="${updateResult.state}" required>
            </div>
        </div>

        <div class="form-group">
            <div>
                <label for="city">City <span class="required">*</span></label>
                <input type="text" id="city" name="city" class="input-field" value="${updateResult.city}" required>
            </div>

            <div>
                <label for="pincode">Pincode <span class="required">*</span></label>
                <input type="text" id="pincode" name="pincode" class="input-field" value="${updateResult.pincode}" required pattern="^\d{6}$">
            </div>
        </div>

        <div class="button-container">
            <button type="submit" class="button">Update</button>
            <button type="reset" class="back-button">Reset</button>
        </div>
    </form>

    <div class="already-account">
        <p>Already have an account? <a href="signin.jsp">Sign In</a></p>
    </div>
</div>

<footer>
    <p>&copy; 2024 Your Website. All rights reserved.</p>
</footer>

</body>
</html>
