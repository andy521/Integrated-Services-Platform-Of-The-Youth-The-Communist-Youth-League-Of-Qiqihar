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
<a href="GoToInsYouthworktables.naah" class="btn btn-success radius f-r mt-20">录入信息</a>
<h2>[青年就业创业信息管理]</h2>
	<div class="line"></div>
	<form action="SelIns.naah" method="post" name="sel">
	<table class="table table-bg  mt-10">
	<tr>
	<td width="10%">
	人员姓名：
	</td>
	<td >
	<input type="hidden" name="page" value="1">
	<input type="text" class="input-text radius size-M" placeholder="" name="name" id="name" value="${requestScope.name}">
	</td>
	<td width="8%">
	<input class="btn btn-secondary radius" type="submit" value="查询">
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
				<th class="col3">电话</th>
				<th class="col3">学历</th>
				<th class="col3">信息状态</th>
				<th class="col3">录入时间</th>
				
				<th class="col3">操作</th>
			</tr>
		</thead>
		<tbody>
		<naah:forEach var="son" items="${requestScope.list}" varStatus="status">
		
		<tr>
			<th class="col1 text-c ">${ status.index + 1}</th>
			<td class="col2 text-c">${son.name}</td>
			<td class="col2 text-c">${son.sex}</td>
			<td class="col2 text-c">${son.tel}</td>
			<td class="col2 text-c">${son.education}</td>
			
			
			
			</tr>
		
		</naah:forEach>
		
	
		</tbody>
	</table>
	</div>

<span id="biuuu_city" class="text-c"></span>

<script src="lib/laypage/laypage.js"></script>

<script>
function upload(str)
{
	window.location.href="UploadYouthworktables.naah?id="+str;
}
function deleteunit(str)
{
	if(confirm("你确定要删除吗？"))
	{
		window.location.href='DelYouthworktables.naah?id='+str;
	}
}

var nums = 10; //每页出现的数量
var pages = Math.ceil(${requestScope.count}/nums); //得到总页数

var changepage = function(curr){
    //此处是页数变得地方
    document.sel.page.value=curr;
    document.sel.name.value='${requestScope.name}';
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