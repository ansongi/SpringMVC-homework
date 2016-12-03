
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>docreate</title>
</head>
<body>
수강신청 되었습니다. <a href="${pageContext.request.contextPath}/home"> 
	여기를 누르면 처음 화면으로 돌아갑니다.</a>
	
<c:forEach var="classes" items="${classes}">
	<p>
		<c:out value="${classes}"></c:out>
	</p>
	</c:forEach>
</body>
</html>