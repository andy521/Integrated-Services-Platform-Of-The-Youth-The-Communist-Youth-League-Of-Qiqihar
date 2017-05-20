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
<a href="javascript:history.go(-1)" class="btn btn-default radius f-r mt-20">返回用户</a>
	<h2>[系统设置-修改信息]</h2>
	<div class="line"></div>
	
	<form action="UpdUser.naah" method="post" class="form form-horizontal responsive" id="demoform"  >	
		<input type="hidden" name="userId" value="${requestScope.user.userId }">
		<div class="row cl">
			<label class="form-label col-xs-2">用户名：</label>
			<div class="formControls col-xs-5">
				<input type="text"  readonly="readonly" class="input-text radius " value="${requestScope.user.username }" name="username" id="username" >
			</div>
			<div class="col-xs-5"> </div>
		</div>
		
		<div class="row cl">
			<label class="form-label col-xs-2">密码：</label>
			<div class="formControls col-xs-5">
				<input type="password" maxlength="20"  class="input-text radius "  placeholder="不修改密码请为空" name="password" id="password"  >
			</div>
			<div class="col-xs-5"> </div>
		</div>
		
		<div class="row cl">
			<label class="form-label col-xs-2">性别：</label>
			<div class="formControls skin-minimal col-xs-5">
				<div class="radio-box">
				<%-- <naah:set var="" value="${requestScope.Info.sex}"></naah:set> --%>
				<naah:if test='${requestScope.user.sex=="1"}'>
					<input type="radio" id="sex-1" value="1" name="sex" checked datatype="*" nullmsg="请选择性别！">
				</naah:if>
				<naah:if test='${requestScope.user.sex!="1"}'>
					<input type="radio" id="sex-1" value="1" name="sex"  datatype="*" nullmsg="请选择性别！">
				</naah:if>
					<label for="sex-1">男</label>
				</div>
				<div class="radio-box">
				<naah:if test='${requestScope.user.sex=="2"}'>
					<input type="radio" id="sex-2" value="2"  name="sex" checked datatype="*" nullmsg="请选择性别！">
				</naah:if>
				<naah:if test='${requestScope.user.sex!="2"}'>
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
				<input type="text" maxlength="20"  value="${requestScope.user.realname }" class="input-text radius " autocomplete="off" placeholder="真实姓名" name="realname" id="realname" datatype="*" nullmsg="真实姓名不能为空">
			</div>
			<div class="col-xs-5"> </div>
		</div>
		
		<div class="row cl">
			<label class="form-label col-xs-2">所在单位：</label>
			<div class="formControls col-xs-5">
				<input type="text" maxlength="50"  value="${requestScope.user.unit}" class="input-text radius " autocomplete="off" placeholder="所在单位" name="unit" id="unit" datatype="*" nullmsg="所在单位不能为空">
			</div>
			<div class="col-xs-5"> </div>
		</div>
		
		<div class="row cl">
			<label class="form-label col-xs-2">单位职务：</label>
			<div class="formControls col-xs-5">
				<input type="text" maxlength="50"  value="${requestScope.user.position}" class="input-text radius " autocomplete="off" placeholder="单位职务" name="position" id="position" datatype="*" nullmsg="单位职务不能为空">
			</div>
			<div class="col-xs-5"> </div>
		</div>
		
		<div class="row cl">
			<label class="form-label col-xs-2">出生日期：</label>
			<div class="formControls col-xs-5">
				<input type="text" class="input-text radius " value='<fmt:formatDate value="${requestScope.user.birthday }" pattern="yyyy-MM-dd"/>' class="input-text radius"  onClick="WdatePicker()"  autocomplete="off" placeholder="成立注册时间" name="birthday" id="birthday" datatype="date" nullmsg="出生日期不能为空!">
				
			</div>
			<div class="col-xs-5"> </div>
		</div>
		
		<div class="row cl">
			<label class="form-label col-xs-2">联系电话：</label>
			<div class="formControls col-xs-5">
				<input type="text"  maxlength="11" value="${requestScope.user.tel }" class="input-text radius " autocomplete="off" placeholder="联系电话" name="tel" id="tel" datatype="tel" errormsg="联系电话格式错误！" nullmsg="联系电话不能为空">
			</div>
			<div class="col-xs-5"> </div>
		</div>
		
		<div class="row cl">
			<label class="form-label col-xs-2">邮箱：</label>
			<div class="formControls col-xs-5">
				<input type="email" maxlength="50"  value="${requestScope.user.email}" class="input-text radius " autocomplete="off" placeholder="邮箱" name="email" id="email" datatype="*" nullmsg="邮箱不能为空">
			</div>
			<div class="col-xs-5"> </div>
		</div>
		
		<div class="row cl">
		<label class="form-label col-xs-2">权限等级：</label>
		<div class="formControls col-xs-5"> <span class="select-box radius">
		<select class="select" size="1" name="roleId" id="roleId"   datatype="*" nullmsg="请选择权限！">
		
		<naah:if test='${sessionScope.user.roleId=="09"}'>
		<option value="09" >市级</option>
		<option value="01" >区县级</option>
		<option value="02">街道级</option>
		</naah:if>
		<naah:if test='${sessionScope.user.roleId=="01"}'>
		<option value="01">区县级</option>
		<option value="02">街道级</option>
		</naah:if>
		<naah:if test='${sessionScope.user.roleId=="02"}'>
		<option value="02">街道级</option>
		</naah:if>
		
		</select>
		</span> </div>
		<div class="col-xs-5"> </div>
		</div>			
	
		<div class="row cl" id="city"  style="display: none;">
		<label class="form-label col-xs-2">区县级</label>
		<div class="formControls col-xs-5"> <span class="select-box radius">
		<select class="select" size="1" name="areasByCity.areaId" id="areasByCity"   datatype="" nullmsg="请选择所在区县！">
		</select>
		</span> </div>
		<div class="col-xs-5"> </div>
		</div>			
		<div class="row cl" id="county"  style="display: none;">
		<label class="form-label col-xs-2">街道级</label>
		<div class="formControls col-xs-5"> <span class="select-box radius">
		<select class="select" size="1" name="areasByCounty.areaId" id="areasByCounty"  datatype="" nullmsg="请选择所在街道！">
		
		</select>
		</span> </div>
		<div class="col-xs-5"> </div>
		</div>		
		
		<div class="row cl">
			<label class="form-label col-xs-2">备注：</label>
			<div class="formControls col-xs-5">
				<textarea name="note" cols="" rows="" class="textarea"  placeholder="" datatype="" >${requestScope.user.note }</textarea>
				
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
<!-- 权限ajax选择 -->
<script>
$("#roleId").change(function(){
	 
	$("#city").css('display','none');
	$("#areasByCity").empty();
	$("#county").css('display','none');
    $("#areasByCounty").empty();

if($("#roleId").val()=='09')
{
	
}
else
	{
	//ajax区县级
	$("#areasByCity").empty();
    $("#city").css('display','block');
    $.ajax(
	    	{  
	        	type:'get',  
	        	url:'userCity.naah',  
	        	contentType : 'application/json',
	       		dataType: 'json',  
	        	success:function(data){  
	        		
	          	  $.each(data,function(i,list){  
	          		  
	            	$("#areasByCity").append("<option value='"+list.areaId+"'>"+list.areaName+"</option>");
	            							});  
	        						},
		
			 	error : function() {  alert("error");}    
	    	});
    	//街道
    if($("#roleId").val()=='02')
    	{
    	$("#areasByCity").change();
    	}
	}
});

