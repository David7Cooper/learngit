<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <!-- 运用EL表达式 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<!-- 在form表单中只有post方法才可以传递po值 -->
	<form action="StudentServlet?po=first" method="post">
		<input type="submit">
	</form>
	<!-- <form action="StudentServlet">
		<input type="submit">
	</form> -->
	<!-- 通过a标签把所有的功能写在一个Servlet类中，实现一个JavaBean一个Servlet -->
	<!-- <a href="StudentServlet?po=index"><button>点击</button></a> -->
</body>
</html>