import java.util.Scanner;
class fermat_theorem{

	static int power(int a,int n, int p)
	{
		int res = 1;
		a = a % p;
		while (n > 0)
		{
			if ((n & 1) == 1)
				res = (res * a) % p;
			n = n >> 1; 
			a = (a * a) % p;
		}
		return res;
	}

	static boolean isPrime(int n, int k)
	{
	    if (n <= 1 || n == 4) 
            return false;
	    if (n <= 3) 
            return true;
	    while (k > 0)
	    {
		    int a = 2 + (int)(Math.random() % (n - 4));
		    if (power(a, n - 1, n) != 1)
			    return false;	
		    k--;
		}
	
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
			int k = 3;
			if(isPrime(n1, k))
				System.out.println(" true");
			else
				System.out.println(" false");
			if(isPrime(n2, k))
				System.out.println(" true");
			else
				System.out.println(" false");
		}
			
	}
}