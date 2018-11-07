<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>登陆页面</title>
    <style type="text/css">
    	div{
    		width: 300px;
    		margin: 0 auto;
    	}
    </style>
  </head>
  <body>
   <div>
   		 <form action="contral.jsp" method="post">
	    <p>账号：<input type="text" name="username"></p>
	    <p>密码：<input type="password" name="userpwd"></p>
	    <p><input type="submit" value="登陆"></p>
    </form>
   </div>
  </body>
</html>
