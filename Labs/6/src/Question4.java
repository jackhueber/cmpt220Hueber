//Question 9.11
import java.util.Scanner;
public class Question4 {

	public static void main(String[] args) {
		final int A = 0, B = 1, C = 2, D = 3, E = 4, F = 5;
	    double[] values = promptValues();
	    LinearEquation linearEquation = new LinearEquation(
	    		values[A], values[B], values[C], values[D], values[E], values[F]);
	     		printResults(linearEquation);
	}
	
	 private static double[] promptValues() {
	        double[] values = new double[6];
	        final Scanner INPUT = new Scanner(System.in);
	        System.out.print("Enter values for a, b, c, d, e, f: ");
	        for (int i = 0; i < values.length; i++) {
	            values[i] = INPUT.nextDouble();
	        }
	        return values;
	    }

	private static void printResults(LinearEquation linearEquation) {
	    System.out.printf(linearEquation.isSolvable() ?
	            "x is %.2f and y is %.2f" : "The equation has no solution.",
	            linearEquation.getX(), linearEquation.getY());
	}
}
