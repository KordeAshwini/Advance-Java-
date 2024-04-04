import java.net.*;
class IP
{
    public static void main(String []args) throws UnknownHostException
    {
        InetAddress h=InetAddress.getLocalHost();
        System.out.println(h);
        System.out.println(h.getHostName());
        System.out.println(h.getHostAddress());


    }
}
