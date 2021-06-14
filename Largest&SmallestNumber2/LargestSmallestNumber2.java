package largest.smallestnumber2;

import java.util.Scanner;

public class LargestSmallestNumber2 {

    public static void SmallerNumber()
	{
            Scanner myScan = new Scanner(System.in);
            int a, b, c;
            
            System.out.print("======= TO FIND THE SMALLEST NUMBER ======= \n");
		
            System.out.print("Please enter first interger : ");
            a = myScan.nextInt();
            
            System.out.print("Please enter second interger : ");
            b = myScan.nextInt();
            
            System.out.print("Please enter third interger : ");
            c = myScan.nextInt();
		
            if(a < b)
                if(a < c)
            System.out.print(a + " is the smallest number");
		
            if(b < a)
		if(b < c)
            System.out.print(b + " is the smallest number");
		
            if(c < a)
		if(c < b)
            System.out.print(c + " is the smallest number");
            
            System.out.print("\n");
	}
    
	public static void LargestNumber()
	{
            Scanner myScan = new Scanner(System.in);
            int d, e, f;
            
            System.out.print("======= TO FIND THE LARGEST NUMBER ======= \n");
		
            System.out.print("Please enter first interger : ");
            d = myScan.nextInt();
            
            System.out.print("Please enter second interger : ");
            e = myScan.nextInt();
	
            System.out.print("Please enter third interger : ");
            f = myScan.nextInt();
		
            if(d > e)
		if(d > f)
            System.out.print(d + " is the largest number");
		
            if(e > d)
		if(e > f)
            System.out.print(e + " is the largest number");
		
            if(f > d)
		if(f > e)
            System.out.print(f + " is the largest number");	
            
            System.out.print("\n");
	}

    
    public static void main(String[] args) {
        SmallerNumber();
	LargestNumber();
    }   
}