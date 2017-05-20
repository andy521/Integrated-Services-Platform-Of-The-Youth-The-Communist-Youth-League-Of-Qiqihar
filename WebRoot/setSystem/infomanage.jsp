<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="naah" uri="http://java.sun.com/jsp/jstl/core"%>
     <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE HTML>
<html>
<head>
<meta charset="utf-8">
<meta name="renderer" content="webkit">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no">
<meta http-equiv="Cache-Control" content="no-siteapp">
<link rel="stylesheet" href="http://res.layui.com/layui/src/css/layui.css" media="all">
<!--[if lt IE 9]>
<script type="text/javascript" src="../lib/html5.js"></script>
<script type="text/javascript" src="../lib/respond.min.js"></script>
<script type="text/javascript" src="../lib/PIE_IE678.js"></script>
<![endif]-->
<link rel="stylesheet" type="text/css" href="static/h-ui/css/H-ui.css">
<link rel="stylesheet" type="text/css" href="lib/icheck/icheck.css" />
<!--[if lt IE 9]>
<link href="../static/h-ui/css/H-ui.ie.css" rel="stylesheet" type="text/css" />
<![endif]-->
<!--[if IE 6]>
<script type="text/javascript" src="../lib/DD_belatedPNG_0.0.8a-min.js" ></script>
<script>DD_belatedPNG.fix('*');</script>
<![endif]-->
<title>Hi，H-ui</title>
</head>
<body>

<section class="container">
	<h2>[系统设置-修改信息]</h2>
	<div class="line"></div>
	
	<form action="UpdInfo.naah" method="post" class="form form-horizontal responsive" id="demoform"  >	
		<input type="hidden" name="userId" value="${requestScope.Info.userId }">
		<input type="hidden" name="areasByCity.areaId" value="${requestScope.Info.areasByCity.areaId}">
		<input type="hidden" name="areasByCountyId.areaId" value="${requestScope.Info.areasByCounty.areaId }"> 
		<input type="hidden" name="roleId" value="${requestScope.Info.roleId }">
		<div class="row cl">
			<label class="form-label col-xs-2">用户名：</label>
			<div class="formControls col-xs-5">
				<input type="text" readonly="readonly" class="input-text radius " value="${requestScope.Info.username }" name="username" id="username" >
			</div>
			<div class="col-xs-5"> </div>
		</div>
		
		<div class="row cl">
			<label class="form-label col-xs-2">密码：</label>
			<div class="formControls col-xs-5">
				<input type="password" class="input-text radius " maxlength="20"   placeholder="不修改密码请为空" name="password" id="password"  >
			</div>
			<div class="col-xs-5"> </div>
		</div>
		
		<div class="row cl">
			<label class="form-label col-xs-2">性别：</label>
			<div class="formControls skin-minimal col-xs-5">
				<div class="radio-box">
				<%-- <naah:set var="" value="${requestScope.Info.sex}"></naah:set> --%>
				<naah:if test='${requestScope.Info.sex=="1"}'>
					<input type="radio" id="sex-1" value="1" name="sex" checked datatype="*" nullmsg="请选择性别！">
				</naah:if>
				<naah:if test='${requestScope.Info.sex!="1"}'>
					<input type="radio" id="sex-1" value="1" name="sex"  datatype="*" nullmsg="请选择性别！">
				</naah:if>
					<label for="sex-1">男</label>
				</div>
				<div class="radio-box">
				<naah:if test='${requestScope.Info.sex=="2"}'>
					<input type="radio" id="sex-2" value="2"  name="sex" checked datatype="*" nullmsg="请选择性别！">
				</naah:if>
				<naah:if test='${requestScope.Info.sex!="2"}'>
					<input type="radio" id="sex-2" value="2"  name="sex"  datatype="*" nullmsg="请选择性别！">
				</naah:if>
					<label for="sex-2">女</label>
				</div>
			</div>
			<div class="col-xs-5"> </div>
		</div>
		
        <div class="row cl">
			<label class="form-label col-xs-2">真实姓名：</label>
			<div class="formControls col-xs-5">
				<input type="text" maxlength="20"  value="${requestScope.Info.realname }" class="input-text radius " autocomplete="off" placeholder="真实姓名" name="realname" id="realname" datatype="*" nullmsg="真实姓名不能为空">
			</div>
			<div class="col-xs-5"> </div>
		</div>
		
		<div class="row cl">
			<label class="form-label col-xs-2">所在单位：</label>
			<div class="formControls col-xs-5">
				<input type="text"  maxlength="50" value="${requestScope.Info.unit}" class="input-text radius " autocomplete="off" placeholder="所在单位" name="unit" id="unit" datatype="*" nullmsg="所在单位不能为空">
			</div>
			<div class="col-xs-5"> </div>
		</div>
		
		<div class="row cl">
			<label class="form-label col-xs-2">单位职务：</label>
			<div class="formControls col-xs-5">
				<input type="text" maxlength="50"  value="${requestScope.Info.position}" class="input-text radius " autocomplete="off" placeholder="单位职务" name="position" id="position" datatype="*" nullmsg="单位职务不能为空">
			</div>
			<div class="col-xs-5"> </div>
		</div>
		
		<div class="row cl">
			<label class="form-label col-xs-2">出生日期：</label>
			<div class="formControls col-xs-5">
				<input type="text" class="input-text radius " value='<fmt:formatDate value="${requestScope.Info.birthday }" pattern="yyyy-MM-dd"/>' class="input-text radius"  onClick="WdatePicker()"  autocomplete="off" placeholder="成立注册时间" name="birthday" id="birthday" datatype="date" nullmsg="出生日期不能为空!">
				
			</div>
			<div class="col-xs-5"> </div>
		</div>
		
		<div class="row cl">
			<label class="form-label col-xs-2">联系电话：</label>
			<div class="formControls col-xs-5">
				<input type="text"  maxlength="11" value="${requestScope.Info.tel }" class="input-text radius " autocomplete="off" placeholder="联系电话" name="tel" id="tel" datatype="*" nullmsg="联系电话不能为空">
			</div>
			<div class="col-xs-5"> </div>
		</div>
		
		<div class="row cl">
			<label class="form-label col-xs-2">邮箱：</label>
			<div class="formControls col-xs-5">
				<input type="email" maxlength="50"  value="${requestScope.Info.email}" class="input-text radius " autocomplete="off" placeholder="邮箱" name="email" id="email" datatype="*" nullmsg="邮箱不能为空">
			</div>
			<div class="col-xs-5"> </div>
		</div>
		<div class="row cl">
			<label class="form-label col-xs-2">备注：</label>
			<div class="formControls col-xs-5">
				<textarea name="note" cols="" rows="" class="textarea"  placeholder="" datatype="" >${requestScope.Info.note }</textarea>
				
			</div>
			<div class="col-xs-5"> </div>
		</div>
		<div class="row cl">
			<div class="col-xs-10 col-xs-offset-2">
				<input class="btn btn-primary" type="submit" value="&nbsp;&nbsp;提交&nbsp;&nbsp;">
			</div>
		</div>
		
		
	</form>	


