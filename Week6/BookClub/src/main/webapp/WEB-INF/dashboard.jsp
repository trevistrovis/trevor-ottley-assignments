<%@page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@page isErrorPage="true"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register User</title>
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>

<link rel="stylesheet" type="text/css" href="/css/style.css">
<script type="text/javascript" src="js/app.js"></script>

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
</head>
<body>

	<div class="container p-3 col-10 mx-auto my-5 bg-secondary text-light">
	<div class="card-body bg-secondary text-light">
		<div class="card-header bg-secondary">
			<h1 class="survey text-info">Welcome <c:out value="${loggedInUser.userName}"/></h1>
			<div class="card-body bg-secondary text-light">
			<table class="table table-info">
			<thead>
				<tr>
					<th scope="col">ID</th>
					<th scope="col">Title</th>
					<th scope="col">Author</th>
					<th scope="col">Created By</th>
					
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${books}" var="book">
					<tr>
						<td><c:out value="${book.id }"></c:out></td>
						<td><a href="/view/${book.id}"><c:out value="${book.title}"/></a></td>
						<td><c:out value="${book.author}"></c:out></td>
						<td><c:out value="${book.user.userName }"></c:out></td>

					</tr>
				</c:forEach>
			</tbody>
		</table>
				<a href="/new" class="btn btn-info">New</a>
				<a href="/logout" class="btn btn-info">Logout</a>
				
			</div>
		</div>
	</div>
	</div>
</body>
</html>