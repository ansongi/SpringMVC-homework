
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
������û �Ǿ����ϴ�. <a href="${pageContext.request.contextPath}/home"> 
	���⸦ ������ ó�� ȭ������ ���ư��ϴ�.</a>
	
<c:forEach var="classes" items="${classes}">
	<p>
		<c:out value="${classes}"></c:out>
	</p>
	</c:forEach>
</body>
</html>