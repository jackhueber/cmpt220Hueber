package lab1hueber.java;
import java.util.Scanner;

public class Question4 {

  public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	  System.out.println("Enter an integer between 0 and 1000: ");
	  // Get values
	    int integer = input.nextInt();
	    int one = integer % 10;
	    int two = integer / 10;
	    // Add the integers together
	    int total = one + two;
	    
	    System.out.println("The sum of the digits is " + total);
  }

}
