<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Formatting Demo</title>
</head>
<body>

<c:set var="date" value="<%=new java.util.Date()%>"/>
<c:out value="${date}"/>

<br/> Time: <strong><fmt:formatDate value="${date}" type="time"/></strong>

<br/> Date: <strong><fmt:formatDate value="${date}" type="date"/></strong>

<br/> Date and Time: <strong><fmt:formatDate value="${date}" type="both"/></strong>

<br/> Date and Time: <strong><fmt:formatDate value="${date}" type="both" timeZone="GMT -1"/></strong>

<br/>
<fmt:setLocale value="en_UK"/>
<br/> Date and Time: <strong><fmt:formatDate value="${date}" type="both" timeZone="GMT -1"/></strong>


</body>
</html>