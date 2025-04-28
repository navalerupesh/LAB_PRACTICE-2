
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

public class AES {

    public static String encrypt(String plainText, String secretKey) throws Exception {
      
        SecretKeySpec key = new SecretKeySpec(secretKey.getBytes(), "AES");
        
    
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, key);
        
     
        byte[] encryptedBytes = cipher.doFinal(plainText.getBytes());
        
       
        return Base64.getEncoder().encodeToString(encryptedBytes);
    }

    
    public static String decrypt(String encryptedText, String secretKey) throws Exception {
       
        SecretKeySpec key = new SecretKeySpec(secretKey.getBytes(), "AES");
        
     
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.DECRYPT_MODE, key);
        
      
        byte[] decodedBytes = Base64.getDecoder().decode(encryptedText);
        
       
        byte[] decryptedBytes = cipher.doFinal(decodedBytes);
        
       
        return new String(decryptedBytes);
    }

    public static void main(String[] args) {
        try {
         
            String secretKey = "1234567890123456";  

          
            String plainText = "Hello, this is a test message!";
            System.out.println("Original Text: " + plainText);
            
            
            String encryptedText = encrypt(plainText, secretKey);
            System.out.println("Encrypted Text (Base64): " + encryptedText);
            
      
            String decryptedText = decrypt(encryptedText, secretKey);
            System.out.println("Decrypted Text: " + decryptedText);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
