import java.io.*;
import java.util.*;

class Graph {
    private int V; // number of nodes
    private LinkedList<Integer>[] adj; // adjacency list

    public Graph(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++)
            adj[i] = new LinkedList<>();
    }

    void addEdge(int v, int w) {
        adj[v].add(w); // adding an edge to the adjacency list (edges are bidirectional in this example)
    }

    void DFSUtil(int vertex, boolean[] visited) {
        visited[vertex] = true; // mark the node as explored
        System.out.print(vertex + " ");
        for (int neighbor : adj[vertex]) {
            if (!visited[neighbor]) {
                DFSUtil(neighbor, visited);
            }
        }
    }

    void DFS(int v) {
        boolean[] visited = new boolean[V]; // initialize a new boolean array to store the details of explored nodes
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