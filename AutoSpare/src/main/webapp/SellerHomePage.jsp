<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Home</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            height: 100%;
        }
        
        header {
            background-color: #2ecc71;
            color: white;
            padding: 30px 40px;
            display: flex;
            justify-content: space-between;
            align-items: center;
            width: 100%;
            box-sizing: border-box;
        }
        
        header h1 {
            margin: 0;
        }
        
        .profile-dropdown {
            position: relative;
            display: inline-block;
        }
        
        .dropdown-btn {
            background-color: purple;
            color: white;
            border: none;
            padding: 10px;
            cursor: pointer;
        }
        
        .dropdown-content {
            display: none;
            position: absolute;
            right: 0;
            background-color: #333;
            min-width: 160px;
            z-index: 1;
        }
        
        .dropdown-content a {
            color: white;
            padding: 12px 16px;
            text-decoration: none;
            display: block;
        }
        
        .dropdown-content a:hover {
            background-color: #ddd;
            color: black;
        }
        
        .profile-dropdown:hover .dropdown-content {
            display: block;
        }
        
        footer {
            background-color: #2ecc71;
            color: white;
            text-align: center;
            padding: 10px;
            position: fixed;
            width: 100%;
            bottom: 0;
            box-sizing: border-box;
        }
        
        main {
            padding: 60px 40px 50px 40px;
            min-height: calc(100vh - 140px);
        }

        .container {
            max-width: 800px;
            margin: 0 auto;
        }

        form {
            background-color: #f4f4f4;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
        }

        form label {
            display: block;
            margin-bottom: 8px;
        }

        form input, form select, form textarea {
            width: 100%;
            padding: 8px;
            margin-bottom: 12px;
            border: 1px solid #ccc;
            border-radius: 4px;
        }

        form input[type="submit"] {
            background-color: #00bfff;
            color: white;
            border: none;
            cursor: pointer;
            padding: 10px;
            border-radius: 4px;
        }

        form input[type="submit"]:hover {
            background-color: #00bfff;
        }

        /* Styling for the file upload button and input */
        .file-upload-container {
            display: flex;
            align-items: center;
            justify-content: space-between;
        }

        .file-upload-container input[type="file"] {
            flex-grow: 1;
            margin-right: 350px;
        }

        .file-upload-container input[type="submit"] {
            background-color: #00b300;
            color: white;
            padding: 5px 10px;
            cursor: pointer;
            border: none;
            border-radius: 4px;
        }

        .file-upload-container input[type="submit"]:hover {
            background-color: #00b300;
        }
    </style>
</head>
<body>

    <header>
        <h1>Logo</h1>
        <div><h4 style="margin-right:10px;">${email}</h4></div>
        <div class="profile-dropdown">
            <button class="dropdown-btn">Profile</button>
            <div class="dropdown-content">
                <a href="sellerUpdate?email=${email}">Edit Profile</a>
                <a href="delete?email=${email}">Delete Account</a>
                <a href="index.jsp">Sign Out</a>
            </div>
        </div>
    </header>

    <main>
        <div class="container">
            <h2>Add New Spare Part</h2>
            <!-- Form to add a new spare part -->
            <form action="AddSparePart" method="POST">
                <label for="partNumber">Part Number:</label>
                <input type="text" id="partNumber" name="partNumber" required><br>

                <label for="name">Part Name:</label>
                <input type="text" id="name" name="name" required><br>

                <label for="category">Category:</label>
                <select id="category" name="category">
                    <option value="Electrical">Electrical</option>
                    <option value="Mechanical">Mechanical</option>
                    <option value="Hydraulic">Hydraulic</option>
                    <option value="Pneumatic">Pneumatic</option>
                    <option value="Other">Other</option>
                </select><br>

                <label for="price">Price:</label>
                <input type="number" id="price" name="price" step="0.01" required><br>

                <label for="quantityInStock">Quantity in Stock:</label>
                <input type="number" id="quantityInStock" name="quantityInStock" required><br>

                <label for="manufacturer">Manufacturer:</label>
                <input type="text" id="manufacturer" name="manufacturer" required><br>

                <label for="description">Description:</label>
                <textarea id="description" name="description" rows="4" required></textarea><br>

                <!-- File upload section -->
                <label for="image">Image:</label>
                <div class="file-upload-container">
                    <input type="file" name="file">
                    <input type="submit" value="Upload">
                </div>

                <input type="submit" value="Add Spare Part">
            </form>
        </div>
    </main>

    <footer>
        <p>&copy; 2025 My Website</p>
    </footer>

</body>
</html>
