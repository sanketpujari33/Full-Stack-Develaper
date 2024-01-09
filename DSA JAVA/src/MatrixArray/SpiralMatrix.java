package MatrixArray;

public class SpiralMatrix {
    public static void spiralMatrix(int matrix[][], int n, int m){
       int startRow=0, endRow=n;
        int startCol=0, endCol=m;
        while (startRow<=endRow && startCol<=endCol){
             // top
            for (int j = startCol; j <=endCol ; j++) {
                System.out.print(matrix[startRow][j]+"->");
            }
            // right
            for (int i = startRow+1; i <=endRow ; i++) {
                System.out.print(matrix[i][endRow]+"->");
            }
            //bottom
            for (int j = endCol-1; j >=startCol ; j--) {
                if(startRow == endRow){
                    break;
                }
                System.out.print(matrix[endRow][j]+"->");
            }
            //left
            for (int i = endRow-1; i >=startRow +1; i--) {
                if(startCol == endCol){
                    break;
                }
                System.out.print(matrix[i][startCol]+"->");
            }
            startCol++;
            endCol--;
            startRow++;
            endRow--;
        }
    }

    public static void main(String[] args) {
        int [][] matrix={{ 1, 2, 3, 4},
                         { 5, 6, 7, 8},
                         { 9, 10, 11, 12},
                         { 13, 14, 15, 16}};
        spiralMatrix(matrix,matrix.length-1,matrix[0].length-1);
    }
}
