<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="productServlet" >
        <label for="productName">Product Name:</label>
        <input type="text" id="productName" name="productName" required><br>

        <label for="price">Price:</label>
        <input type="number" id="productPrice" price="productPrice" required><br>

        <input type="submit" value="Submit">
    </form>
</body>
</html>