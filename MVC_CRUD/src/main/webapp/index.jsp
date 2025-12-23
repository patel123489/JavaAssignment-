<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
</head>
<body>
		${msg}
		<form action="form" method="get">
		<input type="text" name="name" placeholder="enter name"> <input
			type="text" name="email" placeholder="enter email"> <input
			type="text" name="phone" placeholder="enter phone"> <input
			type="Submit">
	</form>
</body>
</html>