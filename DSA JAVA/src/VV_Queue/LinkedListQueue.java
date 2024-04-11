package VV_Queue;

public class LinkedListQueue {
    static int arr[];
    static int size;
    static Node rear=null;
  static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
  static  class Queue {
    static Node head=null;
    static Node tail=null;
    static boolean isEmpty(){
        return head==null & rear==null;
    }
    public  static void add(int data){
        Node newNode=new Node(data);
        if(isEmpty()){
            head=newNode;
            tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }
    public static int remove(){
        if(isEmpty()){
            return -1;
        }
        int front=head.data;
        head=head.next;
        return front;
    }
    public static int peek(){
        if(isEmpty()){
            return -1;
        }
        return head.data;
    }

  }
    public static void main(String[] args) {
      Queue q=new Queue();
      q.add(1);
      q.add(2);
      q.add(3);
      q.add(4);
      q.add(5);

      while (!q.isEmpty()) {
          System.out.println(q.peek());
          q.remove();
      }
//      System.out.println(q.peek());
//      System.out.println(q.remove());
    }

}
