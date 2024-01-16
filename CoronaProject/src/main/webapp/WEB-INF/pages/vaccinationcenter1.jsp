
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
    <h1>Centers</h1>
    <div>
    <table border="1" height="300px" cellpadding="18" cellspacing="1" align="center" width="650px">
        <tr>
            <th colspan="4" style="padding-left:400px"><button><a href="addVacCenter">Add new center</a></button></th>
        </tr>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>City</th>
            <th>Action</th>
        </tr>
        
        <c:forEach var="i" items="${vacCenters}">
              <tr>
                 <td>${i.id}</td>
                 <td>${i.name}</td>
                 <td>${i.city}</td>
                 <td><button><a href="view?id=${i.id}">View</a></button>
                     <button><a href="editCenter?id=${i.id}">Edit</a></button>
                      <button><a href="deleteCenter?id=${i.id}">Delete</a></button>
              </tr>
        
        </c:forEach>
    
        <tr>
            <td colspan="4">${count1}</td>
        </tr>
    </table>    
    </div>
</body>
</html>