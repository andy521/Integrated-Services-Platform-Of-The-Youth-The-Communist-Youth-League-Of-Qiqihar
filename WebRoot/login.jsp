﻿<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="naah" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML>
<html>
<head>
<meta charset="utf-8">
<meta name="renderer" content="webkit">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
<meta http-equiv="Cache-Control" content="no-siteapp" />
<!--[if lt IE 9]>
<script type="text/javascript" src="lib/html5.js"></script>
<script type="text/javascript" src="lib/respond.min.js"></script>
<script type="text/javascript" src="lib/PIE_IE678.js"></script>
<![endif]-->
<link href="static/h-ui/css/H-ui.min.css" rel="stylesheet" type="text/css" />
<link href="static/h-ui.admin/css/H-ui.login.css" rel="stylesheet" type="text/css" />
<link href="static/h-ui.admin/css/style.css" rel="stylesheet" type="text/css" />
<link href="lib/Hui-iconfont/1.0.7/iconfont.css" rel="stylesheet" type="text/css" />
<!--[if IE 6]>
<script type="text/javascript" src="http://lib.h-ui.net/DD_belatedPNG_0.0.8a-min.js" ></script>
<script>DD_belatedPNG.fix('*');</script>
<![endif]-->
<title>后台登录 - Naah v1.0</title>
</head>
<body>
<naah:if test="${requestScope.message!=null}">
<script type="text/javascript">
alert('${requestScope.message}');
</script>
</naah:if>

<div class="header"></div>
<div class="loginWraper">
  <div id="loginform" class="loginBox">

    <form class="form form-horizontal" action="Admin" method="post">
      <div class="row cl">
        <label class="form-label col-xs-3"><i class="Hui-iconfont">&#xe60d;</i></label>
        <div class="formControls col-xs-8">
          <input id="username" name="username" type="text" placeholder="账户" class="input-text size-L">
        </div>
      </div>
      <div class="row cl">
        <label class="form-label col-xs-3"><i class="Hui-iconfont">&#xe60e;</i></label>
        <div class="formControls col-xs-8">
          <input id="password" name="password" type="password" placeholder="密码" class="input-text size-L">
        </div>
      </div>
      <div class="row cl">
        <div class="formControls col-xs-8 col-xs-offset-3">
          <input name="pic" class="input-text size-L" type="text" placeholder="验证码"  value="" style="width:150px;">
          <img src="pic.naah" id="imgObj"  onclick="this.src='pic.naah?'+ Math.random()" title="点击图片刷新验证码"> <a id="kanbuq" href="#" onclick="this.src='pic.naah?'+ Math.random()">看不清，换一张</a> </div>
      
      </div>
      <div class="row cl">
        <div class="formControls col-xs-8 col-xs-offset-3">
        <p></p>
        </div>
      </div>
      <div class="row cl">
        <div class="formControls col-xs-8 col-xs-offset-3">
          <input name="" type="submit" class="btn btn-success radius size-L" value="&nbsp;登&nbsp;&nbsp;&nbsp;&nbsp;录&nbsp;">
          <input name="" type="button" class="btn btn-default radius size-L" value="&nbsp;退&nbsp;&nbsp;&nbsp;&nbsp;出&nbsp;" onclick="JavaScript:if(confirm('你是否要退出系统？')){parent.window.close();}">
        </div>
      </div>
    </form>
  </div>
</div>
<div class="footer">Copyright 齐齐哈尔市团市委 by Naah</div>
<script type="text/javascript" src="lib/jquery/1.9.1/jquery.min.js"></script> 
<script type="text/javascript" src="static/h-ui/js/H-ui.js"></script> 


</body>
</html>