<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.util.*"%>
<%@ taglib prefix="naah" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>医疗救助登记表</title>
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
<h1>医疗救助登记表</h1>
<table width="660" height="749" border="1">
  <tr>
    <td width="76" height="66"><p >姓 名</p></td>
    <td width="88">${requestScope.Illnesshelptable.name}</td>
    <td width="63"><p >性 别</p></td>
    <td width="62">${requestScope.Illnesshelptable.sex}</td>
    <td width="56"><p >年 龄</p></td>
    <td width="62">${requestScope.Illnesshelptable.age}</td>
    <td width="122"><p >民 族</p></td>
    <td width="168">${requestScope.Illnesshelptable.nation}</td>
  </tr>
  <tr>
    <td height="103"><p align="center" >工  作 <br>
      单  位 <br>
    （学 校）</p></td>
    <td colspan="4">${requestScope.Illnesshelptable.company}</td>
    <td colspan="2"><p >所 患 疾 病</p></td>
    <td>${ requestScope.Illnesshelptable.illness}</td>
  </tr>
  <tr>
    <td rowspan="2"><p align="center" >家庭</p>
    <p align="center" >住址</p></td>
    <td colspan="4" rowspan="2">${requestScope.Illnesshelptable.address}</td>
    <td rowspan="2"><p align="center" >联系</p>
    <p align="center" >电话</p></td>
    <td><p >办公电话</p></td>
    <td>${requestScope.Illnesshelptable.tel}</td>
  </tr>
  <tr>
    <td height="58"><p >手    机</p></td>
    <td>${requestScope.Illnesshelptable.phone}</td>
  </tr>
  <tr>
    <td height="263"><p align="center" >家庭</p>
      <p align="center" >&nbsp;</p>
      <p align="center" >&nbsp;</p>
      <p align="center" >情况<br>
    </p></td>
    <td colspan="7">${requestScope.Illnesshelptable.familyStatus}</td>
  </tr>
  <tr>
    <td height="191"><p >备 注</p></td>
    <td colspan="7">${requestScope.Illnesshelptable.note}</td>
  </tr>
</table>

</body>
</html>
