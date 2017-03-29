//Question 11.17
import java.util.ArrayList;
import java.util.Scanner;
public class AlgebraPerfectSquare {

	public static void main(String[] args) {
        int num1 = promptInteger();
        int num2 = findNum2(num1);
        System.out.println("The smallest number num2 for num1 * num2 to be a perfect square is " + num1);
        System.out.println("num1 * num2 is " + (num1 * num2));
    }

    private static int findNum2(int number) {
        ArrayList<Integer> factors = getFactors(number);
        ArrayList<Integer> oddCountFactors = getOddCountFactors(factors);
        return product(oddCountFactors);
    }

    private static int product(ArrayList<Integer> oddFactors) {
        int num2 = 1;
        for (Integer oddFactor : oddFactors) {
            num2 *= oddFactor;
        }
        return num2;
    }

    private static ArrayList<Integer> getOddCountFactors(ArrayList<Integer> factors) {
        ArrayList<Integer> oddFactors = new ArrayList<>();
        for (Integer factor : factors) {
            int count = 0;
            for (Integer integer : factors) {
                if (integer.equals(factor)) count++;
            }
            if (count % 2 == 1 && !oddFactors.contains(factor)) oddFactors.add(factor);
        }
        return oddFactors;
    }

    public static ArrayList<Integer> getFactors(int number) {
        ArrayList<Integer> factors = new ArrayList<>();
        while(number > 1){
            int i = 2;
            while (number % i != 0) i++;
            factors.add(i);
            number /= i;
        }
        return factors;
    }

    public static int promptInteger() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer num1: ");
        return input.nextInt();
    }
}
