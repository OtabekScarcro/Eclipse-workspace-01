<%@include file="head.jsp" %>
	<div class="container">
		<div class="card w-50 mx-auto my-5">
			<div class="card-header text-center">
				New Accaunt
			</div>
			<div class="card-body">
				<form action="user-signup" method="get">
					<div class="form-group my-3">
						<label class="form-label">Username</label>
						<input type="text" class="form-control" name="username" placeholder="Enter Username" required>
					</div>
					<div class="form-group my-3">
						<label class="form-label">Email Address</label>
						<input type="email" class="form-control" name="userEmail" placeholder="Enter Your Email" required>
					</div>
					<div class="form-group my-3">
						<label class="form-label">Password</label>
						<input type="password" class="form-control" placeholder="Enter Password" name="userPassword" required>
					</div>
					<div class="text-center my-3">
						<button type="submit" class="btn btn-primary">Create Account</button>
					</div>
				</form>
			</div>
		</div>
	</div>
<%@include file="footer.jsp" %>