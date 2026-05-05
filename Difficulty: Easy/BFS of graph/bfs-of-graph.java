import java.util.*;

class Solution {
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        
        int V = adj.size(); // number of vertices
        
        ArrayList<Integer> result = new ArrayList<>();
        boolean[] visited = new boolean[V];
        
        Queue<Integer> queue = new LinkedList<>();
        
        // Start from node 0
        queue.add(0);
        visited[0] = true;
        
        while (!queue.isEmpty()) {
            int node = queue.poll();
            result.add(node);
            
            // Traverse neighbors
            for (int neighbor : adj.get(node)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
        
        return result;
    }
}