<%@include file="include/header.jsp" %>
<%@ page import="java.util.List" %>
<%@ page import="org.javacoders.entity.User" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<div class="main-banner">
	<div class="container">
	    <section id="main-section" class="main-section">
	        <div class="main-section__info">
	        	<strong>Listing users</strong>
	        	<hr/>
	        	<table border="1">
	        		<thead>
	        			<th>User ID</th>
	        			<th>Username</th>
	        			<th>Email</th>
	        			<th>Operation</th>
	        		</thead>
	        		<c:forEach items="${listUsers}" var="user">
	        			<c:url var="updateURL" value="operation">
	        				<c:param name="page" value="updateUser"/>
	        				<c:param name="usersId" value="${user.users_id}"/>
	        				<c:param name="username" value="${user.username}"/>
	        				<c:param name="email" value="${user.email}"/>
	        			</c:url>
	        			
	        			<c:url var="deleteURL" value="operation">
	        				<c:param name="page" value="deleteUser"/>
	        				<c:param name="usersId" value="${user.users_id}"/>
	        			</c:url>
	        			
	        			<tr>
		        			<td>${user.users_id}</td>
		        			<td>${user.username}</td>
		        			<td>${user.email}</td>
	        			<td>
	        				<a href="${updateURL}">Update</a>
	        				<a href="${deleteURL}" 
	        					onclick="if(!confirm('Are you sure to delete this user?')) return false">Delete</a>
						</td>
	        			</tr>
	        			
	        		</c:forEach>
	        	</table>
	        </div>
	    </section>
	</div>
</div>
<%@include file="include/footer.jsp" %>
















