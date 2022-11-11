import java.io.*;    
import java.net.*;    
class URLExample 
{    
    public static void main(String[] args)
    {    
        try
        {    
            URL url=new URL("https://en.wikipedia.org/wiki/Computer_network_programming");    
            URLConnection urlcon=url.openConnection();    
            InputStream stream=urlcon.getInputStream();    
            int i;    
            while((i=stream.read())!=-1)
            {    
                System.out.print((char)i);    
            }
        }    
        catch(IOException e)
        {
            System.out.println(e);}    
    }   
}
       