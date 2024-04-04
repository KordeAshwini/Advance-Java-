//client 


import java.util.Scanner;
import java.io.*;
import java.net.*;
public class client1
{
    private static Socket socket;
    public static void main (String args[])
    {
        try{
            String host="localhost";
            int port=25000;
            InetAddress address=InetAddress.getByName(host);
            socket=new Socket(address,port);

            //send message to the server 

            BufferedWriter bw=new BufferedWriter (new OutputStreamWriter(socket.getOutputStream()));

            Scanner sc=new Scanner(System.in);
            System.out.println("enter a num");
            int number=sc.nextInt();

            String sendMessage=number+"\n";

            bw.write(sendMessage);
            bw.flush();
            System.out.println("message sent to the server :"+sendMessage);
            InputStream is=socket.getInputStream();
            InputStreamReader isr=new InputStreamReader(is);
            BufferedReader br=new BufferedReader(isr);
            String message=br.readLine();
           System.out.println("factorial recieved from server :"+message);




        }
        catch (Exception exception)
        {
            exception.printStackTrace();
        }
        finally
        {
            try{
                socket.close();
            }
            catch (Exception e)
            {
                e.printStackTrace();

            }
        }
    }
}