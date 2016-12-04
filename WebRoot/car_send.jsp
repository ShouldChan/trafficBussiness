<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="content-type" content="text/html" charset="UTF-8"/>
		<meta name="viewport" content="width=device-width initial-scale=1.0 maximum-scale=1.0 user-scalable=yes" />

		<title>查询机动车行驶证信息</title>


		<link type="text/css" rel="stylesheet" href="css/style.css" />
		<link type="text/css" rel="stylesheet" href="css/jquery.mmenu.all.css" />

		<script type="text/javascript" src="js/jquery.min.js"></script>
		<script type="text/javascript" src="js/jquery.mmenu.min.all.js"></script>
		<script type="text/javascript" src="js/gmap3.min.js"></script>
		<script type="text/javascript" src="js/o-script.js"></script>

	</head>
	<body class="o-page">
		<div id="page" >
			
			<h2 class="title" align="center">机动车行驶证信息查询业务</h2>
			<div id="content" style="height: 450px;text-align: center;">
				
				<h2 class="title" style="text-align: left;">请输入车牌号码：</h2>
				
				<form action="selectcar.action" method="post" id="car" class="carForm">
					
					<input type="text" name="car.plateNo" id="plateNo" placeholder="plateNo">
					
					<input style="width: 100px;height: 30px;" type="submit" class="btn-normal" id="Submit" value="提交">
					
				</form>

			</div>
			
			<div class="subFooter">---基于微信公众平台的交警服务应用---</div>

		</div>
	</body>
</html>