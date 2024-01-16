
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
    <h1>Citizens</h1>
    <div>
    <table border="1" height="300px" cellpadding="25" cellspacing="1" align="center" width="1200px">
        <tr>
            <th colspan="7" style="padding-left:1000px"><button><a href="addcitizen">Add New Citizen</a></button></th>
        </tr>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>City</th>
            <th>No. Of Doses</th>
            <th>Vaccination Status</th>
            <th>Vaccination Center</th>
            <th>Action</th>
        </tr>
        
       <c:forEach var="a" items="${ vacCenters10}">
       <tr width=200px>
            <td>${a.cId }</td>
            <td>${a.cName}</td>
            <td>${a.cCity}</td>
            <td>${a.cNoOfDoses}</td>
             <td>${a.vaccinationStatus}</td>
              <td>${a.vaccinationCenter}</td>
               <td><button><a href="view?id=${a.cId}">View</a></button>
                     <button><a href="editCitizen?id=${a.cId}">Edit</a></button>
                      <button><a href="deleteCitizen?id=${a.cId}">Delete</a></button></td>
                      
                      </tr>
       </c:forEach>
  <tr>
            <td colspan="7">${count1}</td>
        </tr>
    </table>    
    </div>
</body>
</html>