<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>REGISTRATION </title>
<link href="style.css" rel="stylesheet" type="text/css" />
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link href="<c:url value="/resources/css/bootstrap.min.css"/>" rel="stylesheet">
	<link href="<c:url value="/resources/css/custom.css"/>" rel="stylesheet">
	<script src="<c:url value="/resources/js/respond.js"/>"></script>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <script src="<c:url value="/resources/js/bootstrap.min.js"/>"></script>
    <script src="<c:url value="/resources/js/respond.js"/>"></script>
</head>

<body>
<%@include file="navi.jsp"%>
	<div class="content">
		<fieldset>
		<center>	<legend>Register Here</legend></center>
			<!-- for triggering webflow events using links,
					 the eventId to be triggered is given in "href" attribute as:
				 -->
			
		<center>	SIGN_UP
			<sf:form modelAttribute="newuser">
				<br />
				<sf:label path="fname">Name:</sf:label>
				<sf:input path="fname" />
				<br />
				<!-- to display validation messages -->
				<c:forEach
					items="${flowRequestContext.messageContext.getMessagesBySource('fname')}"
					var="err">
					<div>
						<span>${err.text}</span>
					</div>
				</c:forEach>
				<br />
				<sf:label path="email">Email Id: </sf:label>
				<sf:input path="email" />
				<br />
				<c:forEach
					items="${flowRequestContext.messageContext.getMessagesBySource('email')}"
					var="err">
					<div>
						<span>${err.text}</span>
					</div>
				</c:forEach>
				<br />
				<sf:label path="age">Age:       </sf:label>
				<sf:input path="age" />
				<br />
				<c:forEach
					items="${flowRequestContext.messageContext.getMessagesBySource('age')}"
					var="err">
					<div>
						<span>${err.text}</span>
					</div>
				</c:forEach>
				<br />
				<sf:label path="username">USERNAME: </sf:label>
				<sf:input path="username" />
				<br />
				<!-- to display validation messages -->
				<c:forEach
					items="${flowRequestContext.messageContext.getMessagesBySource('username')}"
					var="err">
					<div>
						<span>${err.text}</span>
					</div>
				</c:forEach>
				<br />
				<sf:label path="password">Password:</sf:label>
				<sf:input path="password" type="password"/>
				<br />
				<!-- to display validation messages -->
				<c:forEach
					items="${flowRequestContext.messageContext.getMessagesBySource('password')}"
					var="err">
					<div>
						<span>${err.text}</span>
					</div>
				</c:forEach>
				<br />
				<sf:label path="cPassword" style="text-allign:center">Conformtion Password :</sf:label>
				<sf:input path="cPassword" type="password"/>
				<br />
				<!-- to display validation messages -->
				<c:forEach
					items="${flowRequestContext.messageContext.getMessagesBySource('cPassword')}"
					var="err">
					<div>
						<span>${err.text}</span>
					</div>
				</c:forEach>
				<br />
				<sf:label path="phnumber">Phone Number:</sf:label>
				<sf:input path="phnumber" />
				<br />
				<!-- to display validation messages -->
				<c:forEach
					items="${flowRequestContext.messageContext.getMessagesBySource('phnumber')}"
					var="err">
					<div>
						<span>${err.text}</span>
					</div>
				</c:forEach>
				<br />
				<!-- for triggering webflow events using form submission,
					 the eventId to be triggered is given in "name" attribute as:
					-->
				<input name="_eventId_submit" type="submit" value="Submit" />
				<br />
			</sf:form></center>
			
		</fieldset>
	</div>
	<%@include file="footer.jsp"%>
</body>
</html>