
<%@ include file="/WEB-INF/views/includes.jsp"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<link rel="Stylesheet"
	href="<c:url value="/resources/css/bootstrap.min.css"/>">
<link rel="Stylesheet" href="<c:url value="/resources/css/custom.css"/>">
<link href="<c:url value="/resources/css/main.css" />" rel="stylesheet">
<script src="<c:url value="/resources/js/jquery.1.10.2.min.js" />"></script>
<script src="<c:url value="/resources/js/main.js" />"></script>
<spring:url value="/resources/css/main.css" var="mainCss" />
<spring:url value="/resources/js/jquery.1.10.2.min.js" var="jqueryJs" />
<spring:url value="/resources/js/main.js" var="mainJs" />
<script src="<c:url value="/resources/js/respond.js"/>"></script>

<title>Nav</title>
  <style>
    /* Remove the navbar's default rounded borders and increase the bottom margin */
    .navbar {
/*     padding-right: 15px;
   padding-left: 15px; */
      margin-bottom: 10px;
      border-radius: 0;
    }
    </style>
    <script>
    function formSubmit() {
    	document.getElementById("logoutForm").submit();
    }
    
    </script>
    <c:url value='logout' var="logoutUrl"/>
    <form action="${logoutUrl }" method="post" id="logoutForm"></form>

</head>
<body>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
       <a class="navbar-brand" href="#">Musical Instruments</a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
        <li class="active"><a href="<c:url value="home"/>">Home</a></li>
        <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Instruments<span class="caret"></span></a>
        <ul class="dropdown-menu" style="background-color: black">
          <li><a href="Keyboards">KeyBoards</a></li>  
         <li><a href="Guitars">Guitars</a></li>
          <li><a href="WindInstruments">Wind Instruments</a></li>
          <li><a href="Drums">Drums</a></li>
          <li><a href="#">Pianos</a></li>
          <li><a href="Violins">Violins</a></li>
          <li><a href="IndianInstruments">Indian Instruments</a></li>
        </ul>
        </li>
       <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Recordings<span class="caret"></span></a>
         <ul class="dropdown-menu" style="background-color: black">
          <li><a href="Amplifiers">Amplifiers</a></li>  
         <li><a href="Microphones">Microphones</a></li>
          <li><a href="Hearing protection">Hearing protection</a></li>
          <li><a href="Recording software">Recording software</a></li>
          <li><a href="Audio interface">Audio interface</a></li>
          <li><a href="Channel strips">Channel strips</a></li>
          <li><a href="Preamps">Preamps</a></li>
        </ul>
        </li>
         <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Accessories<span class="caret"></span></a>
         <ul class="dropdown-menu" style="background-color: black">
          <li><a href="Headphones">Headphones</a></li>  
         <li><a href="Earphones">Earphones</a></li>
          <li><a href="Speakers">Speakers</a></li> </ul>
              
        <li><a href="#">Contact</a></li>
        <li><a href="<c:url value="viewproducts"/>">View Products</a></li>
      </ul>
      <ul class="nav navbar-nav navbar-right">   
        <sec:authorize access="hasRole('ROLE_ADMIN')">
        <li><a href="product">product</a></li>
        </sec:authorize>
         <c:if test="${pageContext.request.userPrincipal.name==null }">
        <li><a href="memberShip.obj"><span class="glyphicon glyphicon-user"></span> Sign-Up</a></li>
        </c:if>
           <c:if test="${pageContext.request.userPrincipal.name==null }">
        <li><a href="<c:url value="login"/>"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
        </c:if>
        <sec:authorize access="hasRole('ROLE_USER')">
        <li><a href="<c:url value="viewcart"/>"><span class="glyphicon glyphicon-shopping-cart"></span> Cart</a></li>
         </sec:authorize>
        <c:if test="${pageContext.request.userPrincipal.name!=null }">
        <li><a><span class="glyphicon glyphicon-user">${pageContext.request.userPrincipal.name}</span></a></li>
        <li><a href="javascript:formSubmit()"><span class="glyphicon glyphicon-log-out"></span>Logout</a></li>
        </c:if>
      </ul>
    </div>
  </div>
</nav>
</body>
</html>