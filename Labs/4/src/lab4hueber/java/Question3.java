//Question 6.16
package lab4hueber.java;

public class Question3 {
	
	//Method to find if year is a leap year of not
	public static int numberOfDaysInAYear(int year) {
		return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0) ? 366 : 365;
	}

	public static void main(String[] args) {
		System.out.println("Year    Days");
		System.out.println("------------");
		
		for (int i = 2000; i <= 2020; i++){
			System.out.printf("%-9d%d%n", i, numberOfDaysInAYear(i));
		}
	}
}
