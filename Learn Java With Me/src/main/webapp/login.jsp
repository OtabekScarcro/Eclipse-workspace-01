<%@include file="head.jsp" %>
	<div class="container">
		<div class="card w-50 mx-auto my-5">
			<div class="card-header text-center">
				User Login
			</div>
			<div class="card-body">
				<form action="user-login" method="get">
					<div class="form-group my-3">
						<label class="form-label">Email Address</label>
						<input type="email" class="form-control" name="login-email" placeholder="Enter your email" required>
					</div>
					<div class="form-group my-3">
						<label class="form-label">Password</label>
						<input type="password" class="form-control" name="login-password" required>
					</div>
					<div class="text-center my-3">
						<button type="submit" class="btn btn-primary">Login</button>
					</div>
				</form>
			</div>
		</div>
	</div>
<%@include file="footer.jsp" %>