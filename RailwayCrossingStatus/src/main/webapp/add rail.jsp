<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Railway Crossing</title>
</head>
<body>
<h2>Add Railway Crossing</h2> 
 
 
<form action="RailCrossing" method="POST"> 
<table> 
<tr> 
<td>Name:</td> 
<td><input type="text" name="Name" required></td> 
</tr> 
<tr> 
<td>Address:</td> 
<td><input type="text" name="Address" required></td> 
</tr> 
<tr> 
<td>Landmark:</td> 
<td><input type="text" name="Landmark" required></td> 
</tr> 
<tr> 
<td>Time Schedule:</td> 
<td><input type="time" name="Trainschedule" required></td> 
</tr> 
<tr> 
<td>Person In-Charge:</td> 
<td><input type="text" name="pname" required></td> 
</tr> 
<tr> 
<td>Status:</td> 
<td> 
<input type="radio" name="status" value="open" required> open 
<input type="radio" name="status" value="closed" required> closed 
</td> 
</tr> 
<tr> 
<td><input type="submit" value="Add Crossing"></td> 
</tr> 
</table> 
</form> 

</body>
</html>