package J_opps_java;
// Constructors in Inheritance
class Bases1{
    int i;
    int j;
     Bases1(int i, int j) {// parameterized constructor
        this.i = i;
        this.j = j;
    }
    Bases1(){}// default constructor
    void display() {
        System.out.println("i="+i+" "+" j="+j);
    }
}
class Deriveds1 extends Bases1{
    int k;
    Deriveds1(int k){// overloaded method
       //super(); //added implicitly - invokes Base class default constructor
        super(30 ,40);// call explicitly - invokes Base class parameterized constructor
        this.k=k;
    }
    void display(){  // overriding method
        super.display();//invoke base class display();
        System.out.println("k="+k );
    }
}
 public class InheritanceDemo3 {
    public static void main(String[] args) {
        Bases1 b=new Bases1(10,20);// b.i=0 , b.j=0
       // b.Bases1(10, 20);// b.i=10 , b.j=20
        b.display(); //i=10 , j=20
        Deriveds1 d =new  Deriveds1(50);// d.i=0 , d.j=0, d.k=0;
        d.display();// i=0 , j=0
    }
}
