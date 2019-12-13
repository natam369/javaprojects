<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table border="2" width="70%" cellpadding="2">
		<tr>
			<th>Id</th>
			<th>Email</th>
			<th>Phone</th>
			<th>Name</th>
		</tr>
		<c:forEach var="student" items="${stu}">
			<tr>
				<td>${student.id}</td>
				<td>${student.name}</td>
				<td>${student.phone}</td>
				<td>${student.name}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>