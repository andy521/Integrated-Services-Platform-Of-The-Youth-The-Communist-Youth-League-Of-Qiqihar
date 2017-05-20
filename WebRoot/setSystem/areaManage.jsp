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
<input type="hidden" name="areaName" id="areaName">
</form>
<div class="container">
<h2>[系统设置-地市管理]</h2>

	<div class="line"></div>
	<form action="" method="post" class="form form-horizontal responsive mt-10" id="addform" name="addform">
			
			
			<div class=" col-xs-5">
				<input type="text" maxlength="20"  placeholder="添加市名" class="input-text radius size-M" id="shiname" name="shiname">			
			</div>
			<input class="btn btn-success radius" type="button" value="新增" onclick="addshi()">
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
		<naah:forEach var="city" items="${requestScope.Area}" varStatus="status">
		<tr>
			<th class="col1 text-c ">${ status.index + 1}</th>
			<td class="col2 text-c"><input type="text" maxlength="20"  value="${city.areaName}" id="${city.areaId}" class="input-text radius size-M"></td>
			<td class="col2 text-c">
			<a href="SelCounty.naah?id=${city.areaId}" class="btn btn-secondary radius" >区县管理</a>&nbsp;&nbsp;&nbsp;
			<input class="btn btn-warning radius"  type="button" value="修改" onclick="updateshi('${city.areaId}')">&nbsp;&nbsp;&nbsp;
			<input class="btn btn-danger radius" type="button" value="删除" onclick="deleteshi('${city.areaId}')">
			</td>
		</tr>
		
		
		</naah:forEach>
			
		</tbody>
	</table>
	</div>
	<script type="text/javascript">
	function updateshi(str)
	{
		if(document.getElementById(str).value!="")
		{
			
			document.getElementById("areaId").value=str;
			document.getElementById("areaName").value=document.getElementById(str).value;
			document.PageForm.action="UpdArea.naah";
			document.PageForm.submit();
		}
		else
			{
			alert("修改的市名为空！请修改");
			}
		
	}
	
	function addshi()
	{
		if(document.getElementById("shiname").value!="")
			{
			document.getElementById("areaName").value=document.getElementById("shiname").value;
			document.PageForm.action="InsArea.naah";
			document.PageForm.submit();
			}
		else
			{
			alert("市名为空！请修改");
			}
	}
	
	function deleteshi(str)
	{
		if(confirm("你确定要删除吗？"))
		{
		document.getElementById("areaId").value=str;
		document.PageForm.action="DelArea.naah";
		document.PageForm.submit();
		}
	}

	</script>
</body>
</html>