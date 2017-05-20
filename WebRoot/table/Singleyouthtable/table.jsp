<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.util.*"%>
<%@ taglib prefix="naah" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>单身青年信息登记表</title>
<style>
*{ margin:0 ; padding:0}
table,tr,td,th
{ 
   border:1px solid black;
   border-collapse:collapse;
   text-align:center;
}
table,h1
{ 
   text-align:center; 
   margin:2% auto;
}
</style>
</head>

<body>
<h1>单身青年信息登记表</h1>


<table width="620" height="580" border="1">
  <tr>
    <td width="107" height="45"><p class="red">姓名</p></td>
    <td width="196">${requestScope.Singleyouthtable.name}</td>
    <td width="88"><p >性   别</p></td>
    <td width="194">${requestScope.Singleyouthtable.sex}</td>
  </tr>
  <tr>
    <td height="45">民族</td>
    <td>${requestScope.Singleyouthtable.nation}</td>
    <td><p >出生年月</p></td>
    <td><fmt:formatDate value="${requestScope.Singleyouthtable.birthday}" pattern="yyyy-MM-dd"/></td>
  </tr>
  <tr>
    <td height="45">学历</td>
    <td>${requestScope.Singleyouthtable.education}</td>
    <td><p >工作单位</p></td>
    <td>${requestScope.Singleyouthtable.company}</td>
  </tr>
  <tr>
    <td height="45"><p class="red">家庭住址</p></td>
    <td colspan="3">${requestScope.Singleyouthtable.address}</td>
  </tr>
  <tr>
    <td rowspan="3">联系方式</td>
    <td height="42"><p  class="red">手机号码</p></td>
    <td colspan="2">${requestScope.Singleyouthtable.tel}</td>
  </tr>
  <tr>
    <td height="42"><p  class="blue">QQ号码</p></td>
    <td colspan="2">${requestScope.Singleyouthtable.qq}</td>
  </tr>
  <tr>
    <td height="42"><p  class="blue">微信号</p></td>
    <td colspan="2">${requestScope.Singleyouthtable.wechat}</td>
  </tr>
  <tr>
    <td height="59"><p >择偶标准</p></td>
    <td colspan="3">${requestScope.Singleyouthtable.chooseSexStandard}</td>
  </tr>
  <tr>
    <td height="59"><p >婚姻状况</p></td>
    <td colspan="3">${requestScope.Singleyouthtable.marryStatus}</td>
  </tr>
  <tr>
    <td height="135"><p  class="blue">个人简介</p></td>
    <td colspan="3">${requestScope.Singleyouthtable.personIntroduce}</td>
  </tr>
</table>
</body>
</html>
