package Trees;

public class BinarySearchTree {
    // Node class
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
    public BinarySearchTree() {

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
        if (value < root.getValue()) {
            node.left = insert(value, node.left);
        }
        // Right traversal
        if (value > root.getValue()) {
            node.right = insert(value, node.right);
        }
        // Update the height as we have increased the node on either left or right
        node.height = Math.max(getHeight(node.left), getHeight(node.right)) + 1;
        // Return back
        return node;
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
        BinarySearchTree bst = new BinarySearchTree();
        for (int i = 0 ; i < 1000 ; i++) {
            bst.insert(i);
        }
        System.out.println(getHeight());
    }
}

