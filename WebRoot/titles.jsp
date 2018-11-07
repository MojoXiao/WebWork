<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page import="ww.entity.News" %>
<%@ page import="ww.dao.NewDao" %>
<%@ page import="ww.dao.impl.NewDaoImpl" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>新闻内容</title>
    
	

  </head>
  
  <body>
    <%
   request.setCharacterEncoding("utf-8");
   String title=request.getParameter("title");
   NewDao dao=new NewDaoImpl();
   News news=dao.findBytutle(title);
  %>
    <p>新闻标题:<%=news.getTitle() %></p>
    <p>新闻日期:<%=news.getTime() %></p>
    <p>新闻来源:<%=news.getComeform() %></p>
    <p>新闻内容:<%=news.getNeirong() %></p>
  </body>

  </body>
</html>
