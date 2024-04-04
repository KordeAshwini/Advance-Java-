import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class slip7b extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
	{
		PrintWriter out = res.getWriter();
		res.setContentType("text/html");
		
		try
		{
			String s = req.getParameter("marks");
			int m = Integer.parseInt(s);
			
			out.println("<html><body><h1>");
			out.println(m);
			
			if(m >= 70)
				out.println("Distinction");
			else if(m >= 60 && m < 70)
				out.println("First Class");
			else if(m >= 50 && m < 60)
				out.println("Second Class");
			else
				out.println("Fail");
			out.println("</html></body></h1>");			
		}
		catch(Exception e)
		{
			out.println(e);
		}
	}
	public void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
	{
		doGet(req,res);
	}
}