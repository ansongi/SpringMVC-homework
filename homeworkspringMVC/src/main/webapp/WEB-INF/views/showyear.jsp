<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.util.*"%>
<%
	request.setCharacterEncoding("UTF-8");
%>
<html>
<head>
<title>학기별 이수 학점 조회</title>
</head>
<body>
	<h2>학기별 이수 학점</h2>
	<table border="1">
		<tr>
			<th>수강년도</th>
			<th>학기</th>
			<th>이수 학점</th>
			<th>상세보기</th>
		</tr>
		<tr>
			<td>2013</td>
			<td>1</td>
			<td>
			<c:out value="${year131}"></c:out>
				</td>
			<td><p>
					<a href="/homeworkSpringMVC/13-1">링크</a>
				</p></td>
		</tr>
		<tr>
			<td>2013</td>
			<td>2</td>
			<td><c:out value="${year132}"></c:out></td>
			<td><p>
					<a href="/homeworkSpringMVC/13-2">링크</a>
				</p></td>
		</tr>
		<tr>
			<td>2014</td>
			<td>1</td>
			<td><c:out value="${year141}"></c:out></td>
			<td><p>
					<a href="/homeworkSpringMVC/14-1">링크</a>
				</p></td>
		</tr>
		<tr>
			<td>2014</td>
			<td>2</td>
			<td><c:out value="${year142}"></c:out></td>
			<td><p>
					<a href="/homeworkSpringMVC/14-2">링크</a>
				</p></td>
		</tr>
		<tr>
			<td>2016</td>
			<td>1</td>
			<td><c:out value="${year161}"></c:out></td>
			<td><p>
					<a href="/homeworkSpringMVC/16-1">링크</a>
				</p></td>
		</tr>
		<tr>
			<td>2016</td>
			<td>2</td>
			<td><c:out value="${year162}"></c:out></td>
			<td><p>
					<a href="/homeworkSpringMVC/16-2">링크</a>
				</p></td>
		</tr>
</body>
</html>
