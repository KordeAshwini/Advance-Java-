//10b slip java  server side 
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class server1 
{
    private static Socket socket ;
    public static void main (String [] args)
    {
      try {
            int port=25000;
            ServerSocket serverSocket=new ServerSocket(port);
            System.out.println("server started and listening to the port !");
            while (true)
            {
                socket=serverSocket.accept();
                BufferedReader br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
                String number=br.readLine();
                System.out.println("Message recieved formthe client is"+number);

                // calculating factorial 

                String returnMessage;
                try 
                {
                    int numberInIntFormat=Integer.parseInt(number);
                    int returnValue=1;
                    for(int i=numberInIntFormat;i>=1;i--)
                    returnValue=returnValue*i;
                    returnMessage= String.valueOf(returnValue)+"\n";

                }
                catch(NumberFormatException e)
                {
                    returnMessage="Please send a proper number\n";
                }
                OutputStream os=socket.getOutputStream();
                OutputStreamWriter osw= new OutputStreamWriter(os);
                BufferedWriter bw=new BufferedWriter(osw);
                bw.write(returnMessage);
                System.out.println("Factorial sent to client is" +returnMessage);
                bw.flush();

            }
      }
      catch(Exception e)
      {
        e.printStackTrace();
      }
      finally{
        try
        {
            socket.close();
        }
        catch(Exception e){}
      }
    }
}