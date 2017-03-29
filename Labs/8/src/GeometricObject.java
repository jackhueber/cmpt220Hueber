//Question 11.1
import java.util.Scanner;
public abstract class GeometricObject {
	String color;
	boolean filled;
	abstract double getArea();
	abstract double getPerimeter();
	
	 public static void main(String[] args) {
	    double[] sides = promptDoubleValues(3);
	    String color = promptStringValue();
	    boolean filled = promptBooleanValue();
	    Triangle triangle = new Triangle(sides[0], sides[1], sides[2]);
	    triangle.setColor(color);
	    triangle.setFilled(filled);
	    
	    System.out.println(triangle.toString());
	    System.out.println("Area:      " + triangle.getArea());
	    System.out.println("Perimeter: " + triangle.getPerimeter());
	    System.out.println("Color:     " + triangle.getColor());
	    System.out.println("Filled:    " + triangle.isFilled());
	}

	private static boolean promptBooleanValue() {
	    Scanner input = new Scanner(System.in);
	    System.out.print("Enter [Y]' for filled, or [N] for unfilled: ");
	    return input.nextLine().toUpperCase().charAt(0) == 'Y';
	}

	private static String promptStringValue() {
	    Scanner input = new Scanner(System.in);
	    System.out.print("Enter a color: ");
	    return input.nextLine();
	}

	private static double[] promptDoubleValues(int size) {
	    double[] values = new double[size];
	    final Scanner INPUT = new Scanner(System.in);
	    System.out.print("Enter " + size + " sides: ");
	    for (int i = 0; i < size; i++) {
	        values[i] = INPUT.nextDouble();
	    }
	    return values;
	}
}
