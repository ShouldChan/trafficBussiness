<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="content-type" content="text/html" charset="UTF-8"/>
		<meta name="viewport" content="width=device-width initial-scale=1.0 maximum-scale=1.0 user-scalable=yes" />

		<title>提交事故上传信息</title>


		<link type="text/css" rel="stylesheet" href="css/style.css" />
		<link type="text/css" rel="stylesheet" href="css/jquery.mmenu.all.css" />

		<script type="text/javascript" src="js/jquery.min.js"></script>
		<script type="text/javascript" src="js/jquery.mmenu.min.all.js"></script>
		<script type="text/javascript" src="js/gmap3.min.js"></script>
		<script type="text/javascript" src="js/o-script.js"></script>

	</head>
	<body class="o-page">
		<div id="page" >
			
			<h2 class="title" align="center">交通事故信息提交业务</h2>
			<div id="content" style="height: 1060px;text-align: center;">
				
				<h2 class="title" style="text-align: left;">请输入以下信息（带*表示必填）：</h2>
				
				<form action="accidentsend.action" method="post" id="accident" class="accidentForm">
					
					<label style="text-align: left;">车主姓名 <span class="required">*</span></label>
					<input type="text" name="accident.driverName" id="driverName" placeholder="driverName">
					
					<label style="text-align: left;">车主手机号码 <span class="required">*</span></label>
					<input type="text" name="accident.driverPhone" id="driverPhone" placeholder="driverPhone">
					
					<label style="text-align: left;">车主驾驶证号 <span class="required">*</span></label>
					<input type="text" name="accident.driverId" id="driverId" placeholder="driverId">
					
					<label style="text-align: left;">己方车牌号 <span class="required">*</span></label>
					<input type="text" name="accident.plateNo" id="plateNo" placeholder="plateNo">
					
					<label style="text-align: left;">车辆类型 <span class="required">*</span></label>
					<select id="selectvehicle" name="accident.vehicleType">
						<option value="A1大型客车">A1 大型客车</option>
						<option value="A2牵引车">A2 牵引车</option>
						<option value="A3城市公交车">A3 城市公交车</option>
						<option value="B1中型客车">B1 中型客车</option>
						<option value="B2大型货车">B2 大型货车</option>
						<option value="C1小型汽车">C1 小型汽车</option>
						<option value="C2小型自动挡汽车">C2 小型自动挡汽车</option>
					</select>
					
					<label style="text-align: left;">事故地点 <span class="required">*</span></label>
					<input type="text" name="accident.accidentPlace" id="accidentPlace" placeholder="accidentPlace">
					
					<label style="text-align: left;">保险公司 </label>
					<select id="selectinsurcom" name="accident.insurCom">
						<option value="无"></option>
						<option value="平安车险">平安车险</option>
						<option value="中国人保车险">中国人保车险</option>
						<option value="太平洋车险">太平洋车险</option>
						<option value="中华联合车险">中华联合车险</option>
						<option value="大地车险">大地车险</option>
						<option value="天安车险">天安车险</option>
						<option value="永安车险">永安车险</option>
						<option value="阳光车险">阳光车险</option>
						<option value="其他">其他</option>
					</select>
					
					<label style="text-align: left;">保单号 </label>
					<input type="text" name="accident.insurNo" id="insurNo" placeholder="insurNo">
					<!-- 
					<label style="text-align: left;">机动车驾驶证正副本照片 </label>
					<input type="file" name="accident.drivercardPic" id="drivercardPic" placeholder="drivercardPic">
					
					<label style="text-align: left;">机动车行驶证正副本照片 </label>
					<input type="file" name="accident.carcardPic" id="carcardPic" placeholder="carcardPic">
					
					<label style="text-align: left;">交强险胶贴背面或保单照片 </label>
					<input type="file" name="accident.insurPic" id="insurPic" placeholder="insurPic">
					
					<label style="text-align: left;">前全景图 </label>
					<input type="file" name="accident.frontPic" id="frontPic" placeholder="frontPic">
					
					<label style="text-align: left;">后全景图 </label>
					<input type="file" name="accident.backPic" id="backPic" placeholder="backPic">
					
					<label style="text-align: left;">碰撞部位照片 </label>
					<input type="file" name="accident.keypositionPic" id="keypositionPic" placeholder="keypositionPic">
					 -->
					<label style="text-align: left;">对方车牌号 <span class="required">*</span></label>
					<input type="text" name="accident.opplateNo" id="opplateNo" placeholder="opplateNo">
					
					<label style="text-align: left;">对交警陈述 <span class="required">*</span></label>
					<textarea id="statement" name="accident.statement" placeholder="statement"></textarea>
					
					<input style="width: 100px;height: 30px;" type="submit"  class="btn-normal" id="Submit" value="提交">
					
				</form>

			</div>
			
			<div class="subFooter">---基于微信公众平台的交警服务应用---</div>
			
		</div>
	</body>
</html>