import java.util.Scanner;
public class trans {
public static String encrypt(String text, int key) {
char[][] grid = new char[key][(int) Math.ceil((double) text.length() / key)];
int index = 0;
for (int i = 0; i < key; i++) {
for (int j = 0; j < grid[i].length; j++) {
if (index < text.length()) {
grid[i][j] = text.charAt(index++);
} else {
grid[i][j] = 'X'; 
}
}
}
StringBuilder ciphertext = new StringBuilder();
for (int j = 0; j < grid[0].length; j++) {
for (int i = 0; i < key; i++) {
ciphertext.append(grid[i][j]);
}
}
return ciphertext.toString();
}
public static String decrypt(String ciphertext, int key) {
int numRows = key;
int numCols = (int) Math.ceil((double) ciphertext.length() / numRows);
char[][] grid = new char[numRows][numCols];
int index = 0;
for (int j = 0; j < numCols; j++) {
for (int i = 0; i < numRows; i++) {
if (index < ciphertext.length()) {
grid[i][j] = ciphertext.charAt(index++);
}
}
}
StringBuilder plaintext = new StringBuilder();
for (int i = 0; i < numRows; i++) {
for (int j = 0; j < numCols; j++) {
if (grid[i][j] != 'X') { 
plaintext.append(grid[i][j]);
}
}
}
return plaintext.toString();
}
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter plaintext: ");
String plaintext = scanner.nextLine();
System.out.print("Enter the key (number of rows): ");
int key = scanner.nextInt();
String ciphertext = encrypt(plaintext, key);
System.out.println("Encrypted Text: " + ciphertext);
String decryptedText = decrypt(ciphertext, key);
System.out.println("Decrypted Text: " + decryptedText);
scanner.close();
}
}
