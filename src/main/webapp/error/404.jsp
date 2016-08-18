<!DOCTYPE html>
<!--[if IE 8]> <html lang="en" class="ie8"> <![endif]-->
<!--[if IE 9]> <html lang="en" class="ie9"> <![endif]-->
<!--[if !IE]><!--> <html lang="en"> <!--<![endif]-->
<!-- BEGIN HEAD -->
<head>
	<meta charset="utf-8" />
	<title>Metronic | Extra - 404 Page Option 3</title>
	<meta content="width=device-width, initial-scale=1.0" name="viewport" />
	<meta content="" name="description" />
	<meta content="" name="author" />
	<jsp:include page="/WEB-INF/views/back/core/global-mandatory-styles.jsp"></jsp:include>
	<!-- BEGIN PAGE LEVEL STYLES -->
	<link href="${metronicCtx}/media/css/error.css" rel="stylesheet" type="text/css"/>
	<!-- END PAGE LEVEL STYLES -->
	<link rel="shortcut icon" href="${metronicCtx}/media/image/favicon.ico" />
</head>
<!-- END HEAD -->
<!-- BEGIN BODY -->
<body class="page-404-3">
	<div class="page-inner">
		<img src="${metronicCtx}/media/image/earth.jpg" alt="">
	</div>
	<div class="container error-404">
		<h1>404</h1>
		<h2>Houston, we have a problem.</h2>
		<p>
			Actually, the page you are looking for does not exist. 
		</p>
		<p>
			<a href="index.html">Return home</a>
			<br>
		</p>
	</div>
	<!-- BEGIN JAVASCRIPTS(Load javascripts at bottom, this will reduce page load time) -->
	<!-- BEGIN CORE PLUGINS -->
	<script src="${metronicCtx}/media/js/jquery-1.8.3.min.js" type="text/javascript"></script>   
	<!-- IMPORTANT! Load jquery-ui-1.10.1.custom.min.js before bootstrap.min.js to fix bootstrap tooltip conflict with jquery ui tooltip -->  
	<script src="${metronicCtx}/media/js/jquery-ui-1.10.1.custom.min.js" type="text/javascript"></script>      
	<script src="${metronicCtx}/media/js/bootstrap.min.js" type="text/javascript"></script>
	<!--[if lt IE 9]>
	<script src="${metronicCtx}/media/js/excanvas.js"></script>
	<script src="${metronicCtx}/media/js/respond.js"></script>  
	<![endif]-->   
	<script src="${metronicCtx}/media/js/breakpoints.js" type="text/javascript"></script>  
	<!-- IMPORTANT! jquery.slimscroll.min.js depends on jquery-ui-1.10.1.custom.min.js --> 
	<script src="${metronicCtx}/media/js/jquery.uniform.min.js" type="text/javascript" ></script> 
	<!-- END CORE PLUGINS -->
	<script src="${metronicCtx}/media/js/app.js"></script>  
	<script>
		jQuery(document).ready(function() {    
		   App.init();
		});
	</script>
	<!-- END JAVASCRIPTS -->
<script type="text/javascript">  var _gaq = _gaq || [];  _gaq.push(['_setAccount', 'UA-37564768-1']);  _gaq.push(['_setDomainName', 'keenthemes.com']);  _gaq.push(['_setAllowLinker', true]);  _gaq.push(['_trackPageview']);  (function() {    var ga = document.createElement('script'); ga.type = 'text/javascript'; ga.async = true;    ga.src = ('https:' == document.location.protocol ? 'https://' : 'http://') + 'stats.g.doubleclick.net/dc.js';    var s = document.getElementsByTagName('script')[0]; s.parentNode.insertBefore(ga, s);  })();</script></body>
<!-- END BODY -->
</html>