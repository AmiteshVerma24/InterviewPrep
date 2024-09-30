package Trees;
import java.util.*;

public class BinaryTree {
    // Node class
    private static class Node {
        private int value;
        Node left;
        Node right;
        public Node(int value) {
            this.value = value;
        }
    }
    // Identity of tree
    public static Node root;
    // Insert the root value then call for filling the tree
    public static void populate (Scanner sc) {
        System.out.println("Enter the root Node: ");
        int value = sc.nextInt();
        root = new Node(value);
        populateTree(sc, root);
    }
    public static void populateTree (Scanner sc, Node current) {
        System.out.println("Do you want to enter the left of " + current.value + "?");
        boolean left = sc.nextBoolean();
        if (left) {
            System.out.println("Enter the value of the left of " + current.value);
            int value = sc.nextInt();
            current.left = new Node(value);
            populateTree(sc, current.left);
        }
        System.out.println("Do you want to enter the right of " + current.value + "?");
        boolean right = sc.nextBoolean();
        if (right) {
            System.out.println("Enter the value of the right of " + current.value);
            int value = sc.nextInt();
            current.right = new Node(value);
            populateTree(sc, current.right);
        }
    }

    public static void display(Node current, String indent) {
        if (current == null) return;
        System.out.println(indent + current.value);
        display(current.left, indent + "\t");
        display(current.right, indent + "\t");
    }

    public static void prettyDisplay(Node current, int level) {
        if (current == null) {
            return;
        }
        prettyDisplay(current.right, level + 1);
        if (level != 0) {
            for (int i = 0; i < level - 1; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|------->" + current.value);
        } else {
            System.out.println(current.value);
        }
        prettyDisplay(current.left, level + 1);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        populate(sc);
        display(root, "");
        prettyDisplay(root, 0);
    }
}
