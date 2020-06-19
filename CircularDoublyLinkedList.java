public class CircularDoublyLinkedList {
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

    public CircularDoublyLinkedList(){
        head = null;
        tail = null;
    }

    public boolean isEmpty()
    {
        return head == null;
    }

    public void insertFromLast(int data){
        Node newNode = new Node(data);
        if(isEmpty()){
            head = tail = newNode;
        } else {
            newNode.next = head;
            newNode.prev = tail;
            head.prev = newNode;
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void insertFromBeginning(int data){
        Node newNode = new Node(data);
        if(isEmpty()){
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            newNode.prev = tail;
            tail.next = newNode;
            head = newNode;
        }
    }

    public void insertAtNth(int data, int loc){
        Node newNode = new Node(data);
        Node temp = head;
        while(--loc > 0){
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
            if(head!=tail) {
                tail = tail.prev;
                tail.next = head;
                head.prev = tail;
            } else {
                head.next = head.prev = head = tail = null;
            }
        }
    }

    public void deleteFromBeginning(){
        if(isEmpty()){
            System.out.println("Empty!");
            return;
        } else {
            if(head!=tail){
                head = head.next;
                head.prev = tail;
                tail.next = head;
            } else {
                head.next = head.prev = head = tail = null;
            }
        }
    }

    public void deleteFromNth(int loc){
        Node temp = head;
        while(--loc > 0){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        temp.next.prev = temp;
    }

    public void searchElement(int data){
        Node temp = head;
        boolean flag = false;
        do {
            if(temp.data == data){
                flag = true;
                break;
            }
            temp = temp.next;
        }
        while(temp!=head);

        if(flag)
        {
            System.out.println("Element "+data+" is in circular doubly linked list");
        } else {
            System.out.println("Element "+data+" is not in circular doubly linked list");
        }

    }

    public void traverse(){
        if(isEmpty()){
            System.out.println("Empty!");
            return;
        } else {
            Node temp = head;
            do
            {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            while (temp != head);
            System.out.println();
        }
    }

    public void reverseTraverse(){
        if(isEmpty()){
            System.out.println("Empty");
            return;
        } else {
            Node temp = tail;
            do
            {
                System.out.print(temp.data + " ");
                temp = temp.prev;
            }
            while (temp != tail);
            System.out.println();
        }
    }

    public static void main(String args[]){
        CircularDoublyLinkedList obj = new CircularDoublyLinkedList();
        obj.insertFromLast(2);
        obj.insertFromLast(4);
        obj.insertFromLast(6);
        obj.traverse();
        obj.insertFromBeginning(1);
        obj.traverse();
        obj.insertAtNth(3,2);
        obj.traverse();
        obj.deleteFromLast();
        obj.traverse();
        obj.deleteFromBeginning();
        obj.traverse();
        obj.insertFromBeginning(1);
        obj.insertFromBeginning(5);
        obj.traverse();
        obj.deleteFromNth(2);
        obj.traverse();
        obj.reverseTraverse();
        obj.searchElement(5);
        obj.searchElement(99);
    }
}
