
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
   
     <h1 style="text-align:center;color:blue">Citizen Information:</h1>
     
      <table border="1" height="300px" cellpadding="18" cellspacing="1" align="center" width="350px">
        <tr>
            <th colspan="2">${citById1.cName}</th>
        </tr>
        <tr>
            <td>ID</td>
            <td>${citById1.cId}</td>
        </tr>
        <tr>
            <td>City</td>
            <td>${citById1.cCity}</td>
        </tr>
          <tr>
            <td>Number of Vaccines</td>
            <td>${citById1.cNoOfDoses}</td>
        </tr>
        <tr>
            <td>Vaccination Status</td>
            <td>${citById1.vaccinationStatus}</td>
        </tr>
        <tr>
            <td>Allocated Vaccination Center</td>
            <td><a href="view?id=${citById1.cId}">${citById1.vaccinationCenter}</a></td>
        </tr>
    </table>

   

    
</body>
</html>
    
</body>
</html>