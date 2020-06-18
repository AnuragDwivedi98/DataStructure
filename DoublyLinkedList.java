public class DoublyLinkedList {
    private Node head;
    private Node tail;

    private class Node{
        private int data;
        private Node next;
        private Node prev;

        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public DoublyLinkedList(){
        head = null;
        tail = null;
    }

    public boolean isEmpty(){
        return head == null && tail == null;
    }

    public void insertFromLast(int data){
        Node newNode = new Node(data);
        if(isEmpty()){
            tail = newNode;
            head = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
            tail.next = null;
        }
    }

    public void insertFromBeginning(int data){
        Node newNode = new Node(data);
        if(isEmpty()){
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            newNode.prev = null;
            head = newNode;
        }
    }

    public void insertAtNth(int data, int loc){
        Node newNode = new Node(data);
        Node temp = head;
        while (--loc > 0){
            temp = temp.next;
        }
        newNode.next = temp.next;
        newNode.prev = temp;
        temp.next = newNode;
        newNode.next.prev = newNode;
    }

    public void deleteFromLast(){
        if(isEmpty()){
            System.out.println("Empty!");
            return;
        } else {
            if(head!=tail){
                tail = tail.prev;
                tail.next = null;
            } else{
                head = tail = null;
            }

        }
    }

    public void deleteFromStart(){
        if(isEmpty()){
            System.out.println("Empty!");
            return;
        } else{
            if(head!=tail){
                head = head.next;
                head.prev = null;
            } else{
                head = tail = null;
            }
        }
    }

    public void deleteAtNth(int loc){
        Node temp = head;
        while(--loc > 0){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        temp.next.prev = temp;
    }

    public void traverse(){
        if(isEmpty()){
            System.out.println("Empty!");
            return;
        } else {
            Node current = head;
            while (current!=null){
                System.out.print(current.data+" ");
                current = current.next;
            }
            System.out.println();
        }
    }

    public void reverseTraverse(){
        Node temp = tail;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.prev;
        }
        System.out.println();
    }



    public static void main(String args[]){
        DoublyLinkedList obj = new DoublyLinkedList();
        obj.insertFromLast(10);
        obj.insertFromLast(20);
        obj.insertFromBeginning(5);
        obj.insertAtNth(15,2);
        obj.traverse();
        obj.deleteFromLast();
        obj.traverse();
        obj.deleteFromStart();
        obj.traverse();
        obj.insertFromLast(20);
        obj.insertFromLast(22);
        obj.insertFromLast(25);
        obj.traverse();
        obj.deleteAtNth(3);
        obj.traverse();
        obj.reverseTraverse();
    }
}
