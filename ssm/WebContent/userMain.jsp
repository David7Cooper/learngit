<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 查询全部———————————————————————————————————————————————————————————————————————————————— -->
	<h3>查询全部</h3>
	<table border="1">
		<tr>
			<td>ID</td>
			<td>userName</td>
			<td>userPass</td>
			<td>sex</td>
			<td colspan="2">操作</td>
		</tr>
		<c:forEach items="${users }" var="user">
			<tr>
				<td>${user.id }</td>
				<td>${user.username }</td>
				<td>${user.userpass }</td>
				<td>${user.sex }</td>
				<td><a href="removeUser.do?id=${user.id }">删</a></td>
				<td href=""><a>改</a></td>
			</tr>
		</c:forEach>
	</table>
	<hr>
<!-- 查（第二种显示） -->
<h3>查询全部（第二种显示）</h3>
	<form action="updateUser.do" method="post">
		<table border="1">
		<tr>
			<td>ID</td>
			<td>userName</td>
			<td>userPass</td>
			<td>sex</td>
			<td colspan="2">操作</td>
		</tr>
		<c:forEach items="${users }" var="user">
			<tr>
				<td>${user.id }</td>
				<td><input type="text" name="username" value="${user.username }"></td>
				<td><input type="text" name="userpass" value="${user.userpass }"></td>
				<td><input type="text" name="sex" value="${user.sex }"></td>
				<td><a href="removeUser.do?id=${user.id }">删</a></td>
				<td><input type="submit" value="改"></td>
			</tr>
		</c:forEach>
		</table>
	</form>
	<hr>
<!-- 查（通过姓名查询）————————————————————————————————————————————————————————————————————————————— -->
<!-- 	<table border="1"> -->
<!-- 		<tr> -->
<!-- 			<td>ID</td> -->
<!-- 			<td>userName</td> -->
<!-- 			<td>userPass</td> -->
<!-- 			<td>sex</td> -->
<!-- 		</tr> -->
<!-- 		<tr> -->
<%-- 			<td>${user.id }</td> --%>
<%-- 			<td>${user.username }</td> --%>
<%-- 			<td>${user.userpass }</td> --%>
<%-- 			<td>${user.sex}</td> --%>
<!-- 		</tr> -->
<!-- 	</table> -->
<!-- 	<hr> -->
<!-- 增———————————————————————————————————————————————————————————————————————————————————————— -->
	<h3>增</h3>
	<form action="add.do" method="post">
	<p>请输入新增的人物信息</p>
	<label>username</label><input type="text" name="username"><br>
	<label>userpass</label><input type="text" name="userpass"><br>
	<label>sex</label><input type="text" name="sex"><br>
	<input type="submit">
	</form>
	<hr>
</body>
</html>