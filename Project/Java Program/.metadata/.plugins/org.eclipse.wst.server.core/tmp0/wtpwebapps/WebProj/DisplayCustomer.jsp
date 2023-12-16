<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Customer List</title>
    <style>
        table {
            width: 100%;
            border-collapse: collapse;
        }

        th, td {
            border: 1px solid black;
            padding: 8px;
            text-align: left;
        }

        th {
            background-color: #f2f2f2;
        }
    </style>
</head>
<sql:setDataSource var="dataSource"
				driver="com.mysql.cj.jdbc.Driver"
				url="jdbc:mysql://localhost:3306/java16"
				user="root" password="1998"/>
<body>
		<sql:query var="customers"  dataSource="${dataSource}">
		 select * from Customer
		</sql:query>
    <h2>Customer List</h2>
    <table>
        <thead>
            <tr>
                <th>Customer Name</th>
                <th>Username</th>
                <th>Password</th>
                <th>Age</th>
                <th>Email</th>
            </tr>
        </thead>
        <tbody>
        <c:forEach var="customer" items="${customers.rows}">
            <tr>
                <td><c:out value="${customer.custname}" /></td>
                <td><c:out value="${customer.username}"/></td>
                <td><c:out value="${customer.password}" /></td>
                <td><c:out value="${customer.age}" /></td>
                <td><c:out value="${customer.email}" /></td>
            </tr>
             </c:forEach>
            <!-- Add more rows for additional books -->
        </tbody>
    </table>
</body>
</html>