import java.util.*;

public class graph {
    // Variables for the graph data structure
    int vertices;                           // To store number of vertices
    LinkedList<Integer> adjacency_list[]; // To store the edges
    // Constructor to create the object
    public graph(int vertices){
        // Setting the number of vertices of the graph
        this.vertices = vertices;
        // Creating the adjacency matrix to store the edges
        this.adjacency_list = new LinkedList[vertices];
        // Initially making all the elements of the adjacency matrix as empty linked list
        for (int i = 0 ; i < vertices ; i++){
            this.adjacency_list[i] = new LinkedList<>();
        }
    }
    // Method to add edge to the graph
    public void addEdge(int source,int destination){
        // For directed
        this.adjacency_list[source].addLast(destination);
        // For undirected
        // this.adjacency_list[source].addLast(destination);
        // this.adjacency_list[destination].addLast(source);

    }
    // Method to print the adjacency list
    public void print_adjacency_list() {
        System.out.println("THE ADJACENCY LIST IS");
        for(int i = 0 ; i < this.vertices ; i++){
            System.out.println("|"+i+"|"+" => "+this.adjacency_list[i].toString());
        } 
    }
    // Method to print the graph in level wise manner
    public void breadth_first_search(int start){
        // Final result
        String result = "";
        // Visited array
        boolean[] visited_arr = new boolean [this.vertices];
        // Queue which will help us to traverse
        Queue<Integer> que = new LinkedList<Integer>();
        // Adding the starting point of traversal
        que.add(start);
        visited_arr[start] = true;
        // Traversing the graph
        while(que.isEmpty() == false){
            Integer removed = que.remove();
            result += removed;
            Integer[] array = this.adjacency_list[removed].toArray(new Integer[this.adjacency_list[removed].size()]);
            for(int i = 0 ; i < array.length ; i++){
                if(visited_arr[array[i]] == false){
                    que.add(array[i]);
                    visited_arr[array[i]] = true;
                }
            }
        }
        System.out.println("Breadth first search " + result);
    }
    // Method to print the graph in depth first search manner
    public void depth_first_search(int start){
        // Visited array
        Stack<Integer> visited_list = new Stack<>();
        // Stack to traverse the graph
        Stack<Integer> stack = new Stack<>();
        // Push the start
        stack.push(start);
        // Traversing the graph
        while(stack.isEmpty() == false){
            int top = stack.pop();
            visited_list.push(top);
            Object[] arr = this.adjacency_list[top].toArray();      // Returns the neighbours of the top of the stack
            for (int i = 0 ; i < arr.length ; i++){
                if(visited_list.contains(arr[i]) == false){
                    stack.push((Integer) arr[i]);
                }
            }
        }
        System.out.println("Stack is:- " + stack.toString());
        System.out.println("Depth first seach:- " + visited_list.toString());
    }
    // Method to detect cycles in a graph
    public void detect_cycle(int start){
        // Visited array
        Stack<Integer> visited_list = new Stack<>();
        // Stack to traverse the graph
        Stack<Integer> stack = new Stack<>();
        // Push the start
        stack.push(start);
        int flag = 0;
        // Traversing the graph
        while(stack.isEmpty() == false){
            int top = stack.pop();
            visited_list.push(top);
            Object[] arr = this.adjacency_list[top].toArray();      // Returns the neighbours of the top of the stack
            for (int i = 0 ; i < arr.length ; i++){
                if(visited_list.contains(arr[i]) == false){
                    stack.push((Integer) arr[i]);
                }else{
                    flag = 1;
                }
            }
        }
        System.out.println("Stack is:- " + stack.toString());
        System.out.println("Depth first seach:- " + visited_list.toString());
        if(flag == 1){
            System.out.println("Cycle exist");
        }else{
            System.out.println("Cycle does not exist");
        }
    }
    public static void main(String[] args) {
        graph g = new graph(6);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1,3);
        g.addEdge(3,4);
        g.addEdge(3,5);
        g.addEdge(4,1);
        // g.addEdge(5,0);
        g.print_adjacency_list();
        g.breadth_first_search(0);
        g.depth_first_search(0);
        g.detect_cycle(0);
    }
}

// Here adjacency list looks like this
//    0      1      2
// [[1->2],[2->3],[0->3]]
