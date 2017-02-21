//Question 7.11
import java.util.Scanner;

public class Question2 {
	
	//Find Deviation
	 public static double deviation(double[] x) {
	    double mean = mean(x);
	    double sum = 0;
	    for (double z : x) {
	        sum += Math.pow(z - mean, 2);
	    }
	    return Math.sqrt(sum / (x.length - 1));
	}
	
	 //Find Mean
	public static double mean(double[] x) {
		double sum = 0;
		for (double z : x) {
		   sum += z;
		}
		return sum / x.length;
	}

	//User Input
	public static void main(String[] args) {
		final int SIZE = 10;
	    double[] array = new double[SIZE];
	    Scanner input = new Scanner(System.in);
	    System.out.print("Enter ten numbers: ");
	    for (int i = 0; i < SIZE; i++) {
	        array[i] = input.nextDouble();
	    }
	    System.out.printf("Mean: %.2f%n", mean(array));
	    System.out.printf("Standard deviation: %.5f%n", deviation(array));
	}

}
