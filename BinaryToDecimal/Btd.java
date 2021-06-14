package btd;

import java.util.Scanner;

public class Btd {

    public static void main(String[] args) {
        
        int temp;
        int decimal = 0, i = 0;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        temp = sc.nextInt();
        
        while (temp != 0) {
            int remainder = temp % 10; 
            decimal = decimal + (int)(remainder * Math.pow (2, i));
            i++;
            temp = temp / 10;
        }
        System.out.print("The Decimal value is: " + decimal);
        System.out.print("\n");
    } 
}
