<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<tr>
			<th>编号</th>
			<th>userName</th>
			<th>userPass</th>
			<th>sex</th>
			<th>操作</th>
		</tr>

		<c:forEach items="${pageBean.list }" var="user">
			<tr>
				<td>${user.id }</td>
				<td>${user.username }</td>
				<td>${user.userpass }</td>
				<td>${user.sex }</td>
				<td><a href="?id=${user.id }">修改</a>| <a href="deleteUser.do?id=${user.id }">删除</a>
				</td>
			</tr>
		</c:forEach>
		
		<tr>
			<td width="13%" class="tocenter">
				<font size="2">共 ${pageBean.totalPage} 页</font>
			</td>
			<td width="17%" class="tocenter">
				<font size="2">共 ${pageBean.allRow} 条记录</font>
			</td>
			<td width="15%" class="tocenter">
				<font size="2">当前第  ${pageBean.currentPage} 页</font>
			</td>
			<td colspan="4" width="55%" class="tocenter">
			<a href="userMain.do?pages=1">首页</a>
			<c:choose>  
            <c:when test="${pageBean.currentPage - 1 > 0}">  
                <a href="userMain.do?pages=${pageBean.currentPage - 1}">上一页</a>  
            </c:when>  
            <c:when test="${pageBean.currentPage - 1 <= 0}">  
                <a href="userMain.do?pages=1">上一页</a>  
            </c:when>  
        </c:choose>  
        <c:choose>  
            <c:when test="${pageBean.totalPage==0}">  
                <a href="userMain.do?pages=${pageBean.currentPage}">下一页</a>  
            </c:when>  
            <c:when test="${pageBean.currentPage + 1 < pageBean.totalPage}">  
                <a href="userMain.do?pages=${pageBean.currentPage + 1}">下一页</a>  
            </c:when>  
            <c:when test="${pageBean.currentPage + 1 >= pageBean.totalPage}">  
                <a href="userMain.do?pages=${pageBean.totalPage}">下一页</a>  
            </c:when>  
            
        </c:choose>  
        <a href="userMain.do?pages=${pageBean.totalPage}">尾页</a>
		</tr>
		
	</table>
</body>
</html>




