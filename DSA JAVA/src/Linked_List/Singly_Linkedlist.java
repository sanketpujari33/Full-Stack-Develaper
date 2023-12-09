package Linked_List;

public class Singly_Linkedlist {

    private ListNode head;
    private static class ListNode{
           private  int data;
           private ListNode next;
           private ListNode(int data){
               this.data = data;
               this.next=null;
           }
    }
    public void display(){
        ListNode current=head;
        while (current!=null){
            System.out.print(current.data+"-->");
            current=current.next;
        }
        System.out.println("null");
    }
    public int length(){
        if(head==null){
            return 0;
        }
        ListNode current=head;
        int count=0;
        while(current!=null){
            count++;
            current=current.next;
        }
        return count;
    }
    public void insertFrist(int data){
        ListNode newNode=new ListNode(data);
        newNode.next=head;
        head=newNode;
    }
    public void insertLast(int data){
        ListNode newNode=new ListNode(data);
        if(head==null){
            head=newNode;
            return;
        }
            ListNode current=head;
            while(null !=  current.next){
                current=current.next;
            }
            current.next=newNode;
    }
    public void insertAt(int position,int data){
        ListNode newNode = new ListNode(data);
        if(position==1){
            newNode.next=head;
            head=newNode;
        }else{
            ListNode current=head;
            int count=1;
            while (count<position-1){
                count++;
                current=current.next;
            }
            ListNode previous=current.next;
            current.next=newNode;
            newNode.next=previous;
        }
    }
    public ListNode deleteFrist(){
        if(head==null){
            return null;
        }
        ListNode current=head;
        head=head.next;
        return current;
    }
    public ListNode deleteLast(){
        if(head==null || head.next==null){
            return head;
        }
        ListNode current=head;
        ListNode previous=null;
        while(current.next!=null){
            previous=current;
            current=current.next;
        }
        previous.next=null;
        return current;
    }
    public void deleteAt(int position){

        if(position==1){
            head=head.next;
        }else{
            ListNode current=head;
            int count=1;
            while (count<position-1){
                count++;
                current=current.next;
            }
            ListNode previous=current.next;
            current.next=previous.next;
        }
    }
    public boolean innerSearch(int data){
        ListNode current=head;
        while (current!=null){
            if(current.data==data) {
                return true; 
            }
            current=current.next;
        }
        return false;
    }
    public ListNode reverseList(ListNode head){
        if(head==null){
            return head;
        }
        ListNode current=head;
        ListNode previous=null;
        ListNode next=null;
        while (current!=null){
            next=current.next;
            current.next=previous;
            previous=current;
            current=next;
        }
        return previous;
    }
public void displayRev(ListNode head){
    ListNode current=head;
    while (current!=null){
        System.out.print(current.data+"-->");
        current=current.next;
    }
    System.out.println("null");
}
    public static void main(String[] args) {
        Singly_Linkedlist sll=new Singly_Linkedlist();
        for (int i = 0; i < 11; i++) {
            sll.insertLast(i);
        }
        sll.insertAt(12,11);
        System.out.println(sll.deleteFrist().data);
        System.out.println(sll.deleteLast().data);

        sll.deleteAt(6);
        System.out.println(sll.innerSearch(3));
        System.out.println(sll.length());
        sll.display();
        sll.displayRev(sll.reverseList(sll.head));
    }
}
