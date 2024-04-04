//write a multithreading java program to display hello java n times on the screen using runnable interface.
 import java.util.*;
 class MyThread implements Runnable{
    Thread t1;
	int n;
    MyThread(String s,int a)
	{
        t1 = new Thread(this,s);
		n=a;
		System.out.println(t1.getName());
		t1.start();
    }
     public void run()
	 {
		 try
		 {
			 for(int i=1;i <= n;i++)
			 {
				 System.out.println("Hello Java");
				 t1.sleep(500);
			 }
		 }
		 catch(InterruptedException e)
		 {}
     }
 }
 public class slip3a
 {
     public static void main(String[] args) 
	 {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of times you want to print Hello Java: ");
        int n=sc.nextInt();
         MyThread t=new MyThread("Java Thread",n);
     }
 }
