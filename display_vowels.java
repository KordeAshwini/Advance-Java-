//write a multithreading program in java to display all the vowels from a given string
import java.util.*;
class MyThread extends Thread
{
    String str;
    MyThread(String str)
	{
        this.str=str;
    }
    public void run()
	{
        for(int i=0;i<str.length();i++)
		{
			//ch=str.charAt(i);
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'||
                 str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U')
                 {
                System.out.println("Vowel is: "+str.charAt(i));
            }
        }
    }
}
public class slip2a
{
    public static void main(String[] args) 
	{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str=sc.nextLine();
        MyThread t=new MyThread(str);
        t.start();
    }
}


