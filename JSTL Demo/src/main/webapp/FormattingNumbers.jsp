<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Formatting Numbers</title>
</head>
<body>

<c:set var="number" value="6541684.669667"/>
<b><c:out value="${number}"/></b>
<br/><br/>

Max Integer Digits: <fmt:formatNumber type="number" maxIntegerDigits="3" value="${number}"/>
<br/>
Max Fraction Digits: <fmt:formatNumber type="number" maxFractionDigits="3" value="${number}"/>
<br/>
Currency: <fmt:formatNumber value="${number}" type="currency" />

<br/>
<fmt:setLocale value="en_US"/>
Currency: <fmt:formatNumber value="${number}" type="currency" />

</body>
</html>