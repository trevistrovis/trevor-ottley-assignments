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
<div class = "container">
	<div class = "card">
		<div class = "card-header bg-secondary d-flex justify-content-between align-items-center">
			<h1 class="survey text-info">View Book</h1>
			<a href="/dashboard" class="btn btn-info">Dashboard</a>
		</div>
		<div class="card-body bg-secondary text-light">
				<table class="table table-info">
					<tbody>
						<tr>
							<th scope="row">Title</th>
							<td>${book.title}</td>
						</tr>
						<tr>
							<th scope="row">Author</th>
							<td>${book.author}</td>
						</tr>
						<tr>
							<th scope="row">Thoughts</th>
							<td>${book.thoughts}</td>
						</tr>
						<tr>
							<th scope="row">Created By</th>
							<td>${book.user.userName}</td>
						</tr>
					</tbody>
				</table>
		</div>
	</div>
</div>

</body>
</html>