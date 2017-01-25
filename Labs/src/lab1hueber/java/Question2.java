package lab1hueber.java;
import java.util.Scanner;

public class Question2 {

  public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
		
	System.out.print("Enter Celsius: ");
	  double celsius = input.nextDouble();
	  // Conversion
	  double fahrenheit = (9.0 / 5) * celsius + 32;
	  // Print fahrenheit
	  
	  System.out.println(celsius + " " + "celsius " + "is " + fahrenheit + " " + "fahrenheit" );
  }

}
