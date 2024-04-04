import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*<applet code = "slip1b" width = 500 height = 500>
</applet>*/

public class slip1b extends Applet implements Runnable,ActionListener
{
	Thread t;
	TextField txt1;
	Button btnstart;
	
	public void init()
	{
		txt1 = new TextField(20);
		btnstart = new Button("Start");
		btnstart.addActionListener(this);
		add(txt1);
		add(btnstart);
	}
	
	public void run()
	{
		for(int i = 1;i < 101;i++)
		{
			txt1.setText(" "+i);
			
			try
			{
				Thread.sleep(500);
			}
			catch(InterruptedException ie)
			{
				ie.printStackTrace();
			}
		}
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==btnstart)
		{
			t=new Thread(this);
			t.start();
		}
	}
	
}