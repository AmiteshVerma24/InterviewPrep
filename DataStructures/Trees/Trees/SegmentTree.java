package Trees;
public class SegmentTree {
    private class Node {
        public int data;
        public int startInterval;
        public int endInterval;
        public Node left;
        public Node right;
        public Node(int startInterval, int endInterval) {
            this.startInterval = startInterval;
            this.endInterval = endInterval;
        }
     }

     Node root; 

    public SegmentTree (int [] arr) {
        this.root = constructTree(arr, 0, arr.length - 1);
    }

    public Node constructTree(int [] arr, int startInterval, int endInterval) {
        if (startInterval == endInterval) {
            Node node = new Node(startInterval, endInterval);
            node.data = arr[startInterval];
            return node;
        }
        Node node = new Node(startInterval, endInterval); 
        int mid = startInterval + (endInterval - startInterval) / 2;
        // Left
        node.left = constructTree(arr, startInterval, mid);
        // Right 
        node.right = constructTree(arr, mid + 1, endInterval);
        // Update sum
        node.data = node.left.data + node.right.data;
        // Return the node
        return node;
    }

    public static void main(String[] args) {
        int [] arr = {3, 8, 7, 6, -2, -8, 4, 9}; 
        SegmentTree st = new SegmentTree(arr);
        
    }
}
