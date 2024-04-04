//write multithreading program in java which will generate the threads to display 10 terms of fibonacci series and to display 1 to 10 in reverse order
import java.util.*;
class Fibonacci extends Thread
{
    public void run()
    {
		try
		{
			int a=0,b=1,c=0;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the limit for fibonacci : ");
			int n = sc.nextInt();
			
			System.out.println("Fibonacci Series:");
			
			for(int i = 0;i < n;i++)
			{
				System.out.print(c+" ");
				a=b;
				b=c;
				c=a+b;
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
    }
}
class Reverse extends Thread
{
    public void run()
    {
		try
		{
			System.out.println("Reverse Order:");
			for(int i = 10;i >= 1;i--)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
    }
}
public class Slip13a
{
    public static void main(String[] args)
	{
		try
		{
			Fibonacci obj1=new Fibonacci();
			obj1.start();
			//obj1.sleep(500);
			Reverse obj2=new Reverse();
			obj2.start();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
    }
}