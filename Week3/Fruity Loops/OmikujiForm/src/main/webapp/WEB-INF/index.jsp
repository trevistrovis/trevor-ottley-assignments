<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="/style.css">
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<title>Omikuji Form</title>
</head>
<body>
<h1>Send an Omikuji!</h1>
<form action="/submitOmikuji" method="post">
	<div>
		<label>Pick any number from 5 to 25</label>
		<input type = "number" name = "number">
	</div>
	<div>
		<label>Enter the name of any city</label>
		<input type = "text" name = "city">
	</div>
	<div>
		<label>Enter the name of any real person</label>
		<input type = "text" name = "person">
	</div>
	<div>
		<label>Enter professional endeavor or any hobby</label>
		<input type = "text" name = "hobby">
	</div>
	<div>
		<label>Enter any type of living thing</label>
		<input type = "text" name = "thing">
	</div>
	<div>
		<label>Say something nice to someone</label>
		<input type = "text" name = "message">
	</div>
	<div>
		<input type = "submit" name = "enter" value = "Submit">
	</div>

</form>

</body>
</html>