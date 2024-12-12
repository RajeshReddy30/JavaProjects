<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>TV Show </title>
<link rel="icon" href="tv-show-icon.png" type="image/x-icon">
<style>
body {
	font-family: Arial, sans-serif;
	margin: 0;
	padding: 0;
	background-image: url('https://images.unsplash.com/photo-1562069564-d1a18d6d4b7f');
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
	background-color: #004f6c;
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
	background-color: #007bff;
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
		<img src="https://upload.wikimedia.org/wikipedia/commons/a/a7/Logo_of_PlayStation.svg" alt="TV Show Logo">
		<h2>TV Show </h2>
	</div>
	<div class="right-buttons">
		<button onclick="location.href='details.jsp'">Submit TV Show </button>
	</div>
</header>

<main>
	<div class="card-container">
		<!-- Add Cards or Information Here -->
	</div>
</main>

<footer>
	<p>&copy; 2024 TVShow. All rights reserved.</p>
	<p>
		<a href="#">Privacy Policy</a> | <a href="#">Terms of Service</a>
	</p>
	<p>Contact: 9014812209</p>
</footer>

</body>
</html>

