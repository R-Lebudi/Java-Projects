package odd.evennumbers;

import java.util.Scanner;

public class OddEvenNumbers {

    public static void main(String[] args) {
       
          for (int i = 0; i <10; i++){
            if (i % 2 == 1){
                System.out.print(i + " ODD number \n");
            }
        }
       
       for (int i = 0; i <=10; i++){
            if (i % 2 == 0){
                System.out.print(i + " EVEN number \n");
            }
        } 

    }
}

/* -------------------------------------------------------------------*/
        
//          System.out.print("Enter an Integer: ");
//
//          Scanner sc = new Scanner(System.in);
//          int i = sc.nextInt();
//          
//          if (i % 2 == 0){
//              System.out.print(i + " is an EVEN number \n");
//          }else
//              System.out.print(i + " is an ODD number \n");
//    }
// }