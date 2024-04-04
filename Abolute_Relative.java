import java.util.*;
import java.lang.*;
import java.sql.*;

public class slip16a
{
    public static void main(String[] args) throws SQLException, ClassNotFoundException
    {
		try
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection con = DriverManager.getConnection("jdbc:odbc:mydsn");
			System.out.println("conn done");
			Scanner sr=new Scanner(System.in);
			String sql="Select * from emp";
			Statement st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			
			ResultSet rs = st.executeQuery(sql);
			rs.absolute(3);
			int id = rs.getInt(1);
			String name = rs.getString(2);
			double sal = rs.getDouble(4);
			System.out.println(id+" "+name+" "+sal);
			
			System.out.println("position of the pointer after moving it to 2 places forward relatively :  "+rs.relative(2));
			
			System.out.println(rs.getRow());
			id=rs.getInt(1);
			name=rs.getString(2);
			sal=rs.getDouble(4);
			System.out.println(id+" "+name+" "+sal);
			
			System.out.println("position of the pointer after moving it to 3 places backward relatively :  "+rs.relative(-3));
			
			System.out.println(rs.getRow());
			id=rs.getInt(1);
			name=rs.getString(2);
			sal=rs.getDouble(4);
			System.out.println(id+" "+name+" "+sal);
				
			rs.close();
			con.close();		
        }   
		catch(Exception e)
		{}
		
	}	
}