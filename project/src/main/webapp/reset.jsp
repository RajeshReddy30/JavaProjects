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
    </style>
</head>

<body>

    <header>
        <nav class="navbar navbar-expand-lg navbar-dark">
            <div class="container">
                <a class="navbar-brand" href="#">Your Logo</a>
                <div class="ms-auto">
                    <a href="signup.jsp" class="btn btn-custom-secondary">Sign Up</a>
                </div>
            </div>
        </nav>
    </header>

    <main class="container my-5">
        <div class="row justify-content-center">
            <div class="col-md-8">
                <h2 class="text-center mb-4">Company Details</h2>
                <form action="SubmitCompanyDetails" method="post">
                    <div class="form-row">
                        <!-- Left Column -->
                        <div class="form-col">
                            <div class="form-group">
                                <label for="name" class="form-label">Company Name</label>
                                <input type="text" class="form-control" id="name" name="name" required>
                            </div>

                            <div class="form-group">
                                <label for="email" class="form-label">Email</label>
                                <input type="email" class="form-control" id="email" name="email" required>
                            </div>

                            <div class="form-group">
                                <label for="contactNumber" class="form-label">Contact Number</label>
                                <input type="tel" class="form-control" id="contactNumber" name="contactNumber" required>
                            </div>

                            <div class="form-group">
                                <label for="address" class="form-label">Address</label>
                                <input type="text" class="form-control" id="address" name="address" required>
                            </div>

                            <div class="form-group">
                                <label for="gstNumber" class="form-label">GST Number</label>
                                <input type="number" class="form-control" id="gstNumber" name="gstNumber" required>
                            </div>
                        </div>

                        <!-- Right Column -->
                        <div class="form-col">
                            <div class="form-group">
                                <label for="companyType" class="form-label">Company Type</label>
                                <input type="text" class="form-control" id="companyType" name="companyType" required>
                            </div>

                            <div class="form-group">
                                <label for="country" class="form-label">Country</label>
                                <select class="form-control" id="country" name="country" onchange="updateStates()" required>
                                    <option value="">Select Country</option>
                                    <option value="India">India</option>
                                    <option value="USA">USA</option>
                                    <option value="Canada">Canada</option>
                                </select>
                            </div>

                            <div class="form-group">
                                <label for="state" class="form-label">State</label>
                                <select class="form-control" id="state" name="state" onchange="updateCities()" disabled required>
                                    <option value="">Select State</option>
                                </select>
                            </div>

                            <div class="form-group">
                                <label for="city" class="form-label">City</label>
                                <select class="form-control" id="city" name="city" onchange="updatePincode()" disabled required>
                                    <option value="">Select City</option>
                                </select>
                            </div>

                            <div class="form-group">
                                <label for="pincode" class="form-label">Pincode</label>
                                <input type="text" class="form-control" id="pincode" name="pincode" disabled required>
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
            <p class="mb-1">&copy; 2023 SG Group. All rights reserved.</p>
        </div>
    </footer>

    <!-- Bootstrap JS and Popper.js -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>

    <script>
        // Simulating API data for countries, states, cities, and pin codes
        const countriesData = {
            'India': {
                'states': {
                    'Maharashtra': ['Mumbai', 'Pune'],
                    'Delhi': ['New Delhi', 'Noida']
                },
                'pincode': {
                    'Mumbai': '400001',
                    'Pune': '411001',
                    'New Delhi': '110001',
                    'Noida': '201301'
                }
            },
            'USA': {
                'states': {
                    'California': ['Los Angeles', 'San Francisco'],
                    'New York': ['New York City', 'Buffalo']
                },
                'pincode': {
                    'Los Angeles': '90001',
                    'San Francisco': '94101',
                    'New York City': '10001',
                    'Buffalo': '14201'
                }
            },
            'Canada': {
                'states': {
                    'Ontario': ['Toronto', 'Ottawa'],
                    'Quebec': ['Montreal', 'Quebec City']
                },
                'pincode': {
                    'Toronto': 'M5A 1A1',
                    'Ottawa': 'K1A 0B1',
                    'Montreal': 'H2X 1A1',
                    'Quebec City': 'G1R 1A1'
                }
            }
        };

        // Fetch states dynamically using the API
        async function updateStates() {
            const country = document.getElementById('country').value;
            const stateDropdown = document.getElementById('state');
            const cityDropdown = document.getElementById('city');
            const pincodeInput = document.getElementById('pincode');

            // Clear previous states and cities
            stateDropdown.innerHTML = "<option value=''>Select State</option>";
            cityDropdown.innerHTML = "<option value=''>Select City</option>";
            pincodeInput.value = '';
            pincodeInput.disabled = true;

            if (country) {
                try {
                    const response = await fetch(`https://https://api.countrystatecity.in/v1/countries/IN/states`, {
                        method: 'POST',
                        headers: { 'Content-Type': 'application/json' },
                        body: JSON.stringify({ country: country })
                    });
                    const data = await response.json();
                    const states = data.data.states;

                    if (states) {
                        states.forEach(state => {
                            const option = document.createElement('option');
                            option.value = state.name;
                            option.textContent = state.name;
                            stateDropdown.appendChild(option);
                        });
                        stateDropdown.disabled = false;
                    }
                } catch (error) {
                    console.error('Error fetching states:', error);
                }
            }
        }

        // Update cities based on selected state
        function updateCities() {
            const country = document.getElementById('country').value;
            const state = document.getElementById('state').value;
            const cityDropdown = document.getElementById('city');
            const pincodeInput = document.getElementById('pincode');

            cityDropdown.innerHTML = "<option value=''>Select City</option>";
            pincodeInput.value = '';
            pincodeInput.disabled = true;

            if (country && state) {
                const cities = countriesData[country]?.states[state];
                if (cities) {
                    cities.forEach(city => {
                        const option = document.createElement('option');
                        option.value = city;
                        option.textContent = city;
                        cityDropdown.appendChild(option);
                    });
                    cityDropdown.disabled = false;
                }
            }
        }

        // Update pincode based on selected city
        function updatePincode() {
            const country = document.getElementById('country').value;
            const state = document.getElementById('state').value;
            const city = document.getElementById('city').value;
            const pincodeInput = document.getElementById('pincode');

            if (country && state && city) {
                const pincode = countriesData[country]?.pincode[city];
                if (pincode) {
                    pincodeInput.value = pincode;
                    pincodeInput.disabled = false;
                }
            }
        }
    </script>

</body>

</html>
