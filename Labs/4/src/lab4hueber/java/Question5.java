//Question 7.2
package lab4hueber.java;

import java.util.Scanner;

public class Question5 {
	
	public static void reverseIntegers(int[] array){
		 for (int i = 0; i < array.length / 2; i++) {
	        int temp = array[i];
	        array[i] = array[array.length - i - 1];
	        array[array.length - i - 1] = temp;
		 }
	}
	private static void printIntegers(int[] numbers) {
		for (int anArray : numbers) {
	        System.out.print(anArray + " ");
		
		 }
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		  int[] numbers = new int[10];
		  
	        System.out.print("Enter 10 numbers: ");
	        
	        for (int i = 0; i < numbers.length; i++) {
	            numbers[i] = input.nextInt();
	        }
	    reverseIntegers(numbers);
	    printIntegers(numbers);
	}
}
