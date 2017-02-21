//Question 7.19

import java.util.Scanner;

public class Question4 {
	
	//See if list is sorted
	public static boolean isSorted(int[] list) {
		for (int i = 0; i < list.length - 1; i++ ) {
			if (list[i] > list[i + 1]) return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter list: ");
		//Number of elements determined here
		final int SIZE = input.nextInt();
		int[] myList = new int[SIZE];
		for (int i = 0; i < SIZE; i++) {
			myList[i] = input.nextInt();
		}
		System.out.println(isSorted(myList) ? "The list is sorted" : "The list is not sorted");

	}

}
