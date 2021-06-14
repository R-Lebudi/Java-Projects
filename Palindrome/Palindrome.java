package palindrome;

import java.util.Scanner;

// PALINDROME is a word, phrase, number or sentence that reads the same backward or forward but still has the same meaning
// level; civic; madam; racecar; refer; rotator; radar; mom; noon; stats; wow
// 0-9; 121; 111; 99
// madam i'm adam; sit on a potato pan, otis; able was i, i saw elba

public class Palindrome {

    private static boolean iterative (String strSubmitted){
        int fromLeft;
        boolean result = false;
        int fromRight = strSubmitted.length()-1;
        if (strSubmitted.length()==1)
        result = true;
        else
        {
        for(fromLeft = 0;
        fromLeft < strSubmitted.length();
        fromLeft ++,fromRight--) 
        {
        if(strSubmitted.charAt(fromLeft)==
        strSubmitted.charAt(fromRight)) 
        {
        result = true;
        }
        else
        result = false;
        }
        }
        return result;
        }

    public static void main(String[] args) {
        boolean is = false;
        String sentence = "";
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter a word or sentence:");
        sentence = scnr.nextLine();
        is = iterative (sentence.toLowerCase());
        if (is==true)
        System.out.println (sentence+" is a palindrome");
        else
        System.out.println(sentence+" is not a palindrome");
    }   
}
