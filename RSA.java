
import java.math.BigInteger; 
import java.security.SecureRandom; 
import java.util.Scanner; 
public class RSA {
    private BigInteger n, d, e; 
    private int bitLength = 1024;
    private SecureRandom random = new SecureRandom(); 
    public RSA() {
        BigInteger p = BigInteger.probablePrime(bitLength / 2, random);
        BigInteger q = BigInteger.probablePrime(bitLength / 2, random);
        n = p.multiply(q);
        BigInteger phi = (p.subtract(BigInteger.ONE)).multiply(q.subtract(BigInteger.ONE));

        e = new BigInteger("65537");

        d = e.modInverse(phi);
    }


    public BigInteger encrypt(BigInteger message) {
        return message.modPow(e, n);
    }

    
    public BigInteger decrypt(BigInteger ciphertext) {
        return ciphertext.modPow(d, n);
    }

    public BigInteger getN() {
        return n;
    }

 
    public BigInteger getE() {
        return e;
    }

    public static void main(String[] args) {
        RSA rsa = new RSA(); 
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Public Key (n, e): (" + rsa.getN() + ", " + rsa.getE() + ")");
        System.out.print("Enter a message (as an integer): ");
        BigInteger message = scanner.nextBigInteger(); 

        
        BigInteger encrypted = rsa.encrypt(message);
        System.out.println("Encrypted message: " + encrypted);

       
        BigInteger decrypted = rsa.decrypt(encrypted);
        System.out.println("Decrypted message: " + decrypted);

        scanner.close(); 
    }
}





















