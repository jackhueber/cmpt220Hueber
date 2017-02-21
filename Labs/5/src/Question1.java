//Question 7.10
import java.util.Arrays;
import java.util.Scanner;

public class Question1 {
	//Smallest Integer
	public static int indexOfSmallestElement(double[] array) {
		int integer = 0;
		for (int i = 1; i < array.length; i++) {
			if (array[i] < array[integer]) {
				integer = 1;
			}
		}
		return integer;
	}
	//User input
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] array = new double[10];
		for (int i = 0; i < array.length; i++) {
			System.out.print("Enter next integer: ");
				array[i] = input.nextDouble();
        }
        System.out.println(Arrays.toString(array));
        System.out.println("The smallest integer is: " + indexOfSmallestElement(array));
	}
}
