//Question 13.1
import java.util.Scanner;

public class Question1 {

	 public static void main(String[] args) {
	        Triangle triangle = createUserTriangle();
	        System.out.println(triangle);
	 }

	 private static Triangle createUserTriangle() {
	     double[] sides = promptDoubleValues(3);
	     String color = promptStringValue("Enter the color: ");
	     boolean isFilled = promptBooleanValue();
	     Triangle triangle = new Triangle(sides[0], sides[1], sides[2]);
	     triangle.setColor(color);
	     triangle.setFilled(isFilled);
	     return triangle;
	 }

	 private static boolean promptBooleanValue() {
	     Scanner input = new Scanner(System.in);
	     System.out.print("Enter T' for filled, or F for unfilled: ");
	     return input.nextLine().toUpperCase().charAt(0) == 'T';
	 }

	 private static String promptStringValue(String prompt) {
	     Scanner input = new Scanner(System.in);
	     System.out.print(prompt);
	     return input.nextLine();
	 }

	 private static double[] promptDoubleValues(int size) {
	     double[] values = new double[size];
	     boolean valid;
	     do {
	         valid = true;
	         Scanner input = new Scanner(System.in);
	         System.out.print("Enter " + size + " sides: ");
	         for (int i = 0; i < size; i++) {
	             if (input.hasNextDouble()) {
	                 values[i] = input.nextDouble();
	             } else {
	                 System.out.println("One or more of the input values is invalid.\nTry again.");
	                 valid = false;
	                 break;
	             }
	         }
	     } while (!valid);
	     return values;
	 }
}

	
