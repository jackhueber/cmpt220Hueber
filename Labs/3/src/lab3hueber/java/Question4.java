package lab3hueber.java;
//Question 6.1

public class Question4 {

	public static int getPentagonalNumber(int n) {
		return n * (3 * n -1) / 2;
	}

	public static void main(String[] args) {
		//Set the starting number for the loop
		int num = 0;
        for (int i = 1; i <= 100; i++) {
            System.out.printf("%5d ", getPentagonalNumber(i));
            num++;
            if (num == 10){
                System.out.println();
                //set back to 0 to restart the loop after the line reaches 10
                num = 0;
            }
        }
	}
}