<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.util.*"%>
<%@ taglib prefix="naah" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>青少年心理咨询登记表</title>
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
<h1>青少年心理咨询登记表</h1>

<table width="586" height="749" border="1">
  <tr>
    <td width="63" height="70"><p >姓 名</p></td>
    <td width="65">${requestScope.Youthmentalitytable.name}</td>
    <td width="63"><p >民族</p></td>
    <td width="76">${requestScope.Youthmentalitytable.nation}</td>
    <td width="63"><p >性 别</p></td>
    <td width="57">${requestScope.Youthmentalitytable.sex}</td>
    <td width="60"><p >年 龄</p></td>
    <td width="81">${requestScope.Youthmentalitytable.age}</td>
  </tr>
  <tr>
    <td height="93" colspan="2"><p >所在单位或学校</p></td>
    <td colspan="4">${requestScope.Youthmentalitytable.school}</td>
    <td><p >学 历</p></td>
    <td>${requestScope.Youthmentalitytable.education}</td>
  </tr>
  <tr>
    <td height="106"><p >委托人</p></td>
    <td colspan="3">${requestScope.Youthmentalitytable.mandator}</td>
    <td><p align="center" >委托人 <br />
    联系方式</p></td>
    <td colspan="3">${requestScope.Youthmentalitytable.tel}</td>
  </tr>
  <tr>
    <td height="106"><p >咨询方向</p></td>
    <td colspan="7">${requestScope.Youthmentalitytable.askDirection}</td>
  </tr>
  <tr>
    <td height="360"><p align="center" >情</p>
      <p align="center" >况</p>
      <p align="center" >简</p>
      <p align="center" >介<br />
    </p></td>
    <td colspan="7">${requestScope.Youthmentalitytable.note}</td>
  </tr>
</table>

</body>
</html>
