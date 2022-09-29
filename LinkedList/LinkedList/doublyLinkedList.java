package LinkedList;
public class doublyLinkedList {
    // Variables
    public Node headNode;
    public int size;
    public Node tailNode;

    // Class node
    public class Node{
        public int data;                       // Data to store
        public Node nextNode;                  // Next node
        public Node prevNode;                  // Previous node
        public Node(int data){          // Create new node
            this.data = data;
        }
    }

    // Constructors
    public doublyLinkedList(){
        this.size = 0;
        this.headNode = null;
        this.tailNode = null;
    }

    // Helper to check if linked list is empty or not
    public boolean isEmpty(){
        if (headNode == null && tailNode == null){
            return true;
        }
        return false;
    }

    public void insertAtHead(int value){
        Node newNode = new Node(value);             // New node to be added at start
        newNode.nextNode = headNode;                // Linking new Node with prev head Node
        newNode.prevNode = null;                    // Making prev Node of new head Node as null
        if (isEmpty()){                             // Function to link tail Node and prev Node of old head node
            tailNode = newNode;
        }
        else{
            headNode.prevNode = newNode;
        }
        headNode = newNode;                         // Updating the head Node
    }

    public void printLinkedList(){
        if (isEmpty()){
            System.out.println("The Double Linked List is Empty.");
            return;
        }
        Node pointer = headNode;
        System.out.print("null <-> ");        
        while (pointer.nextNode != null){
            System.out.print(pointer.data + " <-> ");
            pointer = pointer.nextNode;
        }
        System.out.print("null");   
    }


    public static void main(String[] args) {
        doublyLinkedList dll = new doublyLinkedList();
        for (int i = 0 ; i < 10 ; i++){
            dll.insertAtHead(i);
        }
        dll.printLinkedList();
    }

}
