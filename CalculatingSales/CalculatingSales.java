package calculatingsales;

import java.util.Scanner;

public class CalculatingSales {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sum = 0;
        int n = -1 ;
        double a = 3.54;
        double b = 11.50; 
        double c = 7.32; 
        double d = 3.49; 
        double e = 8.64;
        
        while(n !=0) {
        System.out.print("Enter product number ");
        n = input.nextInt();

        if (n==6)
            break;

        System.out.print("Enter the number of quantity sold ");
        int q = input.nextInt();
        
        if(n == 1){
        System.out.print("The retail price is     R" + a + "\n\n");
        }
        
        if(n == 2){
        System.out.print("The retail price is     R" + b + "\n\n");
        }
        if(n == 3){
        System.out.print("The retail price is     R" + c + "\n\n");
        }
        if(n == 4){
        System.out.print("The retail price is     R" + d + "\n\n");
        }
        if(n == 5){
        System.out.print("The retail price is     R" + e + "\n\n");
        }

        switch (n) {
            case 1:
                a = 3.54 * q; 
                sum += 3.54 * q;
            case 2:
                b = 11.50 * q;
                sum += 11.50 * q;
                break;
            case 3:
                c = 7.32 * q;
                sum += 7.32 * q;
                break;
            case 4:
                d = 3.49 * q;
                sum += 3.49 * q;
                break;
            case 5:
                e = 8.64 * q;
                sum += 8.64 * q;
                break;
            default:
                sum += 0;
                break;
            }
        }
        System.out.println("The total retail for product One is     R" + a + "\n");
        System.out.println("The total retail for product Two is     R" + b + "\n");
        System.out.println("The total retail for product Three is   R" + c + "\n");
        System.out.println("The total retail for product Four is    R" + d + "\n");
        System.out.println("The total retail for product Five is    R" + e + "\n");
        System.out.println("Total cost is                           R" + sum + "\n");
        System.out.println("\n");
    }
}