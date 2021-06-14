package decimaltobinary;

import java.util.Scanner;

public class DecimalToBinary {
    
    public static void main(String[] args) {
        int number, i = 0;
        int bin[] = new int[100];
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        number = sc.nextInt();
        
        while (number != 0) {
            bin[i] = number % 2;
            number = number / 2;
            i++;
        }

        System.out.print("The Binary value is: ");
        for (int j = i - 1; j >= 0; j--){
            System.out.print("" + bin[j]);
        }
        System.out.print("\n");
    }
    
}
