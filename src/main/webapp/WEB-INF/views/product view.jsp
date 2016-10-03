<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
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
<table border="1">
			<th>ID</th>
			<th>NAME</th>
			<th>DESCRIPTION</th>
			<th>PRICE</th>
			<th>QUANTITY</th>
			<th>CATEGORY</th>
		 	<th>EDIT</th>
			<th>DELETE</th>
			<c:forEach items="${productmodelList}" var="productModel">
				<tr>
					<td>${productModel.id}</td>
					<td>${productModel.name}</td>
					<td>${productModel.description}</td>
					<td>${productModel.price}</td>
					<td>${productModel.quantity }</td>
					<td>${productModel.category}</td>
						<td><a href="<c:url value="edit/${productModel.id}"/>">EDIT</a></td>
					<td><a href="<c:url value="delete/${productModel.id}"/>">DELETE</a></td>
				</tr>
			
				
			</c:forEach>
		</table>
		
</body>
</html>