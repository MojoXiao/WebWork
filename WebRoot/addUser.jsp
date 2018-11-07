<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>注册页面</title>
    
	<form action="add.jsp" method="post">
	    <p>新建账号：<input type="text" name="username"></p>
	    <p>密码：<input type="password" name="userpwd"></p>
	    <p><input type="submit" value="确定注册"></p>
    </form>
  </head>
  
  <body>
  </body>
</html>
