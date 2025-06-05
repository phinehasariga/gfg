class Solution {
    public int countPaths(int[][] edges, int V, int src, int dest) {
        // Code here
                List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            adj.get(edge[0]).add(edge[1]);
        }
        
        // Perform topological sort using Kahn's algorithm
        int[] inDegree = new int[V];
        for (int[] edge : edges) {
            inDegree[edge[1]]++;
        }
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < V; i++) {
            if (inDegree[i] == 0) {
                queue.add(i);
            }
        }
        List<Integer> topOrder = new ArrayList<>();
        while (!queue.isEmpty()) {
            int u = queue.poll();
            topOrder.add(u);
            for (int v : adj.get(u)) {
                inDegree[v]--;
                if (inDegree[v] == 0) {
                    queue.add(v);
                }
            }
        }
        
        // Initialize DP array
        int[] dp = new int[V];
        dp[dest] = 1; // Base case
        
        // Process nodes in reverse topological order
        for (int i = topOrder.size() - 1; i >= 0; i--) {
            int u = topOrder.get(i);
            for (int v : adj.get(u)) {
                dp[u] += dp[v];
            }
        }
        
        return dp[src];
    }
}