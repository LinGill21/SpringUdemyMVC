<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
	<title>Student Registration Confirmation</title>
</head>
<body>
	The student is confirmed: ${student.firstName} ${student.lastName} from ${student.country}
	<br/>
	Favorite Programming Language  ${student.favoriteLanguage}
	<br/>
	Known OS:
	<ul>
		<c:forEach var="os" items="${student.operatingSystem}">
		<li>${os}</li>
		</c:forEach>
	</ul>
</body>
</html>