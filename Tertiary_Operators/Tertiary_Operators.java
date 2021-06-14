package tertiary_operators;

import java.util.Scanner;

/* 
from the " ( " to the " ? " its the condition
After " ? " between " : " its the boolean operators to verify the condition
which are TRUE : FALSE
*/

public class Tertiary_Operators {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int number;
        
        System.out.print("Please enter your day number: ");
        number = scan.nextInt();
        
        String msg = (number > 5 ? "Its weekend" : "Its weekdays");{
            System.out.println(msg);
        }    
        
            System.out.println("\n");
            
        Scanner sc = new Scanner(System.in);
        
        int nomoro;
        
        System.out.print("Please enter your number: ");
        nomoro = scan.nextInt();
        
        int x = (nomoro >= 9 ? 1990 : 2000);{
            System.out.println(x);
        }
    }    
}
