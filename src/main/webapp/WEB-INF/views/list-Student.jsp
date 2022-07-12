<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Directory</title>
</head>
<body>
<div class="container"></div>
	<h3>Student Directory</h3>
	<hr>
	<p class="h4 mb-4">New Student Form</p>
	<form action="/SpringLab6/search" class="form-inline">
		<a href="/SpringLab6/students/saveForm" class="btn btn-primary btn-sm mb-3">Add Student</a>
	</form>
	
	<table class="table table-bordered table-striped">
		<thead class="thead-dark">
			<tr>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Course</th>
			<th>Country</th>
			<th>Action</th>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${Students}" var="tempStudent">
				<tr>
					<td><c:out value="${tempStudent.firstname}"/></td>
					<td><c:out value="${tempStudent.lastname}"/></td>
					<td><c:out value="${tempStudent.course}"/></td>
					<td><c:out value="${tempStudent.country}"/></td>
					<td>
					
					</td>
				</tr>
			</c:forEach>
		
		</tbody>
	
	</table>
</body>
</html>