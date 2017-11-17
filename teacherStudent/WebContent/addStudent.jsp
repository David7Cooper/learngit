<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <!-- 运用EL表达式 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
	a{
		text-decoration: none;
	}
</style>
</head>
<body>
	<form action="StudentServlet?po=add2" method="post">
		<table border="1px">
			<tr>
				<th>编号</th>
				<th>姓名</th>
				<th>年龄</th>
				<th>性别</th>
				<th>老师</th>
				<th colspan="3">功能</th>
			</tr>
			<c:forEach items="${Student }" var="student">
			<tr>
				<td>${student.id }</td>
				<td>${student.name }</td>
				<td>${student.age }</td>
				<td>${student.sex }</td>
				<td>${student.teacher.name }</td>
				<td><a href="StudentServlet?po=remove&id=${student.id }">删</a></td>
				<td><a href="StudentServlet?po=update&id=${student.id }">改</a></td>
			</tr>
			</c:forEach>
			<tr>
				<td><input type="text" value="${nextId}"></td>
				<td><input type="text" name="name"></td>
				<td><input type="text" name="age"></td>
				<td><input type="text" name="sex"></td>
				<td><input type="text" name="teacherName"></td>
				<td colspan="2" style="text-align: center;"><a href="StudentServlet?po=defualt">提交</a></td>
			</tr>
			<tr>
				<!-- a标签中无法完成表单里的值传递 -->
				<td colspan="7" style="text-align: center;"><input type="submit" value="新增"></td>
			</tr>			
		</table>
	</form>
</body>
</html>