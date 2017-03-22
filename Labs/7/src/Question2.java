//Question 10.5
import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
        int number = getInteger();
        StackOfIntegers primeFactors = getFactors(number);
        printFactors(primeFactors);
    }

    private static void printFactors(StackOfIntegers primeFactors) {
        System.out.print(primeFactors.pop());
        while (primeFactors.getSize() > 0) {
            System.out.printf(", %d", primeFactors.pop());
        }
    }

    public static int getInteger() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive Integer: ");
        return input.nextInt();
    }

    public static StackOfIntegers getFactors(int number) {
        StackOfIntegers stackOfIntegers = new StackOfIntegers();
        while(number > 1){
            int i = 2;
            while (number % i != 0) i++;
            stackOfIntegers.push(i);
            number /= i;
        }
        return stackOfIntegers;
    }
}