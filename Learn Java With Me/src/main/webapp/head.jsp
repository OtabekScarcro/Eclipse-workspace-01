<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <link rel="stylesheet" href="css/main-header.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.3.0/css/all.min.css" integrity="sha512-SzlrxWUlpfuzQ+pcUCosxcglQRNAq/DZjVsC0lE40xsADsfeQoEypE+enwcOiGjk/bSuGGKHEyjSoQ1zVisanQ==" crossorigin="anonymous" referrerpolicy="no-referrer" />
    <title><%
    		if(request.getAttribute("title") == null){
    			out.println("Welcome Java Learning");
    		}else {
    			out.println(request.getAttribute("title"));
    		}
			%>
	</title>
</head> 
<body>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
	
	<nav class="navbar navbar-expand-lg">
	  <div class="container-fluid container hover-white">
	    <a class="navbar-brand fs-2 fw-bold text-white" href="#">Learn With Bryan</a>
	    <div class="collapse navbar-collapse" id="navbarSupportedContent">
	      <ul class="navbar-nav ms-auto mb-2 mb-lg-0">
	        <li class="nav-item me-3">
	          <a class="nav-link fw-bold fs-5 text-white" href="${pageContext.request.contextPath}/java-coders?page=home">Home</a>
	        </li>
	        <li class="nav-item me-3">
	          <a class="nav-link fw-bold fs-5 text-white" href="${pageContext.request.contextPath}/java-coders?page=docs">Docs</a>
	        </li>
	        <li class="nav-item me-3">
	          <a class="nav-link fw-bold fs-5 text-white" href="${pageContext.request.contextPath}/java-coders?page=questions">Questions</a>
	        </li>
	        <li class="nav-item me-3">
	          <a class="nav-link fw-bold fs-5 text-white" href="${pageContext.request.contextPath}/java-coders?page=resources">Best Resources</a>
	        </li>
	        <li class="nav-item me-3">
	          <a class="nav-link fw-bold fs-5 text-white" href="${pageContext.request.contextPath}/java-coders?page=about-me">About me</a>
	        </li>
	        <%if(request.getSession().getAttribute("user") != null){ %>
	        	<li class="nav-item me-3">
		          <a class="nav-link fw-bold fs-5 text-white" href="${pageContext.request.contextPath}/java-coders?page=sign-out">Sign out</a>
		        </li>
		    <%}%>
	      </ul>
	    </div>
	  </div>
	</nav>
	
	
	
	
	
	
	
	
	
	