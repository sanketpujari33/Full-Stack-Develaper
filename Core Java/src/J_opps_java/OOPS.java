package J_opps_java;

class Pen{

    //-----------------------------(object, propartise)-----------------------------------
    String color;
    String type;
    //-------------------------------(methad and function)---------------------------------

    public void write() {
        System.out.println("writing something");
    }
    public void printColor(){
        System.out.println(this.color);
    }
    public void printType(){
        System.out.println(this.type);

    }
}
class Students{
    String name;
    int age;
    int marks;

    public  void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.marks);
    }
    //-----------------------------(Constructor)-----------------------------------

    Students(Students s2){
        this.name=s2.name;
        this.age=s2.age;
        this.marks=s2.marks;
    }
    Students(){

    }
}
//-----------------------------(Polymorphism)------------------------------------------------
class Polymorphism{
    String name;
    int age;
    public void printInfo(String name){
        System.out.println(name);
    }
    public void printInfo(int age){
        System.out.println(age);
    }
    public void printInfo(String name, int age){
        System.out.println(name+" "+age);
    }

//-----------------------------(compile time Polymorphism)-----------------------------------
//String fristname;
//    String lastName;
//    public void printInfo(String name){
//        System.out.println(name);
//    }
//    public void printInfo(String name){
//        System.out.println(age);
//    }
//    public void printInfo(String name, int age){
//        System.out.println(name+" "+age);
//    }
    //-----------------------------(run time Polymorphism)---------------------------------------
}



//-----------------------------(Inheritance)---------------------------------------
class Shape{
    public void area(){
        System.out.println("Display area");
    }
}
//-----------------------------(Singal level Inheritance)---------------------------------------
class Triangle extends Shape{
    public void area(int l, int h){
        System.out.println(1/2*l*h);
    }
}
//-----------------------------(Multi level Inheritance)---------------------------------------
class EquilateralTriangle extends Triangle{
    public void area(int l, int h){
        System.out.println(1/2*l*h);
    }
}
//-----------------------------(Hierarchial Inheritance)---------------------------------------
class Circle extends Shape{
    public void area(int r){
        System.out.println((3.14)*r*r);
    }
}
//-----------------------------(Hybrid Inheritance)------------------------------------------



//-----------------------------(Abstract)------------------------------------------------
abstract class  Animal{
    abstract void walk();
    Animal(){
        System.out.println("You are creating a new Animal");
    }
    public void eat(){
        System.out.println("Eats");
    }
}
class Dog extends Animal{
    Dog(){
        System.out.println("creating a Dog");
    }
    public void walk(){
        System.out.println("Walks on 4 legs and 4 feet");
    }
}
class Cat extends Animal{
    public void walk(){
        System.out.println("Walks on 4 legs and 4 feet");
    }
}
//-----------------------------(Interfaces)------------------------------------------------
interface Car{
    void run();
    void stop();
}
interface Bike{

}
class Tata implements Car{
    public void run(){
        System.out.println("Running");
    }
    public void stop(){
        System.out.println("Stopping");
    }
}
class BMW implements Car{
    public void run(){
        System.out.println("Running");
    }
    public void stop(){
        System.out.println("Stopping");
    }
}
//-----------------------------(Multipale Inheritance (InterBases))---------------------------------------
class Ferrai implements Car, Bike {
    public void run(){
        System.out.println("Running");
    }
    public void stop(){
        System.out.println("Stopping");
    }

}
//-----------------------------(Static)------------------------------------------------
class Student{
     String name;
    static String school;
    public static void setSchoolName(String schoolName){
//        name=schoolName; error
        school=schoolName;
    }

}
//-----------------------------(Final)------------------------------------------------


public class OOPS {
    public static void main(String[] args) {
//        opps_java.bank.Bank b1=new opps_java.bank.Bank();
//        b1.main(args);
//      Pen p1= new Pen();
//      p1.color="blue";
//      p1.type="gel";
//      p1.write();
//        Pen p2= new Pen();
//        p2.color="black";
//        p2.type="pencil";
//        p2.printColor();
//        Students s1=new Students();
//        s1.name="Sanket";
//        s1.age=20;
//        s1.marks=90;
        //-----------------------------(copy Constructor)-----------------------------------
//        Students s2=new Students(s1);
//        s2.printInfo();
//        Triangle t1=new Triangle();
//        Animal animal=new Animal();
//        animal.walk();
//        Dog dog=new Dog();
//        dog.eat();
//        dog.walk();

        Student student1=new Student();
        student1.setSchoolName("NewtonSchool");
        student1.name="Sanket Pujari";
        System.out.println(student1.name);
        System.out.println(Student.school);

    }
}
