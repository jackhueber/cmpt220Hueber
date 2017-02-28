//Question 9.13
import java.util.Scanner;
public class Question5 {

	public static void main(String[] args) {
		final int ROWS = 0, COLUMNS = 1;
        int[] arraySize = promptArraySize();
        double[][] array = prompt2DDoubleArray(arraySize[ROWS], arraySize[COLUMNS]);
        Location location = Location.locationLargest(array);
        System.out.println(location.toString());
    }

    private static int[] promptArraySize() {
        int[] size = new int[2];
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns in the array: ");
        for (int i = 0; i < 2; i++) {
            size[i] = input.nextInt();
        }
        return size;
    }

    private static double[][] prompt2DDoubleArray(int rows, int columns) {
        double[][] m = new double[rows][columns];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                m[i][j] = input.nextDouble();
            }
        }
        return m;
    }
	}


