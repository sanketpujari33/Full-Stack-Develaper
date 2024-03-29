package J_2DArray_MatrixArray;
import java.util.Scanner;

public class MatrixTranspose {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the dimensions of the matrix
        System.out.print("Enter the number of rows (N): ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns (M): ");
        int cols = scanner.nextInt();

        // Create the matrix
        int[][] matrix = new int[rows][cols];

        // Prompt the user to enter the elements of the matrix
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Print the original matrix
        System.out.println("Original matrix:");
        printMatrix(matrix);

        // Print the transpose of the matrix
        System.out.println("Transpose of the matrix:");
        int[][] transposeMatrix = transpose(matrix);
        printMatrix(transposeMatrix);

        // Close the Scanner
        scanner.close();
    }

    // Function to print a matrix
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }

    // Function to find the transpose of a matrix
    public static int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] transposeMatrix = new int[cols][rows];

        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                transposeMatrix[i][j] = matrix[j][i];
            }
        }

        return transposeMatrix;
    }
}
