<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link rel = "stylesheet" type = "text/css" href = "/style.css">
<meta charset="ISO-8859-1">
<title>The Omikuji!</title>
</head>
<body>
	<h1>Your Omikuji!</h1>
	<h3>
		<c:out value="${showResult}"></c:out>
	</h3>
	<a href = "/omikuji">Go back</a>
</body>
</html>