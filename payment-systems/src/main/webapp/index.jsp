<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Payment System</title>
<link rel="icon" href="ganesh.png" type="image/x-icon">
<style>
body {
	font-family: Arial, sans-serif;
	margin: 0;
	padding: 0;
	background-image:url(https://blogassets.airtel.in/wp-content/uploads/2024/07/Payment-Shock-What-It-Means-How-It-Works-Article-Image.jpg);

	background-size: cover;
	background-repeat: no-repeat;
	background-attachment: fixed;
	color: white;
}

header {
	display: flex;
	justify-content: space-between;
	align-items: center;
	padding: 10px 20px;
	background-color: #17d0e9;
	
}

.left-buttons {
	display: flex;
	align-items: center;
	gap: 10px;
}

.left-buttons img {
	height: 50px;
}

.right-buttons {
	display: flex;
	gap: 10px;
}

button {
	background-color: #f44336;
	color: white;
	padding: 10px 20px;
	border: none;
	border-radius: 4px;
	cursor: pointer;
}

button:hover {
	opacity: 0.8;
}

footer {
	
	color: white;
	padding: 20px;
	text-align: center;
	bottom: 0;
	position: fixed;
	width: 100%;
	 background-color: rgba(0, 0, 0, 0.5);
}

footer a {
	color: white;
	text-decoration: none;
}

footer a:hover {
	text-decoration: underline;
}

main {
	text-align: justify;
	padding: 100px;
}



.card-container {
	display: flex;
	flex-direction: row;
	justify-content: center; 
	gap: 20px; 
	margin: 20px 0;
}


p {
	margin: 1px;
}
</style>
</head>

<body>

	<header>
		<div class="left-buttons">
			<img src="https://img.freepik.com/premium-vector/gradient-payment-logo-design_269830-899.jpg?semt=ais_hybrid" alt="Payment Logo">
			<h2>Payment System</h2>
		</div>
		<div class="right-buttons">
			<button onclick="location.href='details.jsp'">Add</button>
		</div>
	</header>



	<footer>
		<p>&copy; 2024 PaymentSystem. All rights reserved.</p>
		<p>
			<a href="#">Privacy Policy</a> | <a href="#">Terms of Service</a>
		</p>
		<p>Contact: 9014812209</p>
	</footer>

</body>

</html>