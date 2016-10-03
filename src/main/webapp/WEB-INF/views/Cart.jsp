
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


<body><!--  ="cartpage" ng-controller="cartController" -->
<!-- <script type="text/javascript">
angular.module("mycartpage",[]).controller('cartController',function($scope,$http){
/* alert("hi"); */
console.log("execution of angular js");
$http({method:'GET',
	url:'viewcartpdetails'}).success(function(data,status,header,config){
	alert("Welcome");
	$scope.cart=data;
	console.log("len"+prod.length);
	for(var c=0;c<$scope.cart.length;c++)
		{
		var d=$scope.cart[c];
		console.log(d);
		console.log($scope.cart);
		return $scope.cart;
		}
});
});

</script> -->
	<%@include file="navi.jsp"%>
	<div class="container">
	
	<h1> CART</h1>
	<div class="pull-right">
	<!-- <input type="text" ng-model="test"> -->
	</div>
	</div>
	<table border="1" style="width:100%">
		<tr>
		
			<th>Quantity</th>
			<th>NAME</th>
			<th>DESCRIPTION</th>
			<th>PRICE</th>
			<th>CATEGORY</th>
			<th>Total Prize</th>
			
			 	<th>DELETE</th>
		
			</tr>
			<%-- <tr ng-repeat="ce in prod | fiter:test">
					<td class="media" colspan=3><img class="media-object" src="<c:url value="resources/admin/upload/{{ce.imagename}}.jpg"/>"></td>
					<td>{{ce.quantity}}</td>
					<td>{{ce.name}}</td>
					<td>{{ce.description}}</td>
					<td>{{ce.price}}</td>
					<td>{{ce.category}}</td>
					
					
					<td><a href="<c:url value="delete/${ce.id}"/>">DELETE</a></td>
				
					
				<td><a href="<c:url value="viewproduct/${ce.id}"/>">VIEW</a></td>
				</tr> --%>
		<c:set var="total" value="0"></c:set>	
		<c:forEach items="${cartlist}" var="cart">
				<tr>
					<td>${cart.quantity}</td>
					<td>${cart.product.name}</td>
					<td>${cart.product.description}</td>
					<td>${cart.product.price}</td>
					<td>${cart.product.category}</td>
					<td>${cart.totalprice}</td>
					<td><a href="<c:url value="deleted/cartitem/${cart.cid}"/>">DELETE</a></td>
				
					
				<%-- <td><a href="<c:url value="viewproduct/${ce.id}"/>">VIEW</a></td> --%>
				</tr>
				<c:set var="total" value="${total+cart.totalprice}"></c:set>
			</c:forEach>
			<tr>
			<td colspan="5">Total<span>${total}</span></td>
			</tr> 
	</table>
	
	<a href="<c:url value="checkout.obj"/>" class="btn btn-primary">Checkout</a>
	
