package largestsmallestnumber;

import java.util.Scanner;

public class LargestSmallestNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter three integers: ");
        
                int largest = sc.nextInt();
        while(sc.hasNextInt()){
            int input = sc.nextInt();
            if (input > largest){
                largest = input;
            }
        }
        
        System.out.println(largest + " is the largest");
        System.out.println("\n");
        
        
        Scanner we = new Scanner(System.in);

        System.out.print("Enter 3 integers: ");
        
        int smallest = we.nextInt();
        while(we.hasNextInt()){
            int input = we.nextInt();
            if (input < smallest){
                smallest = input;
            }
        }
        
        System.out.println(smallest + " is the smallest");
        System.out.println("\n");
        
        int range = largest - smallest;
        System.out.println(largest + " - " + smallest + " = " + range + " is the range");
    }    
}     

/* ------------------------OPTION 2-----------------------------------*/

//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        
//        if (a > b && a > c){
//            System.out.println(a + " is the largest");
//        }else if (b > a && b > c){
//            System.out.println(b + " is the largest");
//        }else if (c > a && c > b){
//            System.out.println(c + " is the largest");
//        }  
//       if (a < b && a < c){
//            System.out.println(a + " is the smallest");
//        }else if (b < a && b < c){
//            System.out.println(b + " is the smallest");
//        }else if (c < a && c < b){
//            System.out.println(c + " is the smallest");
//        }      
//    } 
//} 


/* ---------------------------OPTION 3--------------------------------*/
        
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        
//        if (a > b && a > c){
//            System.out.println(a + " is the largest");
//        }else if (b > a && b > c){
//            System.out.println(b + " is the largest");
//        }else if (c > a && c > b){
//            System.out.println(c + " is the largest");
//        }
//        
//        System.out.println("\n");
//        
//        Scanner dc = new Scanner(System.in);
//        
//        System.out.print("Enter 3 integers: ");
//        
//        int d = sc.nextInt();
//        int e = sc.nextInt();
//        int f = sc.nextInt();
//        
//        if (d < e && d < f){
//            System.out.println(d + " is the smallest");
//        }else if (e < d && e < f){
//            System.out.println(e + " is the smallest");
//        }else if (f < d && f < e){
//            System.out.println(f + " is the smallest");
//        }
//    } 
// }