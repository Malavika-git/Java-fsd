<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Favourite Crossing</h2> 
<a href="userhome.jsp">Home</a><br> 
<a href="search.jsp">Search Crossing</a><br><br> 
<sql:setDataSource var="snapshot" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/railway" user="root" password="Malavika@19" /> 
 
 
<sql:query dataSource="${snapshot}" var="favourites"> 
SELECT * FROM favourites; </sql:query> 
 
 
<c:if test="${not empty favourites.rows}"> 
<table border="1" width="100%"> 
<tr> 
<th>Sr.No</th> 
<th>Name</th> 
<th>Address</th> 
<th>Landmark</th> 
<th>Time Schedule</th> 
<th>Person In-Charge</th> 
<th>Status</th> 
</tr> 
<c:forEach var="favorite" items="${favorites.rows}"> 
<tr> 
<td><c:out value="${favourite.id}" /></td> 
<td><c:out value="${favourite.Name}" /></td> 
<td><c:out value="${favourite.Address}" /></td> 
<td><c:out value="${favourite.Landmark}" /></td> 
<td><c:out value="${favourite.Trainschedule}" /></td> 
<td><c:out value="${favourite.pname}" /></td> 
<td><c:out value="${favourite.status}" /></td> 
</tr> 
</c:forEach> 
</table> 
</c:if> 
<c:if test="${empty favourites.rows}"> 
<p>No favourite crossings.</p> 
</c:if> 


</body>
</html>