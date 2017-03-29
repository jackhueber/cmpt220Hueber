//Question 11.11
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class ArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 5 numbers: ");
        for (int i = 0; i < 5; i++) {
            list.add(input.nextInt());
        }
        sort(list);
        System.out.println(list);
    }

    public static void sort(ArrayList<Integer> list) {
        Collections.sort(list);
    }
}