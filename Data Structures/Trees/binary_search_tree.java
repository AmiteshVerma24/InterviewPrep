import java.util.*;

// Node class for holding info
class Node{
    // Variables
    private int data;
    private Node leftNode;
    private Node rightNode;
    // Constructors
    public Node(int data){
        this.data = data;
        this.leftNode = null;
        this.rightNode = null;
    }
    // Helper functions
    public int getData(){
        return data;
    }
    public Node getLeftNode(){
        return this.leftNode;
    }
    public Node getRightNode(){
        return this.rightNode;
    }
    public void setData(int data){
        this.data = data;
    }
    public void setLeftNode(Node leftNode){
        this.leftNode = leftNode;
    }
    public void setRightNode(Node righNode){
        this.rightNode = righNode;
    }
}
// Binary Search Tree class
class binary_search_tree{
    // Variable
    public Node root;
    public int number_of_nodes;
    // Constructor
    public binary_search_tree(){
        this.root = null;
        this.number_of_nodes = 0;
    }
    // Helper methods
    public void setRoot(Node root){
        this.root = root;
    }
    public Node getRoot(Node root){
        return this.root;
    }
    public boolean isEmpty(){
        if (this.number_of_nodes == 0){
            return true;
        }
        return false;
    }
    // Insertion in binary search tree
    public void insertNode(int value){
        // Creating new node for insertion
        Node newNode = new Node(value);
        // For base case
        if (isEmpty()){
            System.out.println("BST was empty inserting the root node");
            setRoot(newNode);
        }
        // All other cases
        Node currentNode = root;        // for traversing the binary search tree
        while(currentNode != null){
            // left insertion
            if (value <= currentNode.getData()){
                // checking if the left node is empty or not
                if(currentNode.getLeftNode() == null){
                    currentNode.setLeftNode(newNode);
                }
                currentNode = currentNode.getLeftNode();
            }
            // right insertion
            else{
                // checking if the right node is empty or not
                if(currentNode.getRightNode() == null){
                    currentNode.setRightNode(newNode);
                }
                currentNode = currentNode.getRightNode();
            }
        }
    }
    // Search elemnt in BST
    public boolean search(int value){
        // Testing for base case
        if(isEmpty()){
            System.out.println("Binary Search Tree is empty!");
            return false;
        }
        // For all other cases
        Node currentNode = root;
        while(currentNode != null){
            // Checking for value
            if(currentNode.getData() == value){
                System.out.format("The NODE with value %d exists in Binary Search Tree.",value);
                return true;
            }
            // Traversing the Binary Search Tree
            if(value <= currentNode.getData()){
                currentNode = currentNode.getLeftNode();
            }else{
                currentNode = currentNode.getRightNode();
            }
        }
        return false;
    }
    public static void main(String[] args) {
        
    }

}