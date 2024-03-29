package J_2DArray_MatrixArray;

import java.util.Scanner;

public class SearchMatrices {
    public static boolean searchMatrices(int matrix[][], int key, int n, int m){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <m ; j++) {
                if(matrix[i][j]==key)
                    System.out.print("found at cell ("+ i +","+j+")");
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int matrix[][]=new int[3][3];
        int n=matrix.length, m=matrix[0].length;
        int key=sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <m ; j++) {
                matrix[i][j]=sc.nextInt();
            }
        }
       if( searchMatrices(matrix,key,n,m)){
           System.out.println("not found key");
       };
    }
}
