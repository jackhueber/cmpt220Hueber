//Question 11.13
import java.util.ArrayList;
import java.util.Scanner;
public class RemoveDuplicates {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ten integers: ");
        for (int i = 0; i < 10; i++) {
            list.add(input.nextInt());
        }
        removeDuplicate(list);
        printList(list);
    }

    private static void printList(ArrayList<Integer> list) {
        System.out.print("The distinct integers are");
        for (Integer i : list) {
            System.out.print(" " + i);
        }
    }

    public static void removeDuplicate(ArrayList<Integer> list) {
        ArrayList<Integer> noDuplicates = new ArrayList<>();
        for (Integer integer : list) {
            if (!noDuplicates.contains(integer)) noDuplicates.add(integer);
        }
        list.clear();
        list.addAll(noDuplicates);
    }

}
