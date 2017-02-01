// Question 3.5
package lab2hueber.java;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		System.out.println("Enter the day: ");
		
		// Create Scanner
		Scanner input = new Scanner(System.in);
		
		int day = input.nextInt();
		
		// Future
		System.out.println("Enter the days elasped since today: ");
		Scanner input1 = new Scanner(System.in);
				
		int daysPassed = input1.nextInt();
		System.out.println("Today is ");
		// Switch for entered integers
		switch (day) {
		case 0:System.out.println("Sunday"); break;
		case 1: System.out.println("Monday"); break;
		case 2: System.out.println("Tuesday"); break;
		case 3: System.out.println("Wednesday"); break;
		case 4: System.out.println("Thursday"); break;
		case 5: System.out.println("Friday"); break;
		case 6: System.out.println("Saturday"); break;
		}
		
		// Tell future day
		int future = (day + daysPassed) % 7;
		
		System.out.println("The future day is ");
		
		switch (future) {
		case 0:System.out.println("Sunday"); break;
		case 1: System.out.println("Monday"); break;
		case 2: System.out.println("Tuesday"); break;
		case 3: System.out.println("Wednesday"); break;
		case 4: System.out.println("Thursday"); break;
		case 5: System.out.println("Friday"); break;
		case 6: System.out.println("Saturday"); break;
		}
	}

}
