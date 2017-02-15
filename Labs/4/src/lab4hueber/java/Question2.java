//Question 6.12
package lab4hueber.java;

public class Question2 {
	
	//Method to print the characters
	public static void printChars(char ch1, char ch2, int numberPerLine) {
		int count = 0;
		for (int i = ch1; i <= ch2; i++) {
			System.out.println((char) i + " ");
			count++;
			if (count == numberPerLine) {
				System.out.println();
				count = 0;
			}
		}
	}
	
	public static void main(String[] args) {
		printChars('1', 'z', 10);
	}

}
