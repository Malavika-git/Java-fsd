<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Resgister Form</title>
</head>
<body>
<form action="Register" method="post"> 
<div align=center> 
<h3>User Registration</h3> 
<table> 
<tr><td>Name: </td><td><input type="text" name="uname" placeholder="UserName" required></td></tr> 
<tr><td>Email: </td><td><input type="text" name="email" placeholder="Email" required></td></tr> 
<tr><td>Password: </td><td><input type="password" name="password" placeholder="password" required></td></tr><br><br> 
<tr><td></td><td><input type="submit" value="register"><br><br>Already 
Registered?<a href="login.jsp">Go to login</a></td></tr> 
</table> 
</div> 
</form> 

</body>
</html>