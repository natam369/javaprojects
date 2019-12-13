<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Student Details Registration</h2>
	<hr>
	<div class=form>
		<form action="/addstudent/" method="post"
			onsubmit=" return validate()">
			<table>
				<tr>
					<td>Name</td>
					<td><input id="name" name="name"></td>
				</tr>
				<tr>
					<td>Phone</td>
					<td><input id="phone" name="phone"></td>
				</tr>
				<tr>
					<td>Email</td>
					<td><input id="email" name="email"></td>
				</tr>
				<tr>
					<td><input type="submit" value="Submit"></td>
				</tr>
			</table>
		</form>
		<br />
		<form action="/delete/" method="post">
			<table>
				<tr>
					<td><strong> Delete the user</strong></td>
				</tr>
				<tr>
					<td><input id="id" name="studentId"></td>
				</tr>
				<tr>
					<td><input type="submit" value="Delete"></td>
				</tr>
			</table>
		<a href="/view/">
    <button>Show All</button>
</a>
	</div>
</body>
</html>