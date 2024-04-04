<%@ page language = "Java" import = "java.util.*"%>

<html>
<body>
<form method = post>
Enter your name:<input type=text name="t1" value=" ">
<input type=submit value = "Click" name="b1">
<%
  
	  String val=request.getParameter("t1");
	  
	  if(val != null)
	  {
		  Date currDate=new Date();
		  out.println("<br>Today's Date : "+currDate);
		  int hrs = currDate.getHours();
		  
		  if(hrs < 12)
		  {
			  out.println("<br>Good Morning!! "+val);
		  }
		  else if(hrs >= 12 && hrs <= 16)
		  {
			  out.println("<br>Good Afternoon!! "+val);
		  }
		  else if(hrs >= 17 && hrs <= 20)
		  {
			  out.println("<br>Good Evening!! "+val);
		  }
		  else if(hrs >= 20)
		  {
			  out.println("<br>Good Night!! "+val);
		  }
	  }
%>	  
</form>
</body>
</html>	  