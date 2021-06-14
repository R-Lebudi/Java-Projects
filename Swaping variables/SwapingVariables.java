/*
 1.Write a Java program to swap two variables.
 2.Write a Java program to swap two variables using a third variable.
 */

package swaping.variables;

public class SwapingVariables {

    public static void main(String[] args) {
        
        System.out.println("1. Swapping two varibles using two variables");
        
        int a, b; 
        
        a = 9;
        b = 7;
        
        System.out.println("Before swapping: a, b = " + a + ", " + b);
        
        a = a + b;
        b = a - b;
        a = a - b;
               
        System.out.println("After swapping: a, b = " + a + ", " + b);
        
        System.out.println("\n");
        System.out.println("2. Swapping two varibles using a third variable");
        
        int x, y, temp; 
        
        x = 55;
        y = 47;
        
        System.out.println("Before swapping: x, y = " + x + ", " + y);

        temp = x;  
        x = y;    
        y = temp;
               
        System.out.println("After swapping: x, y = " + x + ", " + y);
        
    }
    
}
