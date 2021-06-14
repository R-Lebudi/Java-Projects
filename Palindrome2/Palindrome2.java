package palindrome2;

import java.util.Scanner;

// PALINDROME is a word, phrase, number or sentence that reads the same backward or forward but still has the same meaning
// level; civic; madam; racecar; refer; rotator; radar; mom; noon; stats; wow
// 0-9; 121; 111; 99
// madam i'm adam; sit on a potato pan, otis; able was i, i saw elba

public class Palindrome2 {

    public static void main(String[] args) {
        String original, reverse = ""; // Objects of String class
	Scanner in = new Scanner(System.in);
	     
	System.out.println("Enter a string to check if it is a palindrome");
	original = in.nextLine();
	     
	int length = original.length();
	     
	for (int i = length - 1; i >= 0; i--)
            reverse = reverse + original.charAt(i);
	         
	if (original.equals(reverse))
	    System.out.println("The string is a palindrome.");
	else
	    System.out.println("The string isn't a palindrome.");

    }   
}