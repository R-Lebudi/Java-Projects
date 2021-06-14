package javaapplication7;

public class JavaApplication7 {

    public static void main(String[] args) {
        
        int[] a = {10, 20, 30, 40, 50};
        System.out.println(a[2] + " " + a[4]);
        
        // enhanced for statement
        for(int temp : a){
            System.out.println(temp);
        }
        
        System.out.println("--------------");
        
        // declaring an array then assigning values after
        int[] x = new int[5];
        
        //then assigning values 
        x[3] = 25;
        x[0] = 12;
        
        for(int temp2 : x){
            System.out.println(temp2);
        }       
         
        System.out.println("--------------");
         
        String[] st  = {"one", "two", "three"};
        for(String temp4 : st){
            System.out.println(temp4);
            
        System.out.println("--------------");
        
        // declaring an array then assigning values after
        String[] q = new String[5];
        
        //then assigning values 
        q[3] = "25";
        q[0] = "12";
        
        for(String temp6 : q){
            System.out.println(temp6);
        }       
        
        } 
        
    }
    
}
