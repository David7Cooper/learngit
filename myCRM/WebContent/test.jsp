<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>查询全部</h3>
	<table border="1">
		<tr>
			<td>ID</td>
			<td>userName</td>
			<td>userPass</td>
		</tr>
		<c:forEach items="${customs }" var="custom">
			<tr>
				<td>${custom.id }</td>
				<td>${custom.name }</td>
			</tr>
		</c:forEach>
	</table>
	<hr>
</body>
</html>