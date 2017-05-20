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
<a href="GoToInsSingleyouthtables.naah" class="btn btn-success radius f-r mt-20">录入信息</a>
<h2>[单身青年信息管理]</h2>
	<div class="line"></div>
	<form action="SelSingleyouthtables.naah" method="post" name="sel">
	<table class="table table-bg  mt-10">
	<tr>
	<td>
	人员姓名：
	<input type="hidden" name="page" value="1">
	<input type="text" class="input-text radius size-M" placeholder="" name="name" id="name" value="${requestScope.name}">
	</td>
	<td>
	人员年龄：
	<input type="text" class="input-text radius size-M" placeholder="" name="age" id="age" value="${requestScope.age}">
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
	择偶标准：
	<input type="text" class="input-text radius size-M" placeholder="" name="chooseSexStandard" id="chooseSexStandard" value="${requestScope.chooseSexStandard}">
	</td>
	</tr>
	
	<tr>
	<td>
	人员学历：
	<input type="text" class="input-text radius size-M" placeholder="" name="education" id="education" value="${requestScope.education}">
	</td>
	<td>
	人员单位：
	<input type="text" class="input-text radius size-M" placeholder="" name="company" id="company" value="${requestScope.company}">
	</td>
	<td>
	婚姻状况：
	<input type="text" class="input-text radius size-M" placeholder="" name="marryStatus" id="marryStatus" value="${requestScope.marryStatus}">
	</td>
	<td>
	审核状态：
	<span class="select-box radius size-M">
				<select class="select" name="status" id="status" >
				<option value=""></option>
				<option value="0">录入</option>
				<option value="1">待审</option>
				<option value="2">已审</option>			
				<option value="3">驳回</option>
				<option value="4">显示</option>			
				</select>
	</span>
	<script>
				for(var k=1;k<document.getElementById("status").options.length;k++)
				{
				if(document.getElementById("status").options[k].value==${requestScope.status})
				{
				document.getElementById("status").options[k].selected='selected';
				}
				}
	</script>
			
	</td>
	<td>
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
				<th class="col3">年龄</th>
				<th class="col3">电话</th>
				<th class="col3">婚姻状况</th>
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
			<td class="col2 text-c">${son.age}</td>
			<td class="col2 text-c">${son.tel}</td>
			<td class="col2 text-c">${son.marryStatus}</td>
			
			<naah:if test="${son.flag=='0' }">
			
			<td class="col2 text-c">录入</td>
			<td class="col2 text-c"><fmt:formatDate value="${son.uploadDate }" pattern="yyyy-MM-dd"/></td>
			<td class="col2 text-c" >
			<a href="GoToSelSingleyouthtables.naah?id=${son.id}" target="_blank" class="btn btn-default radius" >查看</a>&nbsp;&nbsp;&nbsp;
			<input type="button" value="上报" class="btn btn-success radius" onclick="upload('${son.id}',1)" >&nbsp;&nbsp;&nbsp;
			<a href="GoToUpdSingleyouthtables.naah?id=${son.id}" class="btn btn-warning radius" >修改</a>&nbsp;&nbsp;&nbsp;
			<a href="javascript:deleteunit('${son.id}')" class="btn btn-danger  radius" >删除</a>&nbsp;&nbsp;&nbsp;
			</td>
			</naah:if>
			
			<naah:if test="${son.flag=='1' }">
			<td class="col2 text-c ">待审</td>
			<td class="col2 text-c"><fmt:formatDate value="${son.uploadDate }" pattern="yyyy-MM-dd"/></td>
			<td class="col2 text-c" >
			<a href="GoToSelSingleyouthtables.naah?id=${son.id}" target="_blank" class="btn btn-default radius" >查看</a>&nbsp;&nbsp;&nbsp;
			<naah:if test="${sessionScope.user.roleId!='02'}">
			<input type="button" value="通过" class="btn btn-success radius" onclick="upload('${son.id}',2)" >&nbsp;&nbsp;&nbsp;
			<input type="button" value="驳回" class="btn btn-danger radius" onclick="upload('${son.id}',3)" >&nbsp;&nbsp;&nbsp;
			</naah:if>
			</td>
			</naah:if>
			
			<naah:if test="${son.flag=='2' }">
			<td class="col2 text-c">已审</td>
			<td class="col2 text-c"><fmt:formatDate value="${son.uploadDate }" pattern="yyyy-MM-dd"/></td>
			<td class="col2 text-c" >
			<a href="GoToSelSingleyouthtables.naah?id=${son.id}" target="_blank" class="btn btn-default radius" >查看</a>&nbsp;&nbsp;&nbsp;
			<naah:if test="${sessionScope.user.roleId=='09'}">
			<input type="button" value="显示" class="btn btn-success radius" onclick="upload('${son.id}',4)" >&nbsp;&nbsp;&nbsp;
			<input type="button" value="驳回" class="btn btn-danger radius" onclick="upload('${son.id}',3)" >&nbsp;&nbsp;&nbsp;
			</naah:if>
			</td>
			</naah:if>
			
			<naah:if test="${son.flag=='3' }">
			<td class="col2 text-c">驳回</td>
			<td class="col2 text-c"><fmt:formatDate value="${son.uploadDate }" pattern="yyyy-MM-dd"/></td>
			<td class="col2 text-c" >
			<a href="GoToSelSingleyouthtables.naah?id=${son.id}" target="_blank" class="btn btn-default radius" >查看</a>&nbsp;&nbsp;&nbsp;
			<input type="button" value="上报" class="btn btn-success radius" onclick="upload('${son.id}',1)" >&nbsp;&nbsp;&nbsp;
			<a href="GoToUpdSingleyouthtables.naah?id=${son.id}" class="btn btn-warning radius" >修改</a>&nbsp;&nbsp;&nbsp;
			<a href="javascript:showreason('${son.id}','Singleyouthtable')" class="btn btn-danger  radius" >驳回原因</a>&nbsp;&nbsp;&nbsp;
			<a href="javascript:deleteunit('${son.id}')" class="btn btn-danger  radius" >删除</a>&nbsp;&nbsp;&nbsp;
			</td>
			</naah:if>
			
			<naah:if test="${son.flag=='4' }">
			<td class="col2 text-c">显示</td>
			<td class="col2 text-c"><fmt:formatDate value="${son.uploadDate }" pattern="yyyy-MM-dd"/></td>
			<td class="col2 text-c" >
			<a href="GoToSelSingleyouthtables.naah?id=${son.id}" target="_blank" class="btn btn-default radius" >查看</a>&nbsp;&nbsp;&nbsp;
			<naah:if test="${sessionScope.user.roleId=='09'}">
			<input type="button" value="取消显示" class="btn btn-danger radius" onclick="upload('${son.id}',2)" >&nbsp;&nbsp;&nbsp;
			</naah:if>
			</td>
			</naah:if>
			
			
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
function upload(str,status)
{
	if(status=='3')
		{
		
		 layer.prompt
		 (
			{
			 	title: '驳回原因', 
				formType: 2,
			}, function(text, index)
			{
			    layer.close(index);
			    window.location.href="UploadSingleyouthtables.naah?id="+str+"&&status="+status+"&&reason="+text;
			}
			);
		}
	else
		{
		window.location.href="UploadSingleyouthtables.naah?id="+str+"&&status="+status;
		}
}

function showreason(id,tablename)
{
	
	 $.ajax(
		    	{  
		        	type:'get',  
		        	url:'reason.naah?id='+id+'&&tablename='+tablename,  
					contentType : 'application/json', 
		       		dataType: 'json',  
		        	success:function(data){  
		          	  $.each(data,function(i,list){  
		          		layer.alert(list);
		            	
;		            							});},
				 	error : function() {  alert("error");}   
		    	});
	 
}

function deleteunit(str)
{
	if(confirm("你确定要删除吗？"))
	{
		window.location.href='DelSingleyouthtables.naah?id='+str;
	}
}
function PrivilegePage(str)
{
	var url="unitManage!fail.action?id="+str;
	window.open(url, 'newwindow', 'height=300, width=500, top='+Math.round((window.screen.height-400)/2-100)+',left='+Math.round((window.screen.width-400)/2)+',toolbar=no, menubar=no, scrollbars=yes, resizable=no,location=no, status=no');
	
}

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