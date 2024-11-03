//package Graph;

//public class DFS_Adj_Matrix {
    
//}


import java.util.Arrays;

class DFS_Adj_Matrix {

    // Helper method to perform DFS traversal
    // Checks if there's a path from src to dest
    private boolean helper(int n, int[][] graph, int src, int dest, boolean[] vis) {
        // Base case: if src and dest are the same, path exists
        if(src == dest) return true;

        // Mark the current node as visited
        vis[src] = true;

        // Traverse all nodes to find adjacent nodes of src
        for(int i = 0; i < n; i++) {
            // Check if there is an edge from src to i and i is unvisited
            if(graph[src][i] == 1 && !vis[i]) {
                // Recursively check if there's a path from i to dest
                if(helper(n, graph, i, dest, vis))
                    return true; // Path found, return true
            }
        }

        // No path found from this node, return false
        return false;
    }

    // Main method to check if a valid path exists from source to destination
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        // Initialize an adjacency matrix of size n x n
        int[][] graph = new int[n][n]; // Alternatively, we can use a 2D boolean array
        boolean[] vis = new boolean[n]; // Visited array to keep track of visited nodes

        // Initialize adjacency matrix with 0, indicating no edges
        for(int[] row: graph) {
            Arrays.fill(row, 0);
        }

        // Populate the adjacency matrix based on the edges list
        for(int[] edge: edges) {
            int u = edge[0]; // Starting node of the edge
            int v = edge[1]; // Ending node of the edge
            graph[u][v] = 1; // Mark edge u -> v
            graph[v][u] = 1; // Mark edge v -> u (since the graph is undirected)
        }

        // Use DFS to check if a path exists from source to destination
        return helper(n, graph, source, destination, vis);
    }
}
