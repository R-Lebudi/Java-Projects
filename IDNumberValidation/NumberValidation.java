package numbervalidation;

import java.util.Scanner;

public class NumberValidation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        
        if(valNumber(s1)){
            System.out.print("Valid ID  \n");
        }else {
            System.out.print("Invalid ID \n");
        }
    }
    
    public static boolean valNumber (String s){
       return s.length() == 13 && s.matches("[0-9]+");
    }
    
}
