<%@page import="org.javacoders.model.User"%>
<%
	User user = null;
	request.getSession().setAttribute("user", user);
%>

<%@include file="head.jsp"%>

<div class="container">
    <div id="carouselExampleSlidesOnly" class="carousel slide" data-bs-ride="carousel">
        <div class="carousel-inner text-center">
            <div class="carousel-item active">
                <div class="carousel-welcome">
                    <h1 class="banner-content__introduction">Welcome To My <span>Website</span></h1>
                    <h3 class="banner-content__position">Be Expert In Java</h3>
                </div>
            </div>
            <div class="carousel-item">
                <div class="about-me">
                    <h1 class="banner-content__introduction">I am John Bryan</h1>
                    <h3 class="banner-content__position">Java Developer</h3>
                    <div class="socials">
                        <a href="#" class="fs-3 text-primary">
                            <i class="fa-brands fa-twitter"></i>
                        </a>
                        <a href="#" class="fs-3 text-danger">
                            <i class="fa-brands fa-youtube"></i>
                        </a>
                        <a href="#" class="fs-3 text-white">
                            <i class="fa-brands fa-instagram"></i>
                        </a>
                        <a href="#" class="fs-3 text-primary">
                            <i class="fa-brands fa-telegram"></i>
                        </a>
                        <a href="#" class="fs-3 text-primary">
                            <i class="fa-brands fa-linkedin"></i>
                        </a>
                    </div>
                </div>
            </div>
            <div class="carousel-item">
                <h3 class="banner-content__position">The Best Resources On The Internet</h3>
                <h3 class="banner-content__position">The Best and Clear Answers<br>For Each and Every Question</h3>
            </div>
        </div>
    </div>
    <div class="text-center">
    	<a href="${pageContext.request.contextPath}/java-coders?page=sign-in" class="btn btn-secondary w-50 btn-lg mb-2">Sign In</a><br>
	    <a href="${pageContext.request.contextPath}/java-coders?page=sign-up" class="btn btn-secondary w-50 btn-lg my-2">Sign Up</a>
    </div>
</div>

<%@include file="footer.jsp"%>








