<%@ page contentType="text/html; charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Gadget Form</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            display: flex;
            flex-direction: column;
            height: 100vh;
        }
        nav {
            background-color: #333;
            padding: 10px 20px;
        }
        nav a {
            color: white;
            text-decoration: none;
            margin-right: 15px;
            font-size: 16px;
        }
        nav a:hover {
            text-decoration: underline;
        }
        .content {
            flex-grow: 1;
            padding: 20px;
        }
        footer {
            background-color: #333;
            color: white;
            text-align: center;
            padding: 10px;
            position: fixed;
            bottom: 0;
            width: 100%;
        }
        form {
            max-width: 500px;
            margin: 0 auto;
            padding: 20px;
            border: 1px solid #ccc;
            border-radius: 8px;
            background-color: #f9f9f9;
        }
        label {
            display: block;
            margin-bottom: 8px;
            font-weight: bold;
        }
        input[type="text"], input[type="number"] {
            width: 100%;
            padding: 10px;
            margin-bottom: 15px;
            border: 1px solid #ccc;
            border-radius: 4px;
        }
        input[type="submit"] {
            background-color: #333;
            color: white;
            padding: 10px 20px;
            border: none;
            border-radius: 4px;
            cursor: pointer;
        }
        input[type="submit"]:hover {
            background-color: #555;
        }
        input[type="reset"] {
            background-color: #337;
            color: white;
            padding: 10px 20px;
            border: none;
            border-radius: 4px;
            cursor: pointer;
        }
        input[type="reset"]:hover {
            background-color: #556;
        }
    </style>
</head>
<body>

    <nav>
        <a href="index.jsp">Home</a>
        
    </nav>

    <div class="content">
        <h1>Gadget Form</h1>
        <form action="Gadget" method="post">
            <label for="gadgetType">Gadget Type</label>
            <input type="text" id="gadgetType" name="gadgetType" required>

            <label for="gadgetId">Gadget ID</label>
            <input type="number" id="gadgetId" name="gadgetId" required>

            <label for="gadgetName">Gadget Name</label>
            <input type="text" id="gadgetName" name="gadgetName" required>

            <input type="submit" value="Save Gadget">
            <input type="reset" value="Reset">
        </form>
    </div>

    <footer>
        <p>&copy; 2024 My Website</p>
    </footer>

</body>
</html>
