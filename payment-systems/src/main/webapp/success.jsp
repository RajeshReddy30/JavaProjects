<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Payment Details</title>
<style>

.table {
    width: 80%;
    margin: 20px auto;
    border-collapse: collapse;
    border: 1px solid #000; 
}

.table th, .table td {
    border: 1px solid #000; 
    padding: 10px;
    text-align: left;
}

.table th {
    background-color: #f2f2f2; 
}

.table-striped tbody tr:nth-child(odd) {
    background-color: #f9f9f9; 
}

.table-hover tbody tr:hover {
    background-color: #dcdcdc; 
}

h1 {
    text-align: center;
    font-size: 24px;
    margin-bottom: 20px;
}
</style>
</head>
<body>
<div>
    <h1>Payment Details</h1>
</div>
<table class="table table-bordered table-striped table-hover">
    <thead>
        <tr>
         <th>Receiver Name</th>
            <th>ContactNumber</th>
            <th>Amount</th>           
            <th>TranscationId</th>
            <th>Method</th>
            <th>TransactionDate</th>
            <th>CreatedBy</th>           
            <th>CreatedOn</th>
        </tr>
    </thead>
    <tbody>
        <tr>
        <td>${details.recieverName}</td>
            <td>${details.recieverPhoneNumber}</td>
            <td>${details.amount}</td>
            <td>${details.transactionId}</td>
             <td>${details.paymentMethod}</td>
              <td>${details.transactionDate}</td>
               <td>${details.createdBy}</td>
              <td>${details.createdOn}</td>  
        </tr>
    </tbody>
</table>
</body>
</html>