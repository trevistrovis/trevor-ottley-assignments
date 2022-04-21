<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hopper's Receipt</title>
</head>
<body>
	<h1>---Hopper's Receipt---</h1>
	
	<h1>Purchased By:</h1>
	<h2><c:out value="${name}"/></h2>
	
	<h1>Item Purchased:</h1>
	<h2><c:out value="${item}"/></h2>
	
	<h1>Item Price:</h1>
	<h2><c:out value="${price}"/></h2>
	
	<h1>Description of Item:</h1>
	<h2><c:out value="${desc}"/></h2>
	
	<h1>Vendor:</h1>
	<h2><c:out value="${vendor}"/></h2>
	


</body>
</html>