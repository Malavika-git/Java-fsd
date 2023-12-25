<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Update Crossing Process</h2> 
<sql:setDataSource var="snapshot" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/railway" user="root" password="Malavika@19" /> 
<c:if test="${not empty param.id}"> 
<sql:update dataSource="${snapshot}"> 
UPDATE adminhome SET Name=?, Address=?, Landmark=?, Trainschedule=?, pname=?, status=? 
WHERE id=? 
<sql:param value="${param.Name}" /> 
<sql:param value="${param.Address}" /> 
<sql:param value="${param.Landmark}" /> 
<sql:param value="${param.Trainschedule}" /> 
<sql:param value="${param.pname}" /> 
<sql:param value="${param.status}" /> 
<sql:param value="${param.id}" /> 
</sql:update> 
<p>Update successful!</p> 
</c:if> 
<a href="adminhome.jsp">Back to Admin Home</a> 


</body>
</html>