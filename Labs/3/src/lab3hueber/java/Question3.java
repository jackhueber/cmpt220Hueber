package lab3hueber.java;

//Question 5.16
import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {		
		System.out.print("Enter a positive integer: ");
		//Get number from user
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		
		//Find the factors of the number
		while (number > 1) {
			int i = 2;
			while (number % i != 0) i++;
			
			System.out.print(i);
			
			if (number != i) {
				System.out.print(", ");
			
				number /= i;
			}
		}
	}
}
