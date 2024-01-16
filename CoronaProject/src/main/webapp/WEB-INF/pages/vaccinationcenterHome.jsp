
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Home Page</title>
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
        .body{
            position: relative;
            text-align: center;
            color: black;
        }
        .txt{
            position: absolute;
            top: 50%;
            left: 30%;
            transform: translate(-30%, -50%);
            font-size: 35px;
            font-family: Impact, Haettenschweiler, 'Arial Narrow Bold', sans-serif;
            animation-name: animation;
            animation-duration: 10s;
            animation-iteration-count: 3;
            animation-delay: 3s;
        }
    
@keyframes animation{
    0%{
        border: solid 0px white;
        height: 250px;
        width: 800px;
    }
    25%{
        border: solid 0px white;
        height: 500px;
        width: 850px;
    }
    50%{
        border: solid 0px white;
        height: 500px;
        width: 500px;
    }
    75%{
        border: solid 0px white;
        height: 300px;
        width: 800px;
    }
    100%{
        border: solid 0px white;
        height: 250px;
        width: 800px;
    }
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
    <div class="body">
        <img src="images/vacc.jpeg" class="img" style="width: 100%;" alt="">
        <div class="txt">“It’s clear that prevention will never be sufficient. That’s why we need a vaccine that will be safe.”</div>
    </div>
</body>
</html>