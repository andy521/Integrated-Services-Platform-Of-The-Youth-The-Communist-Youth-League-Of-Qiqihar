<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="naah" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>[益起来·希望工程圆梦行动奖学金申请信息]</title>
<link rel="stylesheet" type="text/css" href="static/h-ui/css/H-ui.css">
</head>
<body>

<div class="container">
<form action="indexUniversitytables.naah" method="post" name="sel">
	<input class="btn btn-secondary radius f-r mt-20" type="submit" value="查询">
<h2>[益起来·希望工程圆梦行动奖学金申请信息]</h2>
	<div class="line"></div>
	
	<table class="table table-bg  mt-10">
	<tr>
	<td>
	人员姓名：
	<input type="hidden" name="page" value="1">
	<input type="text" class="input-text radius size-M" placeholder="" name="name" id="name" value="${requestScope.name}">
	</td>
	<td>
	人员性别：
	 <span class="select-box radius size-M">
				<select class="select" name="sex" id="sex" >
				<option value=""></option>
				<option value="男">男</option>
				<option value="女">女</option>
				</select>
	</span>
			<script>
				for(var k=1;k<document.getElementById("sex").options.length;k++)
				{
				if(document.getElementById("sex").options[k].value=='${requestScope.sex}')
				{
				document.getElementById("sex").options[k].selected='selected';
				}
				}
	</script>
	</td>
	<td>
	人员民族：
	<input type="text" class="input-text radius size-M" placeholder="" name="nation" id="nation" value="${requestScope.nation}">
	</td>
	<td>
	人员高中：
	<input type="text" class="input-text radius size-M" placeholder="" name="highSchool" id="highSchool" value="${requestScope.highSchool}">
	</td>
	<td>
	人员大学：
	<input type="text" class="input-text radius size-M" placeholder="" name="university" id="university" value="${requestScope.university}">
	</td>
	</tr>
	</table>
	</form>
<table class="table table-border table-bordered table-hover table-bg mt-10">
		<thead>
			<tr>
				<th class="col1">序号</th>
				<th class="col2">姓名</th>
				<th class="col3">性别</th>
				<th class="col3">民族</th>
				<th class="col3">生日</th>
				<th class="col3">高中</th>
				<th class="col3">高中排名</th>
				<th class="col3">高考分数</th>
				<th class="col3">大学</th>
				<th class="col3">申请理由</th>
			</tr>
		</thead>
		<tbody>
		<naah:forEach var="son" items="${requestScope.list}" varStatus="status">
		
		<tr>
			<th class="col1 text-c ">${ status.index + 1}</th>
			<td class="col2 text-c">${fn:substring(son.name,0,1)}某某</td>
			<td class="col2 text-c">${son.sex}</td>
			<td class="col2 text-c">${son.nation}</td>
			<td class="col2 text-c"><fmt:formatDate value="${son.birthday}" pattern="yyyy-MM-dd"/></td>
			<td class="col2 text-c">${son.highSchool}</td>
			<td class="col2 text-c">${son.ranking}</td>
			<td class="col2 text-c">${son.examScore}</td>
			<td class="col2 text-c">${son.university}</td>
			<td class="col2 text-c">${son.note}</td>
			</tr>
		
		</naah:forEach>
		
	
		</tbody>
	</table>
	</div>

<span id="biuuu_city" class="text-c"></span>
<script type="text/javascript" src="lib/jquery/1.9.1/jquery.min.js"></script> 
<script type="text/javascript" src="lib/layer/3.0/layer.js"></script> 
<script type="text/javascript" src="static/h-ui/js/H-ui.js"></script> 
<script type="text/javascript" src="static/h-ui.admin/js/H-ui.admin.js"></script>  
<script src="lib/laypage/laypage.js"></script>

<script>

var nums = 10; //每页出现的数量
var pages = Math.ceil(${requestScope.count}/nums); //得到总页数

var changepage = function(curr){
    //此处是页数变得地方
    document.sel.page.value=curr;
    document.sel.name.value='${requestScope.name}';
    document.sel.status.value='${requestScope.status}';
    document.sel.submit();
};

//调用分页
laypage({
    cont: 'biuuu_city',
    curr:${requestScope.page},
    pages: pages,
    skin: '#AF0000',
    first: '首页',
    last: '尾页/'+pages,
    skip:true,
    jump: function(obj,first){
       //点完后处理页的函数
    	if(!first)
    		{
    	changepage(obj.curr);}
    }
})
</script>


</body>
</html>