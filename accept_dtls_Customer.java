import java.sql.*;
import java.util.*;

public class slip4b
{
    public static void main(String args[])
    {
        Connection con=null;
        PreparedStatement pst=null;
        int i;
        try {
            
                Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                con=DriverManager.getConnection("jdbc:odbc:mydsn");
                pst=con.prepareStatement("insert into customer values(?,?,?,?)");
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter the number of records : ");
                //int sobj=sc.nextInt();
                i=0;
                for(int j=1;j<=2;j++)
                {
                    System.out.println("Enter the customer id : ");
                    int cid=Integer.parseInt(sc.nextLine());
                    System.out.println("Enter the customer name");
                    String cname=sc.nextLine();
                    System.out.println("Enter the customer address");
                    String addr=sc.nextLine();
                    System.out.println("Enter the customer phone number");
                    double phno=Double.parseDouble(sc.nextLine());
                    pst.setInt(1,cid);
                    pst.setString(2,cname);
                    pst.setString(3,addr);
                    pst.setDouble(4,phno);
                    i=pst.executeUpdate();
                    System.out.println(" " +i);
                }
                con.close();

            }
         
        catch (Exception e) 
        {

           e.printStackTrace();
        }
    }
}   
