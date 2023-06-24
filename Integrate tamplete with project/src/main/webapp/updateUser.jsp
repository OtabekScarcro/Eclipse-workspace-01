<%@ include file="include/header.jsp" %>
<div class="main-banner">
	<div class="container">
	    <section id="main-section" class="main-section">
	        <div class="main-section__info">
	        	<form action="${pageContext.request.contextPath}/operation" method="post">
	        	Username: <input type="text" name="username" value="${param.username}" required="required"/><br/>
	        	Email: <input type="email" name="email" value="${param.email}" required="required"/><br/>
	        	<input type="hidden" name="usersId" value="${param.usersId}"/>
	        	<input type="hidden" name="form" value="updateUserOperation"/>
	        	<input type="submit" value="Update User"/><br/>
	        	</form>
	        </div>
	    </section>
	</div>
</div>
<%@ include file="include/footer.jsp" %>