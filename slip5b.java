import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class slip5b extends HttpServlet
{
    Connection con;
	Statement st;
	public void init()
	{
		try
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection con = DriverManager.getConnection("jdbc:odbc:mydsn");
		}
		catch(Exception e)
		{}
	}
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
	{
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		try
		{
			st=con.createStatement();
			String sql="Select * from product";
			ResultSet rs = st.executeQuery(sql);
			
			pw.println("<table border=2>");
			pw.println("<th>product code</th>");
			pw.println("<th>product name</th>");
			pw.println("<th>price</th>");
			
			while(rs.next())
			{
				pw.println("<tr>");
				pw.println("<td>"+rs.getInt(1)+"</td>");
				pw.println("<td>"+rs.getString(2)+"</td>");
				pw.println("<td>"+rs.getInt(3)+"</td>");
			}
			pw.println("</table>");
		}
		catch(Exception e)
		{}
	}
}