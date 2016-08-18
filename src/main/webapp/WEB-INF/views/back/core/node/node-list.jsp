<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>
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
	<jsp:include page="../global-mandatory-styles.jsp"></jsp:include>
	<link rel="shortcut icon" href="${metronicCtx}/media/image/favicon.ico" />
	<title>首页</title>
</head>
<!-- END HEAD -->
<!-- BEGIN BODY -->
<body class="page-header-fixed">
<jsp:include page="../head.jsp"></jsp:include>
<!-- BEGIN CONTAINER -->
<div class="page-container">
		<jsp:include page="../menu.jsp"></jsp:include>
		<div class="page-content">
			<!-- BEGIN PAGE CONTAINER-->        

			<div class="container-fluid">

				<!-- BEGIN PAGE HEADER-->

				<div class="row-fluid">

					<div class="span12">
						<jsp:include page="../setting.jsp"></jsp:include>
						<!-- BEGIN PAGE TITLE & BREADCRUMB-->

						<h3 class="page-title">

							Managed Tables <small>managed table samples</small>

						</h3>

						<ul class="breadcrumb">

							<li>

								<i class="icon-home"></i>

								<a href="index.html">Home</a> 

								<i class="icon-angle-right"></i>

							</li>

							<li>

								<a href="#">Data Tables</a>

								<i class="icon-angle-right"></i>

							</li>

							<li><a href="#">Managed Tables</a></li>

						</ul>

						<!-- END PAGE TITLE & BREADCRUMB-->

					</div>

				</div>

				<!-- END PAGE HEADER-->

				<!-- BEGIN PAGE CONTENT-->

				<div class="row-fluid">

					<div class="span12">

						<!-- BEGIN EXAMPLE TABLE PORTLET-->

						<div class="portlet box light-grey">

							<div class="portlet-title">

								<div class="caption"><i class="icon-globe"></i>Managed Table</div>

								<div class="tools">

									<a href="javascript:;" class="collapse"></a>

									<a href="#portlet-config" data-toggle="modal" class="config"></a>

									<a href="javascript:;" class="reload"></a>

								</div>

							</div>
							<div class="portlet-body">
								<div class="clearfix">
									<div class="btn-group">
										<button id="sample_editable_1_new" class="btn green" onclick="location.href='create.do?parentId=${parent.id}'">
											<s:message code="operation.add"/><i class="icon-plus"></i>
										</button>
										<button id="sample_editable_1_new" class="btn yellow">
											<s:message code="operation.update"/><i class="icon-pencil"></i>
										</button>	
										<button id="sample_editable_1_new" class="btn red">
											<s:message code="operation.delete"/><i class="icon-remove"></i>
										</button>																			
									</div>
									<div class="btn-group pull-right">
										<button class="btn dropdown-toggle" data-toggle="dropdown"><s:message code="operation.tool"/> <i class="icon-angle-down"></i>
										</button>
										<ul class="dropdown-menu pull-right">
											<li><a href="#">Print</a></li>
											<li><a href="#">Save as PDF</a></li>
											<li><a href="#">Export to Excel</a></li>
										</ul>
									</div>
								</div>
								<table class="table table-striped table-bordered table-hover" id="sample_1">
									<thead>
										<tr>
											<th style="width:8px;"><input type="checkbox" class="group-checkable" data-set="#sample_1 .checkboxes" /></th>
											<th><s:message code="node.id" /></th>
											<th class="hidden-480"><s:message code="node.name" /></th>
											<th class="hidden-480"><s:message code="node.code" /></th>
											<th class="hidden-480"><s:message code="node.model" /></th>
											<th ></th>
										</tr>
									</thead>
									<tbody>
										<tr class="odd gradeX">
											<td><input type="checkbox" class="checkboxes" value="1" /></td>
											<td>shuxer</td>
											<td class="hidden-480"><a href="mailto:shuxer@gmail.com">shuxer@gmail.com</a></td>
											<td class="hidden-480">120</td>
											<td class="center hidden-480">12 Jan 2012</td>
											<td ><span class="label label-success">Approved</span></td>
										</tr>
									</tbody>
								</table>
							</div>
						</div>
						<!-- END EXAMPLE TABLE PORTLET-->
					</div>
				</div>
				<!-- END PAGE CONTENT-->
			</div>
			<!-- END PAGE CONTAINER-->
		</div>
</div>
<!-- END CONTAINER -->
<jsp:include page="../footer.jsp"></jsp:include>
<!-- BEGIN JAVASCRIPTS(Load javascripts at bottom, this will reduce page load time) -->
<jsp:include page="../core-plugins.jsp"></jsp:include>
<script src="${metronicCtx}/media/js/app.js" type="text/javascript"></script>
	<!-- END PAGE LEVEL SCRIPTS --> 
		<script>
		jQuery(document).ready(function() {
		   App.init(); // initlayout and core plugins
		});
	</script>
</body>
</html>