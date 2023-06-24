<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<c:import url="/include/header.jsp"></c:import>

<h1>Hello</h1>
<c:set var="name" value="Otabek"></c:set>
<c:out value="${name}"></c:out>

<c:import url="/include/footer.jsp"></c:import>
