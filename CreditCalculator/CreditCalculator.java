package creditcalculator;

import java.util.Scanner;

public class CreditCalculator {

    public static void main(String[] args) {
        
        Scanner jv = new Scanner (System.in);
        
        int accnum = 0;
        double begBalance = 0;
        double totalCharges = 0;
        double totalCredits = 0;
        double creditLimit = 0;
        double newBalance = 0;
        
        
        System.out.println("Please enter Customer Account Number (or -1 to quit): "); 
        accnum = jv.nextInt();
            
        System.out.println("Please enter Customer Beginning Balance: ");
        begBalance = jv.nextDouble();
           
        System.out.println("Please enter Total Charges: ");
        totalCharges = jv.nextDouble();
                
        System.out.println("Please enter Total Credits: ");
        totalCredits = jv.nextDouble();
                    
        System.out.println("Please enter Customer Credit Limit: ");
        creditLimit = jv.nextDouble();
                    
            newBalance = begBalance + totalCharges - totalCredits;        
            
            System.out.print("Account: " + accnum + "\n");
            System.out.print("Credit Limit: " + creditLimit + "\n");
            System.out.print("Balance: " + newBalance);
            
            System.out.println(); 
            
            if (newBalance > creditLimit){
                    System.out.print("Credit Limit Exceeded");
                }
            else {
                System.out.print("Credit Limit NOT Exceeded");
            }
            System.out.println(); 
    } 
}