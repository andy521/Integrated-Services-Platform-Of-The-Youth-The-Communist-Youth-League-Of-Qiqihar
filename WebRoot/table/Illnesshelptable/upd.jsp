<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.util.*"%>
<%@ taglib prefix="naah" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
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
<a href="javascript:history.go(-1)" class="btn btn-default radius f-r mt-20">返回单位</a>
<h2>[医疗救助信息管理-修改]</h2>
<div class="line"></div>
<form action="UpdIllnesshelptables.naah" method="post" class="form form-horizontal responsive" id="demoform">
<input type="hidden" name="id" value="${requestScope.Illnesshelptable.id}">
			<div class="row cl">
			<label class="form-label col-xs-2">姓名：</label>
			<div class="formControls col-xs-5">
				<input type="text" maxlength="20"  value="${requestScope.Illnesshelptable.name}" class="input-text radius" placeholder="姓名" name="name" id="name" datatype="*" nullmsg="姓名不能为空！">
			</div>
			<div class="col-xs-5"> </div>
		</div>
        
  			<div class="row cl">
			<label class="form-label col-xs-2">性别：</label>
				<div class="formControls skin-minimal col-xs-5">
						<div class="radio-box">
							<input type="radio" value="男" id="sex-1"  name="sex" datatype="*"
							<naah:if test='${requestScope.Illnesshelptable.sex=="男"}'>checked="checked"</naah:if>
							 nullmsg="请选择性别！">
							<label for="sex-1">男</label>
						</div>
						<div class="radio-box">
							<input type="radio" value="女" id="sex-2"
							<naah:if test='${requestScope.Illnesshelptable.sex=="女"}'>checked="checked"</naah:if>
							 name="sex">
							<label for="sex-2">女</label>
						</div>
				</div>
				<div class="col-xs-5"> </div>
			</div>
      
    			<div class="row cl">
			<label class="form-label col-xs-2">年龄：</label>
			<div class="formControls col-xs-5">
				<input type="text" max="150" value="${requestScope.Illnesshelptable.age}" class="input-text radius" placeholder="年龄" name="age" id="age" datatype="*" nullmsg="年龄不能为空！">
			</div>
			<div class="col-xs-5"> </div>
		</div>
      
    			<div class="row cl">
			<label class="form-label col-xs-2">民族：</label>
			<div class="formControls col-xs-5">
				<input type="text" maxlength="10"  value="${requestScope.Illnesshelptable.nation}" class="input-text radius" placeholder="民族" name="nation" id="nation" datatype="*" nullmsg="民族不能为空！">
			</div>
			<div class="col-xs-5"> </div>
		</div>
        
      			<div class="row cl">
			<label class="form-label col-xs-2">公司学校：</label>
			<div class="formControls col-xs-5">
				<input type="text" maxlength="100"  value="${requestScope.Illnesshelptable.company}" class="input-text radius" placeholder="公司" name="company" id="company" datatype="*" nullmsg="公司不能为空！">
			</div>
			<div class="col-xs-5"> </div>
		</div>
 
            <div class="row cl">
			<label class="form-label col-xs-2">疾病:</label>
			<div class="formControls col-xs-5">
				<textarea  class="textarea radius" name="illness" id="illness" datatype="*" nullmsg="疾病不能为空！">${ requestScope.Illnesshelptable.illness}</textarea>
			</div>
			<div class="col-xs-5"> </div>
            </div>
     
        
       			<div class="row cl">
			<label class="form-label col-xs-2">地址：</label>
			<div class="formControls col-xs-5">
				<input type="text"  maxlength="200" value="${requestScope.Illnesshelptable.address}" class="input-text radius" placeholder="地址" name="address" id="address" datatype="*" nullmsg="地址不能为空！">
			</div>
			<div class="col-xs-5"> </div>
		</div>
        
       			<div class="row cl">
			<label class="form-label col-xs-2">座机：</label>
			<div class="formControls col-xs-5">
				<input type="text" maxlength="11"  value="${requestScope.Illnesshelptable.tel}" class="input-text radius" placeholder="座机" name="tel" id="tel" datatype="tel" nullmsg="座机不能为空！">
			</div>
			<div class="col-xs-5"> </div>
		</div>

       			<div class="row cl">
			<label class="form-label col-xs-2">手机：</label>
			<div class="formControls col-xs-5">
				<input type="text" maxlength="11"  value="${requestScope.Illnesshelptable.phone}" class="input-text radius" placeholder="手机" name="phone" id="phone" datatype="tel" nullmsg="手机不能为空！">
			</div>
			<div class="col-xs-5"> </div>
		</div>
        
  
             <div class="row cl">
			<label class="form-label col-xs-2">家庭状况:</label>
			<div class="formControls col-xs-5">
				<textarea  class="textarea radius"  name="familyStatus" id="familyStatus" datatype="*" nullmsg="家庭状况不能为空！">${requestScope.Illnesshelptable.familyStatus}</textarea>
			</div>
			<div class="col-xs-5"> </div>
            </div>


            <div class="row cl">
			<label class="form-label col-xs-2">备注:</label>
			<div class="formControls col-xs-5">
				<textarea  class="textarea radius" name="note" id="note" datatype="" nullmsg="备注不能为空！">${requestScope.Illnesshelptable.note}</textarea>
			</div>
			<div class="col-xs-5"> </div>
            </div>
         <input type="hidden" name="flag" id="flag" value="${requestScope.Illnesshelptable.flag}">
		<input type="hidden" name="areasByAreaId.areaId" id="areasByCity.areaId" value="${requestScope.Illnesshelptable.areasByAreaId.areaId}">
		<input type="hidden" name="areasByCountyId.areaId" id="areasByCounty.areaId" value="${requestScope.Illnesshelptable.areasByCountyId.areaId}">
		<input type="hidden" name="usersByInputUser.userId" id="usersByInputUser.userId"  value="${requestScope.Illnesshelptable.usersByInputUser.userId}">
		<input type="hidden" name="reason" id="reason" value="${requestScope.Illnesshelptable.reason}">
		<input type="hidden" name="uploadDate" id="uploadDate" value="${requestScope.Illnesshelptable.uploadDate}">

		<div class="row cl">
			<div class="col-xs-10 col-xs-offset-2">
				<input class="btn btn-primary" type="submit" value="&nbsp;&nbsp;修改&nbsp;&nbsp;">
			</div>
		</div>
	</form>
	

