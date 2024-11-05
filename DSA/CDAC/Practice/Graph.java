import java.io.*;
import java.util.*;

class Graph {
    private int V;
    private LinkedList<Integer>[] adj; 

    public Graph(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++)
            adj[i] = new LinkedList<>();
    }

    void addEdge(int v, int w) {
        adj[v].add(w); 
    }

    void DFSUtil(int vertex, boolean[] visited) {
        visited[vertex] = true; 
        System.out.print(vertex + " ");
        for (int neighbor : adj[vertex]) {
            if (!visited[neighbor]) {
                DFSUtil(neighbor, visited);
            }
        }
    }

    void DFS(int v) {
        boolean[] visited = new boolean[V]; 
        DFSUtil(v, visited);
    }

    public static void main(String args[]) {
        Graph g = new Graph(6);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 0);
        g.addEdge(1, 3);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 4);
        g.addEdge(3, 5);
        g.addEdge(4, 3);
        g.addEdge(5, 3);

        System.out.println("Following is Depth First Traversal: ");
        g.DFS(0);
    }
}