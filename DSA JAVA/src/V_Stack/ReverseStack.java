package V_Stack;

import java.util.Stack;
import static V_Stack.PushAtBottom.pushAtBottom;

public class ReverseStack {
    public static  void reverse(Stack<Integer>s){
        if(s.isEmpty()){
            return;
        }
        int top=s.pop();
        reverse(s);
        pushAtBottom(top,s);
    }
    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

       reverse(s);
        while (!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
