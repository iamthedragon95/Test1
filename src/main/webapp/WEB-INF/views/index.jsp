
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

<title>carousel</title>
<style>
.carousel-inner>.item>img, .carousel-inner>.item>a>img {
	width: 1440px;
	height: 340px;
}

 


</style>
</head>
<body>
	<%@ include file="/WEB-INF/views/navi.jsp"%>
	<div id="myCarousel" class="carousel slide">
		<!-- Indicators -->
		<ol class="carousel-indicators">
			<li class="item1 active"></li>
			<li class="item2"></li>
			<li class="item3"></li>

		</ol>

		<!-- Wrapper for slides -->
		<div class="carousel-inner" role="listbox">

			<div class="item active">
				<img
					src="<c:url value="resources/images/in1.jpg"/>"
					alt="bt1" >
				<div class="carousel-caption">
					<h3>DRUMS</h3>
					<p>Playing Drums is a therapy</p>
				</div>
			</div>

			<div class="item">
				<img
					src="<c:url value="resources/images/in3.jpg"/>"
					alt="bt2">
				<div class="carousel-caption">
					<h3>Microphones</h3>
					<p>Sing it to a microphone</p>
				</div>
			</div>

			<div class="item">
				<img
					src="<c:url value="resources/images/in2.jpg"/>"
					alt="bt3" >
				<div class="carousel-caption">
					<h3>Ear Phones</h3>
					<p>Keep away people</p>
				</div>
			</div>



		</div>

		<!-- Left and right controls -->
		<a class="left carousel-control" href="#myCarousel" role="button">
			<span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
			<span class="sr-only">Previous</span>
		</a> <a class="right carousel-control" href="#myCarousel" role="button">
			<span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
			<span class="sr-only">Next</span>
		</a>
	</div>
	</div>
	<script>
$(document).ready(function(){
    // Activate Carousel
    $("#myCarousel").carousel();
    
    // Enable Carousel Indicators
    $(".item1").click(function(){
        $("#myCarousel").carousel(0);
    });
    $(".item2").click(function(){
        $("#myCarousel").carousel(1);
    });
    $(".item3").click(function(){
        $("#myCarousel").carousel(2);
    });
    $(".item4").click(function(){
        $("#myCarousel").carousel(3);
    });
    
    // Enable Carousel Controls
    $(".left").click(function(){
        $("#myCarousel").carousel("prev");
    });
    $(".right").click(function(){
        $("#myCarousel").carousel("next");
    });
});
</script>
<br>
</br> 
  <div class="col-sm-4">
      <div class="panel panel-success">
        <div class="panel-heading">Guitars</div>
        <div class="panel-body"><a href="Guitars"><img src="<c:url value="resources/images/in1-1.jpg"/>"   style="width:100%" alt="Image" ></a></div>
        <div class="panel-footer">Make Some Music</div>
      </div>
    </div>
  </div>
</div>
<div class="col-sm-4">
      <div class="panel panel-success">
        <div class="panel-heading">Amplifiers</div>
        <div class="panel-body"><img src="<c:url value="resources/images/in1-2.jpg"/>" style="width:100%" alt="Image"></div>
        <div class="panel-footer">Play Hard</div>
      </div>
    </div>
  </div>
</div>
<div class="col-sm-4">
      <div class="panel panel-success">
        <div class="panel-heading">Headphones</div>
        <div class="panel-body"><img src="<c:url value="resources/images/in1-3.jpg"/>" style="width:100%" alt="Image"></div>
        <div class="panel-footer">Keep Away people</div>
      </div>
    </div>
  </div>
</div>
<br>
<br>
 <div class="col-sm-4">
      <div class="panel panel-success">
        <div class="panel-heading">Wind Instruments</div>
        <div class="panel-body"> <a href=guitars><img src="<c:url value="resources/images/in2-1.jpg"/>"   style="width:100%" alt="Image" ></a></div>
        <div class="panel-footer">Play it easy</div>
      </div>
    </div>
  </div>
</div>
<div class="col-sm-4">
      <div class="panel panel-success">
        <div class="panel-heading">Pianos</div>
        <div class="panel-body"><img src="<c:url value="resources/images/in2-2.jpg"/>" style="width:100%" alt="Image"></div>
        <div class="panel-footer">It ain't got no wrong note</div>
      </div>
    </div>
  </div>
</div>
<div class="col-sm-4">
      <div class="panel panel-success">
        <div class="panel-heading">Microphones</div>
        <div class="panel-body"><img src="<c:url value="resources/images/in2-3.jpg"/>" style="width:100%" alt="Image"></div>
        <div class="panel-footer">Things arn't worth saying sing it out!!</div>
      </div>
    </div>
  </div>
</div>

<%@ include file="/WEB-INF/views/footer.jsp"%>

</body>

</html>