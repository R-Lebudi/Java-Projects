/*
Write a Java program that takes a number as input and prints its multiplication table upto 10.
    Test Data:
    Input a number: 8

    Expected Output :
    8 x 1 = 8
    8 x 2 = 16
    8 x 3 = 24
    ...
    8 x 10 = 80
 */
package multiplication_of_an_int;

import java.util.Scanner;

public class Multiplication_Of_An_Int {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); 
        
        System.out.print("Input a number: ");
        int x = sc.nextInt();
        
        for(int i = 0; i < 10; i++){
            System.out.println(x + " X " + (i+1) + " = " + (x *(i+1)));
        }
    }
}