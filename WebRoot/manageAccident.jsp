<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!doctype html>
<html>
<head>
    <meta charset="UTF-8">
    <title>后台管理中心</title>
    <link rel="stylesheet" type="text/css" href="css/common.css"/>
    <link rel="stylesheet" type="text/css" href="css/main.css"/>
    <script type="text/javascript" src="js/libs/modernizr.min.js"></script>
</head>
<body>
<div class="topbar-wrap white">
    <div class="topbar-inner clearfix">
        <div class="topbar-logo-wrap clearfix">
            <h1 class="topbar-logo none"><a href="driverlist.action" class="navbar-brand">后台管理</a></h1>
        </div>
    </div>
</div>
<div class="container clearfix">
    <div class="sidebar-wrap">
        <div class="sidebar-title">
            <h1>交警后台管理</h1>
        </div>
        <div class="sidebar-content">
            <ul class="sidebar-list">
                <li>
                    <a href="#"><i class="icon-font">&#xe003;</i>信息管理</a>
                    <ul class="sub-menu">
                        <li><a href="driverlist.action"><i class="icon-font">&#xe005;</i>驾驶员信息管理</a></li>
                        <li><a href="carlist.action"><i class="icon-font">&#xe005;</i>机动车信息管理</a></li>
                        <li><a href="offenselist.action"><i class="icon-font">&#xe005;</i>交通违章信息管理</a></li>
                        <li><a href="accidentlist.action"><i class="icon-font">&#xe005;</i>事故处理信息管理</a></li>
                    </ul>
                </li>
            </ul>
        </div>
    </div>

    <div class="main-wrap">

        <div class="crumb-wrap">
            <div class="crumb-list"><i class="icon-font"></i><a href="driverlist.action">首页</a><span class="crumb-step">&gt;</span><span class="crumb-name">事故处理信息管理</span></div>
        </div>
        
        <div class="result-wrap">
            <form name="myform" id="myform" method="post">
                <div class="result-title">
                    <div class="result-list">
                        <a href="#"><i class="icon-font"></i>新增记录</a>
                        <a id="batchDel" href="javascript:void(0)"><i class="icon-font"></i>批量删除</a>
                    </div>
                </div>
                <div class="result-content">
                    <table class="result-tab" width="100%">
                        <tr>
                            <th>编号</th>
                            <th>姓名</th>
                            <th>手机号</th>
                            <th>驾驶证号</th>
                            <th>己方车牌</th>
                            <th>车辆类型</th>
                            <th>事故地点</th>
                            <th>保险公司</th>
                            <th>保单号</th>
                            <th>驾驶证照片</th>
                            <th>行驶证照片</th>
                            <th>保单照片</th>
                            <th>前全景图</th>
                            <th>后全景图</th>
                            <th>碰撞部位照片</th>
                            <th>对方车牌</th>
                            <th>陈述</th>
                        </tr>
                       <s:iterator value="#request.lists">
                            <tr>
	                            <td><s:property value="accidentId"/></td>
	                            <td><s:property value="driverName"/></td>
	                            <td><s:property value="driverPhone"/></td>
	                            <td><s:property value="driverId"/></td>
	                            <td><s:property value="plateNo"/></td>
	                            <td><s:property value="vehicleType"/></td>
	                            <td><s:property value="accidentPlace"/></td>
	                            <td><s:property value="insurCom"/></td>
	                            <td><s:property value="insurNo"/></td>
	                            <td><s:property value="drivercardPic"/></td>
	                            <td><s:property value="carcardPic"/></td>
	                            <td><s:property value="insurPic"/></td>
	                            <td><s:property value="frontPic"/></td>
	                            <td><s:property value="backPic"/></td>
	                            <td><s:property value="keypositionPic"/></td>
	                            <td><s:property value="opplateNo"/></td>
	                            <td><s:property value="statement"/></td>
	                        </tr>
	                        </s:iterator>
                    </table>
                    <div class="list-page">1/1 页
                    </div>
                </div>
            </form>
        </div>
    </div>
</div>
</body>
</html>