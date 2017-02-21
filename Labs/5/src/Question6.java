//Question 8.5
import java.util.Scanner;

public class Question6 {
	
	//Print method for the matrix
	public static void print(double[][] addend1, double[][] addend2, double[][] sum){
        for (int i = 0; i < addend1.length; i++) {
            for (int j = 0; j < addend1[0].length; j++) {
                System.out.printf("%4.1f ", addend1[i][j]);
            }
            System.out.print(i == addend1.length / 2 ? " +  " : "    ");
            for (int j = 0; j < addend2[0].length; j++) {
                System.out.printf("%4.1f ", addend2[i][j]);
            }
            System.out.print(i == addend1.length / 2 ? " =  " : "    ");
            for (int j = 0; j < sum[0].length; j++) {
                System.out.printf("%4.1f ", sum[i][j]);
            }
            System.out.println();
        }
    }
	
	//Method to add in the matrix
	public static double[][] addMatrix(double[][] a, double[][] b) {
        if (a.length == 0) return null;
        if (a.length != b.length) return null;
        for (int i = 0; i < a.length; i++) {
            if (a[0].length != b[i].length) return null;
        }
        double[][] sum = new double[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        return sum;
    }
	
	public static double[][] getMatrix(int rows, int columns) {
	    double[][] m = new double[rows ][columns];
	    Scanner input = new Scanner(System.in);
	    System.out.println("Enter a " + rows + " by " + columns + " matrix row by row:");
	    for (int r = 0; r < rows; r++) {
	        for (int c = 0; c < columns; c++) {
	            m[r][c] = input.nextDouble();
	        }
	    }
	    return m;
	}

	public static void main(String[] args) {
		double[][] matrix1 = getMatrix(3, 3);
        double[][] matrix2 = getMatrix(3, 3);
        double[][] sum = addMatrix(matrix1, matrix2);
        System.out.println("The matrices are added as follows");
        print(matrix1, matrix2, sum);
	}

}
