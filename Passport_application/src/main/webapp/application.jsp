<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous"></script>
<body>
<form>
		<nav class="navbar navbar-light bg-light">
			<form class="container-fluid justify-content-start">
				<button>Home</button>
				<button>Apply</button>

			</form>

		</nav>
		<form>
		 <div class="mb-3">
    <label for="exampleInputPassword1" class="form-label">Name</label>
    <input type="text" class="form-control" id="exampleInputPassword1" name = "name">
  </div>
  
  <div class="mb-3">
    <label for="exampleInputPassword1" class="form-label">Father Name</label>
    <input type="text" class="form-control" id="exampleInputPassword1" name = "fatherName">
  </div>
  <div class="mb-3">
    <label for="exampleInputPassword1" class="form-label">Mother Name</label>
    <input type="text" class="form-control" id="exampleInputPassword1" name = "motherName">
  </div>
  <div class="mb-3">
    <label for="exampleInputPassword1" class="form-label">Aadhar Number</label>
    <input type="number" class="form-control" id="exampleInputPassword1"name = "aadharNumber">
  </div>
  <div class="mb-3">
    <label for="exampleInputPassword1" class="form-label">Contact Number</label>
    <input type="tel" class="form-control" id="exampleInputPassword1" name = "contactNumber">
  </div>
  <div class="mb-3">
    <label for="exampleInputPassword1" class="form-label">Address</label>
    <input type="address" class="form-control" id="exampleInputPassword1" name = "address">
  </div>
  <div class="mb-3">
    <label for="exampleInputPassword1" class="form-label">City</label>
    <input type="text" class="form-control" id="exampleInputPassword1"name = "city">
  </div>
  <div class="mb-3">
    <label for="exampleInputPassword1" class="form-label">State</label>
    <input type="password" class="form-control" id="exampleInputPassword1" name = "state">
  </div>
  <div class="mb-3">
    <label for="exampleInputPassword1" class="form-label">Pincode</label>
    <input type="password" class="form-control" id="exampleInputPassword1" name = "pincode">
  </div>
  <div class="mb-3">
    <label for="exampleInputPassword1" class="form-label">country</label>
    <input type="password" class="form-control" id="exampleInputPassword1" name = "country">
  </div>
  
  
  <button type="submit" class="btn btn-primary">Submit</button>
</form><div class="card-footer text-muted" align="center">
    Designed By:Rajesh Reddy
  </div>
</body>
</html>