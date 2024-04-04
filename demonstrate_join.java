class NewThread implements Runnable
{
    String name;
	Thread t;
	NewThread(String threadname)
	{
		name = threadname;
		t= new Thread(this,name);
		System.out.println("child thread "+t);
		t.start();
	}
	public void run()
	{
		try
		{
			for(int i=0;i<5;i++)
			{
				System.out.println();
				Thread.sleep(500);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("Thread is interrupted");
		}
		System.out.println(name+" existing");
	}
}
class slip14a
{
	public static void main(String arg[])
	{
		NewThread obj1 = new NewThread("one");
		NewThread obj2 = new NewThread("two");
		NewThread obj3 = new NewThread("three");
		
		System.out.println("thread one is alive "+obj1.t.isAlive());
		System.out.println("thread two is alive "+obj2.t.isAlive());
		System.out.println("thread three is alive "+obj3.t.isAlive());
		
		try
		{
			System.out.println("waiting for threads to finish");
			obj1.t.join();
			obj2.t.join();
			obj3.t.join();
			
			try
			{
				for(int i=0;i<5;i++)
			    {
					System.out.println("main thread "+i);
					Thread.sleep(1000);
			   }
			}
			catch(InterruptedException e)
			{
				System.out.println("Thread is interrupted");
			}
		}
		catch(Exception e)
		{}
		System.out.println("thread one is alive "+obj1.t.isAlive());
		System.out.println("thread two is alive "+obj2.t.isAlive());
		System.out.println("thread three is alive "+obj3.t.isAlive());
		
		System.out.println("main thread existing");
	}
}