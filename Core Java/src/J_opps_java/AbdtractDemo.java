package J_opps_java;

abstract class Vechicle{
    abstract void drive();
    void applyBreak(){
        System.out.println("Applay Break");
    }
}
    class Car1 extends Vechicle{
    void drive(){
        System.out.println("Driving Car1");
    }
    void changeGear(){
        System.out.println("Changing Gear");
    }
}
public class AbdtractDemo {
    public static void main(String[] args) {
        //Vehicle vehicle=new Vehicle();// Error
        Vechicle v=new Car1();
        v.drive();
        v.applyBreak();
        Car1 c=new Car1();
        c.changeGear();
        c.drive();
    }
}
