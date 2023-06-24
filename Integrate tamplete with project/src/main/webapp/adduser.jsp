<%@ include file="include/header.jsp" %>
<div class="main-banner">
	<div class="container">
	    <section id="main-section" class="main-section">
	        <div class="main-section__info">
	        	<form action="${pageContext.request.contextPath}/operation" method="post">
	        	Username: <input type="text" name="username" required="required"/><br/>
	        	Email: <input type="email" name="email" required="required"/><br/>
	        	<input type="hidden" name="form" value="addUserOperation">
	        	<input type="submit" value="Add User"/><br/>
	        	</form>
	        </div>
	    </section>
	</div>
</div>
<%@ include file="include/footer.jsp" %>