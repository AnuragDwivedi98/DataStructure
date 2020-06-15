import java.util.EmptyStackException;

public class StackUsingLinkedList {
    private ListNode top;
    private int length;

    class ListNode{
        private int data;
        private ListNode next;
        public ListNode(int data){
            this.data = data;
        }
    }

    public StackUsingLinkedList(){
        top = null;
        length = 0;
    }

    public int length(){
        return length;
    }

    public boolean isEmpty(){
        return length == 0;
    }

    public void push(int data){
        ListNode newNode = new ListNode(data);
        newNode.next = top;
        top = newNode;
        length++;
    }

    public int pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        int result = top.data;
        top = top.next;
        length--;
        return result;
    }
     public int peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return top.data;
     }

     public void traverse(){
        ListNode temp = top;
        if(isEmpty()){
            throw new EmptyStackException();
        }
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
     }
    public static void main(String args[]){
        StackUsingLinkedList obj = new StackUsingLinkedList();
        obj.push(2);
        obj.push(44);
        obj.push(5);
        obj.push(7);
        obj.traverse();
        System.out.println("Peek of Stack:"+obj.peek());
        obj.pop();
        System.out.println("After pop operation peek of stack is:"+obj.peek());
    }
}
