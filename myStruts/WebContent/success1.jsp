<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
	body{
	}
	table{
		text-align:center;
	}
</style>
</head>
<body>
	<h1>success1</h1>
	<table border="1">
		<tr>
			<td><h3>Name</h3></td>
			<td><h3>Age</h3></td>
			<td><h3>Sex</h3></td>
			<td><h3>Password</h3></td>
		</tr>
		<tr>
			<td><s:property value="user1.name"/></td>
			<td><s:property value="user1.age"/></td>
			<td><s:property value="user1.sex"/></td>
			<td><s:property value="user1.password"/></td>
		</tr>
	</table>
</body>
</html>