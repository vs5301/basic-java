import java.rmi.*;
class MyServer
{
    public static void main(String args[])
    {
        try 
        {
            Adder stub = new AdderRemote();
            Naming.rebind("rmi://localhost5000/sonoo",stub);
        } 
        catch (Exception e) 
        {
            System.out.println(e);
        }
    }
}