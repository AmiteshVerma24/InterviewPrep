package LinkedList;

public class linkedlist {
    // Variables
    public Node headNode;           // To hold head element
    public int size;                // To hold the size
    // Class node
    public class Node{
        int data;                   // Hold data of node
        Node nextNode;              // Address of next node
        public Node(int data){      // Function to create new node
            this.data = data;
        }
    }

    // Constructor
    public linkedlist(){
        headNode = null;
        size = 0;
    }

    // Insert at head
    public void insertAtHead(int value){
        Node newNode = new Node(value);     // Creating new node
        newNode.nextNode = headNode;        // Joining the new node to head node
        headNode = newNode;                 // Making the head node to point to new node at start
        size++;                             // Increasing the size
    }

    // Insert at end
    public void insertAtEnd(int value){
        Node newNode = new Node(value);
        newNode.nextNode = null;

        Node last = headNode;
        while(last.nextNode != null){
            last = last.nextNode;
        }
        last.nextNode = newNode;
        size++;
    }

    // Print list
    public void printList(){
        Node currentNode = headNode;
        while (currentNode.nextNode != null){
            String value = Integer.toString(currentNode.data); 
            System.out.print(value + " -> ");
            currentNode = currentNode.nextNode;
        }
        String value = Integer.toString(currentNode.data);
        System.out.print(value + " -> NULL\n");
    }
    
    public static void main(String[] args) {
        linkedlist myLinkedList = new linkedlist();
        for (int i = 0 ; i < 10 ; i++){
            myLinkedList.insertAtHead(i);
            myLinkedList.printList();
        }
        myLinkedList.printList();

        myLinkedList.insertAtEnd(100);
        myLinkedList.printList();

    }
}