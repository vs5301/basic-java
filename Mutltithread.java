import java.util.*;  
class ThreadA extends Thread 
{  
    public void run() 
    {
        try (Scanner sc = new Scanner(System.in)) {
			try 
			{ 
			    this.setName("Thread-A"); 
			    System.out.println(this.getName()+" Enter the value of a:");  
			    int a=sc.nextInt(); 
			    System.out.println(this.getName()+" Enter the value of b:");  
			    int b=sc.nextInt(); 
			    System.out.println("The of the thread "+this.getName()+" are for the values  a:"+a+" b:"+b); 
			    System.out.println(this.getName()+" (a+b):"+(a+b)); 
			    System.out.println(this.getName()+" (a-b):"+(a-b)); 
			    System.out.println(this.getName()+" (a*b):"+(a*b)); 
			    System.out.println(this.getName()+" (a/b):"+(a/b)); 
			    System.out.println(this.getName()+" (a^b):"+(Math.pow(a,b))); 
			} 
			catch (Exception e) 
			{ 
			    System.out.println(" Exception is caught"); 
			}
		} 
    } 
} 
class ThreadB extends Thread 
{  
    public void run() 
    {
        try (Scanner sc = new Scanner(System.in)) {
			try 
			{ 
			    this.setName("Thread-B"); 
			    System.out.println(this.getName()+" Enter the value of a:");  
			    int a=sc.nextInt(); 
			    System.out.println("The of the thread "+this.getName()+" are for the values  a:"+a); 
			    System.out.println(this.getName()+" Sin(a):"+Math.sin(a)); 
			    System.out.println(this.getName()+" cos(a):"+Math.cos(a)); 
			    System.out.println(this.getName()+" tan(a):"+Math.tan(a)); 
			    System.out.println(this.getName()+" sqrt(a):"+Math.sqrt(a)); 
			} 
			catch (Exception e) 
			{ 
			    System.out.println("Exception"); 
			}
		}    
    } 
} 
class Main 
{  
    public static void main(String[] args) 
    { 
        Thread A=new ThreadA(); 
        Thread B=new ThreadB(); 
        A.start(); 
        B.start(); 
    } 
} 
   