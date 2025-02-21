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
    </style>
</head>
<body>

    <header>
        <h1>Logo</h1>
        <div><h4 style="margin-right:10px;">${ email} </h4></div>
        <div class="profile-dropdown">
            <button class="dropdown-btn">Profile</button>
            <div class="dropdown-content">
                <a href="update?email=${email}">Edit Profile</a>
                <a href="delete?email=${email}">Delete Account</a>
                <a href="index.jsp">Sign Out</a>
            </div>
        </div>
    </header>

    <main></main>

    <footer>
        <p>&copy; 2025 My Website</p>
    </footer>

</body>
</html>


