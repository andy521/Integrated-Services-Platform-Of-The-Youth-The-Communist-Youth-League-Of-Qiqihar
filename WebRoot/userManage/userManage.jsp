<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="naah" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="static/h-ui/css/H-ui.css">


</head>
<body>

<div class="container">
<a href="GoToInsUser.naah" class="btn btn-success radius f-r mt-20">新增用户</a>
<h2>[系统用户管理]</h2>
	<div class="line"></div>
	<form action="SelUser.naah" method="post" name="sel" >
	<table class="table table-bg mt-10">
	<tr>
	<td width="10%">
	用户名/实名：
	</td>
	<td >
	<input type="hidden" name="page" value="1">
	<input type="text" class="input-text radius size-M" placeholder="" name="name" id="name" value="${requestScope.name}" >
	</td>
	<td width="10%">
	所属单位：
	</td>
	<td >
	<input type="text" class="input-text radius size-M" placeholder="" name="unit" id="unit" value="${requestScope.unit}">
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
				<th class="col2">用户名</th>
				<th class="col3">实名</th>
				<th class="col3">所在单位</th>
				<th class="col3">职务</th>
				<th class="col3">操作</th>
			</tr>
		</thead>
		<tbody>
		<naah:forEach var="user" items="${requestScope.users}" varStatus="status">
		
		<tr>
			<th class="col1 text-c ">${ status.index + 1}</th>
			<td class="col2 text-c" width="10%">${user.username}</td>
			<td class="col2 text-c" width="15%">${user.realname}</td>
			<td class="col2 text-c" width="25%">${user.unit}</td>
			<td class="col2 text-c" width="20%">${user.position}</td>
			<td class="col2 text-c" width="25%">
			<a href="javascript:PrivilegePage('${user.userId}')" class="btn btn-secondary radius"  >授权</a>&nbsp;&nbsp;&nbsp;
			<a href="GoToUpdUser.naah?id=${user.userId}" class="btn btn-warning radius" >修改</a>&nbsp;&nbsp;&nbsp;
			<input type="button" value="删除" class="btn btn-danger radius" onclick="deleteuser('${user.userId}')" >
			</td>
			</tr>
		
		</naah:forEach>
		</tbody>
	</table>
	</div>

<span id="biuuu_city" class="text-c"></span>

<script src="lib/laypage/laypage.js"></script>
<script type="text/javascript">
function deleteuser(str)
{
	if(confirm("你确定要删除吗？"))
	{
		window.location.href='DelUser.naah?id='+str;
	}
}
function PrivilegePage(str)
{
	var url="GoToPrivilege.naah?id="+str;
	window.open(url, 'newwindow', 'height=500, width=300, top='+Math.round((window.screen.height-400)/2-100)+',left='+Math.round((window.screen.width-400)/2)+',toolbar=no, menubar=no, scrollbars=yes, resizable=no,location=no, status=no');
	
}

</script>
<script>

var nums = 10; //每页出现的数量
var pages = Math.ceil(${requestScope.count}/nums); //得到总页数

var changepage = function(curr){
    //此处是页数变得地方
    document.sel.page.value=curr;
    document.sel.name.value='${name}';
    document.sel.unit.value='${unit}';
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