<script type="text/javascript" src="lib/jquery/1.9.1/jquery.min.js"></script> 
<script type="text/javascript" src="lib/icheck/jquery.icheck.min.js"></script> 
<script type="text/javascript" src="lib/bootstrap-Switch/bootstrapSwitch.js"></script> 
<script type="text/javascript" src="lib/Validform/5.3.2/Validform.min.js"></script> 
<script type="text/javascript" src="lib/My97DatePicker/WdatePicker.js"></script>
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
			"float": /^([0-9]+\.[0-9]*)$|^([0-9]+)$/,
			"tel" : /^[0-9-()]{7,18}$/,
			"date" : /^([0-9]{3}[1-9]|[0-9]{2}[1-9][0-9]{1}|[0-9]{1}[1-9][0-9]{2}|[1-9][0-9]{3})-(((0[13578]|1[02])-(0[1-9]|[12][0-9]|3[01]))|((0[469]|11)-(0[1-9]|[12][0-9]|30))|(02-(0[1-9]|[1][0-9]|2[0-8])))$/,
			"cjz": /^([0-9]|[a-z]|[A-Z]){7}$|^([0-9]|[a-z]|[A-Z]){20}$/,
			"swdm": /^([0-9]|[a-z]|[A-Z]|-){15}$|^([0-9]|[a-z]|[A-Z]|-){18}$|^([0-9]|[a-z]|[A-Z]|-){20}$/,
			"cjlb":/^视力$|^听力$|^语言$|^肢体$|^智力$|^精神$|^多重$/,
			"dj":/^一级$|^二级$|^三级$|^四级$|^五级$/
			}
		}
	);
});
</script>
</div>

</body>
</html>