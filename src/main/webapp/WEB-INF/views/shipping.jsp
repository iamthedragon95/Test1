    <%@ include file="/WEB-INF/views/includes.jsp"%>
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
    

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Shipping</title>
</head>
<body>
<div class="container">
<form:form  method="POST" modelAttribute="shippingdetails">
		<form:label path="sname">NAME</form:label><br>
		<form:input  path="sname" pattern="[a-zA-Z\s]{3,30}" required="true"
						class="form-control input-lg" placeholder="Name"/>
		<c:forEach
						items="${flowRequestContext.messageContext.getMessagesBySource('sname')}"
						var="err">
						<div>
							<span>${err.text}</span>
						</div>
					</c:forEach>
		<hr>
		<center><h4>ADDRESS</h4></center>
		<form:label path="Addr1">LINE 1</form:label><br>
		<form:input path="Addr1"  required="true"
						class="form-control input-lg" placeholder="Enter the address line"/>
		<c:forEach
						items="${flowRequestContext.messageContext.getMessagesBySource('Addr1')}"
						var="err">
						<div>
							<span>${err.text}</span>
						</div>
					</c:forEach>
		<hr>
		<form:label path="Addr2">LINE 2</form:label><br>
		<form:input path="Addr2"  required="true"
						class="form-control input-lg" placeholder="Enter the Address Line 2"/>
		<c:forEach
						items="${flowRequestContext.messageContext.getMessagesBySource('Addr2')}"
						var="err">
						<div>
							<span>${err.text}</span>
						</div>
					</c:forEach>
		<hr>
		<form:label path="Addr3">LINE 3</form:label><br>
		<form:input path="Addr3"  required="true"
						class="form-control input-lg" placeholder="Enter the Address Line 3"/>
		<c:forEach
						items="${flowRequestContext.messageContext.getMessagesBySource('Addr3')}"
						var="err">
						<div>
							<span>${err.text}</span>
						</div>
					</c:forEach>
		<hr>
		<div class="row">	
		<div class="col-md-6">
		<form:label path="City">CITY</form:label><br>
		<form:select  class="define" path="City" name="City">
			 <form:option value="Chennai">Chennai</form:option>
   			<form:option value="Madurai">Madurai</form:option>
   			<form:option value="Thuttukudi">Thuttukudi</form:option>
  		 	<form:option value="Kannaayakumari">Kannayakumari</form:option>
  		 	<form:option value="Thirunelveli">Thirunelveli</form:option>
  		 	<form:option value="Thanjavur">Thanjavur</form:option>
  		 	<form:option value="Trichy">Trichy</form:option>
			</form:select>
			<c:forEach
						items="${flowRequestContext.messageContext.getMessagesBySource('City')}"
						var="err">
						<div>
							<span>${err.text}</span>
						</div>
					</c:forEach>
		</div>
		<div class="col-md-6">
		<form:label path="pincode">PINCODE</form:label><br>
		<form:input path="pincode" required="true"
								class="form-control input-lg" placeholder="PinCode" pattern=".{6}"/>		
		<c:forEach
						items="${flowRequestContext.messageContext.getMessagesBySource('pincode')}"
						var="err">
						<div>
							<span>${err.text}</span>
						</div>
					</c:forEach>
		<hr>
		</div>
		</div>
		<form:label path="PhoneNumber">PHONE NUMBER</form:label><br>
		<form:input path="PhoneNumber" required="true"
								class="form-control input-lg" placeholder="phone number" pattern="[789][0-9]{9}"/>				
	<c:forEach
						items="${flowRequestContext.messageContext.getMessagesBySource('PhoneNumber')}"
						var="err">
						<div>
							<span>${err.text}</span>
						</div>
					</c:forEach>
			<hr>
				<button style="align:center" class="btn btn-md btn-success btn-block signup-btn"
									name="_eventId_submit" type="submit" value="Submit" >Submit</button>
</form:form>
</div>
</body>
</html>