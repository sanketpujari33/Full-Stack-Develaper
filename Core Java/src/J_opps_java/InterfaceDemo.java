package J_opps_java;

interface Shapes{
        void draw();
       default void fill(){
            System.out.println("Filling");
        }

}
class Crircle implements Shapes{
    public void draw(){
        System.out.println("Drawing Crircle");
    }
}
public class InterfaceDemo {
    public static void main(String[] args) {
        Shapes s=new Crircle();
        s.draw();
        s.fill();
    }
}
/*
When implementing (overridung)) interface methods then the overriden method should be public
*/