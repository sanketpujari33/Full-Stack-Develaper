<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<% 
   String bgcolor=request.getParameter("bgcolor");
	if(bgcolor == null || bgcolor.trim().equals(""))
		bgcolor="white";
%>
<body bgcolor=<%= bgcolor %>>
	Background color <%= bgcolor %>
</body>
</body>
</html>