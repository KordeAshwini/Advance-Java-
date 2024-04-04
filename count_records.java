import java.sql.*;

public class slip20a
{
	public static void main(String arg[])
	{
		try
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection con=DriverManager.getConnection("jdbc:odbc:mydsn");
			
			Statement st=con.createStatement();
			System.out.println("Conn done");
			
			ResultSet rs = st.executeQuery("select * from emp");
			
			int n =0;
			while(rs.next())
			{
				n++;
			}
			System.out.println("Total record : "+n);
		
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
