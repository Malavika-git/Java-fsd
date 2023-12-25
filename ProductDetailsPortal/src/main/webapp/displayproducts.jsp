<%@ page import="com.example.ecommerce.Product" %>
<%@ page import="java.util.*" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Product Details</h2>

    <% Product product = (Product) session.getAttribute("product"); %>
    
<% if (product != null) { %>
        <p><strong>Product Name:</strong> <%= product.getProductName() %></p>
        <p><strong>Price:</strong> <%= product.getPrice() %></p>
    <% } else { %>
        <p>No product details available.</p>
    <% } %>
   
        
</body>
</html>