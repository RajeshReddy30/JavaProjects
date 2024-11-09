<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="ISO-8859-1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Saved Successfully</title>

   
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <style>
        
        .form-container {
            max-width: 600px;
            margin: 0 auto;
            padding: 20px;
        }
        .card-footer {
            background-color: #343a40;  
            color: white;  
            text-align: center;
            padding: 10px;
        }
        .navbar-custom {
            background-color: #007bff;  
        }
        .navbar-custom .navbar-brand {
            color: white;  
        }
    </style>
</head>
<body>

    
    <nav class="navbar navbar-light navbar-custom">
        <a class="navbar-brand" href="index.jsp">Home</a>
    </nav>

    
    <div class="form-container mt-5">
        <h1 class="text-center mb-4">Saved Successfully</h1>

       
        <form>
            <div class="mb-3">
                <label for="name" class="form-label">Name</label>
                <input type="text" class="form-control" id="name" value="${Name}" readonly>
            </div>

            <div class="mb-3">
                <label for="email" class="form-label">Email</label>
                <input type="email" class="form-control" id="email" value="${Email}" readonly>
            </div>

            <div class="mb-3">
                <label for="contact" class="form-label">Contact</label>
                <input type="text" class="form-control" id="contact" value="${Contact}" readonly>
            </div>

            <div class="mb-3">
                <label for="description" class="form-label">Description</label>
                <input type="text" class="form-control" id="description" value="${Description}" readonly>
            </div>

            
            <div class="d-flex justify-content-center">
                <a href="index.jsp">
                    <button type="button" class="btn btn-primary">Back to Enquiry</button>
                </a>
            </div>
        </form>
    </div>

    
    <div class="card-footer text-muted">
        Designed By: Rajesh Reddy
    </div>

    
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</body>
</html>

