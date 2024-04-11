package VV_Queue;

import java.util.Stack;

public class QueueUsingTwoStack {
    public static class Queue{
      static Stack<Integer> stack1 = new Stack<>();
      static Stack<Integer> stack2 = new Stack<>();
      public static boolean isEmpty(){
          return stack1.isEmpty();
      }
      public static void add(int data){
          while(!stack1.isEmpty()){
              stack2.push(stack1.pop());
          }
          stack1.push(data);
          while(!stack2.isEmpty()){
              stack1.push(stack1.pop());
          }
      }
      public static int remove(){
          if(isEmpty()){
              System.out.println("empty queue");
              return -1;
          }
          return stack1.pop();
      }
      public static int peek(){
          if(isEmpty()){
              System.out.println("empty queue");
              return -1;
          }
          return stack1.peek();
      }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
