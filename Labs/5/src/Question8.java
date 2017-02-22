//Question 8.10
public class Question8 {

	public static void main(String[] args) {
        int[][] myMatrix = newMatrix(4, 4);
        printMatrix(myMatrix);
        int[] maxIndex = getMaxIndices(myMatrix);
        System.out.println("The largest row index: " + maxIndex[0]);
        System.out.println("The largest column index: " + maxIndex[1]);
    }

	//Method for printing the matrix
    public static void printMatrix(int[][] matrix) {
        for (int[] myMatrix : matrix) {
            for (int aMatrix : myMatrix) {
                System.out.print(aMatrix);
            }
            System.out.println();
        }
    }

    //Creates the matrix
    public static int[][] newMatrix(int rows, int columns) {
        int[][] myMatrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                myMatrix[i][j] = (int)(Math.random() * 2);
            }
        }
        return myMatrix;
    }

    //Get the row and column that has the most 1's
    public static int[] getMaxIndices(int[][] matrix) {
        int colIndex = 0;
        int rowIndex = 0;
        int maxRow= 0;
        int maxCol = 0;
        for (int i = 0; i < matrix.length; i++) {
            int sumRow = 0;
            int sumCol = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                sumRow += matrix[i][j];
                sumCol += matrix[j][i];
            }
            if (sumRow > maxRow) {
                maxRow = sumRow;
                rowIndex = i;
            }
            if (sumCol > maxCol) {
                maxCol = sumCol;
                colIndex = i;
            }
        }
        int[] index = new int[2];
        index[0] = rowIndex;
        index[1] = colIndex;
        return index;
    }

}
