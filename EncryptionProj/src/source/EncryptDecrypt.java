package source;
import java.math.*;
public class EncryptDecrypt {
	
	
	//THIS IS WRONG AND OR DOESN'T WORK, VALUES CREATED WORK FOR ENCRYPTION 
	//data type is too small
	public BigInteger Encrypt(int E, int n, int UnEncryptedVal) {
		BigInteger Temp1;
		BigInteger PrimesProduct = BigInteger.valueOf(n);
		Temp1 = BigInteger.valueOf((long) UnEncryptedVal)
				.pow(E)
				.mod(PrimesProduct);
	
		return(Temp1);
	}
	
	public BigInteger Decrypt(int d, int n, BigInteger encrypted) {
		BigInteger Temp1;
		BigInteger PrimesProduct = BigInteger.valueOf(n);
		Temp1 = encrypted
				.pow(d)
				.mod(PrimesProduct);

		return(Temp1);
	}

}
