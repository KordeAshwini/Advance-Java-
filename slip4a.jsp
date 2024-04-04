<html>
<body>
<form action="slip4a.jsp" method = get>
Enter a number:<input type=text name="num">
<input type=submit name="Calculate" value = "Calculate">
</form>
</body>
</html>
<%@ page language = "Java"%>
<%! int temp,n,sum=0,mod=0;%>
<%
  try
  {
	  n=Integer.parseInt(request.getParameter("num"));
	  temp=n;
	  while(temp!=0)
	  {
		  mod=temp%10;
		  sum=sum+(mod*mod*mod);
		  temp=temp/10;
	  }
	  if(sum==n)
	  {
		  out.println("Armstrong number");
		  sum=0;
	  }
	  else
	  {
		  out.println("Not an Armstrong number");
		  sum=0;
	  }
  }
  catch(Exception e)
  {}
%>  
  