<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="../js/jquery.js"></script>
<script type="text/javascript">
	$(function(){
		$("#btn").click(function(){
			$.post("/test/LoginServlet",
					{"username":$("#username").val(),"password":$("#password").val()},
					function(data){
						if(data==0){
							/* $("div").html("<h1>登录成功</h1>") */
							location.href="loginSecond.jsp?username="+$("#username").val();
						}else if(data==1){
							$("div").html("<h1>用户名错误</h1>");
						}else{
							$("div").html("<h1>密码错误</h1>");
						}
					},"html");
		});
	});
</script>
</head>

<body>
	<h1>Welcome to login</h1>
	<div></div>
	<p>username &nbsp&nbsp<input type="text" name="username" id="username"></p>
	<p>password &nbsp&nbsp<input type="text" name="password" id="password"></p>
	<p><input type="button" id="btn" value="submit"></p>
</body>
</html>