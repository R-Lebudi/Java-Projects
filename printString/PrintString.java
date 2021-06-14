/*
Write a Java program to print 'Hello' on screen and then print your name on a separate line.
    Expected Output :
        Hello
        'Your name'
*/

package printstring;

public class PrintString {

    public static void main(String[] args) {
        
        String hi = "Hello";
        
        String name = "Man - Lu";
        
        System.out.println(hi + "\n" + name);
        
     // OR 
     
        System.out.println("Hello" + "\n" + "Bra Lu");
        
     // OR 
     
        System.out.println("Hello\nBra ManLu");
  
    }
}
