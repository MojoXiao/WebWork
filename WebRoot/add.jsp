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
    
    <title>My JSP 'add.jsp' starting page</title>
    

  </head>
  
  <body>
     <%
    request.setCharacterEncoding("utf-8");
    String username=request.getParameter("username");
    String userpwd=request.getParameter("userpwd");
    UserDao dao=new UserDaoImpl();
    User user=new User(username,userpwd);
    int num=dao.addUser(user);
    if(num>0){ 
    	response.sendRedirect("list.jsp");
    }
    %>

  </body>
</html>
