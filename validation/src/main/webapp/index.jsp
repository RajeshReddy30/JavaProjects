<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Validation Page</title>
    <style>
        .valid {
            color: green;
        }
        .invalid {
            color: red;
        }
    </style>
</head>
<body>
    <div>
        <form action="" method="post" onsubmit="return validateForm()">
            <label>UserName:</label>
            <input type="text" placeholder="username" name="username" id="username" onChange="displayUserName()" required="required"><br>
            <span id="outputname"></span><br>

            <label>Email:</label>
            <input type="email" placeholder="email" name="email" id="email" onChange="displayEmail()" required="required"><br>
            <span id="outputemail"></span><br>

            <label>Address:</label>
            <input type="text" placeholder="address" name="address" id="address" onChange="displayAddress()" required="required"><br>
            <span id="outputAddress"></span><br>

            <label>Contact:</label>
            <input type="tel" placeholder="contactNumber" name="contact" id="contact" onChange="displayContact()" required="required"><br>
            <span id="outputcontact"></span><br>

            <label>Gender:</label>
            <input type="radio" name="gender" id="male">Male
            <input type="radio" name="gender" id="female">Female<br>

            <input type="submit"  value="Submit">
        </form>
    </div>

    <script type="text/javascript">
        function displayUserName() {
            const name = document.getElementById('username').value;
            const nameSpan = document.getElementById('outputname');
            if (name.length > 3) {
                nameSpan.innerHTML = 'Username: ' + name;
                nameSpan.className = 'valid';
            } else {
                nameSpan.innerHTML = 'Username must be at least 4 characters';
                nameSpan.className = 'invalid';
            }
        }

        function displayEmail() {
            const email = document.getElementById('email').value;
            const emailSpan = document.getElementById('outputemail');
            const emailRegex = /^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$/;
            if (emailRegex.test(email)) {
                emailSpan.innerHTML = 'Email: ' + email;
                emailSpan.className = 'valid';
            } else {
                emailSpan.innerHTML = 'Please enter a valid email address.';
                emailSpan.className = 'invalid';
            }
        }

        function displayAddress() {
            const address = document.getElementById('address').value;
            const addressSpan = document.getElementById('outputAddress');
            if (address.length > 5) {
                addressSpan.innerHTML = 'Address: ' + address;
                addressSpan.className = 'valid';
            } else {
                addressSpan.innerHTML = 'Address must be at least 6 characters.';
                addressSpan.className = 'invalid';
            }
        }

        function displayContact() {
            const contact = document.getElementById('contact').value;
            const contactSpan = document.getElementById('outputcontact');
            const contactRegex = /^[0-9]{10}$/;
            if (contactRegex.test(contact)) {
                contactSpan.innerHTML = 'Contact: ' + contact;
                contactSpan.className = 'valid';
            } else {
                contactSpan.innerHTML = 'Please enter a valid contact number.';
                contactSpan.className = 'invalid';
            }
        }

    </script>
</body>
</html>


