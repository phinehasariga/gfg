class Solution {
    // Function to return Breadth First Search Traversal of given graph.
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        ArrayList<Integer> bfsTraversal = new ArrayList<>();
        int V = adj.size();
        boolean[] visited = new boolean[V]; 
        Queue<Integer> queue = new LinkedList<>();

 
        queue.offer(0);
        visited[0] = true;

        while (!queue.isEmpty()) {
            int node = queue.poll();
            bfsTraversal.add(node);

           
            for (int neighbor : adj.get(node)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.offer(neighbor);
                }
            }
        }
        
        return bfsTraversal;
    }
}