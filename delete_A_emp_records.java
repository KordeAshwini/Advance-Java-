import java.sql.*;

public class slip2b
{
	public static void main(String arg[])
	{
		try
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection con=DriverManager.getConnection("jdbc:odbc:mydsn");
			
			System.out.println("Conn done");
			Statement st=con.createStatement();
			int i=st.executeUpdate("delete from Employee where emp_name like 'A%'");
			
			System.out.println("record deleted : ");
			System.out.println(i);
			
			ResultSet rs=st.executeQuery("select * from Employee");
			
			while(rs.next())
			{
				System.out.println(""+rs.getInt(1));
				System.out.println(""+rs.getString(2));
				System.out.println(""+rs.getString(3));
				System.out.println(""+rs.getInt(4));
				
			}
			rs.close();
			con.close();
		}
		catch(Exception e)
		{}
	}
}
