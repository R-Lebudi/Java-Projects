package javaapplication4;

public class JavaApplication4 {

    // for loop
    public static void main(String[] args) {
        
        for (int i = 10; i > 0; i--){
            System.out.println("i = " + i);
        }
     
      System.out.println("--------------");  
        
    // while loop
    
        int e = -10;
        
        while(e <= 0){
            System.out.print(" e = " + e + "\n");
            e++;
        }
      System.out.println("--------------"); 
      
     // do while loop
     
        int q = 10;
        
        do{
            System.out.println("q = " + q);
            q--;
        }while(q > 0);
    }
    
}
