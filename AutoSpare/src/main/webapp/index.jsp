<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Registration & Login Page</title>
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">

    <style>
        :root {
            --header-bg: #2ecc71;
            --footer-bg: #2ecc71;
            --button-primary: #e74c3c;
            --button-secondary: #f39c12;
            --dropdown-bg: #16a085; 
            --dropdown-item-bg: #1abc9c; 
            --dropdown-item-hover: #16a085; 
            --dropdown-item-active: #1abc9c; 
        }

        body {
            display: flex;
            flex-direction: column;
            min-height: 100vh;
            background-color: #ecf0f1;
        }

        main {
            flex: 1;
        }

        .navbar {
            background-color: var(--header-bg) !important;
        }

        .navbar-brand, .navbar-nav .nav-link {
            color: white !important;
        }

        .btn-custom-primary {
            background-color: var(--button-primary);
            border-color: var(--button-primary);
            color: white;
        }

        .btn-custom-primary:hover {
            background-color: #c0392b;
            border-color: #c0392b;
            color: white;
        }

        .btn-custom-secondary {
            background-color: var(--button-secondary);
            border-color: var(--button-secondary);
            color: white;
        }

        .btn-custom-secondary:hover {
            background-color: #d35400;
            border-color: #d35400;
            color: white;
        }

        footer {
            background-color: var(--footer-bg);
        }

        .form-row {
            display: flex;
            flex-wrap: wrap;
        }

        .form-col {
            flex: 1;
            margin-right: 20px;
        }

        .form-col:last-child {
            margin-right: 0;
        }

        .form-group {
            margin-bottom: 1rem;
        }

        .navbar .dropdown-menu {
            background-color: var(--dropdown-bg);
        }

        .navbar .dropdown-item {
            background-color: var(--dropdown-item-bg);
            color: white;
        }

        .navbar .dropdown-item:hover {
            background-color: var(--dropdown-item-hover);
        }

        .navbar .dropdown-item:active {
            background-color: var(--dropdown-item-active);
        }

    </style>
</head>

<body>

    <header>
        <nav class="navbar navbar-expand-lg navbar-dark">
            <div class="container">
                <a class="navbar-brand" href="#">Your Logo</a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav"
                    aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarNav">
                    <ul class="navbar-nav ms-auto">
                        <!-- User Dropdown -->
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                                User
                            </a>
                            <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                                <li><a class="dropdown-item" href="signup.jsp">Sign Up</a></li>
                                <li><a class="dropdown-item" href="signin.jsp">Sign In</a></li>
                            </ul>
                        </li>

                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" href="#" id="sellerDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                                Seller
                            </a>
                            <ul class="dropdown-menu" aria-labelledby="sellerDropdown">
                                <li><a class="dropdown-item" href="register.jsp">Registration</a></li>
                                <li><a class="dropdown-item" href="login.jsp">Login</a></li>
                            </ul>
                        </li>

                        <li class="nav-item">
                            <a class="nav-link" href="admin.jsp">Admin</a>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>
    </header>

    <main class="container my-5">
        

        <form action="upload" method="post" enctype="multipart/form-data">
            <input type="file" placeholder="upload image" name="file">
            <input type="submit" value="Upload">
        </form>
    </main>

    <footer class="text-light py-3 mt-auto">
        <div class="container text-center">
            <p class="mb-1">&copy; 2024 Your Website. All rights reserved.</p>
        </div>
    </footer>

    <!-- Bootstrap JS and Popper.js -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>

</body>

</html>
