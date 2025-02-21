<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Registration Page</title>
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
    <h2>Sign Up</h2>
    <form id="registerForm" action="update" method="POST"> 
        <div class="form-group">
        <input type="hidden" id="id" name="id" value="${updateResult.id }" required>
					 
        
            <div>
                <label for="username">Username <span class="required">*</span></label>
                <input type="text" id="username" name="userName" class="input-field" value="${updateResult.userName }" required minlength="5" maxlength="20">
                <small class="error-message" id="usernameError"></small><br>
            </div>
            <div>
                <label for="password">Password <span class="required">*</span></label>
                <input type="password" id="password" name="password" class="input-field" value="${updateResult.password }"  required minlength="8" maxlength="20" 
                       pattern="^(?=.*[A-Za-z])(?=.*\d)[A-Za-z\d@$!%*?&]{8,}$" title="Password must be at least 8 characters long and contain both letters and numbers.">
                <small class="error-message" id="passwordError"></small><br>
            </div>
        </div>

        <div class="form-group">
            <div>
                <label for="email">Email <span class="required">*</span></label>
                <input type="email" id="email" name="email" class="input-field" value="${updateResult.email }"required pattern="^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$" title="Please enter a valid email address." onchange="checkEmail()">
                <small class="error-message" id="emailError"></small>
                <span class="error-message" id="mailResponse"></span>
            </div>
            <div>
                <label for="aadhar">Aadhar Number <span class="required">*</span></label>
                <input type="num" id="aadhar" name="aadharNumber" class="input-field" value="${updateResult.aadharNumber }"  required maxlength="12" pattern="^\d{12}$" title="Aadhar number should be 12 digits." onchange="checkAadhar()">
                <small class="error-message" id="aadharError"></small>
                <span class="error-message" id="aadharResponse"></span>
            </div>
        </div>

        <div class="form-group">
            <div>
                <label for="contact">Contact Number <span class="required">*</span></label>
                <input type="text" id="contact" name="contactNumber" class="input-field" value="${updateResult.contactNumber }"  required pattern="^\d{10}$" title="Contact number should be 10 digits." onchange="checkContact()">
                <span class="error-message"  id="contactResponse"></span>
                <small class="error-message" id="contactError"></small><br>
            </div>
            <div>
                <label for="dob">Date of Birth <span class="required">*</span></label>
                <input type="date" id="dob" name="dateOfBirth" class="input-field" value="${updateResult.dateOfBirth }" required>
                <small class="error-message" id="dobError"></small><br>
            </div>
        </div>

        <div class="form-group">
            <div>
                <label for="country">Country <span class="required">*</span></label>
                <input type="text" id="country" name="country" class="input-field" value="India" readonly><br>
            </div>
            <div>
                <label for="state">State <span class="required">*</span></label>
                <select id="state" name="state" class="input-field" required>
                <option  value="${updateResult.state }">${updateResult.state }</option>
                    <option value="">Select State</option>
                    <option value="Andhra Pradesh">Andhra Pradesh</option>
                    <option value="Arunachal Pradesh">Arunachal Pradesh</option>
                    <option value="Assam">Assam</option>
                    <option value="Bihar">Bihar</option>
                    <option value="Chhattisgarh">Chhattisgarh</option>
                    <option value="Goa">Goa</option>
                    <option value="Gujarat">Gujarat</option>
                    <option value="Haryana">Haryana</option>
                    <option value="Himachal Pradesh">Himachal Pradesh</option>
                    <option value="Jharkhand">Jharkhand</option>
                    <option value="Karnataka">Karnataka</option>
                    <option value="Kerala">Kerala</option>
                    <option value="Madhya Pradesh">Madhya Pradesh</option>
                    <option value="Maharashtra">Maharashtra</option>
                    <option value="Manipur">Manipur</option>
                    <option value="Meghalaya">Meghalaya</option>
                    <option value="Mizoram">Mizoram</option>
                    <option value="Nagaland">Nagaland</option>
                    <option value="Odisha">Odisha</option>
                    <option value="Punjab">Punjab</option>
                    <option value="Rajasthan">Rajasthan</option>
                    <option value="Sikkim">Sikkim</option>
                    <option value="Tamil Nadu">Tamil Nadu</option>
                    <option value="Telangana">Telangana</option>
                    <option value="Uttar Pradesh">Uttar Pradesh</option>
                    <option value="Uttarakhand">Uttarakhand</option>
                    <option value="West Bengal">West Bengal</option>
                </select><br>
            </div>
        </div>

        <div class="form-group">
            <div>
                <label for="city">City <span class="required">*</span></label>
                <input type="text" id="city" name="city" class="input-field" value="${updateResult.city }" required><br>
            </div>
            <div>
                <label for="pincode">Pincode <span class="required">*</span></label>
                <input type="text" id="pincode" name="pincode" class="input-field" value="${updateResult.pincode }"  required pattern="^\d{6}$" title="Pincode should be 6 digits."><br>
            </div>
        </div>

        <div class="form-group">
            <div class="full-width">
                <label for="address">Address <span class="required">*</span></label>
                <input id="address" name="address" class="input-field" value="${updateResult.address }" required rows="4"><br>
            </div>
        </div>

        <div class="button-container">
            <button type="submit" class="button">update</button>
            <button type="reset" class="back-button" onclick="document.getElementById('registerForm').reset();">Reset</button>
        </div>
    </form>

    <div class="already-account">
        <p>Already have an account? <a href="signin.jsp">Sign In</a></p>
    </div>
</div>

<footer>
    <p>&copy; 2024 Your Website. All rights reserved.</p>
</footer>

<script type="text/javascript">
function checkEmail() {
    var userEmail = document.getElementById("email").value;
    console.log(userEmail);
    const req = new XMLHttpRequest();
    req.open("GET", "http://localhost:8080/project/getMail?email=" + encodeURIComponent(userEmail), true);
    req.send();
    req.onload = function() {
        if (req.status === 200) {
            document.getElementById("mailResponse").innerHTML = req.responseText;
        }
    }
}
function checkAadhar(){
	var aadhar=document.getElementById("aadhar").value;
	 console.log(aadhar);
	    const req = new XMLHttpRequest();
	    req.open("GET", "http://localhost:8080/project/getAadhar?aadharNumber="+encodeURIComponent(aadhar), true);
	    req.send();
	    req.onload = function() {
	        if (req.status === 200) {
	            document.getElementById("aadharResponse").innerHTML = req.responseText;
	        }
	    }
	
}
function checkContact(){
	var contact=document.getElementById("contact").value;
	 console.log(contact);
	    const req = new XMLHttpRequest();
	    req.open("GET", "http://localhost:8080/project/getContact?contactNumber="+encodeURIComponent(contact), true);
	    req.send();
	    req.onload = function() {
	        if (req.status === 200) {
	            document.getElementById("contactResponse").innerHTML = req.responseText;
	        }
	    }
	
}
</script>

</body>
</html>