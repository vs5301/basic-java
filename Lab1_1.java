import java.util.Scanner;
class Fibonacci 
{
  
    public static void main(String args[]) 
    {
     
         int n, first = 0,next = 1,avg = 0;
         boolean flag = false;
          
            System.out.println("Enter how may fibonnaci numbers to print");
            try (Scanner scanner = new Scanner(System.in)) {
				n = scanner.nextInt();
			}
            System.out.print("The first " + n + " Fibonacci numbers are: ");
            System.out.print(first + " " + next);
            for (int i = 1; i<=n-2; ++i)
            {
                int sum = first + next;
                first = next;
                next = sum;
                avg = avg + sum;
                System.out.print(" " + sum);
            }
            System.out.println("" + avg);
            for (int i = 2; i <= avg / 2; ++i) 
            {
                // condition for nonprime number
                if (avg % i == 0) 
                {
                  flag = true;
                  break;
                }
            }
            if (!flag)
                System.out.println(avg + " is a prime number.");
            else
                System.out.println(avg + " is not a prime number.");
    }
  
}