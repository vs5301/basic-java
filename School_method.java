import java.util.Scanner;
class school_method 
{

	static boolean isPrime(int n)
	{
		if (n <= 1)
			return false;
		for (int i = 2; i < n; i++)
			if (n % i == 0)
				return false;

		return true;
	}

	public static void main(String args[])
	{
        try (Scanner sc = new Scanner(System.in)) 
        {
            System.out.println("Input first value");
            int n1 = sc.nextInt();
            System.out.println("Input Second value");
            int n2 = sc.nextInt();
            if (isPrime(n1))
            	System.out.println(" true");
            else
            	System.out.println(" false");
            if (isPrime(n2))
            	System.out.println(" true");
            else
            	System.out.println(" false");
        }
	}
}