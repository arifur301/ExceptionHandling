package classexample;

import java.util.Scanner;

public class palindromes {

	public static void main(String[] args) {
		
/* Write a program to check for palindromes. Example: Bob, ADA
 * Anna, Civic, Racecar etc.
 */
		String originalWord, reverseWord = "";
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any word: ");
		originalWord = scanner.next();
		System.out.println(originalWord.length());
		
		for(int i = originalWord.length()-1; i>=0; i-- ) {
			reverseWord = reverseWord + originalWord.charAt(i);
		}
		System.out.println(reverseWord);
		if (originalWord.equalsIgnoreCase(reverseWord)) {
			System.out.println("Yes !! Palindrome");
		}else {
			System.out.println("No !! Not a Palindrome");
		}
		
		scanner.close();
	
	}

}
