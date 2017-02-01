package lab1hueber.java;
import java.util.Scanner;

public class Question5 {

  public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.println("Print v0, v1, and t: ");
	// Get the values
	double v0 = input.nextDouble();
	double v1 = input.nextDouble();
	double t = input.nextDouble();
	// Acceleration formula
	double acceleration = (v1 - v0) / t;
	
	System.out.println("The acceleration is: " + acceleration);
  }

}
