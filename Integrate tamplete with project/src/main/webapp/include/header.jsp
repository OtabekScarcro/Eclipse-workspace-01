<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.3.0/css/all.min.css" integrity="sha512-SzlrxWUlpfuzQ+pcUCosxcglQRNAq/DZjVsC0lE40xsADsfeQoEypE+enwcOiGjk/bSuGGKHEyjSoQ1zVisanQ==" crossorigin="anonymous" referrerpolicy="no-referrer" />
    <link rel="stylesheet" href="./css/main.css">
    <link rel="stylesheet" href="./css/about.css">
    <link rel="stylesheet" href="./css/partners.css">
    <link rel="stylesheet" href="./css/footer.css">
    <title><%
    		if(request.getAttribute("title") == null){
    			out.println("Homepage");
    		}else {
    			out.println(request.getAttribute("title"));
    		}
			%>
	</title>
</head>
<body>
    <!--Header section-->
    <header class="main-header">
        <div class="container">
            <nav class="main-navigation">
                <div class="main-navigation__icon">
                    <a href="${pageContext.request.contextPath}/home?page=home">
                        <img  src="./images/logo.png.webp" alt="MY ICON">
                    </a>
                </div>
                <ul class="main-navigation__items">
                    <li class="main-navigation__item">
                        <a href="${pageContext.request.contextPath}/site?page=home">Home</a>
                    </li>
                    <li class="main-navigation__item">
                        <a href="${pageContext.request.contextPath}/operation?page=listusers">List users</a>
                    </li>
                    <li class="main-navigation__item">
                        <a href="${pageContext.request.contextPath}/operation?page=adduser">Add User</a>
                    </li>
                </ul>
            </nav>
        </div>
    </header>
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    