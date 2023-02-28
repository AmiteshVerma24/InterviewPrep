package Graphs;
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
        // Visited array
        Queue<Integer> visited_list = new LinkedList<>(); 
        // Exploration queue to help traversing
        Queue<Integer> exploration_queue = new LinkedList<>();
        // Adding the node from which the graph has to be traversed
        visited_list.add(start);
        exploration_queue.add(start);
        while(exploration_queue.isEmpty() == false){
            // Pop the head of the queue
            int element = exploration_queue.remove();
            // Traversing the adjacency list to find the adjacent edges of the popped node
            Object[] arr = this.adjacency_list[element].toArray();
            for (int i = 0 ; i < arr.length ; i++){
                if((visited_list.contains((Integer) arr[i]) == false)){
                    visited_list.add((Integer) arr[i]);
                    exploration_queue.add((Integer) arr[i]);
                }
                
            }
            
        }
        System.out.println("The Graph in breadth first manner is: "+visited_list.toString());
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
    public static void main(String[] args) {
        graph g = new graph(5);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1,4);
        g.addEdge(1,3);
        g.addEdge(2,0);
        g.addEdge(2,3);
        g.print_adjacency_list();
        g.breadth_first_search(0);
        g.depth_first_search(0);
    }
}
