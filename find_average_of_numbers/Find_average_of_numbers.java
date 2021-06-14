/*
Write a Java program that takes three numbers as input to calculate and print the average of the numbers.
 */

package find_average_of_numbers;

import java.util.Scanner;

public class Find_average_of_numbers {

    public static void main(String[] args) {
        
        Scanner sa = new Scanner(System.in);
        
        System.out.print("Input number 1: ");
        int gp = sa.nextInt();

        System.out.print("Input number 2: ");
        int lmp = sa.nextInt();

        System.out.print("Input number 3: ");
        int kzn = sa.nextInt();
        
        double avg = ((gp + lmp + kzn) / 3);
        
        System.out.println("Average of numbers = " + avg);
        
    }
    
}
