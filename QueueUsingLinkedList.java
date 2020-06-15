import java.util.NoSuchElementException;

public class QueueUsingLinkedList {
    private ListNode rear;
    private ListNode front;
    private int length;

    private class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public QueueUsingLinkedList(){
        this.rear = null;
        this.front = null;
    }
    public int length(){
        return length;
    }

    public boolean isEmpty(){
        return length == 0;
    }
    public void enQueue(int data){
        ListNode newNode = new ListNode(data);
        if(isEmpty()){
            front = newNode;
        } else {
            rear.next = newNode;
        }
        rear = newNode;
        length++;
    }

    public int deQueue(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        int result = front.data;
        front = front.next;
        if(front == null){
            rear = null;
        }
        length--;
        return result;
    }

    public int peek(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        return front.data;
    }


    public void print(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        ListNode temp = front;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String args[]){
        QueueUsingLinkedList obj = new QueueUsingLinkedList();
        obj.enQueue(23);
        obj.enQueue(22);
        obj.enQueue(67);
        obj.enQueue(54);
        obj.enQueue(11);
        obj.print();
        System.out.println("Peek Element of Queue: "+obj.peek());
        obj.deQueue();
        obj.deQueue();
        obj.print();
        System.out.println("Peek Element of Queue: "+obj.peek());
    }
}
