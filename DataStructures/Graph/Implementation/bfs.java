package Graph.Implementation;

import java.util.ArrayList;
import java.util.List;

public class bfs {
    public static List<Integer> bfsTraversal(Graph graph, int source) {
        return bfs(graph, source);
    }

    public static List<Integer> bfs(Graph graph, int source) {
        List<Integer> ans = new ArrayList<>();
        Queue<Integer> queue = new Queue<>(graph.vertices);

        boolean[] visited = new boolean[graph.vertices];
        queue.enqueue(source); visited[source] = true;

        while(!queue.isEmpty()) {
            // Dequeue a vertex from queue and add it to the result
            int current = queue.dequeue();
            ans.add(current);
            LinkedList<Integer>.Node temp = graph.adjacencyList[current].headNode;
            // Get all adjacent vertices of the dequeued vertex current
            while (temp != null) {
                if (!visited[temp.data]) {
                    queue.enqueue(temp.data);
                    visited[temp.data] = true; 
                }
                temp = temp.nextNode;
            }
        }
        return ans;
    }
}
