/*
Write a Java program to convert a binary number to hexadecimal number.
        Input Data:
    Input a Binary Number: 1101

        Expected Output
    HexaDecimal value: D
 */
package binarytohexadecimal;

import java.util.Scanner;

public class BinaryToHexadecimal {

    public static void main(String[] args) {
        
        int[] hexa_decimal = new int[1000];
        int i = 1, j = 0, remainder, decimal = 0, binary;
        
        Scanner bth = new Scanner(System.in);
        
        System.out.print("Input a Binary number: ");
        binary = bth.nextInt();
        
        while (binary > 0){
            remainder = binary % 2;
            decimal = decimal + remainder * i;
            i = i * 2;
            binary = binary / 10;
        }
        i = 0;
        while (decimal != 0){
            hexa_decimal[i] = decimal % 16;
            decimal = decimal / 16;
            i++;
        }
        System.out.print("Hexadecimal value is: ");
        for (j = 1 - 1; j >= 0; j--){
            if (hexa_decimal[j] > 9){
                System.out.print((char)(hexa_decimal[j] + 55) + "\n");
            }else{
                System.out.print(hexa_decimal[j] + "\n");
            }
        }
    }
}