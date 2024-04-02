package J_opps_java;

interface Object{

}
interface Shapes{
        void draw();
       default void fill(){
            System.out.println("Filling");
        }

}
class Circles implements Shapes, Object{
    public void draw(){
        System.out.println("Drawing Circle");
    }
}
public class InterfaceDemo {
    public static void main(String[] args) {
        Shapes s=new Circles();
        s.draw();
        s.fill();
    }
}
/*
When implementing (overriding) interface methods then the override method should be public
*/