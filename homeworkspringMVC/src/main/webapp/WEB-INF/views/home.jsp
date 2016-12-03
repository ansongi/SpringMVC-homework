<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>

<p> <a href="${pageContext.request.contextPath}/year_semester"> 1.Academic credits by semester </a>
<p> <a href="${pageContext.request.contextPath}/class_division"> 2.Credit check by class </a>
<p> <a href="${pageContext.request.contextPath}/newclass"> 3.Apply for course </a>
<p> <a href="${pageContext.request.contextPath}/newclassview"> 4.View course enrollment </a>
</body>
</html>
