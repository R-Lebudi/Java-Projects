package javaapplication5;

public class JavaApplication5 {

    public static void main(String[] args) {
        
        int x,y;
        x = 10;
        y = 10;
        
        if(x > 0 && y > 0){
            System.out.println("Both nums are positive");
        }else if(x > 0 || y > 0){
            System.out.println("Atleast one num is positive");
        }else{
            System.out.println("Both nums are negative");
        }
    }
    
}
