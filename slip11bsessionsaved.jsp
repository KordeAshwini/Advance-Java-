<%@ page language = "java"%>
<%!String pwd="admin";%>
<%
String username = (String)session.getAttribute("username");
if(username==null)username="";
%>
<html>
<head>
<title>show saved name</title>
</head>
<body>
<%
   if(username.equals(pwd))
   out.print("Welcome "+username);
   else
   out.print("wrong pwd");
%>
</body>
</html>   
