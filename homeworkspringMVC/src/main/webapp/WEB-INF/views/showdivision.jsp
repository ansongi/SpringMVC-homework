<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>���к� �̼����� ���� ��ȸ</title>
</head>
<body>
	</table>
	<h2>���к� �̼����� ����</h2>
	<table border="1">
		<tr>
			<th>����</th>
			<th>�ٱ�</th>
			<th>����</th>
			<th>����</th>
			<th>����</th>
			<th>������</th>
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