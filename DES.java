import javax.crypto.Cipher; 
import javax.crypto.KeyGenerator; 
import javax.crypto.SecretKey; 
import javax.crypto.spec.SecretKeySpec; 
import java.util.Base64; 
public class DES{
public static String encrypt(String message,String key) throws Exception {
SecretKeySpec secretKey = new SecretKeySpec(key.getBytes(),"DES");
Cipher cipher = Cipher.getInstance("DES/ECB/PKCS5Padding");
cipher.init(Cipher.ENCRYPT_MODE,secretKey);
byte[] encryptedBytes = cipher.doFinal(message.getBytes());
return Base64.getEncoder().encodeToString(encryptedBytes);
}
public static String decrypt(String encryptedMessage, String key) throws Exception {
SecretKeySpec secretKey = new SecretKeySpec(key.getBytes(),"DES");
Cipher cipher = Cipher.getInstance("DES/ECB/PKCS5Padding");
cipher.init(Cipher.DECRYPT_MODE, secretKey);
byte[] decodedBytes = Base64.getDecoder().decode(encryptedMessage);
byte[] decryptedBytes = cipher.doFinal(decodedBytes);
return new String(decryptedBytes);
}
public static void main(String[] args) {
try {
String message = "Hello,World!";
String key = "12345678"; 
String encryptedMessage = encrypt(message, key);
System.out.println("Encrypted Message: " + encryptedMessage);
String decryptedMessage = decrypt(encryptedMessage, key);
System.out.println("Decrypted Message: " + decryptedMessage);
} catch (Exception e) 
{
e.printStackTrace(); 
}
}
} 
