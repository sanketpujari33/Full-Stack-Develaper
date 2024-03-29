package F_AdvancedPatterns;
/*
Print The Advanced Patterns

        *****
       *   *
      *   *
     *   *
    *****

*/
public class HollowSolidRhombus {
    public static void main(String[] args) {
        int N=5;
        for (int i = 1; i <=N; i++) {
            for (int j=1; j<=N-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=5; j++) {
                if(i==1 || i==N || j==1 || j==5){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
