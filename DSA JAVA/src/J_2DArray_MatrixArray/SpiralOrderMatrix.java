package J_2DArray_MatrixArray;

public class SpiralOrderMatrix {
    public static void main(String[] args) {
        // Given matrix
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        // Print the spiral order matrix
        printSpiralOrderMatrix(matrix);
    }

    // Function to print the spiral order matrix
    public static void printSpiralOrderMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int rowStart = 0, rowEnd = rows - 1;
        int colStart = 0, colEnd = cols - 1;

        while (rowStart <= rowEnd && colStart <= colEnd) {
            // Print the first row from the remaining rows
            for (int i = colStart; i <= colEnd; i++) {
                System.out.print(matrix[rowStart][i] + " ");
            }
            rowStart++;

            // Print the last column from the remaining columns
            for (int i = rowStart; i <= rowEnd; i++) {
                System.out.print(matrix[i][colEnd] + " ");
            }
            colEnd--;

            // Print the last row from the remaining rows
            if (rowStart <= rowEnd) {
                for (int i = colEnd; i >= colStart; i--) {
                    System.out.print(matrix[rowEnd][i] + " ");
                }
                rowEnd--;
            }

            // Print the first column from the remaining columns
            if (colStart <= colEnd) {
                for (int i = rowEnd; i >= rowStart; i--) {
                    System.out.print(matrix[i][colStart] + " ");
                }
                colStart++;
            }
        }
    }
}
