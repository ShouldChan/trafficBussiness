<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="content-type" content="text/html" charset="UTF-8"/>
		<meta name="viewport" content="width=device-width initial-scale=1.0 maximum-scale=1.0 user-scalable=yes" />

		<title>交通违章信息查询结果</title>


		<link type="text/css" rel="stylesheet" href="css/style.css" />
		<link type="text/css" rel="stylesheet" href="css/jquery.mmenu.all.css" />

	</head> 
	<body class="o-page">
		<div id="page" >
			<h2 class="title" align="center">交通违章信息查询结果</h2>
			<div id="content" style="height: 1060px;text-align: center;">
			<s:set name="onetrafficoffense" value="#request.onetrafficoffense"/>
			   <table align="center">
			        <tr>
						<td colspan="4" align="center">
							<s:property value="message"/>
						</td>
					</tr>
					<tr>
						<td width="100">违章记录编号:</td>
						<td>
							<s:property value="#onetrafficoffense.offenseRecordId"/>
						</td>
						
					</tr>
					<tr>
					    <td width="100">车牌号码:</td>
						<td>
						    <s:property value="#onetrafficoffense.plateNo"/>
						</td>
					</tr>
					<tr>
					    <td width="100">发动机编号:</td>
						<td>
							<s:property value="#onetrafficoffense.engineNo"/>
						</td>
					</tr>
					<tr>
						<td width="100">车主身份证号码:</td>
						<td>
							<s:property value="#onetrafficoffense.driverId"/>
						</td>
					</tr>
					<tr>
					    <td width="100">车主姓名:</td>
						<td>
							<s:property value="#onetrafficoffense.ownerName"/>
						</td>
					</tr>
					<tr>
						<td width="100">违章原因:</td>
						<td>
							<s:property value="#onetrafficoffense.illegalReasons"/>
						</td>
					</tr>
					<tr>
					    <td width="100">违章日期:</td>
						<td>
							<s:property value="#onetrafficoffense.illegalDate"/>
						</td>
					</tr>
					<tr>
						<td width="100">违章是否已处理:</td>
						<td>
							<s:property value="#onetrafficoffense.isHandled"/>
						</td>
					</tr>
					<tr>
					    <td width="100">惩罚类型:</td>
						<td>
							<s:property value="#onetrafficoffense.punishType"/>
						</td>
					</tr>
					
				</table>
			<div class="subFooter">---基于微信公众平台的交警服务应用---</div>
			
		</div>
	</body>
</html>