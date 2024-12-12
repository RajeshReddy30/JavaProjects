<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style>
.pad {
    padding: 20px;
}
</style>
</head>
<body>

<div align="center">
    <h2>Enter GoogleApp Details</h2>
</div>

<div align="center">
    <form action="submit">
        <div class="pad">
            <label>Application Name</label>
            <input type="text" name="appName" placeholder="Enter App Name">
        </div>
        <div class="pad">
            <label>Application Size</label>
            <input type="number" name="appSize" placeholder="Enter App Size">
        </div>
        <div class="pad">
            <label>Application Description</label>
            <input type="text" name="appDesc" placeholder="Enter App Description">
        </div>
        
         <div class="pad">
            <label>Application OfferedBy</label>
            <input type="text" name="appofferby" placeholder="Enter OfferedBy">
        </div>
        
        <div class="pad">
            <label>Application Rating</label>
            <input type="number" name="appRate" placeholder="Enter App Rating">
        </div>
        
                <div class="pad">
            
            <input type="submit" value="Submit">
        </div>
    </form>
</div>

</body>
</html>