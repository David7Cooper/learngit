<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 进入struts.xml中的<action></action>配置 -->
	<form action="ActionUser">
		<input type="text" name="user.name"><br>
		<input type="text" name="user.password"><br>
		<input type="submit"/>
	</form>
	<!-- 注册1.0 -->
	<form action="ActionUser1">
		<input type="text" name="user1.name"><br>
		<input type="text" name="user1.age"><br>
		<input type="text" name="user1.sex"><br>
		<input type="text" name="user1.password">
		<input type="submit">
	</form>
	<!-- 注册1.0 -->
	<!-- 注册2.0 -->
	<s:form action="ActionUser" method="post">
		<s:textfield name="user.name" label="用户名"></s:textfield>
		<s:password name="user.password" label="密码"></s:password>
		<s:submit></s:submit>
	</s:form>
	<!-- 注册2.0 -->
</body>
</html>