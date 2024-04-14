<!-- success.jsp -->

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Success Page</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            text-align: center;
            margin: 0;
            padding: 0;
        }
        .container {
            margin-top: 50px;
            padding: 20px;
            border: 1px solid #ccc;
            border-radius: 5px;
            background-color: #fff;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            width: 50%;
            margin-left: auto;
            margin-right: auto;
        }
        h1 {
            color: #333;
        }
        p {
            color: #666;
            font-size: 18px;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Welcome! <%= request.getParameter("username") %> Login Successful</h1>
        <p>Congratulations! You have successfully logged in.</p>
       <P> Click <a href="login.jsp" target="_blank">Login</a></p>
    </div>
</body>
</html>
