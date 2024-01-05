package Recursion.Recursion3;

public class PlaceTilesOfSize {
    public static int placeTiles(int n, int m){
        if(n==m){
            return 2;
        }
        if(n<m){
            return 1;
        }
        int vartPlacements=placeTiles(n-m,m);
        int horPlacements=placeTiles(n-1,m);
        return  vartPlacements+horPlacements;
    }
    public static void main(String[] args) {
        int n=4,m=2;
        int ans=placeTiles(n,m);
        System.out.println(ans);
    }
}
