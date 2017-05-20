
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.util.*"%>
<%@ taglib prefix="naah" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>"益起来·希望工程圆梦行动"
奖学金申请表</title>
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
<h1>"益起来·希望工程圆梦行动"
奖学金申请表</h1>
<table width="865" height="861" border="1">
  <tr>
    <td width="137"><p >姓    名</p></td>
    <td colspan="6">${requestScope.Universitytable.name}</td>
    <td width="92"><p >性别</p></td>
    <td colspan="2">${requestScope.Universitytable.sex}</td>
  </tr>
  <tr>
    <td height="25"><p >姓名汉语拼音</p></td>
    <td colspan="6">${requestScope.Universitytable.nameSpell}</td>
    <td><p >民族</p></td>
    <td colspan="2">${requestScope.Universitytable.nation}</td>
  </tr>
  <tr>
    <td height="42"><p >出生日期</p></td>
    <td colspan="4"><p ><fmt:formatDate value="${requestScope.Universitytable.birthday}" pattern="yyyy-MM-dd"/></p></td>
    <td width="41"><p >籍贯</p></td>
    <td colspan="4"><p >${requestScope.Universitytable.hometown}</p></td>
  </tr>
  <tr>
    <td><p >身份证号码</p></td>
    <td colspan="9">${requestScope.Universitytable.idCard}</td>
  </tr>
  <tr>
    <td><p >高中就读学校</p></td>
    <td colspan="6">${requestScope.Universitytable.highSchool}</td>
    <td><p >科别（文、理）</p></td>
    <td colspan="2">${requestScope.Universitytable.subject}</td>
  </tr>
  <tr>
    <td colspan="3"><p >高中期间获得何种奖励</p></td>
    <td colspan="5">${requestScope.Universitytable.awardInHighSchool}</td>
    <td colspan="2"><p >年级排第<u>${requestScope.Universitytable.ranking}</u>名</p></td>
  </tr>
  <tr>
    <td><p >准考证号</p></td>
    <td colspan="6">${requestScope.Universitytable.examNumber}</td>
    <td><p >高考成绩</p></td>
    <td colspan="2">${requestScope.Universitytable.examScore}</td>
  </tr>
  <tr>
    <td><p >录取院校</p></td>
    <td colspan="9">${requestScope.Universitytable.university}</td>
  </tr>
  <tr>
    <td><p >院、系</p></td>
    <td colspan="4">${requestScope.Universitytable.college}</td>
    <td colspan="2"><p >专业</p></td>
    <td colspan="3">${requestScope.Universitytable.major}</td>
  </tr>
  <tr>
    <td><p >联系电话</p></td>
    <td colspan="4">${requestScope.Universitytable.tel}</td>
    <td colspan="2"><p >邮箱（或QQ）</p></td>
    <td colspan="3">${requestScope.Universitytable.qq}</td>
  </tr>
  <tr>
    <td height="52"><p >家长姓名</p></td>
    <td colspan="9"><p align="left" >父亲姓名：${requestScope.Universitytable.fatherName}       联系电话：${requestScope.Universitytable.fatherTel} <br>
    母亲姓名：${requestScope.Universitytable.motherName}       联系电话：${requestScope.Universitytable.motherTel}</p></td>
  </tr>
  <tr>
    <td height="24"><p >家庭详细地址</p></td>
    <td colspan="7">${requestScope.Universitytable.address}</td>
    <td width="73"><p >邮政编码</p></td>
    <td width="151">${requestScope.Universitytable.zipCode}</td>
  </tr>
  <tr>
    <td colspan="2" rowspan="3"><p >受助生办理个人银行账户资料（选填）</p></td>
    <td height="42" colspan="2"><p >户名</p></td>
    <td colspan="6"><p align="right" >${requestScope.Universitytable.bankCustomer}(申请学生本人的真实姓名)</p></td>
  </tr>
  <tr>
    <td colspan="2"><p >开户行名</p></td>
    <td colspan="6"><p align="right" >${requestScope.Universitytable.bankName}</p></td>
  </tr>
  <tr>
    <td height="42" colspan="2"><p >账(卡)号</p></td>
    <td colspan="6">${requestScope.Universitytable.bankNumber}</td>
  </tr>
  <tr>
    <td height="304">申请理由</td>
    <td colspan="9"><p align="left" >&nbsp;</p>
      <p align="left" >${requestScope.Universitytable.note}(由学生本人填写100字以内的申请理由) </p>
  
    <p >学生签名：</p></td>
  </tr>
</table>
</body>
</html>
