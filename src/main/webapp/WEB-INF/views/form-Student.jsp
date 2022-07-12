<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Save Student</title>
</head>
<body>
<div class="container"></div>
	<h3>Student Directory</h3>
	<hr>
	<p class="h4 mb-4">New Student Form</p>
	<form action="/SpringLab6/students/saveForm" method="POST">
		<input type="hidden" name="id" value="$(Student.id)">
		
		<div class="form-inline">
			<input type="text" name="firstname" value="$(Student.firstname)"
				class="form-control mb-4 col-4" placeholder="First Name">
		</div>
		<div class="form-inline">
			<input type="text" name="firstname" value="$(Student.lastname)"
				class="form-control mb-4 col-4" placeholder="Last Name">
		</div>
		<div class="form-inline">
			<input type="text" name="firstname" value="$(Student.course)"
				class="form-control mb-4 col-4" placeholder="Course">
		</div>
		<div class="form-inline">
			<input type="text" name="firstname" value="$(Student.country)"
				class="form-control mb-4 col-4" placeholder="Country">
		</div>
		
		<button type="submit" class="btn btn-info col-2">Save</button>
	</form>
	<hr>
	
	<a href="/SpringLab6/students/printstudents">Back to Students List</a>
</body>
</html>