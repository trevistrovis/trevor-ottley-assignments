<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Ninja</title>
</head>
<body>
<h1>New Ninja</h1>
<form:form action="/ninjas" method="post" modelAttribute="ninja">
	 <div>
     	<form:select path="dojo">
        
        	<c:forEach var="eachDojo" items="${dojos}">
	        
	        	<option value="${eachDojo.id}"><c:out value="${eachDojo.name}"/></option>
	        
        	</c:forEach>
        	
        </form:select>
    </div>
   <div>
        <form:label path="firstName">First Name</form:label>
        <form:errors path="firstName"/>
        <form:input path="firstName"/>
    </div>
       <div>
        <form:label path="lastName">Last Name</form:label>
        <form:errors path="lastName"/>
        <form:input path="lastName"/>
    </div>
       <div>
        <form:label path="age">Age</form:label>
        <form:errors path="age"/>
        <form:input path="age"/>
    </div>
    <div>
    	<input type="submit" value="Submit"/>
    </div>
    <div>
    	<a href="/dojos">Go Back</a>
    </div>

</form:form>

</body>
</html>