package marksaverage;

import java.util.Scanner;

public class MarksAverage {

    public static void main(String[] args) {
        int mark[] = new int[5];
        int i;
        float sum = 0;
        float avg, perc;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks Obtained in 5 Subjects: ");
        
        for (i = 0; i < 5; i++){
            mark[i] = sc.nextInt();
            sum = sum + mark[i];
        }
        avg = sum/5;
        perc = (sum/500)*100;
        
        System.out.print("Average Marks = " + avg);
        
        System.out.print("\nPercentage = " + perc + "% \n");
    }
}
