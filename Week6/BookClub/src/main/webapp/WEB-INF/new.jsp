<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="container p-3 col-10 mx-auto my-5 bg-secondary text-light">
	<div class="card">
		<div class="card-header bg-secondary d-flex justify-content-between align-items-center">
			<h1 class="display-4 survey text-info">New Book</h1>
			<div>
				<a href="/dashboard" class="btn btn-info">Dashboard</a>
				<a href="/logout" class="btn btn-info">Logout</a>
			</div>
		</div>
			<div class="card-body bg-secondary text-light">

				<form:form action="/create" method="post" modelAttribute="newBook">
					<p>
						<form:label path="title" class="col-sm-2 col-form-label left">Title</form:label>
						<form:input path="title" class="form-control"/>
						<form:errors class="text-danger" path="title" />
					</p>
					<p>
						<form:label path="author" class="col-sm-2 col-form-label left">Author</form:label>
						<form:input path="author" class="form-control"/>
						<form:errors class="text-danger" path="author" />
					</p>
					<p>
						<form:label path="thoughts" class="col-sm-2 col-form-label left">Thoughts</form:label>
						<form:input path="thoughts" class="form-control"/>
						<form:errors class="text-danger" path="thoughts" />
					</p>
					<form:input type="hidden" value="${loggedInUser.id}" path="user"/>
					<button class="btn btn-info">Add Book</button>

				</form:form>
				
			</div>
		</div>
	</div>

</body>
</html>