</script>

<!-- 街道选择ajax -->
<script>
$("#areasByCity").change(function(){
	
	if($("#roleId").val()=='02')
	{
		
	setTimeout(
			 function(){
			 $("#areasByCounty").empty();
			 $("#county").css('display','block');
			
			 
				//along
				    $("#areasByCounty").empty();
				    $.ajax(
				    	{  
				        	type:'get',  
				        	url:'userCounty.naah?cityid='+$("#areasByCity").val(),  
							contentType : 'application/json', 
				       		dataType: 'json',  
				        	success:function(data){  
				          	  $.each(data,function(i,list){  
				            	$("#areasByCounty").append("<option value='"+list.areaId+"'>"+list.areaName+"</option>");
				            							});},
						 	error : function() {  alert("error");}    });
				    	}, 50);
	}
	
});

</script>
<script>
				for(var k=1;k<document.getElementById("roleId").options.length;k++)
				{
				if(document.getElementById("roleId").options[k].value=='${requestScope.user.roleId}')
				{
				document.getElementById("roleId").options[k].selected='selected';
				$("#roleId").change();
				}
				}
				
	setTimeout(function(){
					
					for(var k=1;k<document.getElementById("areasByCity").options.length;k++)
					{
						
					if(document.getElementById("areasByCity").options[k].value=='${requestScope.user.areasByCity.areaId}')
					{
					document.getElementById("areasByCity").options[k].selected='selected';
					
					if($("#roleId").val()=='02'){$("#areasByCity").change();}
					
					}
					}
				
	}	, 150);
			
	setTimeout(function(){
				
				for(var k=1;k<document.getElementById("areasByCounty").options.length;k++)
				{
					
				if(document.getElementById("areasByCounty").options[k].value=='${requestScope.user.areasByCounty.areaId}')
				{
					
				document.getElementById("areasByCounty").options[k].selected='selected';
				}
				}
	}	, 250);		
		
				
				
	</script>
</body>
</html>