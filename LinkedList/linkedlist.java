package LinkedList;

public class linkedlist {

    public Node headNode;           // To hold head element
    public int size;                // To hold the size

    public class Node{
        int data;                   // Hold data of node
        Node nextNode;              // Address of next node
        public Node(int data){      // Function to create new node
            this.data = data;
        }
    }

    public linkedlist(){
        headNode = null;
        size = 0;
    }

    public void insertAtHead(int value){
        Node newNode = new Node(value);     // Creating new node
        newNode.nextNode = headNode;        // Joining the new node to head node
        headNode = newNode;                 // Making the head node to point to new node at start
        size++;                             // Increasing the size
    }

    public void printList(){
        Node currentNode = headNode;
        while (currentNode.nextNode != null){
            String value = Integer.toString(currentNode.data); 
            System.out.print(value + " -> ");
        }
        String value = Integer.toString(currentNode.data);
        System.out.print(value + " -> NULL");
    }
    
    public static void main(String[] args) {
        linkedlist myLinkedList = new linkedlist();
        for (int i = 0 ; i < 10 ; i++){
            myLinkedList.insertAtHead(i);
        }
        myLinkedList.printList();
    }
}