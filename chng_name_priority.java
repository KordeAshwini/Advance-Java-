//write a java program which will display name and priority of current thread.change name to MyThread and set priority to 2.

public class slip6a 
{
    public static void main(String[] args) 
	{
        Thread t =Thread.currentThread();
        System.out.println("Current Thread "+t);
	    System.out.println(t.getName());
		t.setPriority(2);
		t.setName("My Thread");
		System.out.println("Thread with new name and priority "+t);
    }
}