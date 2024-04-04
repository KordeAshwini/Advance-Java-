import java.sql.*;
import java.awt.*;

public class slip15a
{
	public static void main(String arg[])
	{
		try
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection con=DriverManager.getConnection("jdbc:odbc:mydsn");
			
			Statement st=con.createStatement();
			System.out.println("Conn done");
			
			ResultSet rs=st.executeQuery("select * from Employee");
			
			while(rs.next())
			{
				System.out.print(rs.getInt(1)+" ");
				System.out.print(rs.getString(2)+" ");
				System.out.print(rs.getString(3)+" ");
				System.out.println(rs.getInt(4)+" ");
				
			}
			rs.close();
			con.close();
		}
		catch(Exception e)
		{}
	}
}
