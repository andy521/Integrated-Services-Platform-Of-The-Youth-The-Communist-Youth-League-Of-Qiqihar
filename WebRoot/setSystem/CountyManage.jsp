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
<form name="PageForm" action="" method="POST" >
<input type="hidden" name="areaId"  id="areaId">
<input type="hidden" name="areaName"  id="areaName">
<input type="hidden" name="areaParent"  id="areaParent" value="${requestScope.Id}">
<input type="hidden" name="isCity" id="isCity" value="0">
</form>
<div class="container">
<a href="SelArea.naah" class="btn btn-default radius f-r mt-20">返回地区</a>
<h2>[系统设置-地市管理-县区管理]</h2>

	<div class="line"></div>
	<form action="" method="post" class="form form-horizontal responsive mt-10" id="addform" name="addform">
			
			
			<div class=" col-xs-5">
				
				<input type="text" maxlength="20"  placeholder="添加县区名" class="input-text radius size-M" id="xq" name="xq">			
			</div>
			<input class="btn btn-success radius" type="button" value="新增" onclick="addxq()">
	</form>
<table class="table table-border table-bordered table-hover table-bg mt-10">
		<thead>
			<tr>
				<th class="col1">序号</th>
				<th class="col2">名称</th>
				<th class="col3">操作</th>
			</tr>
		</thead>
		<tbody>
		<naah:forEach var="county" items="${requestScope.County}" varStatus="status">
		<tr>
			<th class="col1 text-c ">${ status.index + 1}</th>
			<td class="col2 text-c"><input type="text" maxlength="20"  value="${county.areaName}" id="${county.areaId}" class="input-text radius size-M"></td>
			<td class="col2 text-c">
			<input class="btn btn-warning radius"  type="button" value="修改" onclick="updatexq('${county.areaId}')">&nbsp;&nbsp;&nbsp;
			<input class="btn btn-danger radius" type="button" value="删除" onclick="deletexq('${county.areaId}')">
			</td>
		</tr>
		
		
		</naah:forEach>
		
		</tbody>
	</table>
	</div>
	<script type="text/javascript">
	function updatexq(str)
	{
		if(document.getElementById(str).value!="")
		{
			document.getElementById("areaId").value=str;
			document.getElementById("areaName").value=document.getElementById(str).value;
			document.PageForm.action="UpdCounty.naah";
			document.PageForm.submit();
		}
		else
			{
			alert("修改的县区名为空！请修改");
			}
		
	}
	
	function addxq()
	{
		if(document.getElementById("xq").value!="")
			{
			document.getElementById("areaName").value=document.getElementById("xq").value;
			document.PageForm.action="InsCounty.naah";
			document.PageForm.submit();
			}
		else
			{
			alert("要添加的县区名为空！请修改");
			}
	}
	
	function deletexq(str)
	{
		if(confirm("你确定要删除吗？"))
		{
		document.getElementById("areaId").value=str;
		document.PageForm.action="DelCounty.naah";
		document.PageForm.submit();}
	}

	</script>
</body>
</html>