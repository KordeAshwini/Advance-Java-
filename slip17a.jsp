<form method=post action = http://localhost:9090/slip17a.jsp>
Enter your Age:<Input type = text name="age">
<input type = submit name="submit">
</form>
<%@ page language="java"%>
<%@ page import="java.lang.*"%>
<%@ page import="java.util.*"%>
<%! int i=0;%>
<%
   try
   {
	   i=Integer.parseInt(request.getParameter("age"));
	   if(i>=18)
		   out.println("you are eligible to vote");
	   else
		   out.println("you are not eligible to vote");
   }
   catch(Exception e)
   {}   
%>






