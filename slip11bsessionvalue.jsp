<%@ page language="java"%>
<%
   String username=request.getParameter("username");
   if(username==null)username="";
   session.setAttribute("username",username);
%>
<html>
<head><title>Name saved</title>
</head>
<body>
<p><a href="slip11bsessionsaved.jsp">
<%=username%>-next page to view the session value</a></p>
</body>
</html>