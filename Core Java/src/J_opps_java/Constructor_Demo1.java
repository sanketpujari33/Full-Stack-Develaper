package J_opps_java;

class Sample {
    int i;
    int j;
    Sample(int i, int j) {
        // constructor
        this.i=i;
        this.j=j;
    }
    void display() {
        //not a constructor, an ordinary method
        System.out.println(" i = "+i+" "+" j = "+j);
    }
}
public class Constructor_Demo1 {
    public static void main(String[] args) {
        Sample sample= new Sample(10, 10);
        sample.display();
    }
}
