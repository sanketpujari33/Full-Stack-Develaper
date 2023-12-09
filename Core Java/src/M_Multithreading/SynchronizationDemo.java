package M_Multithreading;

class Table
{
    synchronized void printTable(int n)
    {
        for (int i = 1; i <=10; i++) {
            System.out.println(n + " * " + i + " = " +(n * i));

        }
    }
}
class ThreadA extends Thread
{
    Table t;
    ThreadA (Table t)
    {
        this.t = t;
    }
    public void run()
    {
        t.printTable(5);
    }
}
class ThreadB extends Thread
{
    Table t;
    ThreadB (Table t)
    {
        this.t = t;
    }
    public void run()
    {
        t.printTable(8);
    }
}
public class SynchronizationDemo  {
    public static void main(String[] args) {
        Table t = new Table();
        ThreadA t1=  new ThreadA(t);
        t1.start();
        ThreadB t2=  new ThreadB(t);
        t2.start();

    }
}
