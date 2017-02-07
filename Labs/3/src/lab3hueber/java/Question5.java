package lab3hueber.java;

//Question 6.3
import java.util.Scanner;
public class Question5 {

	public static int reverse(int number){
		int reverse = 0;
        while (number > 0){
            reverse = reverse * 10 + number % 10;
            number /= 10;
        }
		return reverse; 
	}
	
	public static boolean isPalindrome(int number){
		 return number == reverse(number);
	}
	
	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
	        System.out.print("Enter an integer: ");
	        int num = input.nextInt();
	        String str = isPalindrome(num) ? "" : "not ";
	        System.out.println("The integer is " + str + "a palindrome");

	}

}
