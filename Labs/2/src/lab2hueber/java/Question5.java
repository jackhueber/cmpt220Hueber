// Question 4.20
package lab2hueber.java;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Ask user for string
		System.out.println("Enter a string: ");
		
		String str = (String) input.next();
		
		// Find String length
		System.out.print("The length of the string is: ");
		System.out.println(str.length());
		
		// Find first letter of the string
		System.out.println("The first letter in the string is: " + str.substring(0, 1));

	}

}
