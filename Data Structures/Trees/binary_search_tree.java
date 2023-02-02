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
    // 1. Set root method
    public void setRoot(Node root){
        this.root = root;
    }
    // 2. Get root method
    public Node getRoot(Node root){
        return this.root;
    }
    // 3. Check whether the tree is empty or not
    public boolean isEmpty(){
        if (this.number_of_nodes == 0){
            return true;
        }
        return false;
    }
    // 4. Find the least node of a subtree
    public Node findLeastNode(Node current_node){
        // As for delete method we need the least of right sub tree of current node
        Node temp = current_node.getRightNode();
        while(temp.getLeftNode() != null){
            temp = temp.getLeftNode();
        }
        return temp;
    }

    // Insertion in binary search tree
    public boolean insertNode(int value){
        // Creating new node for insertion
        Node newNode = new Node(value);
        // For base case
        if (isEmpty()){
            System.out.println("BST was empty inserting the root node");
            this.number_of_nodes++;
            setRoot(newNode);
            return true;
        }
        // All other cases
        Node currentNode = root;        // for traversing the binary search tree
        while(currentNode != null){
            // left insertion
            if (value <= currentNode.getData()){
                // checking if the left node is empty or not
                if(currentNode.getLeftNode() == null){
                    currentNode.setLeftNode(newNode);
                    this.number_of_nodes++;
                    return true;
                }
                currentNode = currentNode.getLeftNode();
            }
            // right insertion
            else{
                // checking if the right node is empty or not
                if(currentNode.getRightNode() == null){
                    currentNode.setRightNode(newNode);
                    this.number_of_nodes++;
                    return true;
                }
                currentNode = currentNode.getRightNode();
            }
        }
        return false;
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
                System.out.format("The element with %d found in BST.",value);
                return true;
            }
            // Traversing the Binary Search Tree
            if(value < currentNode.getData()){
                currentNode = currentNode.getLeftNode();
            }else{
                currentNode = currentNode.getRightNode();
            }
        }
        System.out.format("The element %d does not exist in BST.",value);
        return false;
    }
    // Delete element in BST
    public boolean delete(int value){
        // Testing for base case
        if(isEmpty()){
            System.out.println("Binary Search Tree is empty can't delete!");
            return false;
        }
        // Parent node to keep track of current node previous node
        Node parent_node = null;
        Node current_node = root;
        // For traversing the binary tree and searching for the node to be deleted
        while (current_node != null && current_node.getData() != value){
            if (value < current_node.getLeftNode().getData()){
                parent_node = current_node;
                current_node = current_node.getLeftNode();
            }else{
                parent_node = current_node;
                current_node = current_node.getRightNode();
            }
        }
        // if current node is null
        if(current_node == null){
            System.out.println("Can't delete node as it was null");
            return false;
        }
        // when node to be deleted is a leaf node
        else if(current_node.getLeftNode() == null && current_node.getRightNode() == null){
            // check if the node to be deleted is root
            if(root.getData() == current_node.getData()){
                setRoot(null);
                System.out.println("Root was deleted");
                return true;
            }
            // parent_node.data > current_node.data -> deleteleft child
            else if (current_node.getData() < parent_node.getData()){
                System.out.format("Node deleted: %d",current_node.getData());
                parent_node.setLeftNode(null);
                return true;
            }        
            // parent_node.data < current_node.data -> delete right child        
            else {
                System.out.format("Node deleted: %d",current_node.getData());
                parent_node.setRightNode(null);
                return true;
            }                                               
        }
        // when the node to be deleted has only one child
        // 1. has only left subtree
        else if(current_node.getRightNode() == null){
            // if the node to be deleted is root
            if(root.getData() == current_node.getData()){
                setRoot(current_node.getLeftNode());
                System.out.println("Root was updated");
                return true;
            }
            // checking which child to connect parent node with
            // parent_node.data > current_node.data --> link parent_node.left with current_node.left
            else if(parent_node.getData() > current_node.getData()){
                parent_node.setLeftNode(current_node.getLeftNode());
                return true;
            }
            // parent_node.data < current_node.data -> link parent_node.right with current_node.left
            else{
                parent_node.setRightNode(current_node.getLeftNode());
                return true;
            }
        }
        // 2. has only right subtree
        else if(current_node.getLeftNode() == null){
            // if the node to be deleted is root
            if(root.getData() == current_node.getData()){
                setRoot(current_node.getRightNode());
                System.out.println("Root was updated");
                return true;
            }
            // checking which child to connect parent node with
            // parent_node.data > current_node.data --> link parent_node.left with current_node.right
            else if(parent_node.getData() > current_node.getData()){
                System.out.format("Node deleted: %d",current_node.getData());
                parent_node.setLeftNode(current_node.getRightNode());
            }
            // parent_node.data < current_node.data --> link parent_node.right with current_node.right
            else{
                parent_node.setRightNode(current_node.getRightNode());
            }
        }
        // Has subtrees on both the sides
        else{
            // The least node of the right sub tree
            Node leastNode = findLeastNode(current_node);
            int tempData = leastNode.getData();
            // Switching the data of the node to be deleted and least node
            leastNode.setData(current_node.getData()) ;
            current_node.setData(tempData);
            // Deleting the least node by calling the delete function recursively
            delete(leastNode.getData());
            return true;
        }
        return false;
    }
    // Pre order traverse in BST
    public void pre_order_traverse(Node root){
        // When the binary search tree is empty
        if (number_of_nodes == 0){
            System.out.println("The BST is empty!");
            return;
        }
        // Checking if the root in null
        if(root == null){
            return;
        }
        System.out.format("%d, ",root.getData());
        // Going to the left node
        pre_order_traverse(root.getLeftNode());
        // Going to the right node
        pre_order_traverse(root.getRightNode());
    }
    // In order traversal in BST
    public void in_order_traverse(Node root){
        // When the binary search tree is empty
        if (number_of_nodes == 0){
            System.out.println("The BST is empty!");
            return;
        }
        if (root == null){
            return;
        }
        // Going to the left node
        in_order_traverse(root.getLeftNode());
        System.out.format("%d, ",root.getData());
        // Going to the right node
        in_order_traverse(root.getRightNode());
    }
    // Post order traversal in BST
    public void post_order_traverse(Node root){
        // When the binary search tree is empty
        if (number_of_nodes == 0){
            System.out.println("The BST is empty!");
            return;
        }
        if (root == null){
            return;
        }
        // Going to the left node
        post_order_traverse(root.getLeftNode());
        // Going to the right node
        post_order_traverse(root.getRightNode());
        System.out.format("%d, ",root.getData());
    }
    public static void main(String[] args) {
        // Initializing variables
        Scanner sc = new Scanner(System.in);
        int choice, isContinue = 1;
        // Creating binary search tree object
        binary_search_tree bst = new binary_search_tree();
        while(isContinue == 1){
            // Taking user input
            System.out.print("\nWhat would you like to do?\n1.Insert a node\n2.Search for a node\n3.Delete a node\n4.Pre-order traverse\n5.In-order traverse\n6.Post-order traverse\nEnter your choice:- ");
            choice = sc.nextInt();
            // Calling methods based on user input
            switch(choice){
                case 1:
                    System.out.print("Enter the value to insert: ");
                    int value = sc.nextInt();
                    bst.insertNode(value);
                    break;
                case 2:
                    System.out.print("Enter the value to search for: ");
                    int search = sc.nextInt();
                    bst.search(search);
                    break;
                case 3:
                    System.out.print("Enter the value to delete: ");
                    int delete = sc.nextInt();
                    bst.delete(delete);
                    break;
                case 4:
                    System.out.println("The Binary Search Tree in pre-order form is:\n");
                    bst.pre_order_traverse(bst.root);
                    break;
                case 5:
                    System.out.println("The Binary Search Tree in in-order form is:\n");
                    bst.in_order_traverse(bst.root);
                    break;
                case 6:
                    System.out.println("The Binary Search Tree in post-order form is:\n");
                    bst.post_order_traverse(bst.root);
                    break;
                default:
                    System.out.println("INVALID CHOICE!");
            }
        }
    }

}