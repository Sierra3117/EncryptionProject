package source;
import java.util.Random;

public class PrimeNumberGenerator {
	
	//private int primeRange;
	/*limit prime range to 50, 
	change later or something idk
	I mean, that is only 15 possible primes*/
	
    boolean isPrime(int n)
    {
        // Corner case
        if (n <= 1)
            return false;

        // Check from 2 to sqrt(n)
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0)
                return false;

        return true;
    }
    
    public  int CreatePri(int primeRange) {
		Random rand = new Random();
    	int n;
		do {
			n = rand.nextInt(primeRange);
			System.out.println(n);
			int num = n;
		}while (isPrime(n)!= true || n == 0);
		System.out.println("Found");
		return n;
    }
}
