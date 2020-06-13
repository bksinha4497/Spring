<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Yahoooo!!! from JSP </title>
</head>
<body>
<%-- <H1> My First Servlet  ${name} and Password is ${password}</H1>
<%
System.out.print(request.getParameter("name"));
Date date=  new Date();
%>
<H1> Current date is  : <%=date %></H1>
 --%>
<form action="/tm-first-webapp" method="post">
Name : <input type="text" name="name" placeholder="Name"/>
pawword : <input type="password" name="password" placeholder="*******"/>
<input type="submit" value="Login">
</form>
</body>
</html>