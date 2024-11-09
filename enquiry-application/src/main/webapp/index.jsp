<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="ISO-8859-1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Home Page</title>
   
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
<form action="enquiry">
   
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
        <div class="container-fluid">
            <button class="btn btn-outline-light me-2" type="button">Home</button>
            <button class="btn btn-outline-light" type="button">Enquiry</button>
        </div>
    </nav>

    <div class="container mt-4">
        <form>
            <div class="mb-3">
                <label for="nameInput"  class="form-label">Name</label>
                <input type="text" name="name" class="form-control" id="nameInput" required>
            </div>

            <div class="mb-3">
                <label for="emailInput"  class="form-label">Email Address</label>
                <input type="email" name="email" class="form-control" id="emailInput" aria-describedby="emailHelp" required>
                <div id="emailHelp" class="form-text">We'll never share your email with anyone else.</div>
            </div>

            <div class="mb-3">
                <label for="contactInput"  class="form-label">Contact Number</label>
                <input type="tel" name="contacts" class="form-control" id="contactInput" required>
            </div>

            <div class="mb-3">
                <label for="descriptionInput"  class="form-label">Description</label>
                <input type="text" name="description" class="form-control" id="descriptionInput" required>
            </div>

            
            <div class="d-flex justify-content-center">
                <button type="reset" class="btn btn-success me-2">Reset</button>
                <button type="submit" class="btn btn-primary">Submit</button>
            </div>
        </form>
    </div>

   
    <footer class="card-footer text-center text-light bg-dark mt-4">
        Designed By: Rajesh Reddy
    </footer>
 </form>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</body>
</html>

