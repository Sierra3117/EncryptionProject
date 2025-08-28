package source;
import java.util.Random;
import java.lang.Math;
import java.math.BigInteger;


public class Main {
	
	private static int RSAmod;
	private int prime1;
	private int prime2;
	private int EPF;// Euler phi function 
	private static int coprimeE;//encryption key
	private static int d;//decryption key is a double for some reason
	

	
	public   void KeyGen() {
		PrimeNumberGenerator PriGenerator = new PrimeNumberGenerator();
		KeyGenerator KeyGen = new KeyGenerator();
		prime1 = PriGenerator.CreatePri(25);
		prime2 = PriGenerator.CreatePri(25);
		RSAmod = prime1 * prime2;
		EPF =  (prime1-1)*(prime2-1);	
		coprimeE = KeyGen.generateE(EPF, RSAmod);//PriGenerator.CreatePri(EPF);
		d = KeyGen.modInverse(coprimeE, EPF);

	}

	public void checkKeyGen() {
		Main main = new Main();
		main.KeyGen();
		if (d == coprimeE && d == 1 && d == 0) {
			main.KeyGen();
		}
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
		System.out.println("E: ");
		System.out.println(coprimeE);
		System.out.println("D: ");
		System.out.println(d);
	}
	
	//Add garbage collection
	
	public static void main(String[] args) {
		Main main = new Main();
		main.checkKeyGen();
		System.gc();
		main.PrintString();
		BigInteger encrypted;
		EncryptDecrypt Call = new EncryptDecrypt();
		System.out.println("Encrypted val: ");
		encrypted = Call.Encrypt(coprimeE, RSAmod, 5);
		System.out.println(encrypted);
        System.out.println("Decrypted: ");
        System.out.println(Call.Decrypt(d, RSAmod, encrypted));

       //System.out.println(modInverse(A, M));
       // System.out.println(inverseMod(A, M));
		
	}

}
