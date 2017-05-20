<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.util.*"%>
 <%@ taglib prefix="naah" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<!--[if lt IE 9]>
<script type="text/javascript" src="lib/html5.js"></script>
<script type="text/javascript" src="lib/respond.min.js"></script>
<script type="text/javascript" src="lib/PIE_IE678.js"></script>
<![endif]-->
<link rel="stylesheet" type="text/css" href="static/h-ui/css/H-ui.css" />
<link rel="stylesheet" type="text/css" href="lib/icheck/icheck.css" />
<!--[if lt IE 9]>
<link href="static/h-ui/css/H-ui.ie.css" rel="stylesheet" type="text/css" />
<![endif]-->
<!--[if IE 6]>
<script type="text/javascript" src="lib/DD_belatedPNG_0.0.8a-min.js" ></script>
<script>DD_belatedPNG.fix('*');</script>
<![endif]-->
</head>
<body>
<div class="container">
<a href="javascript:history.go(-1)" class="btn btn-default radius f-r mt-20">返回用户</a>
<h2>[系统用户管理-添加用户]</h2>
<div class="line"></div>
<form action="InsUser.naah" method="post" class="form form-horizontal responsive" id="demoform" name="form1">
			
		<div class="row cl">
			<label class="form-label col-xs-2">用户名：</label>
			<div class="formControls col-xs-5">
				<input type="text" maxlength="20"  class="input-text radius "  name="username" id="username" datatype="*" nullmsg="用户名不能为空" >
			</div>
			<div class="col-xs-5"> </div>
		</div>
		
		<div class="row cl">
			<label class="form-label col-xs-2">密码：</label>
			<div class="formControls col-xs-5">
				<input type="password" maxlength="20"  class="input-text radius "  placeholder="" name="password" id="password" datatype="*" nullmsg="密码不能为空" >
			</div>
			<div class="col-xs-5"> </div>
		</div>
		
		<div class="row cl">
			<label class="form-label col-xs-2">性别：</label>
			<div class="formControls skin-minimal col-xs-5">
				<div class="radio-box">
				<%-- <naah:set var="" value="${requestScope.Info.sex}"></naah:set> --%>
					<input type="radio" id="sex-1" value="1" name="sex" datatype="*" nullmsg="请选择性别！">
					<label for="sex-1">男</label>
				</div>
				<div class="radio-box">
					<input type="radio" id="sex-2" value="2"  name="sex"  datatype="*" nullmsg="请选择性别！">
					<label for="sex-2">女</label>
				</div>
			</div>
			<div class="col-xs-5"> </div>
		</div>
		
        <div class="row cl">
			<label class="form-label col-xs-2">真实姓名：</label>
			<div class="formControls col-xs-5">
				<input type="text" maxlength="20"   class="input-text radius " autocomplete="off" placeholder="真实姓名" name="realname" id="realname" datatype="*" nullmsg="真实姓名不能为空">
			</div>
			<div class="col-xs-5"> </div>
		</div>
		
		<div class="row cl">
			<label class="form-label col-xs-2">所在单位：</label>
			<div class="formControls col-xs-5">
				<input type="text"  maxlength="50"  class="input-text radius " autocomplete="off" placeholder="所在单位" name="unit" id="unit" datatype="*" nullmsg="所在单位不能为空">
			</div>
			<div class="col-xs-5"> </div>
		</div>
		
		<div class="row cl">
			<label class="form-label col-xs-2">单位职务：</label>
			<div class="formControls col-xs-5">
				<input type="text"  maxlength="50"  class="input-text radius " autocomplete="off" placeholder="单位职务" name="position" id="position" datatype="*" nullmsg="单位职务不能为空">
			</div>
			<div class="col-xs-5"> </div>
		</div>
		
		<div class="row cl">
			<label class="form-label col-xs-2">出生日期：</label>
			<div class="formControls col-xs-5">
				<input type="text" class="input-text radius "  class="input-text radius"  onClick="WdatePicker()"  autocomplete="off" placeholder="成立注册时间" name="birthday" id="birthday" datatype="date" nullmsg="出生日期不能为空!">
				
			</div>
			<div class="col-xs-5"> </div>
		</div>
		
		<div class="row cl">
			<label class="form-label col-xs-2">联系电话：</label>
			<div class="formControls col-xs-5">
				<input type="text"  maxlength="11"  class="input-text radius " autocomplete="off" placeholder="联系电话" name="tel" id="tel" datatype="tel" errormsg="联系电话格式错误！"  nullmsg="联系电话不能为空">
			</div>
			<div class="col-xs-5"> </div>
		</div>
		
		<div class="row cl">
			<label class="form-label col-xs-2">邮箱：</label>
			<div class="formControls col-xs-5">
				<input type="email"  maxlength="50"  class="input-text radius " autocomplete="off" placeholder="邮箱" name="email" id="email" datatype="*" nullmsg="邮箱不能为空">
			</div>
			<div class="col-xs-5"> </div>
		</div>
	
		
		

		<div class="row cl">
		<label class="form-label col-xs-2">权限等级：</label>
		<div class="formControls col-xs-5"> <span class="select-box radius">
		<select class="select" size="1" name="roleId" id="roleId"   datatype="*" nullmsg="请选择权限！">
		
		<naah:if test='${sessionScope.user.roleId=="09"}'>
		<option value="09">市级</option>
		<option value="01">区县级</option>
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
			
		<div class="row cl" id="city" style="display: none;">
		<label class="form-label col-xs-2">区县级</label>
		<div class="formControls col-xs-5"> <span class="select-box radius">
		<select class="select" size="1" name="areasByCity.areaId" id="areasByCity"   datatype="" nullmsg="请选择所在城市！">
		
		</select>
		</span> </div>
		<div class="col-xs-5"> </div>
		</div>			


		<div class="row cl" id="county"  style="display: none;">
		<label class="form-label col-xs-2">街道级</label>
		<div class="formControls col-xs-5"> <span class="select-box radius">
		<select class="select" size="1" name="areasByCounty.areaId" id="areasByCounty"  datatype="" nullmsg="请选择所在区县！">
		
		</select>
		</span> </div>
		<div class="col-xs-5"> </div>
		</div>		
		
		<div class="row cl">
			<label class="form-label col-xs-2">备注：</label>
			<div class="formControls col-xs-5">
				<textarea name="note" cols="" rows="" class="textarea"  placeholder="" datatype="" ></textarea>
				
			</div>
			<div class="col-xs-5"> </div>
		</div>	

		<div class="row cl">
			<div class="col-xs-10 col-xs-offset-2">
				<input class="btn btn-primary" type="submit" value="&nbsp;&nbsp;提交&nbsp;&nbsp;">
			</div>
		</div>
		
	</form>
	




</div>
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

$(document).ready(  
	    function() {  
	    	$("#roleId").change();
	    }
	    );
	    
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
						 	error : function() {  alert("error");}    
				    	});}, 100);
	
}
});

</script>

</body>
</html>