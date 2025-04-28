public class xor_and {
public static void main(String s[]) {
String Message = "vitthal"; 
int var1 = 127; 
int var2[] = new int[20]; 
//and
  System.out.println("----------- AND Values ----------");
 for (int i = 0; i < Message.length(); i++) {
  var2[i] = 127 & Message.charAt(i); 
    System.out.println("127 & " + Message.charAt(i) + " is = " + var2[i]);
 }
   for (int i = 0; i < Message.length(); i++) {
   System.out.println("Binary value of " + var2[i] + " = " + Integer.toBinaryString(var2[i]));  
 }
//or
 System.out.println("----------- or Values ----------");
 for (int i = 0; i < Message.length(); i++) {
  var2[i] = 127 & Message.charAt(i); 
    System.out.println("127 OR " + Message.charAt(i) + " is = " + var2[i]);
 }
   for (int i = 0; i < Message.length(); i++) {
   System.out.println("Binary value of " + var2[i] + " = " + Integer.toBinaryString(var2[i]));  
 }
//XOR
 System.out.println("----------- xor Values ----------");
 for (int i = 0; i < Message.length(); i++) {
  var2[i] = 127 & Message.charAt(i); 
    System.out.println("127 XOR " + Message.charAt(i) + " is = " + var2[i]);
 }
   for (int i = 0; i < Message.length(); i++) {
   System.out.println("Binary value of " + var2[i] + " = " + Integer.toBinaryString(var2[i]));  
 }
}
}
