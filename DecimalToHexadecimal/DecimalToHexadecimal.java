/*
Write a Java program to convert a decimal number to hexadecimal number.
        Input Data:
    Input a decimal number: 15
    
        Expected Output
    Hexadecimal number is : F 
 */

package decimaltohexadecimal;

import java.util.Scanner;

public class DecimalToHexadecimal {

    public static void main(String[] args) {
        
        int decimal_number, remainder;
        String hexa_decimal_number = "";
        
        // hexadecimal number are::
        char hex[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        
        Scanner bth = new Scanner (System.in);
        
        System.out.print("Input a decimal number: ");
        decimal_number = bth.nextInt();
        
        while(decimal_number > 0){
            remainder = decimal_number % 16;
            hexa_decimal_number = hex[remainder] + hexa_decimal_number;
            decimal_number = decimal_number / 16;
        }
        System.out.println("Hexadecimal number is: " + hexa_decimal_number);
    }
    
}
