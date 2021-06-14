package fibonacciseries;

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {
        int c = 0 , a = 1, b = 0;
        
        System.out.print("Enter an Integer: ");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        //System.out.print("1  1 ");
        
        while (b <= i){
            System.out.print(b + " ");
            c = a + b;
            a = b;
            b = c;
        }
        System.out.print("\n");
    }   
}
