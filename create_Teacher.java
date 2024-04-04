import java.io.*; 
import java.sql.*; 

public class create_Teacher
{
	static Connection cn;
	static Statement st; 
	public static void main (String args[]) 
    {
	   try 
	   {
		int tno, sal; 
		String tname, desg; 
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver"); 
		cn = DriverManager.getConnection ("jdbc:odbc:mydsn"); 
		st=cn.createStatement();
		
		String str="create table Teacher(TNo number,TName varchar(20), Sal number, Desg varchar(20))"; 
		int i=st.executeUpdate(str);		
		System.out.println("Table Created"+i);
		
		System.out.println("Enter Tno");
		tno=Integer.parseInt(br.readLine());
		System.out.println("Enter Tname"); 
		tname=br.readLine(); 
		System.out.println("Enter Sal"); 
		sal=Integer.parseInt(br.readLine()); 
		System.out.println ("Enter Desg"); 
		desg=br.readLine(); 
		int j=st.executeUpdate("insert into Teacher values ("+tno+", '"+tname+"', "+sal+",'"+desg+"')");
		System.out.println ("Record added successfully " + i); 
		cn.close();
	  }
	 catch(Exception e) 
	 {
	   System.out.println(e); 
	 }
   }
}   