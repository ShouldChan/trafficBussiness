<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="content-type" content="text/html" charset="UTF-8"/>
		<meta name="viewport" content="width=device-width initial-scale=1.0 maximum-scale=1.0 user-scalable=yes" />

		<title>驾驶员信息查询结果</title>


		<link type="text/css" rel="stylesheet" href="css/style.css" />
		<link type="text/css" rel="stylesheet" href="css/jquery.mmenu.all.css" />

	</head> 
	<body class="o-page">
		<div id="page" >
			
			<h2 class="title" align="center">驾驶员信息查询结果</h2>
			<div id="content" style="height: 1060px;text-align: center;">
			<s:set name="onedriver" value="#request.onedriver"/>
			   <table align="center">
			        <tr>
						<td colspan="4" align="center">
							<s:property value="message"/>
						</td>
					</tr>
					<tr>
						<td width="100">身份证号码:</td>
						<td>
							<s:property value="#onedriver.driverId"/>
						</td>
						
					</tr>
					<tr>
					    <td width="100">档案编号:</td>
						<td>
							<s:property value="#onedriver.driverRecordId"/>
						</td>
					</tr>
					<tr>
					    <td width="100">姓名:</td>
						<td>
							<s:property value="#onedriver.driverName"/>
						</td>
					</tr>
					<tr>
						<td width="100">性别:</td>
						<td>
							<s:property value="#onedriver.driverSex"/>
						</td>
					</tr>
					<tr>
					    <td width="100">国籍:</td>
						<td>
							<s:property value="#onedriver.driverNationality"/>
						</td>
					</tr>
					<tr>
						<td width="100">地址:</td>
						<td>
							<s:property value="#onedriver.driverAddress"/>
						</td>
					</tr>
					<tr>
					    <td width="100">出生日期:</td>
						<td>
							<s:property value="#onedriver.dateOfBirth"/>
						</td>
					</tr>
					<tr>
						<td width="100">初次领证日期:</td>
						<td>
							<s:property value="#onedriver.dateOfFirstIssue"/>
						</td>
					</tr>
					<tr>
					    <td width="100">准驾车型:</td>
						<td>
							<s:property value="#onedriver.carClass"/>
						</td>
					</tr>
					
				</table>
			<div class="subFooter">---基于微信公众平台的交警服务应用---</div>
			
		</div>
	</body>
</html>