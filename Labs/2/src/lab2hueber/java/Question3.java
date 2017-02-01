// Question 4.9
package lab2hueber.java;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Get input from user
		System.out.println("Enter a character: ");
		
		char inputChar = (char)input.next().charAt(0);
		 
		// Convert to unicode
		int uniChar = (int) inputChar;
		System.out.println("The unicode for the character " + inputChar + " is: " + uniChar);

	}

}
