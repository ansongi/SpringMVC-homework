<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>2016년 1학기 수강 교과목</title>
</head>
<body>
	<c:forEach var="class16and1" items="${class16and1}">
		<p>
			<c:out value="${class16and1}"></c:out>
		</p>
	</c:forEach>
</body>
</html>