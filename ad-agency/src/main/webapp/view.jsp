<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>



<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>view page</title>

<style>
table {
	border-collapse: collapse;
	margin-left: 10px;
	font-size: 13px;
	font-family: "Rubik", sans-serif;
	font-style: normal;
}

.delete {
	margin: 2px;
	font-size: 12px;
	font-family: monospace;
	color: white;
	background-color: red;
}

.update {
	margin: 2px;
	font-size: 12px;
	font-family: monospace;
	background-color: yellow;
}

tbody {
	background-color: rgb(243, 236, 177);
}

th {
	background-color: rgb(283, 206, 167);
}

.heading {
	color: navy;
}
</style>
</head>
<body>

	<form action="view" method="get">
	<a href="index.jsp"> <svg xmlns="http://www.w3.org/2000/svg"
				width="25" height="25" fill="currentColor"
				class="bi bi-arrow-left-circle" viewBox="0 0 16 16">
  <path fill-rule="evenodd"
					d="M1 8a7 7 0 1 0 14 0A7 7 0 0 0 1 8m15 0A8 8 0 1 1 0 8a8 8 0 0 1 16 0m-4.5-.5a.5.5 0 0 1 0 1H5.707l2.147 2.146a.5.5 0 0 1-.708.708l-3-3a.5.5 0 0 1 0-.708l3-3a.5.5 0 1 1 .708.708L5.707 7.5z" />
</svg></a>	
	
		<table border="2">
			<caption>
				
				<input type="submit" value="submit">
				<h2 class="heading">Ad Agency Details</h2>
			</caption>
			<thead>
				<tr>
					<th>Id</th>
					<th>Person Name</th>
					<th>Company Name</th>
					<th>Product Name</th>
					<th>Contact Number</th>
					<th>E-Mail</th>

					<th>Actions</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="dto" items="${listOfDto}">
					<tr>
						<td>${dto.id}</td>
						<td>${dto.personName}</td>
						<td>${dto.companyName}</td>
						<td>${dto.productName}</td>
						<td>${dto.contactNumber}</td>
						<td>${dto.email}</td>

						<td><a href="delete?id=${dto.id}"><button class="delete"
									type="button" value="delete">delete</button></a> <a
							href="update?id=${dto.id}"><button class="update"
									type="button" value="update">update</button></a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</form>
</body>
</html>