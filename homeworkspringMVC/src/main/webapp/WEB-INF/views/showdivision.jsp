<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>구분별 이수학점 내역 조회</title>
</head>
<body>
	</table>
	<h2>구분별 이수학점 내역</h2>
	<table border="1">
		<tr>
			<th>교필</th>
			<th>핵교</th>
			<th>전지</th>
			<th>전기</th>
			<th>전선</th>
			<th>총학점</th>
		</tr>
		<tr>
			<td><c:out value="${sumclass1}"></c:out></td> 
			<td><c:out value="${sumclass6+sumclass7}"></c:out></td>
			<td><c:out value="${sumclass5}"></c:out></td>
			<td><c:out value="${sumclass3}"></c:out></td>
			<td><c:out value="${sumclass4}"></c:out></td>
			<td><c:out
					value="${sumclass1+sumclass2+sumclass3+sumclass4+sumclass5}"></c:out></td>
		</tr>
	</table>
</body>
</html>