<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>USER LOGIN</title>
</head>
<body>
<div align=center> 
<h2>Admin Login</h2> 
<form action="AdminLogin" method="POST"> 
<table> 
<tr><td>Name: </td><td><input type="text" name="uname" placeholder="UserName" required></td></tr> 
<tr><td>Password: </td><td><input type="password" name="password" placeholder="password" required></td></tr> 
<tr><td></td><td><input type="submit" value="Login"><br><br><br>Don't have an account?<a href="Registration.jsp">Sign In</a></td></tr> 
</table> 
</form> </div> 


</body>
</html>