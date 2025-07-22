package source;
import java.util.Random;


public class Main {

    static boolean isPrime(int n)
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
    
    
	public static void main(String[] args) {
		Random rand = new Random();
		int n;
		do {
		n = rand.nextInt(50);
		System.out.println(n);
		int num = n;
        if (isPrime(num)) {
            System.out.println(num + " is prime");
        }
        else {
            System.out.println(num + " is not prime");
        }
		}while (isPrime(n)!= true);

	}

}
