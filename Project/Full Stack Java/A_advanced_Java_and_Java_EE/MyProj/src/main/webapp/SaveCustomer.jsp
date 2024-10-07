<%@page import="mypack.InsertCustomer" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Customer Operations</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 20px;
        }

        a {
            display: inline-block;
            margin: 5px;
            padding: 8px 16px;
            text-decoration: none;
            color: #fff;
            background-color: #4caf50;
            border-radius: 3px;
        }

        a:hover {
            background-color: #45a049;
        }

        .success-message {
            color: #008000;
            margin-top: 20px;
        }
    </style>
</head>
<body>
    <jsp:useBean id="customer" class="mypack.Customer" scope="session"/>
    <jsp:setProperty property="*" name="customer"/>    
    <%
        boolean flag = InsertCustomer.saveCustomer(customer);
        if(flag){
    %>
            <div class="success-message">
                <h3>Customer Added Successfully</h3>
            </div>
    <%
        }else{
    %>
            <div class="success-message">
                <h3>Customer already present</h3>
            </div>
 <%
        }
  %>
    <a href="customer.html">Add New Customer</a>
    <a href="DisplayCustomer.jsp">Display Customer</a>
</body>
</html>
