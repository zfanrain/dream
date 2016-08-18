<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<!--[if IE 8]> <html lang="en" class="ie8"> <![endif]-->
<!--[if IE 9]> <html lang="en" class="ie9"> <![endif]-->
<!--[if !IE]><!--> <html lang="en"> <!--<![endif]-->
<!-- BEGIN HEAD -->
<head>
	<meta charset="utf-8" />
	<meta content="width=device-width, initial-scale=1.0" name="viewport" />
	<meta content="" name="description" />
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<jsp:include page="global-mandatory-styles.jsp"></jsp:include>
	<link rel="shortcut icon" href="${metronicCtx}/media/image/favicon.ico" />	
	<title>首页</title>
</head>
<!-- END HEAD -->
<!-- BEGIN BODY -->
<body class="page-header-fixed">
<jsp:include page="head.jsp"></jsp:include>
<!-- BEGIN CONTAINER -->
<div class="page-container">
		<jsp:include page="menu.jsp"></jsp:include>
		<div class="page-content">

		</div>
</div>
<!-- END CONTAINER -->
<jsp:include page="footer.jsp"></jsp:include>
<!-- BEGIN JAVASCRIPTS(Load javascripts at bottom, this will reduce page load time) -->
<jsp:include page="core-plugins.jsp"></jsp:include>
<script src="${metronicCtx}/media/js/app.js" type="text/javascript"></script>
	<!-- END PAGE LEVEL SCRIPTS --> 
		<script>
		jQuery(document).ready(function() {
		   App.init(); // initlayout and core plugins
		});

	</script>
</body>
</html>