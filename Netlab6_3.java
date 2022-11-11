class Netlab6_3 
{
    public void printCount() 
    {
       try 
       {
          for(int i = 5; i > 0; i--) 
          {
             System.out.println("Counter   ---   "  + i );
          }
       } catch (Exception e) 
       {
          System.out.println("Thread  interrupted.");
       }
    }
}
 
 class ThreadDemo extends Thread 
 {
    private Thread t;
    private String threadName;
    Netlab6_3  PD;
 
    ThreadDemo( String name,  Netlab6_3 pd) 
    {
       threadName = name;
       PD = pd;
    }
    
    public void run() 
    {
       synchronized(PD) 
       {
          PD.printCount();
       }
       System.out.println("Thread " +  threadName + " exiting.");
    }
 
    public void start () 
    {
       System.out.println("Starting " +  threadName );
       if (t == null) 
       {
          t = new Thread (this, threadName);
          t.start ();
       }
    }
 }
 
 class TestThread 
 {
 
    public static void main(String args[]) 
    {
       Netlab6_3 PD = new Netlab6_3();
 
       ThreadDemo T1 = new ThreadDemo( "Thread - 1 ", PD );
       ThreadDemo T2 = new ThreadDemo( "Thread - 2 ", PD );
 
       T1.start();
       T2.start();
 
       
       try 
       {
          T1.join();
          T2.join();
       } 
       catch ( Exception e) 
       {
          System.out.println("Interrupted");
       }
    }
 }