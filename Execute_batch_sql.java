import java.sql.*;
import java.net.*;

class slip14b
{
     static Connection cn;
	 static Statement stmt;
	 
	 public static void main(String arg[])
     {
		 try
		 {
			  Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
              cn = DriverManager.getConnection("jdbc:odbc:mydsn");
			  
			  stmt = cn.createStatement();
			  stmt.addBatch("create table test1(roll_no number,name text(10))");
			  stmt.addBatch("insert into emp values(12,'Renu','Mktg',30000)");
			  stmt.addBatch("update emp set emp_name = 'Mayur' where empno=4");
			  stmt.addBatch("insert into emp values(15,'Tanuja','HR',30000)");
			  stmt.addBatch("insert into emp values(3,'Anuja','HR',30000)");
			 
			  
			  System.out.println("Table updated");
			  
			  int []result = stmt.executeBatch();
			  
			  for(int i= 0;i<result.length;i++)
			  {
				  System.out.println(result[i]);
			  }
			  stmt.close();
			  cn.close();
		 }
		 catch(BatchUpdateException e)
		 {
			 int []count = e.getUpdateCounts();
			 for(int i =0;i < count.length;i++)
			 {
				 System.out.println(count[i]); 
			 }
		 }
		 catch(Exception e)
		 {
			 System.out.println("error"); 
		 }
	 }
}