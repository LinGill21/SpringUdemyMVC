<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
	<title>Customer Confirmation</title>
</head>
<body>
	The customer's name is ${customer.firstName} ${customer.lastName}
	<br/>
	They claimed ${customer.freePasses} passes
	<br/>
	postal code: ${customer.postalCode}
</body>
</html>