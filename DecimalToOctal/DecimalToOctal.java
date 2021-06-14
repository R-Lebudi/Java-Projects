/*
Write a Java program to convert a decimal number to octal number
        Input Data:
    Input a Decimal Number: 15

        Expected Output
    Octal number is: 17  
 */

package decimaltooctal;

import java.util.Scanner;

public class DecimalToOctal {

    public static void main(String[] args) {
        
        int decimal_number, remainder, quotient, i = 1, j;
        int octal_number[] = new int[100];
        
        Scanner dto = new Scanner(System.in);
        
        System.out.print("Input a Decimal number: ");
        decimal_number = dto.nextInt();
        
        quotient = decimal_number;
        
        while(quotient != 0){
            octal_number[i++] = quotient % 8;
            quotient = quotient / 8;
        }
        System.out.print("Input a Octal number: ");
        for (j = i -1; j > 0; j--){
            System.out.print(octal_number[j]);
        }
        System.out.print("\n");
    }
}
