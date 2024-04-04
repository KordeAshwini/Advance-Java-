import java.sql.*;
public class Slip3b
{
    public static void main(String[] args)throws Exception
    {
        try
        {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection con=DriverManager.getConnection("jdbc:odbc:mydsn");

            System.out.println("Connection done");
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("Select * from employee where designation='Comp Sc'");
             while(rs.next())
             {
                int id=rs.getInt(1);
                String name=rs.getString(2);
                String dept=rs.getString(3);
                int sa=rs.getInt(4);
                System.out.println(id+" "+name+" "+dept+" "+sa);

             }
             rs.close();
             con.close();
        }
        catch(ClassNotFoundException s)
        {
            s.printStackTrace();

        }
        catch(SQLException s)
        {
            s.printStackTrace();
        }
    }
}