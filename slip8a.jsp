<html>
<body>
<form method = get action="http://localhost:9090/slip8a.jsp">
Enter any number:<input type=text name="num"><br><br>
<input type=submit name="Calculate" value = "Calculate">
</form>
<%@ page language = "Java"%>
<%@ page  import = "java.lang.*"%>
<%@ page  import = "java.util.*"%>
<font color="red" size=18>
<%! int n=0,rem=0,r=0;%>
<%
  
	 try{
		 n=Integer.parseInt(request.getParameter("num"));
		 if(n<10)
		 {
			 out.println("Sum of first and last digit is : "+n);
		 }
		 else
		 {
			 rem=n%10;
			 do{
				 r=n%10;
				 n=n/10;
			 }while(n>0)
			 n=rem+r;
		     out.println("Sum of first and last digit is : "+n);
		 }
			 
	 }
	 catch(Exception e)
	 {}
%>	  
</font>
</body>
</html>	  