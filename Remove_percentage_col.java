import java.sql.*;

public class slip16b
{
	public static void main(String arg[])
	{
		try
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection con=DriverManager.getConnection("jdbc:odbc:mydsn");
			
			Statement st=con.createStatement();
			System.out.println("Conn done");
			
			st.executeUpdate("alter table student drop percentage");
			System.out.println("percentage column deleted");
		
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
