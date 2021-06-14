package javaapplication1;
import java.util.Scanner;

// importing scanner and using it

public class JavaApplication1 {

    public static void main(String[] args) {
        Scanner dyza = new Scanner(System.in);
        
        System.out.println("Enter number: ");
        int nomber = dyza.nextInt();
        
        System.out.println("Your number is: " + nomber);
    }
    
}
