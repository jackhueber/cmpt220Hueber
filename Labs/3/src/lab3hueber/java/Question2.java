package lab3hueber.java;

//Question 5.5
public class Question2 {

	public static void main(String[] args) {
		System.out.println("Kilograms   Pounds   |   Pounds   Kilograms");
		//Create table
			for (int i = 1, j = 20; i < 200; i += 2, j += 5) {
				System.out.printf("%-9d%9.1f   |   %-9d%9.2f%n", i, i * 2.2, j, j / 2.2);
			}
	}
}
