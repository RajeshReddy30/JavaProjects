<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Company Details - Your Company Name</title>
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">

    <style>
        /* Custom styles */
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

        .required::after {
            content: " *";
            color: red;
        }
    </style>
</head>

<body>

    <header>
        <nav class="navbar navbar-expand-lg navbar-dark">
            <div class="container">
                <a class="navbar-brand" href="#">Your Logo</a>
                <div class="ms-auto">
                </div>
            </div>
        </nav>
    </header>

    <main class="container my-5">
        <div class="row justify-content-center">
            <div class="col-md-8">
                <h2 class="text-center mb-4">Company Details</h2>
                <form action="seller" method="post">
                    <div class="form-row">
                        <!-- Left Column -->
                        <div class="form-col">
                            <div class="form-group">
                                <label for="name" class="form-label required">Company Name</label>
                                <input type="text" class="form-control" id="name" name="name" required>
                                <div class="invalid-feedback">Please provide a company name.</div>
                            </div>

                            <div class="form-group">
                                <label for="email" class="form-label required">Email</label>
                                <input type="email" class="form-control" id="email" name="email" required>
                                <div class="invalid-feedback">Please provide a valid email address.</div>
                            </div>

                            <div class="form-group">
                                <label for="contactNumber" class="form-label required">Contact Number</label>
                                <input type="tel" class="form-control" id="contactNumber" name="contactNumber" required>
                                <div class="invalid-feedback">Please provide a contact number.</div>
                            </div>

                            <div class="form-group">
                                <label for="address" class="form-label required">Address</label>
                                <input type="text" class="form-control" id="address" name="address" required>
                                <div class="invalid-feedback">Please provide an address.</div>
                            </div>

                            <div class="form-group">
                                <label for="gstNumber" class="form-label required">GST Number</label>
                                <input type="text" class="form-control" id="gstNumber" name="gstNumber" required
                                       pattern="^[A-Za-z0-9]{15}$" title="GST Number must be a 15 character alphanumeric string.">
                                <div class="invalid-feedback">GST Number must be a 15-character alphanumeric string.</div>
                            </div>
                        </div>

                        <!-- Right Column -->
                        <div class="form-col">
                            <div class="form-group">
                                <label for="companyType" class="form-label required">Company Type</label>
                                <input type="text" class="form-control" id="companyType" name="companyType" required>
                                <div class="invalid-feedback">Please provide a company type.</div>
                            </div>

                            <div class="form-group">
                                <label for="country" class="form-label required">Country</label>
                                <select class="form-control" id="country" name="country" onchange="loadStates()" required>
                                    <option value="">Select Country</option>
                                </select>
                                <div class="invalid-feedback">Please select a country.</div>
                            </div>

                            <div class="form-group">
                                <label for="state" class="form-label required">State</label>
                                <select class="form-control" id="state" name="state" disabled required>
                                    <option value="">Select State</option>
                                </select>
                                <div class="invalid-feedback">Please select a state.</div>
                            </div>

                            <div class="form-group">
                                <label for="city" class="form-label required">City</label>
                                <input type="text" class="form-control" id="city" name="city" required>
                                <div class="invalid-feedback">Please provide a city.</div>
                            </div>

                            <div class="form-group">
                                <label for="pincode" class="form-label required">Pincode</label>
                                <input type="text" class="form-control" id="pincode" name="pincode" required>
                                <div class="invalid-feedback">Please provide a pincode.</div>
                            </div>
                        </div>
                    </div>

                    <div class="d-grid gap-2 col-2 mx-auto mt-4">
                        <button type="submit" class="btn btn-custom-primary">Submit</button>
                    </div>
                </form>
            </div>
        </div>
    </main>

    <footer class="text-light py-3 mt-auto">
        <div class="container text-center">
            <p class="mb-1">&copy; 2023 RR Group. All rights reserved.</p>
        </div>
    </footer>

    <!-- Bootstrap JS and Popper.js -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>

    <script>
        // Function to load countries into the dropdown
        async function loadCountries() {
            try {
                const response = await fetch('https://countriesnow.space/api/v0.1/countries', {
                    method: 'GET',
                    headers: {
                        'Content-Type': 'application/json'
                    }
                });
                const data = await response.json();

                if (data && data.data) {
                    const countryDropdown = document.getElementById('country');
                    countryDropdown.innerHTML = '<option value="">Select Country</option>';
                    
                    // Populate countries in the dropdown
                    data.data.forEach(country => {
                        const option = document.createElement('option');
                        option.value = country.country;
                        option.textContent = country.country;
                        countryDropdown.appendChild(option);
                    });
                } else {
                    console.error("No country data available");
                }
            } catch (error) {
                console.error('Error fetching countries:', error);
            }
        }

        // Function to load states based on the selected country
        async function loadStates() {
            const country = document.getElementById('country').value;
            const stateDropdown = document.getElementById('state');
            stateDropdown.innerHTML = '<option value="">Select State</option>'; // Reset state dropdown

            if (country) {
                try {
                    const response = await fetch(`https://countriesnow.space/api/v0.1/countries/${country}/states`);
                    const data = await response.json();

                    if (data && data.data) {
                        data.data.forEach(state => {
                            if (country === state.name) {
                                state.states.forEach(s => {
                                    const option = document.createElement('option');
                                    option.value = s.name;
                                    option.textContent = s.name;
                                    stateDropdown.appendChild(option);
                                });
                            }
                        });
                        stateDropdown.disabled = false; // Enable the state dropdown
                    } else {
                        console.error('No states found for this country.');
                    }
                } catch (error) {
                    console.error('Error fetching states:', error);
                }
            }
        }

        // Call loadCountries on window load
        window.onload = loadCountries;
    </script>

</body>

</html>
