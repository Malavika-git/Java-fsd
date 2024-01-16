<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>

<!DOCTYPE html>
<html lang="en">

<head>
    <title>VACCINATION CENTER</title>
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
	border:2px solid hwb(0 100% 0% / 0.5);
	backdrop-filter:blur(10px);
	padding:05px 40px;
}
        </style>
</head>

<link rel="stylesheet" href="main.css">


<body style="background:url('./log.jpg');background-size:cover">

    <nav class="navbar navbar-inverse" style="margin-left: 150px;margin-top: 20px;margin-right: 150px;">
        <div class="container-fluid">
            <div class="navbar-header">
                <a class="navbar-brand">VACCINATION CENTER</a>
            </div>
            
            <ul class="nav navbar-nav navbar-right">
                <li><a href="register"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
                <li  class="active"><a href="./"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
            </ul>
        </div>
    </nav>
     <h4 style="color:blue;text-align:center">Register Page</h4>
    <div class="container">
        <f:form modelAttribute="reg">
            <table>
             <div class="form-group">
                <p style="color:blue">
               <label for="name" style="margin-top: 30px;"><ion-icon name=""></ion-icon>Name:</label>
               <f:input path="name" class="form-control" placeholder="Enter Name"/>
             </div>
             
              <div class="form-group">
                <p style="color:red">
               <label for="name" style="margin-top: 5px;"><ion-icon name=""></ion-icon>Email:</label>
               <f:input path="email" class="form-control" placeholder="email@gmail.com"/>
             </div>
              
             <div class="form-group">
                <p style="color:rgb(70, 128, 0)">
               <label for="password"><ion-icon name=""></ion-icon>Password:</label>
               <f:input path="pwd" class="form-control" placeholder="Enter password"/>
             </div>
        
              <input type="submit" class="btn btn-success"/>
            <input type="reset" class="btn btn-default" style="margin-left: 20px;" value="Cancel"/>
            </table><br>
        
            <label><p style="color:gainsboro"> Do You have an account already click  </p></label>
            <a href="./">Login</a>
           </f:form>
</body></html>