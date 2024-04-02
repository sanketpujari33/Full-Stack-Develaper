<!-- failure.jsp -->

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Login Failed</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f8d7da;
            color: #721c24;
            text-align: center;
            margin: 0;
            padding: 0;
        }
        .container {
            margin-top: 50px;
            padding: 20px;
            border: 1px solid #f5c6cb;
            border-radius: 5px;
            background-color: #fff;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            width: 50%;
            margin-left: auto;
            margin-right: auto;
        }
        h1 {
            color: #721c24;
        }
        p {
            color: #721c24;
            font-size: 18px;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Login Failed</h1>
        <p>Sorry, the login attempt was unsuccessful.</p>
        P> Click <a href="login.jsp" target="_blank">Login</a></p>
    </div>
</body>
</html>
