package source;
import java.util.Random;
import java.lang.Math;


public class Main {
	
	private static int RSAmod;
	private int prime1;
	private int prime2;
	private int EPF;// Euler phi function 
	private int coprimeE;//encryption key
	private double d;//decryption key is a double for some reason
	

	
	public   void KeyGen() {
		PrimeNumberGenerator PriGenerator = new PrimeNumberGenerator();
		KeyGenerator KeyGen = new KeyGenerator();
		prime1 = PriGenerator.CreatePri(50);
		prime2 = PriGenerator.CreatePri(50);
		RSAmod = prime1 * prime2;
		EPF =  (prime1-1)*(prime2-1);	
		coprimeE = KeyGen.generateE(EPF, RSAmod);//PriGenerator.CreatePri(EPF);
		do {
			d = KeyGen.modInverse(coprimeE, EPF);
		}
		while (d == coprimeE);
	}
	

	public void PrintString() {
		System.out.println("First prime is: ");
		System.out.println(prime1);
		System.out.println("Second prime is: ");
		System.out.println(prime2);
		System.out.println("Prime 1 x Prime 2: ");
		System.out.println(RSAmod);
		System.out.println("EPF: ");
		System.out.println(EPF);
		System.out.println(coprimeE);
		System.out.println("D");
		System.out.println(d);
	}
	public static void main(String[] args) {
		Main main = new Main();
		main.KeyGen();
		main.PrintString();
		
        
       //System.out.println(modInverse(A, M));
       // System.out.println(inverseMod(A, M));
		
	}

}
