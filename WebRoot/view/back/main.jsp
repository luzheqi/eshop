<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'main.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<script type="text/javascript" src="js/jquery/jquery-1.9.1.js"></script>
<script type="text/javascript"
	src="js/jquery/jquery-ui-1.10.3.custom.js"></script>
<script type="text/javascript" src="js/back/main.js"></script>

<link rel="stylesheet" type="text/css"
	href="css/ui-lightness/jquery-ui-1.10.3.css">

<link rel="stylesheet" type="text/css" href="css/back/main.css">

</head>

<body>
	<div id="operation" class="menu">
		<h3 id = "CommodityManager">商品管理</h3>
		<div>
			<a id = "addCommodity">添加商品</a> 
			<br>
		</div>
		
		<h3>系统用户管理</h3>
		<div>
			<h3 id = "systemUserManager">系统用户管理管理</h3>
		</div>
		
		<h3 id = "BuyerManager">买家管理</h3>
		<div></div>
		<h3>营业信息管理</h3>
		<div>
			<a href="">1234</a> <a>5678</a>
		</div>
	</div>
	
	<iframe class="content" src="view/back/CommodityManager/CommodityManager.jsp" scrolling="auto"></iframe>
</body>
</html>