</section>

<script type="text/javascript" src="lib/jquery/1.9.1/jquery.min.js"></script> 
<script type="text/javascript" src="lib/icheck/jquery.icheck.min.js"></script> 
<script type="text/javascript" src="lib/bootstrap-Switch/bootstrapSwitch.js"></script> 
<script type="text/javascript" src="lib/My97DatePicker/WdatePicker.js"></script>
<script type="text/javascript" src="lib/Validform/5.3.2/Validform.min.js"></script> 
<script>
//var navigation = responsiveNav("Hui-navbar", {customToggle: ".nav-toggle"});

$(function(){
	$('.skin-minimal input').iCheck({
		checkboxClass: 'icheckbox-blue',
		radioClass: 'iradio-blue',
		increaseArea: '20%'
	});
	
	$("#demoform").Validform({
		tiptype:2,
		datatype:{
			"float": /^([0-9]+\.[0-9]*)$|^[0-9]+$/,
			"tel" : /^[0-9-()]{7,18}$/,
			"date" : /^([0-9]{3}[1-9]|[0-9]{2}[1-9][0-9]{1}|[0-9]{1}[1-9][0-9]{2}|[1-9][0-9]{3})-(((0[13578]|1[02])-(0[1-9]|[12][0-9]|3[01]))|((0[469]|11)-(0[1-9]|[12][0-9]|30))|(02-(0[1-9]|[1][0-9]|2[0-8])))$/,
			"cjz": /^([0-9]|[a-z]|[A-Z]){7}$|^([0-9]|[a-z]|[A-Z]){20}$/,
			"swdm": /^([0-9]|[a-z]|[A-Z]|-){15}$|^([0-9]|[a-z]|[A-Z]|-){18}$|^([0-9]|[a-z]|[A-Z]|-){20}$/
			
			}
		}
	);
});
</script>
</body>
</html>