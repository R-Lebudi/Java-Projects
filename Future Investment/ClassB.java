package classa;

import java.util.Scanner;

public class ClassB {
    public void getData() {
    Scanner sc = new Scanner(System.in);
        
        System.out.print("Input investment amount: ");
        double investment = sc.nextDouble();
        
        System.out.print("Input the rate of interest: ");
        double rate = sc.nextDouble();
        
        System.out.print("Input number of years: ");
        int year = sc.nextInt();
        
        rate *= 0.01;
        
        //double futureInvestmentValue
        
        System.out.println("Years     FutureValue");
        for (int i=1; i<=year; i++){
            int aw = 19;
            if (i>=10)aw = 18;
            System.out.printf(i + "%"+aw+".2f\n", futureInvestmentValue(investment, rate/12, i));
        }
    }
    
    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years){
        return investmentAmount * Math.pow(1 + monthlyInterestRate, years*12);
    }
}