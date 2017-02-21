//Question 8.1
import java.util.Scanner;

public class Question5 {
	
	//Create the matrix
	 public static double[][] getMatrix(int rows, int columns){
	    Scanner input = new Scanner(System.in);
	    double[][] myMatrix = new double[rows][columns];
	    System.out.println("Enter a 3-by-4 matrix row by row (enter after each row):");
	    for (int r = 0; r < rows; r++) {
	        for (int c = 0; c < columns; c++) {
	            myMatrix[r][c] = input.nextDouble();
	        }
	    }
	    return myMatrix;
	}
	 
	//Sum of columns
	public static double sumColumn(double[][] m, int columnIndex) {
		double sum = 0;
        for (double[] mM : m) {
            sum += mM[columnIndex];
        }
        return sum;
	}

	public static void main(String[] args) {
		double[][] myMatrix = getMatrix(3, 4);
	    for (int i = 0; i < myMatrix[0].length; i++) {
	        System.out.println("Sum of the elements at column " + i + " is " + sumColumn(myMatrix, i));
	        }

	}
}
