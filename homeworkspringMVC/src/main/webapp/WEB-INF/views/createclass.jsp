<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css"
   href="${pageContext.request.contextPath}/resources/css/main.css">

<title>수강신청하기</title>
</head>
<body>
   <form method="get" action="${pageContext.request.contextPath}/docreate" modelAttribute="classes">
      <table class="formtable">
         <tr>
            <td class="lable">수강년도</td>
            <td><input class="control" name="year" type="text" /></td>
         </tr>
         <tr>
            <td class="lable">학기</td>
            <td><input class="control" name="semester" type="text" /></td>
         </tr>
         <tr>
            <td class="lable">교과코드</td>
            <td><input class="control" name="class_code" type="text" /></td>
         </tr>
         <tr>
            <td class="lable">교과목명</td>
            <td><input class="control" name="class_name" type="text" /></td>
         </tr>
         <tr>
            <td class="lable">구분</td>
            <td><input class="control" name="class_division" type="text" /></td>
         </tr>
         <tr>
            <td class="lable">학점</td>
            <td><input class="control" name="credit" type="text" /></td>
         </tr>
         <tr>
            <td class="lable"></td>
            <td><input class="control" value="수강신청" type="submit" /></td>
         </tr>
      </table>
   </form>
</body>
</html>