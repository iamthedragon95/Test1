var cartapp = angular.module("cartapp",[]);

cartapp.controller("cartcntrl",function($scope,$http){
	
	$scope.refreshcart=function(){
		$http.get().success(function(data){
			$scope.cart = data;
			setTimeout(function (){ location.reload();},100000);
			}).error(function(data,status){
     		})	
};

$scope.clearcart = function(){
alert("cleared");
$http.delete().success($scope.refreshcart());
	
};

$scope.initcartId = function(){
$scope.cartId	=cartId;
$scope.refreshcart(cartId);
};

$scope.addTocart =function(productId){
	alert("hello");
	$http.put().success(function(){
		alert("product added to cart");
	}).error(function(data,status){
		alert("product not added");
		console.log("")
	
		})
	
	};
	
	$scope.removeFromcart = function(productId){
	alert("delete")	;
	$http.put().success(function(data){
	$scope.refreshcart();
	})
	
	};
	
	$scope.calGrandTotal = function(){
	var grandTotal = 0;
	 for (var i=0;i< $scope.cart.cartItems.length;i++)
		 {
		 grandTotal += $scope.cart.cartItems[i].totalPrice;
		 }
		return grandTotal; 
	}
	
});



	

