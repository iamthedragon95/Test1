<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Category</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="<c:url value="/resources/css/bootstrap.min.css"/>"
	rel="stylesheet">
<link href="<c:url value="/resources/css/custom.css"/>" rel="stylesheet">
<script src="<c:url value="/resources/js/respond.js"/>"></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js"/>"></script>
<script src="<c:url value="/resources/js/respond.js"/>"></script>
<style>
.productbox {
	background-color: #ffffff;
	padding: 10px;
	margin-bottom: 10px;
	-webkit-box-shadow: 0 8px 6px -6px #999;
	-moz-box-shadow: 0 8px 6px -6px #999;
	box-shadow: 0 8px 6px -6px #999;
}

.producttitle {
	font-weight: bold;
	padding: 5px 0 5px 0;
}

.p{
	border-top: 1px solid #dadada;
	padding-top: 5px;
}

p>.a {
	font-weight: bold;
	font-size: 1.4em;
}
</style>
</head>
<body>
	<%@include file="navi.jsp"%>
	<div class="container">
		<!-- 	<c:forEach items="${productmodelList}" var="productModel">
				
				<div class="col-md-3 column productbox">
    <img src="<c:url value="resources/admin/upload/${productModel.imagename}"/>" width="200px" height="200px" class="img-responsive">
    <div class="producttitle">${productModel.name}</</div>
    <div class="productprice"><div class="pull-right"><a href="#" class="btn btn-danger btn-sm" role="button">BUY</a></div><div class="pricetext">${productModel.price}</div></div>
</div>
				
				
				</div>
			</c:forEach>
		</div>-->
		<div class="header">
			<center>
				<h1>
					${productModel.category}
					<h1>
			</center>
		</div>


		<c:forEach items="${productmodelList}" var="productModel">


			<div class="col-md-3 column productbox">
				<div class="thumbnail">
					<img
						src="<c:url value="/resources/admin/upload/${productModel.imagename}.jpg"/>"
						class="img-responsive">
					<center>
						<p>
						<a href="spv">${productModel.name}<br> ${productModel.price}</a>
						</p>
					</center>
					<a href="spv"><button type="button"
							class="btn button1 pull-right">view</button></a>
				<a href="<c:url value="addtocart/${productModel.id}"/>"><button type="button" class="btn button2" >Add to
						Cart</button></a>
				</div>
			</div>
		</c:forEach>
	</div>
</body>
</html>