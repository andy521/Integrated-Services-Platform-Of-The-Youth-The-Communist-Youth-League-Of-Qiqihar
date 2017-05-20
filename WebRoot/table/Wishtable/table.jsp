<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.util.*"%>
<%@ taglib prefix="naah" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>手拉手结对信息登记表</title>
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
<h1>手拉手结对信息登记表</h1>
<table width="586" height="744" border="1">
  <tr>
    <td width="120"><p >姓    名</p></td>
    <td width="140">${requestScope.Wishtable.name}</td>
    <td width="118"><p >性    别</p></td>
    <td width="140">${requestScope.Wishtable.sex}</td>
  </tr>
  <tr>
    <td><p >年    龄</p></td>
    <td>${requestScope.Wishtable.age}</td>
    <td><p >民    族</p></td>
    <td>${requestScope.Wishtable.nation}</td>
  </tr>
  <tr>
    <td><p >所在学校</p></td>
    <td>${requestScope.Wishtable.school}</td>
    <td><p >所在班级</p></td>
    <td>${requestScope.Wishtable.class_}</td>
  </tr>
  <tr>
    <td><p >所在社区</p></td>
    <td colspan="3">${requestScope.Wishtable.communities}</td>
  </tr>
  <tr>
    <td><p >家庭住址</p></td>
    <td colspan="3">${requestScope.Wishtable.address}</td>
  </tr>
  <tr>
    <td rowspan="2"><p >联系方式（家长或老师）</p></td>
    <td><p >手机号码</p></td>
    <td colspan="2">${requestScope.Wishtable.tel}</td>
  </tr>
  <tr>
    <td height="41"><p >QQ号码</p></td>
    <td colspan="2">${requestScope.Wishtable.qq}</td>
  </tr>
  <tr>
    <td height="190"><p >家庭情况</p></td>
    <td colspan="3">${requestScope.Wishtable.familyStatus}</td>
  </tr>
  <tr>
    <td height="233"><p >微心愿愿望</p></td>
    <td colspan="3">${requestScope.Wishtable.wish}</td>
  </tr>
</table>
</body>
</html>
