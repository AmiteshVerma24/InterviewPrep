package Trees;
import Trees.BinarySearchTree;

public class AVL {
    public class Node{
        private int height;
        private int val;
        private Node left;
        private Node right;
        public Node (int val) {
            this.val = val;
        }
        public int getValue() {
            return val;
        }
    }
    // Root of BST
    private static Node root;
    // Constructor
    public AVL() {

    }
    // Get height of node
    public static int getHeight() {
        return getHeight(root);
    }
    public static int getHeight(Node node) {
        if (node == null) return -1;
        return node.height;
    }
    // Is empty
    public boolean isEmpty() {
        return root == null;
    }
    // Insert
    public void insert(int value) {
        root = insert(value, root);
    }
    public Node insert(int value, Node node) {
        // Empty BST
        if (node == null) {
            Node newNode = new Node(value);
            return newNode;
        }
        // Left traversal
        if (value < root.val) {
            node.left = insert(value, node.left);
        }
        // Right traversal
        if (value > root.val) {
            node.right = insert(value, node.right);
        }
        // Update the height as we have increased the node on either left or right
        node.height = Math.max(getHeight(node.left), getHeight(node.right)) + 1;
        // Return back
        return rotate(node);
    }

    public static Node rotate(Node node) {
        // If height-left - height-right > 1 ==> It means the tree is left heavy where we have two cases

        // Left heavy
        if (getHeight(node.left) - getHeight(node.right) > 1){
            // Left-left
            if (getHeight(node.left.left) - getHeight(node.left.right) > 0) {
                return rightRotate(node);
            }
            // Left-right
            if (getHeight(node.left.left) - getHeight(node.left.right) < 0) {
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }
        }
        // Right heavy
        if (getHeight(node.left) - getHeight(node.right) < -1){
            // Right-right
            if (getHeight(node.right.left) - getHeight(node.right.right) < 0) {
                return leftRotate(node);
            }
            // Right-left
            if (getHeight(node.right.left) - getHeight(node.right.right) > 0) {
                node.left = rightRotate(node.left);
                return leftRotate(node);
            }
        }
        return node;
    }

    public static Node rightRotate(Node parent) {
        Node child = parent.left; 
        Node tree = child.right;
        child.right = parent;
        parent.left = tree;
        parent.height = Math.max(getHeight(parent.left), getHeight(parent.right)) + 1;
        child.height = Math.max(getHeight(child.left), getHeight(child.right)) + 1;
        return child;
    }

    public static Node leftRotate(Node child) {
        Node parent = child.right;
        Node tree = child.left;
        parent.left = child;
        child.right = tree;
        parent.height = Math.max(getHeight(parent.left), getHeight(parent.right)) + 1;
        child.height = Math.max(getHeight(child.left), getHeight(child.right)) + 1;
        return parent;
    }

    // Pre-order traversal
    public static void preorder(Node root) {
        if (root == null) return;
        System.out.print(root.val + " -> ");
        preorder(root.left);
        preorder(root.right);
    }
    // In-order traversal
    public static void inorder(Node root) {
        if (root == null) return;
        preorder(root.left);
        System.out.print(root.val + " -> ");
        preorder(root.right);
    }
    // Post-order traversal
    public static void postorder(Node root) {
        if (root == null) return;
        preorder(root.left);
        preorder(root.right);
        System.out.print(root.val + " -> ");
    }
    public static void main(String[] args) {
        AVL avl = new AVL();
        for (int i = 0 ; i < 1000 ; i++) {
            avl.insert(i);
        }
        System.out.println(getHeight());
    }

}
