<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>MetaApp Details</title>

<!-- Bootstrap CDN -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">

</head>
<body>

<div class="container mt-5">
    <div class="row justify-content-center">
        <div class="col-md-6">
            <div class="card shadow">
                <div class="card-header text-center bg-primary text-white">
                    <h3>Enter MetaApp Details</h3>
                </div>
                <div class="card-body">
                    <form action="submit">
                        <div class="mb-3">
                            <label class="form-label">Application Name</label>
                            <input type="text" name="appName" class="form-control" placeholder="Enter App Name">
                        </div>
                        <div class="mb-3">
                            <label class="form-label">Application Size</label>
                            <input type="number" name="appSize" class="form-control" placeholder="Enter App Size">
                        </div>
                        <div class="mb-3">
                            <label class="form-label">Application Description</label>
                            <textarea name="appDesc" class="form-control" rows="3" placeholder="Enter App Description"></textarea>
                        </div>
                        <div class="mb-3">
                            <label class="form-label">Application Rating</label>
                            <input type="number" name="appRate" class="form-control" placeholder="Enter App Rating">
                        </div>
                        <div class="d-grid">
                            <button type="submit" class="btn btn-success">Submit</button>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>

<!-- Bootstrap JS (Optional, for interactive components like modals, tooltips) -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>
