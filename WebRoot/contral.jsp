<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page import="ww.entity.User" %>
<%@ page import="ww.dao.UserDao" %>
<%@ page import="ww.dao.impl.UserDaoImpl" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title></title>
    

  </head>
  
  <body>
   <%
     request.setCharacterEncoding("utf-8");
    String  username=request.getParameter("username");
  	String  userpwd=request.getParameter("userpwd");
  	User user=new User(username,userpwd);
  	UserDao dao=new UserDaoImpl();
  	boolean flag=dao.login(user);
	if(flag){
		session.setAttribute("username", username);
		response.sendRedirect("list2.jsp");
	}else{
		response.sendRedirect("login.jsp");
	}
  	 %>
  
  
  </body>
</html>
