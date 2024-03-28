package M_Multithreading;
// Method of Thread class

class MyThread extends Thread {
        public void run()
        {
            System.out.println("I am a thread");
            Thread t= Thread.currentThread();
            System.out.println(t);   //Thread[#21,Thread-0,5,main]
            t.setName("myThread");
            System.out.println(t);  //Thread[#21,myThread,5,main]
            System.out.println(t.getName());  // myThread
            t.setPriority(8);
            // if the priority is 1< or >10 then will throw an IllegalArgumentException
            System.out.println(t);    //Thread[#21,myThread,8,main]
            System.out.println(t.getPriority()); //8
        }
}
public class ThreadMethodsDemo1 {
    public static void main(String[] args) {
        MyThread t=new MyThread();
        t.start(); // creates a thread and invokes run() method Thread[#1,main,5,main]
    }
}
