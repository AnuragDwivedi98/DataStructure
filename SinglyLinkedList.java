

public class SinglyLinkedList {
    private Node head;
    private Node tail;

    private  class Node
    {
        private int data;
        private Node next;

        public Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    public SinglyLinkedList(){
        head = null;
        tail = null;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void insertAtLast(int data){
        Node newNode = new Node(data);
        if(isEmpty()){
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void insertFromBeginning(int data){
        Node newNode = new Node(data);
        if(isEmpty())
        {
            head = tail = newNode;
        }
        else
            {
            newNode.next = head;
            head = newNode;
        }
    }

    public void insertAtNth(int data, int loc){
        Node newNode = new Node(data);
        Node current = head;
        while(--loc > 0){
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;
    }

//    delete a node from end of the list
    public void deleteFromLast(){
        if(head == null)  // check if list is empty or not.
        {
            System.out.println("Empty");
            return;
        }
        else
            {
            if(head!=tail)   //Checks whether the list contains only one element
            {
                Node current = head;
                //Loop through the list till the second last element such that current.next is pointing to tail
                while (current.next != tail)
                {
                    current = current.next;
                }
                tail = current;
                tail.next = null;
            }
            else {
                head = tail = null;
            }
        }
    }

    public void deleteFromBeginning(){
        if(isEmpty())
        {
            System.out.println("Empty!");
            return;
        }
        else
        {
            if(head!=tail)
            {
                head = head.next;
            }
            else
            {
                head = tail = null;
            }
        }
    }

    public void deleteAtNth(int loc){
        if(isEmpty()){
            System.out.println("Empty!");
            return;
        } else {
            Node current = head;
            while (--loc > 0){
                current = current.next;
            }
            current.next = current.next.next;

        }
    }

    public void reverseTraversal(){
        if(isEmpty()){
            System.out.println("Empty!");
            return;
        }
        Node current = head;
        Node prev = null;
        Node nxt = null;
        while(current!=null){
            nxt = current.next;
            current.next = prev;
            prev = current;
            current = nxt;
        }
        head = prev;
    }

    public void search(int data){
        if(isEmpty()){
            System.out.println("Empty!");
            return;
        }
        Node current = head;
        int loc = 0;
        while(current!=tail){
            if(current.data == data){
                System.out.println("Element "+current.data+" is in the list at position "+loc);
                return;
            }
            loc++;
            current=current.next;
        }
        System.out.println("Element not Found");
    }
     public void deleteEntireLinkedlist(){
        head = null;
        tail = null;
        System.out.println("Deleted entire link list successfully");
     }

    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String args[]){
        SinglyLinkedList obj = new SinglyLinkedList();
        obj.insertAtLast(23);
        obj.insertAtLast(21);
        obj.insertAtLast(19);
        obj.display();
        obj.deleteFromLast();
        obj.display();
        obj.insertFromBeginning(25);
        obj.insertFromBeginning(27);
        obj.display();
        obj.deleteFromBeginning();
        obj.display();
        obj.insertAtNth(10,2);
        obj.display();
        obj.deleteAtNth(2);
        obj.display();
        obj.search(23);
        obj.search(55);
        obj.insertAtLast(19);
        obj.insertAtLast(17);
        obj.display();
        obj.search(19);
        obj.reverseTraversal();
        obj.display();
        obj.deleteEntireLinkedlist();
        
    }
}
