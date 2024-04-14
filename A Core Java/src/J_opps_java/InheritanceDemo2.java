package J_opps_java;
//Polymorphism -Method overloading and Method overriding
class Bases{
    int i;
    int j;
    void input(int i, int j) {
        this.i = i;
        this.j = j;
    }
    void display() {
        System.out.println("i="+i+" "+" j="+j);
    }
}
class Deriveds extends Bases{
    int k;
    void input(int k) {// overloaded method
        this.k=k;
    }
    void display(){  // overriding method
        super.display();//invoke bases class display();
        System.out.println("k="+k );
    }
}
public class InheritanceDemo2 {
    public static void main(String[] args) {
        Bases b=new Bases();// b.i=0 , b.j=0
        b.input(10, 20);// b.i=10 , b.j=20
        b.display(); //i=10 , j=20
        Deriveds d =new  Deriveds();// d.i=0 , d.j=0, d.k=0;
        d.display();// i=0 , j=0
    }
}
