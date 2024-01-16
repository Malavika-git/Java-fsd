
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Vaccination Centers</title>
    <style>
          .header{
            border: solid 1px;
            height: 30px;
            width: 100%;
            background-color: darkkhaki;
            text-align: center;
            display: flex;
            justify-content: space-evenly;
            padding-top: 30px;
            padding-bottom: 30px;
        }
        .header a{
            text-decoration: none;
            color: black;
            font-size: 20px;
        }
        .header a:hover{
            cursor: pointer;
            transform: scale(1.2);
             color: white;
             background: blue;
            
        }
        h1{
            text-align: center;
        }
    </style>
</head>
<body>
     <div class="header">
        <a href="citizens">Citizens</a>
        <a href="vaccinationcenter">Vaccination Centers</a>
        <a href="./">Log Out</a>
        <a>Welcome,admin</a>
    </div>
   
     <h1 style="text-align:center;color:blue">View Vaccination Center:</h1>
     
     
      <h2 style="text-align:center;color:red">Center Information:</h2> 
    <table border="1" height="300px" cellpadding="18" cellspacing="1" align="center" width="350px">
        <tr>
            <th colspan="2">${listById.name}</th>
        </tr>
        <tr>
            <td>ID</td>
            <td>${listById.id}</td>
        </tr>
        <tr>
            <td>City</td>
            <td>${listById.city}</td>
        </tr>
    </table>
    
   
    <div>
    
      <h2 style="text-align:center;color:red">All Citizens of this center:</h2>
    <table border="1" height="300px" cellpadding="18" cellspacing="1" align="center" width="350px">
       <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Action</th>
        </tr>
        
       
              <tr>
                 <td>${citById.cId}</td>
                 <td>${citById.cName}</td>
                 <td><button><a href="">View</a></button>

              </tr>
        
       
    </table>
</body>
</html>
    
</body>
</html>