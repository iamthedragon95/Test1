<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@include file="navi.jsp"%>
<div class="container">
<div class="row">
<div class="colmd-12">
<H1>SHIPPING DETAILS CONFORMATION</H1>
<form:form modelAttribute="shippingdetails" class="form" role="form">

<table>
<tr>
<td>NAME:</td>
<td>${shipping.sname}</td>
</tr>
<tr>
<td>ADRESS</td>
</tr>
<tr>
<td>${shipping.Addr1}</td>
<td>${shipping.Addr2}</td>
<td>${shipping.Addr3}</td>
</tr>
<tr>
<td>${shipping.PhoneNumber}</td>
</tr>



</table>


<input name="_eventId_edit" type="submit" value="Edit" />
				<input name="_eventId_submit" type="submit" value="Confirm Details" />
</form:form>
</div>
</div>
</div>


</body>
</html>