//write multithreading program in java using runnable interface to blink text on the frame
import java.awt.*;  
import java.awt.event.*;

class MyThread extends Frame implements Runnable
{
    Label l;
	Thread t;
	int f;
	
    MyThread()
	{
		t=new Thread(this);
		t.start();
		setLayout(null);
       
        l=new Label("Blinking Text");
        l.setBounds(100,100,100,100);
        add(l);
        setSize(400,400);
        setVisible(true);
		
       addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});
		f=0;
    }
    public void run()
	{
		while(true)
		{
            try
			{
                Thread.sleep(1000);
                l.setVisible(false);
                Thread.sleep(1000);
                l.setVisible(true);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
		
    }
}
public class slip11a{
    public static void main(String[] args) {
        MyThread t=new MyThread();
        Thread t1=new Thread(t);
        t1.start();
    }
}

