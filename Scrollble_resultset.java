import java.io.*;
import java.util.*;
import java.lang.*;
import java.sql.*;

public class slip5a
{
    public static void main(String[] args) throws SQLException, ClassNotFoundException
    {
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        Connection con = DriverManager.getConnection("jdbc:odbc:mydsn");
        Scanner sr=new Scanner(System.in);
        String sql="Select * from emp";
        Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
        ResultSet rs = st.executeQuery(sql);
        while(true)
        {
            System.out.println("menu");
            System.out.println("1. move first");
            System.out.println("2. move last");
            System.out.println("3. move next");
            System.out.println("4. move previous");
            System.out.println("0. exit");
            System.out.println("enter your choice");
            int ch=sr.nextInt();

            if(ch==0)
            {
                con.close();
                break;

            }
            else if(ch==1)
            {
                if(!rs.isFirst())
                {
                    rs.first();
                    int id=rs.getInt(1);
                    String name=rs.getString(2);
                    double sal=rs.getDouble(4);
                    System.out.println(id+" "+name+" "+sal);
                }
            }
			else if(ch==2)
			{
				if(!rs.isLast())
				{
				
					rs.last();
					int id=rs.getInt(1);
					String name=rs.getString(2);
					double sal=rs.getDouble(4);
					System.out.println(id+" "+name+" "+sal);
				}
				
			}
			else if(ch==3)
			{
				if(rs.isLast())
				System.out.println("already at last record");
				else
				{
					rs.next();
					int id=rs.getInt(1);
					String name=rs.getString(2);
					double sal=rs.getDouble(4);
					System.out.println(id+" "+name+" "+sal);
				}
			}
			else if(ch==4)
			{
				if(rs.isFirst())
				System.out.println("already at first record");
				else
				{
					rs.previous();
					int id=rs.getInt(1);
					String name=rs.getString(2);
					double sal=rs.getDouble(4);
					System.out.println(id+" "+name+" "+sal);
				}
			}
			else
				System.out.println("invalid choice");                 		
        }
    }
}