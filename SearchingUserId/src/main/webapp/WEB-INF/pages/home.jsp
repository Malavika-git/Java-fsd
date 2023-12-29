<!DOCTYPE html>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
  <%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<html lang="en">

<head>
    <title>User UserID</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    
    <style>
        .form-group{
        width:400px}
        .container{
	max-width:500px;
	width:100%;
	background:transparent;
	padding:05px 40px 05px;
	border:2px solid rgba(255,255,255,.5);
	backdrop-filter:blur(10px);
	padding:05px 40px;
}
body{
background:lightgray;
}
        </style>
</head>

<link rel="stylesheet" href="main.css">


<body>
    <nav class="navbar navbar-inverse" style="margin-left: 150px;margin-top: 20px;margin-right: 150px;">
        <div class="container-fluid">
            <div class="navbar-header">
                <a class="navbar-brand"><b><p style="text-align:center">PATIENT DETAILS .|</p><b></b></a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                 <a class="navbar-brand" href="add">Add Patient Record    </a>
            </div>  
    </nav>
   <blink> <h1 style="color:green;text-align:center"><b>${Msg}</b></h1></blink>
   <blink> <h1 style="color:green;text-align:center"><b>${id}</b></h1></blink>
    <c:choose>
  <c:when test="${!empty list}">
       <table border="1" bgcolor="cyan" align="center" class="table table-striped-columns">
           <tr bgcolor="pink">
               <th>Patient Id</th>&nbsp;&nbsp;&nbsp;&nbsp;<th>FirstName</th>&nbsp;&nbsp;&nbsp;&nbsp;<th>LastName</th>&nbsp;&nbsp;&nbsp;&nbsp;<th>Age</th>&nbsp;&nbsp;&nbsp;&nbsp;<th>Gender</th>&nbsp;&nbsp;&nbsp;&nbsp;<th>Address</th>&nbsp;&nbsp;&nbsp;&nbsp;<th>Phone Number</th>
           </tr>
           <c:forEach var="a" items="${list }">
                    <tr bgcolor="cyan">
                         <td>${a.patientId}</td> &nbsp;&nbsp;&nbsp;
                         <td>${a.firstName}</td>&nbsp;&nbsp;&nbsp;
                         <td>${a.lastName}</td>&nbsp;&nbsp;&nbsp;
                         <td>${a.age}</td>&nbsp;&nbsp;&nbsp;
                         <td>${a.gender}</td>&nbsp;&nbsp;&nbsp;
                         <td>${a.address}</td>&nbsp;&nbsp;&nbsp;
                         <td>${a.phoneNumber}</td>
                    </tr>
           </c:forEach>             
       </table>
  </c:when>
  <c:otherwise>
      <h1 style="color:green;text-align:center">Records Not Found</h1>
  </c:otherwise>
</c:choose>


    <div class="container">
    
    <f:form modelAttribute="ee">
      
      <table>
        <div class="form-group">
             <label for="name" style="margin-top: 30px;"><span class="glyphicon glyphicon-user"></span>PatientID</label>
             <f:input path="patientId" class="form-control" placeholder="Enter PatientId to be Update.."/><span><p style="color:red">${idMsg}</p></span>
         </div>
             <input type="submit" class="btn btn-success" value="Submit">
             <input type="reset" class="btn btn-default" value="Cancel">
            </table><br>
  </table>
</f:form>
    
</body></html>