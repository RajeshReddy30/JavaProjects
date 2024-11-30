<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Login Page</title>

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
</head>
<body>
	<form action="login">

		<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
			<div class="container-fluid">
				<button class="btn btn-outline-light me-2" type="button">Home</button>

			</div>
		</nav>

		<div class="container mt-4">
			<form>
				<div class="mb-3">
					<label for="nameInput" class="form-label">UserName:</label>
					 <input
						type="text" name="name" class="form-control" id="nameInput"
						required>
				</div>

				<div class="mb-3">
					<label for="emailInput" class="form-label">Date of Birth:</label> <input
						type="date" name="date" class="form-control" id="emailInput"
						required>
				</div>
				<div class="mb-3">
					<label for="genderInput" class="form-label">Gender:</label>

					<div class="form-check">
						<input class="form-check-input" type="radio" name="gender"
							id="maleRadio" value="Male" checked> <label
							class="form-check-label" for="maleRadio">Male</label>
					</div>

					<div class="form-check">
						<input class="form-check-input" type="radio" name="gender"
							id="femaleRadio" value="Female"> <label
							class="form-check-label" for="femaleRadio">Female</label>
					</div>
				</div>
				<div class="mb-3">
					<label for="stateInput" class="form-label">State:</label> 
					<select
						class="form-select" id="stateInput" name="state" required>
						<option value="" disabled selected>Select a state</option>
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
						<option value="Tripura">Tripura</option>
						<option value="Uttarakhand">Uttarakhand</option>
						<option value="Uttar Pradesh">Uttar Pradesh</option>
						<option value="West Bengal">West Bengal</option>
						<option value="Andaman and Nicobar Islands">Andaman and
							Nicobar Islands</option>
						<option value="Chandigarh">Chandigarh</option>

						<option value="Lakshadweep">Lakshadweep</option>
						<option value="Delhi">Delhi</option>
						<option value="Puducherry">Puducherry</option>
					</select>
				</div>
				<div class="mb-3">
    <label for="languagesInput" class="form-label">Languages:</label>
    
    <div class="form-check">
        <input class="form-check-input" name="language" type="checkbox" value="English" id="englishCheckbox">
        
            English
        
    </div>
    
    <div class="form-check">
        <input class="form-check-input" name="language" type="checkbox" value="Hindi" id="hindiCheckbox">
        <label class="form-check-label" for="hindiCheckbox">
            Hindi
        </label>
    </div>
     <div class="form-check">
        <input class="form-check-input" name="language" type="checkbox" value="Telugu" id="teluguCheckbox">
        <label class="form-check-label" for="teluguCheckbox">
            Telugu
        </label>
    </div>
      <div class="form-check">
        <input class="form-check-input" name="language" type="checkbox" value="Kannada" id="kannadaCheckbox">
        <label class="form-check-label" for="kannadaCheckbox">
            Kannada
        </label>
    </div>





				<div class="d-flex justify-content-center">
					<button type="reset" class="btn btn-success me-2">Reset</button>
					<button type="submit" class="btn btn-primary">Submit</button>
				</div>
			</form>
		</div>


		<footer class="card-footer text-center text-light bg-dark mt-4">
			Designed By: Rajesh Reddy </footer>
	</form>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
		crossorigin="anonymous"></script>
</body>
</html>
