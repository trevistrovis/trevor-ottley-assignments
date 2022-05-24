<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Dojo</title>
</head>
<body>
<h1>New Dojo</h1>
<form:form action="/dojos" method="post" modelAttribute="dojo">
   <div>
        <form:label path="name">Dojo Name</form:label>
        <form:errors path="name"/>
        <form:input path="name"/>
    </div>
    <div>
    <input type="submit" value="Submit"/>
	</div>
	<div>
	<a href="/ninjas">Create a Ninja</a>
	</div>
	
</form:form>

</body>
</html>