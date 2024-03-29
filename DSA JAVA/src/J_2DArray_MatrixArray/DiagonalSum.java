package J_2DArray_MatrixArray;

public class DiagonalSum {
    public static int diagonalSum(int matrix[][]){
        int sum = 0;
        // for(int i = 0; i < matrix.length; i++){
        //     for(int j = 0; j < matrix[0].length; j++ ){
        //         if(i== j){
        //             sum += matrix[i][j];
        //         }else if(i+j == matrix[i][j]){
        //             sum += matrix[i][j];
        //         }

        //     }


        for (int i = 0; i < matrix.length; i++) {
            sum+=matrix[i][i];
            if (i != matrix.length-1-i) {
                sum+=matrix[i][matrix.length-i-1];
            }
        }
            return sum;
                                                                                            
    }
    public static void main(String[] args) {

    }
}
