package source;

public class KeyGenerator {
	//Credit to users/2900738/eric on stack overflow
	public int gcd(int p, int q) {
	    if (q == 0) {
	        return p;
	    }
	    return gcd(q, p % q);
	}
	
	public boolean coprime(int p, int q) {
	    return (gcd(p, q) == 1);
	}
	
	public int modInverse(int A, int M)
    {
		//made my own but it was 16 lines long, this one is better	
		//GeeksforGeeks
        for (int X = 1; X < M; X++)
            if (((A % M) * (X % M)) % M == 1)
                return X;
        return 1;
    }
	
	public int generateE(int EPFentry, int primeMult) {
		PrimeNumberGenerator PriGenerator = new PrimeNumberGenerator();
		System.out.println("E key gen here");
		boolean found = false;
		int e = 0;
		while ((found != true) && (e == 0)) {
			int CoPrime = PriGenerator.CreatePri(EPFentry);
			if ((coprime( CoPrime, primeMult) == true) & (coprime(CoPrime, EPFentry) == true)){
				found = true;
				System.out.println("Found is true");
				e = CoPrime;
			}
		}
		//add fix for when is is still 0
		System.out.println("E key gen done");
		return e;
	}
	
}
