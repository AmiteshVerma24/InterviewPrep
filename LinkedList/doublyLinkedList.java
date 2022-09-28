package LinkedList;

public class doublyLinkedList {
    // Variables
    public Node headNode;
    public Node tailNode;
    public int size;
    // Class node
    public class Node{
        int data;                   // Data of new node
        Node nextNode;              // Address of next node
        Node prevNode;              // Address of previous node
        Node (int data){            // Function to create a new node
            this.data = data;
        }
    }
    // Constructor
    public doublyLinkedList(){
        this.headNode = null;
        this.tailNode = null;
        this.size = 0;
    }
    // Helper to check whether empty or not
    public boolean isEmpty(){
        if (headNode == null && tailNode == null){
            return true;
        }
        return false;
    }
    // Insert at head
    public void insertAtHead(int value){
        // Node newNode = new Node(value);
        
    }

}
