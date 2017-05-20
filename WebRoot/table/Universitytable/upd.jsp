<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.util.*"%>
<%@ taglib prefix="naah" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
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
<h2>[益起来·希望工程圆梦行动奖学金申请信息管理-修改]</h2>
<div class="line"></div>
<form action="UpdUniversitytables.naah" method="post" class="form form-horizontal responsive" id="demoform">
<input type="hidden" name="id" value="${requestScope.Universitytable.id}">
			<div class="row cl">
			<label class="form-label col-xs-2">姓名：</label>
			<div class="formControls col-xs-5">
				<input type="text" maxlength="20"  value="${requestScope.Universitytable.name}" class="input-text radius" placeholder="姓名" name="name" id="name" datatype="*" nullmsg="姓名不能为空！">
			</div>
			<div class="col-xs-5"> </div>
		</div>

			<div class="row cl">
			<label class="form-label col-xs-2">姓名拼写：</label>
			<div class="formControls col-xs-5">
				<input type="text" maxlength="20"  value="${requestScope.Universitytable.nameSpell}" class="input-text radius" placeholder="姓名拼写" name="nameSpell" id="nameSpell" datatype="*" nullmsg="姓名拼写不能为空！">
			</div>
			<div class="col-xs-5"> </div>
		</div>

  			 <div class="row cl">
			<label class="form-label col-xs-2">性别：</label>
				<div class="formControls skin-minimal col-xs-5">
						<div class="radio-box">
							<input type="radio" value="男" id="sex-1"  name="sex" datatype="*"
							<naah:if test='${requestScope.Universitytable.sex=="男"}'>checked="checked"</naah:if>
							 nullmsg="请选择性别！">
							<label for="sex-1">男</label>
						</div>
						<div class="radio-box">
							<input type="radio" value="女" id="sex-2"
							<naah:if test='${requestScope.Universitytable.sex=="女"}'>checked="checked"</naah:if>
							 name="sex">
							<label for="sex-2">女</label>
						</div>
				</div>
				<div class="col-xs-5"> </div>
			</div>
      
      
    			<div class="row cl">
			<label class="form-label col-xs-2">民族：</label>
			<div class="formControls col-xs-5">
				<input type="text" maxlength="10"  value="${requestScope.Universitytable.nation}" class="input-text radius" placeholder="民族" name="nation" id="nation" datatype="*" nullmsg="民族不能为空！">
			</div>
			<div class="col-xs-5"> </div>
		</div>
      
    			<div class="row cl">
			<label class="form-label col-xs-2">生日：</label>
			<div class="formControls col-xs-5">
				<input type="text" value='<fmt:formatDate value="${requestScope.Universitytable.birthday}" pattern="yyyy-MM-dd"/>' class="input-text radius" placeholder="生日" name="birthday" id="birthday" onClick="WdatePicker()" datatype="date" nullmsg="生日不能为空！">
			</div>
			<div class="col-xs-5"> </div>
		</div>
        
      			<div class="row cl">
			<label class="form-label col-xs-2">身份证：</label>
			<div class="formControls col-xs-5">
				<input type="text" maxlength="20"  value="${requestScope.Universitytable.idCard}" class="input-text radius" placeholder="身份证" name="idCard" id="idCard" datatype="*" nullmsg="身份证不能为空！">
			</div>
			<div class="col-xs-5"> </div>
		</div>
		
		 <div class="row cl">
			<label class="form-label col-xs-2">籍贯:</label>
			<div class="formControls col-xs-5">
				<input type="text" maxlength="200"  value="${requestScope.Universitytable.hometown}" class="input-text radius" placeholder="籍贯" name="hometown" id="hometown"  datatype="*" nullmsg="籍贯不能为空！">
			</div>
			<div class="col-xs-5"> </div>
                        </div>
		
 
       			<div class="row cl">
			<label class="form-label col-xs-2">高中：</label>
			<div class="formControls col-xs-5">
				<input type="text" maxlength="50"  value="${requestScope.Universitytable.highSchool}" class="input-text radius" placeholder="高中" name="highSchool" id="highSchool" datatype="*" nullmsg="高中不能为空！">
			</div>
			<div class="col-xs-5"> </div>
		</div>
     
       			<div class="row cl">
			<label class="form-label col-xs-2">文理：</label>
			<div class="formControls col-xs-5">
				<input type="text" maxlength="6"  value="${requestScope.Universitytable.subject}" class="input-text radius" placeholder="文理" name="subject" id="subject" datatype="*" nullmsg="文理不能为空！">
			</div>
			<div class="col-xs-5"> </div>
		</div>

            <div class="row cl">
			<label class="form-label col-xs-2">高中奖励:</label>
			<div class="formControls col-xs-5">
				<textarea  class="textarea radius" name="awardInHighSchool" id="awardInHighSchool" datatype="" nullmsg="高中奖励不能为空！">${requestScope.Universitytable.awardInHighSchool}</textarea>
			</div>
			<div class="col-xs-5"> </div>
            </div>
    
       			<div class="row cl">
			<label class="form-label col-xs-2">高中排名：</label>
			<div class="formControls col-xs-5">
				<input type="number"  max="99999" value="${requestScope.Universitytable.ranking}" class="input-text radius" placeholder="高中排名" name="ranking" id="ranking" datatype="" nullmsg="高中排名不能为空！">
			</div>
			<div class="col-xs-5"> </div>
		</div>
        
       			<div class="row cl">
			<label class="form-label col-xs-2">准考证号：</label>
			<div class="formControls col-xs-5">
				<input type="text" maxlength="30"  value="${requestScope.Universitytable.examNumber}" class="input-text radius" placeholder="准考证号" name="examNumber" id="examNumber" datatype="" nullmsg="准考证号不能为空！">
			</div>
			<div class="col-xs-5"> </div>
		</div>
        
       			<div class="row cl">
			<label class="form-label col-xs-2">高考分数：</label>
			<div class="formControls col-xs-5">
				<input type="text" maxlength="6"  value="${requestScope.Universitytable.examScore}" class="input-text radius" placeholder="高考分数" name="examScore" id="examScore" datatype="" nullmsg="高考分数不能为空！">
			</div>
			<div class="col-xs-5"> </div>
		</div>
  

       			<div class="row cl">
			<label class="form-label col-xs-2">大学：</label>
			<div class="formControls col-xs-5">
				<input type="text" maxlength="50"  value="${requestScope.Universitytable.university}" class="input-text radius" placeholder="大学" name="university" id="university" datatype="" nullmsg="大学不能为空！">
			</div>
			<div class="col-xs-5"> </div>
		</div>

       			<div class="row cl">
			<label class="form-label col-xs-2">学院：</label>
			<div class="formControls col-xs-5">
				<input type="text" maxlength="50"  value="${requestScope.Universitytable.college}" class="input-text radius" placeholder="学院" name="college" id="college" datatype="" nullmsg="学院不能为空！">
			</div>
			<div class="col-xs-5"> </div>
		</div>

       			<div class="row cl">
			<label class="form-label col-xs-2">专业：</label>
			<div class="formControls col-xs-5">
				<input type="text"  maxlength="50" value="${requestScope.Universitytable.major}" class="input-text radius" placeholder="专业" name="major" id="major" datatype="" nullmsg="专业不能为空！">
			</div>
			<div class="col-xs-5"> </div>
		</div>

       			<div class="row cl">
			<label class="form-label col-xs-2">电话：</label>
			<div class="formControls col-xs-5">
				<input type="text" maxlength="11"  value="${requestScope.Universitytable.tel}" class="input-text radius" placeholder="电话" name="tel" id="tel" datatype="tel" nullmsg="电话不能为空！">
			</div>
			<div class="col-xs-5"> </div>
		</div>

       			<div class="row cl">
			<label class="form-label col-xs-2">邮箱：</label>
			<div class="formControls col-xs-5">
				<input type="email" maxlength="50"  value="${requestScope.Universitytable.email}" class="input-text radius" placeholder="邮箱" name="email" id="email" datatype="" nullmsg="邮箱不能为空！">
			</div>
			<div class="col-xs-5"> </div>
		</div>

       			<div class="row cl">
			<label class="form-label col-xs-2">qq：</label>
			<div class="formControls col-xs-5">
				<input type="text" maxlength="10"  value="${requestScope.Universitytable.qq}" class="input-text radius" placeholder="qq" name="qq" id="qq" datatype="" nullmsg="qq不能为空！">
			</div>
			<div class="col-xs-5"> </div>
		</div>

       			<div class="row cl">
			<label class="form-label col-xs-2">父亲名字：</label>
			<div class="formControls col-xs-5">
				<input type="text"  maxlength="20" value="${requestScope.Universitytable.fatherName}" class="input-text radius" placeholder="父亲名字" name="fatherName" id="fatherName" datatype="*" nullmsg="父亲名字不能为空！">
			</div>
			<div class="col-xs-5"> </div>
		</div>

       			<div class="row cl">
			<label class="form-label col-xs-2">父亲电话：</label>
			<div class="formControls col-xs-5">
				<input type="text" maxlength="11"  value="${requestScope.Universitytable.fatherTel}" class="input-text radius" placeholder="父亲电话" name="fatherTel" id="fatherTel" datatype="*" nullmsg="父亲电话不能为空！">
			</div>
			<div class="col-xs-5"> </div>
		</div>

       			<div class="row cl">
			<label class="form-label col-xs-2">母亲名字：</label>
			<div class="formControls col-xs-5">
				<input type="text" maxlength="20"  value="${requestScope.Universitytable.motherName}" class="input-text radius" placeholder="母亲名字" name="motherName" id="motherName" datatype="*" nullmsg="母亲名字不能为空！">
			</div>
			<div class="col-xs-5"> </div>
		</div>

       			<div class="row cl">
			<label class="form-label col-xs-2">母亲电话：</label>
			<div class="formControls col-xs-5">
				<input type="text" maxlength="11"  value="${requestScope.Universitytable.motherTel}" class="input-text radius" placeholder="母亲电话" name="motherTel" id="motherTel" datatype="*" nullmsg="母亲电话不能为空！">
			</div>
			<div class="col-xs-5"> </div>
		</div>

       			<div class="row cl">
			<label class="form-label col-xs-2">家庭住址：</label>
			<div class="formControls col-xs-5">
				<input type="text"  maxlength="200" value="${requestScope.Universitytable.address}" class="input-text radius" placeholder="家庭住址" name="address" id="address" datatype="*" nullmsg="家庭住址不能为空！">
			</div>
			<div class="col-xs-5"> </div>
		</div>

       			<div class="row cl">
			<label class="form-label col-xs-2">邮编：</label>
			<div class="formControls col-xs-5">
				<input type="text" maxlength="6"  value="${requestScope.Universitytable.zipCode}" class="input-text radius" placeholder="邮编" name="zipCode" id="zipCode" datatype="*" nullmsg="邮编不能为空！">
			</div>
			<div class="col-xs-5"> </div>
		</div>

       			<div class="row cl">
			<label class="form-label col-xs-2">开户银行：</label>
			<div class="formControls col-xs-5">
				<input type="text" maxlength="50"  value="${requestScope.Universitytable.bankName}" class="input-text radius" placeholder="开户银行" name="bankName" id="bankName" datatype="" nullmsg="开户银行不能为空！">
			</div>
			<div class="col-xs-5"> </div>
		</div>

       			<div class="row cl">
			<label class="form-label col-xs-2">户主名称：</label>
			<div class="formControls col-xs-5">
				<input type="text" maxlength="20"  value="${requestScope.Universitytable.bankCustomer}" class="input-text radius" placeholder="户主名称" name="bankCustomer" id="bankCustomer" datatype="" nullmsg="户主名称不能为空！">
			</div>
			<div class="col-xs-5"> </div>
		</div>

       			<div class="row cl">
			<label class="form-label col-xs-2">银行卡号：</label>
			<div class="formControls col-xs-5">
				<input type="text" maxlength="50"  value="${requestScope.Universitytable.bankNumber}" class="input-text radius" placeholder="银行卡号" name="bankNumber" id="bankNumber" datatype="" nullmsg="银行卡号不能为空！">
			</div>
			<div class="col-xs-5"> </div>
		</div>

            <div class="row cl">
			<label class="form-label col-xs-2">申请理由:</label>
			<div class="formControls col-xs-5">
				<textarea  class="textarea radius" name="note" id="note" datatype="" nullmsg="申请理由不能为空！">${requestScope.Universitytable.note}</textarea>
			</div>
			<div class="col-xs-5"> </div>
            </div>

        <input type="hidden" name="flag" id="flag" value="${requestScope.Universitytable.flag}">
<input type="hidden" name="areasByAreaId.areaId" id="areasByCity.areaId" value="${requestScope.Universitytable.areasByAreaId.areaId}">
<input type="hidden" name="areasByCountyId.areaId" id="areasByCounty.areaId" value="${requestScope.Universitytable.areasByCountyId.areaId}">
<input type="hidden" name="usersByInputUser.userId" id="usersByInputUser.userId"  value="${requestScope.Universitytable.usersByInputUser.userId}">
<input type="hidden" name="reason" id="reason" value="${requestScope.Universitytable.reason}">
<input type="hidden" name="uploadDate" id="uploadDate" value="${requestScope.Universitytable.uploadDate}">

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