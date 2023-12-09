package J_opps_java;

class Outer{

     static class Inner{

         int m=10;
        void doStuuff(){
            System.out.println("m = " + m);
        }
    }
}
public class InnerDemo {
    public static void main(String[] args) {
        Outer.Inner innerObj = new Outer.Inner();
        innerObj.doStuuff();

    }
}
