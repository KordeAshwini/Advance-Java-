<%@ page language = "Java"%>
<%! int n=0,i=0,flag=0;%>
<%
   if(request.getParameter("t1")!=null)
   {
	   String s1=request.getParameter("t1");
	   for(i=0;i<s1.length();i++)
       {
		   if(s1.charAt(i)=='@')
		   {
			   flag=1;
		   }
	   }
	   if(flag==1)
	   {
		   out.println("Valid Email ID");
	   }
	   else
	   {
		    out.println("Invalid Email ID");
	   }
   } 
   else 
   {%>  
	<html>
	<body>
	<form action="http://localhost:9090/slip10a.jsp">
	Enter Email ID:<input type=text name="t1"><br><br>
	<input type=submit>
	</form>
	</body>
	</html>
   <%}%>