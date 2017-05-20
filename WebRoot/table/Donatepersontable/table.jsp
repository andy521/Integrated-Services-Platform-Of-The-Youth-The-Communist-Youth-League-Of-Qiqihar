<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.util.*"%>
    <%@ taglib prefix="naah" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>捐赠人员信息登记表</title>
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
<h1>捐赠人员信息登记表</h1>
<table width="620" height="580" border="1">
  <tr>
    <td width="122" height="46"><p >姓    名</p></td>
    <td width="142">${requestScope.DonatePersonTable.name}</td>
    <td width="132"><p >性    别</p></td>
    <td width="156">${requestScope.DonatePersonTable.sex}</td>
  </tr>
  <tr>
    <td height="46"><p >年    龄</p></td>
    <td>${requestScope.DonatePersonTable.age}</td>
    <td><p >民    族</p></td>
    <td>${requestScope.DonatePersonTable.nation}</td>
  </tr>
  <tr>
    <td height="46"><p >捐助对象</p></td>
    <td>${requestScope.DonatePersonTable.donateObject}</td>
    <td><p >资助金额</p></td>
    <td>${requestScope.DonatePersonTable.donateMoney}</td>
  </tr>
  <tr>
    <td rowspan="2">联系方式</td>
    <td height="36"><p >手机号码</p></td>
    <td colspan="2">${requestScope.DonatePersonTable.tel}</td>
  </tr>
  <tr>
    <td height="36"><p >QQ号码</p></td>
    <td colspan="2">${requestScope.DonatePersonTable.qq}</td>
  </tr>
  <tr>
    <td height="180">捐赠要求</td>
    <td colspan="3">${ requestScope.DonatePersonTable.claim}</td>
  </tr>
  <tr>
    <td height="180"><p >爱心寄语</p></td>
    <td colspan="3">${requestScope.DonatePersonTable.wishes}</td>
  </tr>
</table>
</body>
</html>
