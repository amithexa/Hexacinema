<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title></title>
</head>
<body background = "background.jpg">
<b>Register Here</b>
<table>
	<form action="save" method="post">
		<tr>
			<td>Enter Name:</td>
			<td><input type="text" name="username"></td>
		</tr><br>
		<tr>
			<td>Enter Email:</td>
			<td><input type="text" name="useremail"></td>
		</tr><br>
		<tr>
			<td>Enter Password:</td>
			<td><input type="password" name="userpwd"></td>
		</tr><br>
		<br>
		<tr>
			<td><input type="submit" value="Register"></td>
		</tr>
</table>
</form>
</body>
</html>