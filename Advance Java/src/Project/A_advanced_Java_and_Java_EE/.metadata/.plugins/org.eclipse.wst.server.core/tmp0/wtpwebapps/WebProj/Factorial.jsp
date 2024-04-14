<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
     <%!
	int fact(int n){
	int f=1;
	for(int i=n; i>=1; i--)
	f=f*i;
	return f;
	} %>
	<% int n= Integer.parseInt(request.getParameter("num")); %>
	
	<h3 style="text-aglign:center; color:blue;">Factorial :<%= fact(n) %></h3>
</body>
</html>