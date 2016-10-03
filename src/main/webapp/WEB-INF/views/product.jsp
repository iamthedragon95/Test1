<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page session="true"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>product upload</title>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link href="<c:url value="/resources/css/bootstrap.min.css"/>" rel="stylesheet">
	<link href="<c:url value="/resources/css/custom.css"/>" rel="stylesheet">
	<script src="<c:url value="/resources/js/respond.js"/>"></script>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <script src="<c:url value="/resources/js/bootstrap.min.js"/>"></script>

</head>
<style>
body{
backgorund-color:red;
}
.CAT{
align:"center";
background-color:#00000;
}
table{
width:70%;
background-color:#00000;
}
</style>
<body>


<%@include file="navi.jsp"%>
<div class="col-md-12">
	<form:form action="productmodel" method="POST" modelAttribute="ob" enctype="multipart/form-data">
	<center>
	<table>
		<tr><td colspan="2"><form:errors path="*" cssStyle="color : red;"/></td></tr>
		<div class="form-group">
    <label for="id">Product Id:</label>
    <form:input path="id" class="form-control" id="id"/>
    <form:errors path="id"/>
  </div>
  <div class="form-group">
    <label for="name">Name:</label>
    <form:input path="name" class="form-control" id="name"/>
    <form:errors path="name"/>
  </div>
 <div class="form-group">
    <label for="price">Price:</label>
    <form:input path="price" class="form-control" id="price"/>
    <form:errors path="price"/>
  </div>
  <div class="form-group">
    <label for="description">Description:</label>
    <form:input path="description" class="form-control" id="description"/>
    <form:errors path="description"/>
  </div>
   <div class="form-group">
    <label for="description">Quantity:</label>
    <form:input path="quantity" class="form-control" id="quantity"/>
    <form:errors path="quantity"/>
  </div>		
 <div class="form-group">
    <label for="imagename">ImageName:</label>
    <form:input path="imagename" class="form-control" id="imagename"/>
    <form:input path="filename" type="file"/>
    <form:errors path="filename"/>
  </div>
 <tr>
			<td>CATEGORY</td>
			<form:select path="category" name="CATEGORY">
			 <form:option value="NONE" label="--- Select ---"/>
   			<form:option value="VIOLINS">VIOLINS</form:option>
   			<form:option value="DRUMS">DRUMS</form:option>
  		 	<form:option value="GUITARS">GUITARS</form:option>
  		 	<form:option value="WINDINSTRUMENTS">WINDINSTRUMENTS</form:option>
  		 	<form:option value="KEYBOARDS">KEYBOARDS</form:option>
  		 	<form:option value="INDIANINSTRUMENTS">INDIANINSTRUMENTS</form:option>
			</form:select>
		</tr>
<tr>
			<td colspan="2"><input type="submit" name="action" value="Add" />
				 <input type="submit" name="action" value="Edit" /></td>
				
				<td><center><a href="viewall"  class="btn btn-success">PRODUCT VIEW</a></center>	</td>
		
		</tr>
</table>
</center>
	</form:form>
</div>
<div class="row">
<div class="col-md-12">
<%@include file="footer.jsp"%>
</div>
</div>

</body>
</html>