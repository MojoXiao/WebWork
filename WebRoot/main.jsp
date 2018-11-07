<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>主页面</title>
  <style type="text/css">
    div{
    width:500px;
    margin:0 auto;
    }
    table,tr,th,td{
    border: 1px solid;
    }
    tr:not(.title):nth-of-type(even){
    background: #FF3977;
    }
    tr:not(.title):nth-of-type(odd){
    background: #1DFFBF;
    }
    </style>
    
  </head>
  
  <body>
  	<div>
  		<a href="login.jsp">登录</a>
  		<a href="addUser.jsp">注册</a>
  		<h2>习近平出席首届中国国际进口博览会开幕式并发表主旨演讲</h2>
  	</div>
  </body>
</html>
