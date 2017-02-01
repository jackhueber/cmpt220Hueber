package lab1hueber.java;
import java.util.Scanner;

public class Question3 {

  public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
				
	  System.out.print("Enter Subtotal and a Gratuity Rate: ");
	    // Get values
	    double subtotal = input.nextDouble();
	    double gratuityRate = input.nextDouble();
    	// Find gratuity and total
		double gratuity = gratuityRate / subtotal;
		double total = gratuity + subtotal;
		// Print gratuity and total
			  
		System.out.println("The gratutity is $" + gratuity + " " + "and the total is $" + total);
  }

}
