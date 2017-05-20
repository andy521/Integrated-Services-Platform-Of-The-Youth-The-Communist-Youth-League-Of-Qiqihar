<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="naah" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="static/h-ui/css/H-ui.css">
</head>
<body>

<div class="container">
<h2>[登录日志]</h2>
	<div class="line"></div>
	<form action="logs.naah" method="post" name="sel">
	<input type="hidden" name="page" value="1">
	<table class="table table-bg  mt-10">
	<tr>
	<td>操作用户：<input type="text" class="input-text radius size-M" placeholder="" name="username" id=""username"" value="${requestScope.username}"></td>
	<td>操作类型：
	<span class="select-box radius size-M">
			<select class="select"  name="kind" id="kind" >
				<option value=""></option>
				<option value="登陆">登陆</option>
				<option value="录入">录入</option>
				<option value="修改">修改</option>			
				<option value="删除">删除</option>
				<option value="上报">上报</option>			
				<option value="审核">审核</option>			
				<option value="驳回">驳回</option>			
				<option value="显示">显示</option>			
			</select>
	</span>
	<script>
		for(var k=1;k<document.getElementById("kind").options.length;k++)
		{
		if(document.getElementById("kind").options[k].value=='${requestScope.kind}')
		{
		document.getElementById("kind").options[k].selected='selected';
		}
		}
	</script>
	</td>
	<td>操作对象：<input type="text" class="input-text radius size-M" autocomplete="off" placeholder="" value="${requestScope.table}" name="table" id="table"  ></td>
	<td>操作值：<input type="text" class="input-text radius size-M" autocomplete="off" placeholder="" value="${requestScope.value}" name="value" id="value" ></td>
	<td><input class="btn btn-secondary radius" type="submit" value="查询"></td>
	</tr>
	</table>
	</form>
	
<table class="table table-border table-bordered table-hover table-bg mt-10">
		<thead>
			<tr>
				<th class="col1">序号</th>
				<th class="col1">操作用户</th>
				<th class="col1">操作类型</th>
				<th class="col2">登录IP</th>
				<th class="col3">操作时间</th>
				<th class="col3">操作对象</th>
				<th class="col3">操作值</th>
			</tr>
		</thead>
		<tbody>
		<naah:forEach  var="son" items="${requestScope.list}" varStatus="status">
		<tr>
			<td class="col2 text-c">${ status.index + 1}</td>
			<td class="col2 text-c">${son.users.realname}</td>
			<td class="col2 text-c">${son.operationKind}</td>
			<td class="col2 text-c">${son.operationIp}</td>
			<td class="col2 text-c">${son.operationTime}</td>
			<td class="col2 text-c">${son.operationObject}</td>
			<td class="col2 text-c">${son.opeartionValue}</td>
			</tr>
		

		</naah:forEach>
		</tbody>
	</table>
	</div>
<span id="biuuu_city" class="text-c"></span>

<script src="lib/laypage/laypage.js"></script>

<script>
var nums = 10; //每页出现的数量
var pages = Math.ceil(${requestScope.count}/nums); //得到总页数

var changepage = function(curr){
    //此处是页数变得地方
	document.sel.page.value=curr;
/*     document.sel.name.value='${requestScope.name}';
    document.sel.status.value='${requestScope.status}';
 */    document.sel.submit();
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