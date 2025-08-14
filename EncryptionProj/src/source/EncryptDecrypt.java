package source;
import java.math.*;

public class EncryptDecrypt {
	
	public double Encrypt(int E, int n, int UnEncryptedVal) {
		double EncryptedVal;
		EncryptedVal = (Math.pow(UnEncryptedVal, E) % n);
		return(EncryptedVal);
	}
	
	public double Dencrypt(int D, int n, int EncryptedVal) {
		double DecryptedVal;
		DecryptedVal = (Math.pow(EncryptedVal, D) % n);
		return(DecryptedVal);
	}

}
