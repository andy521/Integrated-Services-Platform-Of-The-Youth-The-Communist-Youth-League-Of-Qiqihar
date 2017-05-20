<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@page import="java.util.Map"%>
<%@page import="java.util.List"%>
 <%@ taglib prefix="naah" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="static/h-ui/css/H-ui.min.css" />
<link rel="stylesheet" type="text/css" href="static/h-ui.admin/css/H-ui.admin.css" />
<link rel="stylesheet" type="text/css" href="lib/Hui-iconfont/1.0.7/iconfont.css" />
<style>
body{background-color:rgba(238,238,238,0.98);}
.a1{background-color:rgba(238,238,238,0.98);
border-right:1px solid #e5e5e5;}
dt{border-bottom:1px solid #e5e5e5;}
</style>
</head>
<body>
<form action="SavePrivilege.naah" method="post" >
<input type="hidden" name="id" value="${requestScope.id}">
<table>
<tr>
<td align="left"><input class="btn btn-success radius" type="submit" value="授权"></td>
<td align="right"><input class="btn btn-warning radius" type="button" value="关闭" onclick="javascript:window.close();">
</td>
<tr>
</table>
<aside class="a1">
<div class="menu_dropdown bk_2">
    

<ul id="Huifold1" class="Huifold">

<naah:forEach var="nav" items="${sessionScope.privilege}">
<naah:set var="privileges" value="${nav.privileges}"></naah:set>

 <naah:if test="${privileges.isLink==0}">
 <li class="item">
 	<h4> <input type="checkbox" id="${privileges.privilegeId}" name="checkbox2" value="${privileges.privilegeId}">${privileges.privilegeName}<b>+</b></h4>
	 <div class="info"> 
		 <naah:forEach var="nei" items="${sessionScope.privilege}">
			 <naah:set var="neiprivileges" value="${nei.privileges}"></naah:set>
			 <naah:if test="${neiprivileges.parentId==privileges.privilegeId}">
			 		<input type="checkbox" id="${neiprivileges.privilegeId}" name="checkbox2" value="${neiprivileges.privilegeId}">
					${neiprivileges.privilegeName}<br>
			 </naah:if>
		 
		 </naah:forEach>
	 
	 </div>
	  </li>
 </naah:if>
   

</naah:forEach>
  
</ul>

	</div>
</aside>
</form>
<script>

var box=document.getElementsByName("checkbox2");

<naah:forEach var="nav" items="${requestScope.privilege}">
<naah:set var="privileges" value="${nav.privileges}"></naah:set>
for(var i=0;i<box.length;i++)
	{
	if(box[i].value=="${privileges.privilegeId}")
		{
		box[i].checked = true;
		}
	}
</naah:forEach>




</script>

<script type="text/javascript" src="lib/jquery/1.9.1/jquery.min.js"></script> 
<script type="text/javascript" src="static/h-ui/js/H-ui.js"></script> 
<script type="text/javascript" src="static/h-ui.admin/js/H-ui.admin.js"></script>  
<script>
$(function(){
	$.Huifold("#Huifold1 .item h4","#Huifold1 .item .info","fast",3,"click"); /*5个参数顺序不可打乱，分别是：相应区,隐藏显示的内容,速度,类型,事件*/
});
</script>
<script>
$("#101").click(function() {
	 $("input[id^='101']").prop("checked",$("#101").prop("checked"));
});
$("#102").click(function() {
	 $("input[id^='102']").prop("checked",$("#102").prop("checked"));
});
$("#103").click(function() {
	 $("input[id^='103']").prop("checked",$("#103").prop("checked"));
});

</script>
</body>
</html>