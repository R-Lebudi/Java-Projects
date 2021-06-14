package restaurant_bill;

import java.util.Scanner;

/*
Write a program that computes tax and tip on a restaurant bill. The ptogram should ask the user to enter the charge of the 
meal. The tax should be 6.75% of the meal charge. The tip should be 20% of the total after adding the tax. 
Display the meal cost, tax amount, tip amount, and total bill of the meal.
*/

public class Restaurant_Bill {

    public static void main(String[] args) {
        Scanner charge = new Scanner(System.in);
        double mealCost;
        double tax;
        double orderCost;
        double tip;
        double totalBill;
        
        System.out.print("Enter the meal cost: ");
        mealCost = charge.nextDouble();
        
        tax = (6.75/100) * mealCost;
        
        orderCost = mealCost + tax;
        
        tip = (20.0/100) * orderCost;
        
        totalBill = orderCost + tip;
        
        System.out.println("Meal cost: R " + mealCost);
        System.out.println("Tax amount: " + tax + "%");
        System.out.println("Order cost: R " + orderCost);
        System.out.println("Tip amount: R " + tip);
        System.out.println("Total Bill amount: R " + totalBill);
    }
}
