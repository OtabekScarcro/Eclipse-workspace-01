<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fn" uri = "http://java.sun.com/jsp/jstl/functions" %>

<c:import url="/include/header.jsp"></c:import>

<h1>Hello</h1>
<c:set var="name" value="Otabek"></c:set>
<c:out value="${name}"></c:out>

<a href="<c:url value="/Another.jsp"/>">Redirecting to another page</a>

<h1>more Functions</h1>
<c:set var="str" value="Hello there"/>
${fn:startsWith(str, "H") }<br/>
${fn:endsWith(str, there) }<br/>
${fn:contains(str, "hello") }<br/>
${fn:containsIgnoreCase(str, "hello") }<br/>


<h2>Even more functions</h2>
${fn:toUpperCase(str) }<br/>
${fn:toLowerCase(str) }<br/>
${fn:indexOf(str, "t") }<br/>
${fn:replace(str, "Hello", "hi") }<br/>
${fn:substring(str, 2, 5) }<br/>
${fn:substringBefore(str, " ") }<br/>
${fn:substringAfter(str, " ") }<br/>

<h2>Split</h2>
<c:set var="elements" value="${fn:split('www.studyeasy.org', '.') }"/>
<c:forEach var="element" items="${elements}">
${element }
<br/>
</c:forEach>

<h2>Join</h2>
Joining elements: ${fn:join(elements, '.') }
<br/>




<c:import url="/include/footer.jsp"></c:import>
