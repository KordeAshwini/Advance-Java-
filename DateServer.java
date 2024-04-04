/* q19a*/

import java.io.*;
import java.net.*;
import java.util.*;

class DateServer
{
    public static void main(String args[]) throws Exception{
        ServerSocket s=new ServerSocket(1000);
        while(true)
        {
            System.out.println("Waiting for connection...");
            Socket soc=s.accept();
           System.out.println("Conn done..");
            DataOutputStream out=new DataOutputStream(soc.getOutputStream());
            out.writeBytes("ServerDate"+(new Date()).toString()+"\n");

            out.close();
            soc.close();
        }
    }
}
