package DataStructures.LinkedList;

public class SinglyLinkedList {
    // Class variables
    private Node head;
    private Node tail;
    private int size;
    // Constructor
    public SinglyLinkedList(){
        this.size = 0;
    }
    // Insert at head
    public void insertAtFirst(int value) {
        // Create new node
        Node new_node = new Node(value);
        new_node.next = head;
        head = new_node;
        // When the LL is completely empty
        if(tail == null){
            tail = head;
        }
        // Increase the size
        size += 1;
    }
    // Insert at end
    public void insertAtEnd(int value) {
        if(tail == null) {
            insertAtFirst(value);
            return;
        }
        // Create a node
        Node new_node = new Node(value);
        tail.next = new_node;
        tail = new_node;
        // Increase the size
        size += 1;
    }
    // Insert at index
    public void insertAtIndex(int value, int index){
        if(index == 0){
            insertAtFirst(value);
            return;
        }
        if(index == size){
            insertAtEnd(value);
            return;
        }
        Node temp = head;
        Node new_node = new Node(value);
        for(int i = 1 ; i < index ; i++){
            temp = temp.next;
        }
        new_node.next = temp.next;
        temp.next = new_node;
        size += 1;
    }
    // Display the LL
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END  ");
    }
    // Delete first
    public int deleteFirst(){
        // Value to be deleted
        int val = head.value;
        head = head.next;
        // In case there was only a single element in the list
        if(head == null){
            tail = null;
        }
        // Reduce size and return
        size -= 1;
        return val;
    }
    // Node class
    private class Node{
        // Node variables
        private int value;
        private Node next;
        // In case we pass only one arguement
        public Node(int value){
            this.value = value;
        }
        // In case both arguements are passed
        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.insertAtFirst(9);
        sll.insertAtFirst(5);
        sll.insertAtFirst(3);
        sll.insertAtEnd(8);
        sll.insertAtEnd(12);
        sll.insertAtEnd(18);
        sll.display();
        sll.insertAtIndex(14, 3);
        sll.display();
    }
}
