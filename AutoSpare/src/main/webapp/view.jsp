<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>VIEW</title>
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
        <h1>Your Logo</h1>
        <div><h4 style="margin-right:10px;">${ email} </h4></div>
        <div class="profile-dropdown">
        <button class="dropdown-btn">View Users</button>
            <div class="dropdown-content">
               <form action="Activeusers"><button type="submit">Active</button></form>
                              <form action="InActiveusers"><button type="submit">InActive</button></form>
               

       </div>
      
        </div>
    </header>
    <form action="view" method="get">
 <table align="center" border="1" cellpadding="3" >
    <thead>
        <tr>
            <th>ID</th>
            <th>USERNAME</th>
            <th>EMAIL</th>
            <th>AADHAR NUMBER</th>
            <th>CONTACT NUMBER</th>
            <th>DOB</th>
            <th>COUNTRY</th>
            <th>STATE</th>
            <th>CITY</th>
            <th>PINCODE</th>
            <th>ADDRESS</th>
            <th>ACTION</th>
        </tr>
    </thead>
    <tbody>
        <!-- Loop for active users -->
        <c:forEach var="save" items="${save}">
            <tr>
                <td>${save.id}</td>
                <td>${save.userName}</td>
                <td>${save.email}</td>
                <td>${save.aadharNumber}</td>
                <td>${save.contactNumber}</td>
                <td>${save.dateOfBirth}</td>
                <td>${save.country}</td>
                <td>${save.state}</td>
                <td>${save.city}</td>
                <td>${save.pincode}</td>
                <td>${save.address}</td>
                <td>
                    <a href="Adminupdate?email=${save.email}">Update</a>
                    <a href="Admindelete?email=${save.email}">Delete</a>
                </td>
            </tr>
        </c:forEach>

        <c:forEach var="viewInActive" items="${viewInActive}">
            <tr>
                <td>${viewInActive.id}</td>
                <td>${viewInActive.userName}</td>
                <td>${viewInActive.email}</td>
                <td>${viewInActive.aadharNumber}</td>
                <td>${viewInActive.contactNumber}</td>
                <td>${viewInActive.dateOfBirth}</td>
                <td>${viewInActive.country}</td>
                <td>${viewInActive.state}</td>
                <td>${viewInActive.city}</td>
                <td>${viewInActive.pincode}</td>
                <td>${viewInActive.address}</td>
                <td>
                    <a href="adminupdateinactive?email=${viewInActive.email}">Update</a>
                </td>
            </tr>
        </c:forEach>
    </tbody>
</table>

       </form>
    <main></main>

    <footer>
        <p>&copy; 2025 My Website</p>
    </footer>

</body>
</html>


