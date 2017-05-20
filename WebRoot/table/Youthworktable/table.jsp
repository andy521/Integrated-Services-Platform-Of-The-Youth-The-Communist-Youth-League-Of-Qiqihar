
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.util.*"%>
<%@ taglib prefix="naah" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>青年就业创业信息登记表</title>
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
<h1>青年就业创业信息登记表</h1>

<table width="620" height="620" border="1">
  <tr>
    <td width="125" height="38"><p >姓   名</p></td>
    <td width="160">${requestScope.Youthworktable.name}</td>
    <td width="169"><p >性   别</p></td>
    <td width="160">${requestScope.Youthworktable.sex}</td>
  </tr>
  <tr>
    <td height="39"><p >民   族</p></td>
    <td>${requestScope.Youthworktable.nation}</td>
    <td><p >出生年月</p></td>
    <td><fmt:formatDate value="${requestScope.Youthworktable.birthday}" pattern="yyyy-MM-dd"/></td>
  </tr>
  <tr>
    <td height="39"><p >学   历</p></td>
    <td>${requestScope.Youthworktable.education}</td>
    <td><p >毕业学校</p></td>
    <td>${requestScope.Youthworktable.graduateSchool}</td>
  </tr>
  <tr>
    <td height="37"><p >就业情况</p></td>
    <td>${requestScope.Youthworktable.workStauts}</td>
    <td><p >所在社区</p></td>
    <td>${requestScope.Youthworktable.communities}</td>
  </tr>
  <tr>
    <td height="43"><p >家庭详细住址</p></td>
    <td colspan="3">${requestScope.Youthworktable.address}</td>
  </tr>
  <tr>
    <td rowspan="2"><p >联系方式</p></td>
    <td height="32"><p >手机号码</p></td>
    <td colspan="2">${requestScope.Youthworktable.tel}</td>
  </tr>
  <tr>
    <td height="31"><p >QQ号码</p></td>
    <td colspan="2">${requestScope.Youthworktable.qq}</td>
  </tr>
  <tr>
    <td height="35"><p >求职方向</p></td>
    <td colspan="3">${requestScope.Youthworktable.wordDirection}</td>
  </tr>
  <tr>
    <td height="68">工作经历</td>
    <td colspan="3">${requestScope.Youthworktable.oldWork}</td>
  </tr>
  <tr>
    <td height="38"><p >推荐人</p></td>
    <td>${requestScope.Youthworktable.referrer}</td>
    <td><p >推荐人电话</p></td>
    <td>${requestScope.Youthworktable.referrerTel}</td>
  </tr>
  <tr>
    <td height="206"><p >实践工作经历</p></td>
    <td colspan="3">${requestScope.Youthworktable.practiceWork}</td>
  </tr>
</table>
</body>
</html>
