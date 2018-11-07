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
  <%String username=(String)session.getAttribute("username"); %>
   您好 [<%=username %>]，欢迎进入百度新闻!<a href="addUser.jsp">注册 </a><hr>
  
  <table>
  	<tr class="title">
  	</tr>
  	<%NewDao dao=new NewDaoImpl();
	List<News> list = dao.findAll();
	for (News news : list){ %>
		<tr>
		  <td><a href="tltles.jsp?title=<%=news.getTitle()%>"><%=news.getTitle()%></a></td> 
		</tr>
	<%} %>
  </table>

    <br>
  	</div>
  </body>
</html>
