//Question 7.14
import java.util.Scanner;

public class Question3 {
	
	//Find the min for gcd
	public static int min(int[] array) {
	    int min = array[0];
	    for (int i = 1; i < array.length; i++) {
	    	if (array[i] < min) min = array[i];
	    }
	    return min;
	}
	   
	//GCD
	public static int gcd(int... numbers) {
		int min = min(numbers);
        for (int i = min; i > 0; i--) {
            boolean gcd = true;
            for (int number : numbers) {
                gcd = gcd && (number % i == 0);
            }
            if (gcd) return i;
        }
        return 1;
    }
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    final int SIZE = 5;
	    int[] numbers = new int[SIZE];
	    System.out.print("Enter " + SIZE + " numbers: ");
	    for (int i = 0; i < SIZE; i++) {
	    	numbers[i] = input.nextInt();
	    }
	    System.out.println("The GCD is: " + gcd(numbers));
	    
	}

}
