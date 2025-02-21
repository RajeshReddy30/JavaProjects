<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Reset Password - Your Company Name</title>
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        :root {
            --header-bg: #2ecc71;
            --footer-bg: #2ecc71;
            --button-primary: #e74c3c;
            --button-secondary: #f39c12;
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

        footer {
            background-color: var(--footer-bg);
            color: white;
            padding: 1.5rem 2rem;
            display: flex;
            justify-content: center;
            align-items: center;
            position: relative;
            border-top: 2px solid black;
        }

        footer #datetime {
            font-size: 1rem;
        }

        footer p {
            margin: 0.3rem 0;
        }

        .error-message {
            color: red;
            font-size: 12px;
        }

    </style>
</head>

<body>

    <header>
        <nav class="navbar navbar-expand-lg navbar-dark">
            <div class="container">
                <a class="navbar-brand" href="#">Your Logo</a>
            </div>
        </nav>
    </header>

    <main class="container my-5">
        <div class="row justify-content-center">
            <div class="col-md-6">
                <h2 class="text-center mb-4">Reset Password</h2>
                <form id="resetPasswordForm" action="Reset" method="post">
                    <input type="hidden" class="form-control" id="email" name="email" value="${mail}">
                    
                    <div class="mb-3">
                        <label for="newPassword" class="form-label">New Password</label>
                        <input type="password" class="form-control" id="newPassword" name="password" required minlength="8" maxlength="20" oninput="checkPasswordMatch()">
                        <small class="error-message" id="newPasswordError"></small>
                    </div>

                    <div class="mb-3">
                        <label for="confirmPassword" class="form-label">Confirm Password</label>
                        <input type="password" class="form-control" id="confirmPassword" name="confirmPassword" required minlength="8" maxlength="20" oninput="checkPasswordMatch()">
                        <small class="error-message" id="confirmPasswordError"></small>
                        <span id="passwordMatchMessage" class="text-danger"></span>
                    </div>

                    <div class="d-grid gap-2 col-4 mx-auto">
                        <button type="submit" class="btn btn-custom-primary" id="resetButton" disabled>Reset Password</button>
                    </div>
                </form>
            </div>
        </div>
    </main>

    <footer>
        <div id="datetime"></div>
    </footer>

    <!-- Bootstrap JS -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>

    <script>
        function checkPasswordMatch() {
            var newPassword = document.getElementById("newPassword").value;
            var confirmPassword = document.getElementById("confirmPassword").value;
            var resetButton = document.getElementById("resetButton");
            var message = document.getElementById("passwordMatchMessage");
            var newPasswordError = document.getElementById("newPasswordError");
            var confirmPasswordError = document.getElementById("confirmPasswordError");

            var passwordPattern = /^(?=.*[A-Za-z])(?=.*\d)[A-Za-z\d@$!%*?&]{8,20}$/;

            // Clear previous errors
            newPasswordError.textContent = '';
            confirmPasswordError.textContent = '';

            // Check password pattern for new password
            if (!newPassword.match(passwordPattern)) {
                newPasswordError.textContent = 'Password must be between 8 and 20 characters and contain both letters and numbers.';
                resetButton.disabled = true;
            }

            // Check confirm password match
            if (newPassword !== confirmPassword) {
                resetButton.disabled = true;
                message.textContent = "Passwords do not match.";
            } else if (newPassword.length > 0) {
                resetButton.disabled = false;
                message.textContent = "";
            } else {
                resetButton.disabled = true;
            }
        }

        function updateDateTime() {
            const now = new Date();
            const currentDateTime = now.toLocaleString();
            document.querySelector('#datetime').textContent = currentDateTime;
        }

        updateDateTime();
        setInterval(updateDateTime, 1000);
    </script>
</body>

</html>
