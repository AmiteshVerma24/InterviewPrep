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

    // Insert at head
    public void insertAtHead(int value){
        Node newNode = new Node(value);             // New node to be added at start
        newNode.nextNode = this.headNode;                // Linking new Node with prev head Node
        newNode.prevNode = null;                    // Making prev Node of new head Node as null
        if (isEmpty()){                             // Function to link tail Node and prev Node of old head node
            tailNode = newNode;
        }
        else{
            headNode.prevNode = newNode;
        }
        this.headNode = newNode;                         // Updating the head Node
        size++;
    }

    // Insert at end
    public void insertAtTail(int value){
        if (isEmpty()){
            insertAtHead(value);
            return;
        }
        Node newNode = new Node(value);
        tailNode.nextNode = newNode;
        newNode.prevNode = this.tailNode;
        newNode.nextNode = null;
        this.tailNode = newNode;
        size++;
    }

    // Delete at head
    public void deleteAtHead(){
        headNode = headNode.nextNode;
        headNode.prevNode = null;
        size--;
    }

    // Delete at tail
    public void deleteAtTail(){
        tailNode = tailNode.prevNode;
        tailNode.nextNode = null;
        size--;
    }

    // Search by value
    public int search(int value){
        Node pointer = headNode;
        int index = 1;
        while(pointer.nextNode != null){
            if (pointer.data == value){
                return index;
            }
            pointer = pointer.nextNode;
            index++;
        }
        return -1;
    }

    // Print the linked list
    public void printLinkedList(){
        if (isEmpty()){
            System.out.println("The Double Linked List is Empty.");
            return;
        }
        System.out.print("NULL<-> "); 
        Node currentNode = headNode;
        while (currentNode.nextNode != null){
            String value = Integer.toString(currentNode.data); 
            System.out.print(value + " <-> ");
            currentNode = currentNode.nextNode;
        }
        String value = Integer.toString(currentNode.data);
        System.out.print(value + " <-> NULL\n"); 
    }


    public static void main(String[] args) {
        doublyLinkedList dll = new doublyLinkedList();
        for (int i = 0 ; i < 10 ; i++){
            dll.insertAtHead(i);
        }
        System.out.println(dll.tailNode.data);
        for (int i = 10 ; i <= 14 ; i++){
            dll.insertAtTail(i);
        }
        dll.printLinkedList();

        dll.deleteAtHead();
        dll.printLinkedList();

        int valueToSearch = 5;
        System.out.println("Value found at " + dll.search(valueToSearch));


    }

}
