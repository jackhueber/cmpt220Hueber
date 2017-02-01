// Question 4.13

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		
		// Ask for a letter
		System.out.println("Enter a letter: ");
		// Get letter from user
		Scanner input = new Scanner(System.in);
		char letter = (char) input.next().charAt(0);
		
		// Check for invalid letter
		 if (!( letter >= 'A' && letter <= 'Z') && !( letter >= 'a' && letter <= 'z' )) {
	            System.out.println(letter + " is invalid.");
	            System.exit(0);
	        }

		// Vowel or Consonant
		String type = "";
		switch (letter) {
			case 'A': type = "vowel";
			case 'E': type = "vowel";
			case 'I': type = "vowel";
			case 'O': type = "vowel";
			case 'U': type = "vowel";
			case 'a': type = "vowel";
			case 'e': type = "vowel";
			case 'i': type = "vowel";
			case 'o': type = "vowel";
			case 'u': type = "vowel"; break;
			default: type = "consonant";
		}
		System.out.println(letter + " is a " + type);
	}
}
