import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class slip12b extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
	{
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		Cookie c[] = req.getCookies();
		
		if(c==null)
		{
			Cookie c1 = new Cookie("count","1");
			res.addCookie(c1);
			pw.println("Welcome");
		}
		else
		{
			int val = Integer.parseInt(c[0].getValue())+1;
			c[0].setValue(Integer.toString(val));
			res.addCookie(c[0]);
			pw.print("Hit Count : "+val);
		}
	}
}