package lab3hueber.java;

//Question 5.1
import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int number;
		int positive = 0;
		int negative = 0;
		int sum = 0;
		
		//Ask user for number
		System.out.println("Enter an integer, the input ends if it is 0: ");
		//Determine number inputed and store until 0 is inputed
		number = input.nextInt();
		
		while (number != 0) {
			if (number >= 0) {
				positive++;
			} else {
				negative++;
			}
			sum += number;
			number = input.nextInt();
		}
		System.out.println("The number of positives is: " + positive);
		System.out.println("The number of negatives is: " + negative);
		System.out.println("The total is: " + (positive + negative));
		System.out.println("The average is: " + (sum / (positive + negative)));
		}
}
