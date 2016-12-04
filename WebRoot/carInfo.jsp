<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="content-type" content="text/html" charset="UTF-8"/>
		<meta name="viewport" content="width=device-width initial-scale=1.0 maximum-scale=1.0 user-scalable=yes" />

		<title>机动车信息查询结果</title>


		<link type="text/css" rel="stylesheet" href="css/style.css" />
		<link type="text/css" rel="stylesheet" href="css/jquery.mmenu.all.css" />

	</head> 
	<body class="o-page">
		<div id="page" >
			
			<h2 class="title" align="center">机动车信息查询结果</h2>
			<div id="content" style="height: 1060px;text-align: center;">
			<s:set name="onecar" value="#request.onecar"/>
			   <table align="center">
			        <tr>
						<td colspan="4" align="center">
							<s:property value="message"/>
						</td>
					</tr>
					<tr>
						<td width="100">车牌号码:</td>
						<td>
							<s:property value="#onecar.plateNo"/>
						</td>
						
					</tr>
					<tr>
					    <td width="100">车主身份证号码:</td>
						<td>
							<s:property value="#onecar.driverId"/>
						</td>
					</tr>
					<tr>
					    <td width="100">车辆类型:</td>
						<td>
							<s:property value="#onecar.vehicleType"/>
						</td>
					</tr>
					<tr>
						<td width="100">车主姓名:</td>
						<td>
							<s:property value="#onecar.ownerName"/>
						</td>
					</tr>
					<tr>
					    <td width="100">车主地址:</td>
						<td>
							<s:property value="#onecar.ownerAddress"/>
						</td>
					</tr>
					<tr>
						<td width="100">使用类型:</td>
						<td>
							<s:property value="#onecar.useCharacter"/>
						</td>
					</tr>
					<tr>
					    <td width="100">品牌型号:</td>
						<td>
							<s:property value="#onecar.carModel"/>
						</td>
					</tr>
					<tr>
						<td width="100">车辆识别代码:</td>
						<td>
							<s:property value="#onecar.carVIN"/>
						</td>
					</tr>
					<tr>
					    <td width="100">发动机型号:</td>
						<td>
							<s:property value="#onecar.engineNo"/>
						</td>
					</tr>
					<tr>
					    <td width="100">注册日期:</td>
						<td>
							<s:property value="#onecar.registerDate"/>
						</td>
					</tr>
					<tr>
					    <td width="100">发证日期:</td>
						<td>
							<s:property value="#onecar.issueDate"/>
						</td>
					</tr>
					<tr>
					    <td width="100">车辆档案编号:</td>
						<td>
							<s:property value="#onecar.carRecordId"/>
						</td>
					</tr>
					<tr>
					    <td width="100">核定载人数:</td>
						<td>
							<s:property value="#onecar.permittedNo"/>
						</td>
					</tr>
					<tr>
					    <td width="100">总质量:</td>
						<td>
							<s:property value="#onecar.totalWeight"/>
						</td>
					</tr>
					<tr>
					    <td width="100">整备质量:</td>
						<td>
							<s:property value="#onecar.curbWeight"/>
						</td>
					</tr>
					<tr>
					    <td width="100">核定载质量:</td>
						<td>
							<s:property value="#onecar.permittedWeight"/>
						</td>
					</tr>
					<tr>
					    <td width="100">外廓尺寸:</td>
						<td>
							<s:property value="#onecar.outsideDimensions"/>
						</td>
					</tr>
					<tr>
					    <td width="100">准牵引总质量:</td>
						<td>
							<s:property value="#onecar.totalWeightofQtraction"/>
						</td>
					</tr>
					<tr>
					    <td width="100">备注:</td>
						<td>
							<s:property value="#onecar.carRemarks"/>
						</td>
					</tr>
					<tr>
					    <td width="100">检验记录:</td>
						<td>
							<s:property value="#onecar.testRecord"/>
						</td>
					</tr>
				</table>
			<div class="subFooter">---基于微信公众平台的交警服务应用---</div>
			
		</div>
	</body>
</html>