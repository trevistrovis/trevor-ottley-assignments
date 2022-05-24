<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Created Dojos</title>
</head>
<body>
	<h1><c:out value="${dojo.name}"/> Ninjas</h1>
	
	<ul>
	<c:forEach var="ninja" items="${dojo.ninjas}">
	
		<li>Name: <c:out value="${ninja.firstName}"/> <c:out value="${ninja.lastName}"/></li>
		<li> Age: <c:out value="${ninja.age}"/></li>
	</c:forEach>
	</ul>
	<a href="/dojos">Create new Dojo</a>
	<a href="/ninjas">Create new Ninja</a>
</body>
</html>