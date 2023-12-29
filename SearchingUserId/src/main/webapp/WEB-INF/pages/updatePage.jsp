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

    <div class="container">
    
    <f:form modelAttribute="pat">
      
      <table>
        <div class="form-group">
          <h1 style="color:blue"><b> Update Form Page</b></h1>
          
             <label for="name" style="margin-top: 30px;"><span class="glyphicon glyphicon-user"></span>Patient ID</label>
             <f:input path="patientId" class="form-control" readonly="true"/>
             
             
             <label for="name" style="margin-top: 30px;"><span class="glyphicon glyphicon-user"></span>Patient FirstName</label>
             <f:input path="firstName" class="form-control" placeholder="Enter firstName"/>
        
            <label for="name" style="margin-top: 30px;"><span class="glyphicon glyphicon-user"></span>Patient LastName</label>
             <f:input path="lastName" class="form-control" placeholder="Enter lastName"/>
             
             <label for="name" style="margin-top: 30px;"><span class="glyphicon glyphicon-user"></span>Patient Age</label>
             <f:input path="age" class="form-control" placeholder="Enter age"/>
             
             <label for="name" style="margin-top: 30px;"><span class="glyphicon glyphicon-user"></span>Patient Gender</label>
             <f:input path="gender" class="form-control" placeholder="Enter gender"/>
             
             <label for="name" style="margin-top: 30px;"><span class="glyphicon glyphicon-user"></span>Patient Address</label>
             <f:input path="address" class="form-control" placeholder="Enter Address"/>
             
             <label for="name" style="margin-top: 30px;"><span class="glyphicon glyphicon-user"></span>Patient Phone Number</label>
             <f:input path="phoneNumber" class="form-control" placeholder="Enter Phone Number"/>
             
         </div>
             <input type="submit" class="btn btn-success" value="Submit">
             <input type="reset" class="btn btn-default" value="Cancel">
            </table><br>
  </table>
</f:form>
    
</body></html>