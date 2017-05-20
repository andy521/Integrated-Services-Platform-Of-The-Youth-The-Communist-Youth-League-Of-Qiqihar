<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.util.*"%>
<%@ taglib prefix="naah" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>青少年法律援助申请登记表</title>
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
<h1>青少年法律援助申请登记表</h1>
<table width="800" height="417" border="1">
  <tr>
    <td width="74"><p >姓名</p></td>
    <td width="71"><p >性别</p></td>
    <td width="74"><p >年龄</p></td>
    <td width="129"><p align="center" >所在学校 <br />
    （社区）</p></td>
    <td width="153"><p >申请援助理由</p></td>
    <td width="126"><p >监护人联系方式</p></td>
    <td width="127"><p align="center" >备注 </p></td>
  </tr>
  <tr>
    <td>${requestScope.Youthlawhelptable.name}</td>
    <td>${requestScope.Youthlawhelptable.sex}</td>
    <td>${requestScope.Youthlawhelptable.age}</td>
    <td>${requestScope.Youthlawhelptable.school}</td>
    <td>${requestScope.Youthlawhelptable.lawReason}</td>
    <td>${requestScope.Youthlawhelptable.tel}</td>
    <td>${requestScope.Youthlawhelptable.note}</td>
  </tr>
  
</table>
</body>
</html>
