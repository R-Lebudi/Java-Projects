package prtbmi;

import java.util.Scanner;

public class PrtBMI {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Double bmi;
        
        System.out.print("Enter your weight ");
        Double weight = sc.nextDouble();
        
        System.out.print("Enter your height ");
        Double height = sc.nextDouble();
       
        bmi = weight / height;
        System.out.println("bmi = " + bmi);
        
        if (bmi <= 18.4){
            System.out.println("Underweight");
            System.out.println("See your nutritionist");
        }
        else if (bmi <= 24.9 ){
            System.out.println("Normal weight");
            System.out.println("Maintain your diet");
        }
        else if (bmi <= 29.9){
            System.out.println("Overweight");
            System.out.println("Consider exercising and see a nutritionist");
        }
        else if (bmi <= 34.9){
            System.out.println("Obesity(Class 1)");
            System.out.println("Exercise and adjust your diet");
        }
        else if (bmi <= 39.9){
            System.out.println("Obesity(Class 2)");
            System.out.println("Be on a diet plan immediately and exerise daily");
        }
        else if (bmi >= 40.0){
            System.out.println("Extreme Obesity(Class 3)");
            System.out.println("Get medical attention");
        }
    }
}
