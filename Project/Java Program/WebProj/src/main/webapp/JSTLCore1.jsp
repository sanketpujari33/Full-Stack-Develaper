<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:out value="Welcome to JSTL"/>
<c:set var="num1" value="${10}"/>
<c:set var="num2" value="${20}"/>
Sum : <c:out value="${num1+num2}"/>