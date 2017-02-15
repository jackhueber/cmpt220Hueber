//Question 7.8
package lab4hueber.java;

import java.util.Scanner;

public class Question7 {

	//Get input from the user and find the average of the inputed numbers
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
	    double[] numbers = new double[10];
	    
	    System.out.print("Enter ten numbers: ");
	    
	    for (int i = 0; i < 10; i++) {
	        numbers[i] = input.nextDouble();
	        }
	    System.out.println("The average is " + average(numbers));
	    }
		
	    public static int average(int[] array){
	        int sum = 0;
	        for (int anArray : array) {
	            sum += anArray;
	        }
	        return sum / array.length;
	    }

	    public static double average(double[] array){
	        double sum = 0;
	        for (double anArray : array) {
	            sum += anArray;
	        }
	        return sum / array.length;
	    }
}
