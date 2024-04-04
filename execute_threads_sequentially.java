class CallMe
{
    //synchronized void call(String msg)
	void call(String msg)
	{
		System.out.println("["+msg);
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			System.out.println("interrupted");
		}
		System.out.println("]");
	}
}
class Caller implements Runnable
{
	String msg;
	CallMe target;
	Thread t;
	public Caller(CallMe tar , String s)
	{
		target = tar;
		msg = s;
		t = new Thread(this);
		t.start();
	}
	public void run()
	{
		synchronized(target)
		{
			target.call(msg);
		}
	}
}
class slip18a
{
	public static void main(String arg[])
	{
		CallMe target = new CallMe();
		Caller ob1 = new Caller(target,"Hello");
		Caller ob2 = new Caller(target,"Synchronized");
		Caller ob3 = new Caller(target,"World");
	}
}