//Question 7.4
package lab4hueber.java;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		final int MAX_NUMBER_OF_SCORES = 100;

		  	//Get input from the user
	    Scanner input = new Scanner(System.in);
	        
	    int[] scores = new int[MAX_NUMBER_OF_SCORES];
	    int sum = 0;
	    double average;
	    int i;
	    int aboveAverage = 0;
	    int belowAverage = 0;
	        
	    System.out.print("Enter the scores ");
	        
	    for (i = 0; i < MAX_NUMBER_OF_SCORES; i++) {
	        int score = input.nextInt();
	        if (score < 0) break;
	        scores[i] = score;
	        sum += score;
	    }
	        //Function for average an compare the scores
	    average = sum / i + 0.0;
	    for (int j = 0; j < i; j++) {
	        if (scores[j] >= average) aboveAverage++;
	        else belowAverage++;
	    }
	    System.out.println(aboveAverage + " scores are above or equal to the average.");
	    System.out.println(belowAverage + " scores are below the average.");
	}
}
