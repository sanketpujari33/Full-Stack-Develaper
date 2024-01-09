package BasicPrograming;

public class SimpleInterest {
    public static void simpleInterest(int p, int r, int t){
        int si=(p*r*t)/100;
        System.out.println(si);
    }
    public static void main(String[] args) {
        simpleInterest(10,15,90);
    }
}
