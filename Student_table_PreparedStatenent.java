import java.sql.*;
import java.io.*;
public class slip18b
{
    static Connection cn;
    static Statement st;
    static PreparedStatement ps;
    static ResultSet rs;
    public static void main(String args[])
    {
        try{
            int rno;
            String name;
            double per;
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            cn=DriverManager.getConnection("jdbc:odbc:mydsn");
            String str="create table student(rno number,sname varchar(20),per number)";
            ps=cn.prepareStatement(str);
            ps.executeUpdate();
            System.out.println("Table created");

            System.out.println("how many records you want to insert");
            int n=Integer.parseInt(br.readLine());
            System.out.println("Enter the records");
            for(int i=0;i<n;i++)
            {
                System.out.println("Enter the rno");
                rno=Integer.parseInt(br.readLine());
                System.out.println("Enter the name");
                name=br.readLine();
                System.out.println("Enter the per");
                per=Double.parseDouble(br.readLine());
                ps =cn.prepareStatement("insert into student values(?,?,?)");
                ps.setInt(1,rno);
                ps.setString(2,name);
                ps.setDouble(3,per);
                ps.executeUpdate();
            }
            System.out.println("All ercords inserted\n");
            st=cn.createStatement();
            rs=st.executeQuery("select * from student");
            System.out.println("Rno\tName\tPer");
            while(rs.next())
            {
                System.out.println(rs.getInt("rno")+"\t"+ rs.getString("sname")+"\t"+rs.getDouble("per"));
            }
            cn.close();

        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}