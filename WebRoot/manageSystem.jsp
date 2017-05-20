<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.util.Map"%>
<%@page import="java.util.List"%>
 <%@ taglib prefix="naah" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE HTML>
<html>
<head>
<meta charset="utf-8">
<meta name="renderer" content="webkit">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
<meta http-equiv="Cache-Control" content="no-siteapp" />
<LINK rel="Bookmark" href="/favicon.ico" >
<LINK rel="Shortcut Icon" href="/favicon.ico" />
<!--[if lt IE 9]>
<script type="text/javascript" src="lib/html5.js"></script>
<script type="text/javascript" src="lib/respond.min.js"></script>
<script type="text/javascript" src="lib/PIE_IE678.js"></script>
<![endif]-->
<link rel="stylesheet" type="text/css" href="static/h-ui/css/H-ui.min.css" />
<link rel="stylesheet" type="text/css" href="static/h-ui.admin/css/H-ui.admin.css" />
<link rel="stylesheet" type="text/css" href="lib/Hui-iconfont/1.0.7/iconfont.css" />
<link rel="stylesheet" type="text/css" href="static/h-ui.admin/skin/default/skin.css" id="skin" />
<style type="text/css">
body,td,th {
	font-family: "Microsoft Yahei", "Hiragino Sans GB", "Helvetica Neue", Helvetica, tahoma, arial, "WenQuanYi Micro Hei", Verdana, sans-serif, \5B8B\4F53;
	color: #000;
	
}

</style>
<!--[if IE 6]>
<script type="text/javascript" src="http://lib.h-ui.net/DD_belatedPNG_0.0.8a-min.js" ></script>
<script>DD_belatedPNG.fix('*');</script>
<![endif]-->
<title>齐齐哈尔市团市委捐赠网管理系统</title>
</head>
<body>

<header class=" navbar-wrapper">
	<div class="navbar navbar-fixed-top">
		<div class="container-fluid cl"> <a class="logo navbar-logo f-l mr-10 hidden-xs" href="index.naah">齐齐哈尔市团市委捐赠网管理系统</a><a class="logo navbar-logo-m f-l mr-10 visible-xs" href="index.naah">齐齐哈尔市团市委捐赠网管理系统</a> <span class="logo navbar-slogan f-l mr-10 hidden-xs">v1.0.1</span> <a aria-hidden="false" class="nav-toggle Hui-iconfont visible-xs" href="javascript:;">&#xe667;</a>
			<nav id="Hui-userbar" class="nav navbar-nav navbar-userbar hidden-xs">
				<ul class="cl">
					<li><a href="javascript:layer_show('aaa','index.naah',300,300);">${sessionScope.user.realname}</a></li>
<li class="dropDown dropDown_hover"> <a href="#" class="dropDown_A">${sessionScope.user.username} <i class="Hui-iconfont">&#xe6d5;</i></a>
						<ul class="dropDown-menu menu radius box-shadow">
							
							<li><a href="logout.naah">退出</a></li>
						</ul>
					</li>
				  
<li id="Hui-skin" class="dropDown right dropDown_hover"> <a href="javascript:;" class="dropDown_A" title="换肤"><i class="Hui-iconfont" style="font-size:18px">&#xe62a;</i></a>
						<ul class="dropDown-menu menu radius box-shadow">
							<li><a href="javascript:;" data-val="blue" title="蓝色">蓝色</a></li>
							
							<li><a href="javascript:;" data-val="green" title="绿色">绿色</a></li>
							<li><a href="javascript:;" data-val="red" title="红色">红色</a></li>
							<li><a href="javascript:;" data-val="yellow" title="黄色">黄色</a></li>
							<li><a href="javascript:;" data-val="orange" title="绿色">橙色</a></li>
						</ul>
					</li>
			  </ul>
			</nav>
		</div>
	</div>
</header>
<aside class="Hui-aside">

	
	<div class="menu_dropdown bk_2">
    

<ul id="Huifold1" class="Huifold">

<naah:forEach var="nav" items="${sessionScope.privilege}">
<naah:set var="privileges" value="${nav.privileges}"></naah:set>
 <li class="item">
 <naah:if test="${privileges.isLink==0}">
 	<h4>${privileges.privilegeName}<b>+</b></h4>
	 <div class="info"> 
		 <naah:forEach var="nei" items="${sessionScope.privilege}">
			 <naah:set var="neiprivileges" value="${nei.privileges}"></naah:set>
			 <naah:if test="${neiprivileges.parentId==privileges.privilegeId}">
					<a _href="${neiprivileges.url}" data-title="${neiprivileges.privilegeName}">${neiprivileges.privilegeName}</a>
			 </naah:if>
		 
		 </naah:forEach>
	 
	 </div>
	 
 </naah:if>
    </li>

</naah:forEach>
  
</ul>

	</div>
</aside>
<div class="dislpayArrow hidden-xs"><a class="pngfix" href="javascript:void(0);" onClick="displaynavbar(this)"></a></div>
<section class="Hui-article-box">
	<div id="Hui-tabNav" class="Hui-tabNav hidden-xs">
		<div class="Hui-tabNav-wp">
			<ul id="min_title_list" class="acrossTab cl">
				<li class="active"><span title="我的桌面" data-href="welcome.html">我的桌面</span><em></em></li>
			</ul>
		</div>
		<div class="Hui-tabNav-more btn-group"><a id="js-tabNav-prev" class="btn radius btn-default size-S" href="javascript:;"><i class="Hui-iconfont">&#xe6d4;</i></a><a id="js-tabNav-next" class="btn radius btn-default size-S" href="javascript:;"><i class="Hui-iconfont">&#xe6d7;</i></a></div>
	</div>
	<div id="iframe_box" class="Hui-article">
		<div class="show_iframe">
			<div style="display:none" class="loading"></div>
			<iframe scrolling="yes" frameborder="0" src=""></iframe>
		</div>
	</div>
</section>

<script type="text/javascript" src="lib/jquery/1.9.1/jquery.min.js"></script> 
<script type="text/javascript" src="static/h-ui/js/H-ui.js"></script> 
<script type="text/javascript" src="static/h-ui.admin/js/H-ui.admin.js"></script>  
<script>
$(function(){
	$.Huifold("#Huifold1 .item h4","#Huifold1 .item .info","fast",3,"click"); /*5个参数顺序不可打乱，分别是：相应区,隐藏显示的内容,速度,类型,事件*/
});

 $(window).bind('beforeunload',function(){
	   $.ajax({
	       url:"closeWindow.naah?id=${sessionScope.user.userId}",
	       type:"post",
	       success:function(){
	           alert("您已退出登录");
	       }
	   });
	}); 

	
	
</script>
</body>
</html>