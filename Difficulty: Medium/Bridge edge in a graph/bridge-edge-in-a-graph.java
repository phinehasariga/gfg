//{ Driver Code Starts
import java.util.*;


// } Driver Code Ends

class Solution {
    private int time;
    private List<Integer>[] graph;
    private boolean[] visited;
    private int[] disc;
    private int[] low;
    private List<int[]> bridges;

    public boolean isBridge(int V, int[][] edges, int c, int d) {
        // Step 1: Build graph as adjacency list
        graph = new ArrayList[V];
        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            graph[u].add(v);
            graph[v].add(u);
        }

        // Step 2: Initialize helper arrays
        visited = new boolean[V];
        disc = new int[V];
        low = new int[V];
        time = 0;
        bridges = new ArrayList<>();

        // Step 3: Run DFS to find all bridges
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                dfs(i, -1);
            }
        }

        // Step 4: Check if edge (c, d) or (d, c) is a bridge
        for (int[] bridge : bridges) {
            if ((bridge[0] == c && bridge[1] == d) || (bridge[0] == d && bridge[1] == c)) {
                return true;
            }
        }

        return false;
    }

    private void dfs(int u, int parent) {
        visited[u] = true;
        disc[u] = low[u] = time++;

        for (int v : graph[u]) {
            if (v == parent) continue;

            if (!visited[v]) {
                dfs(v, u);
                low[u] = Math.min(low[u], low[v]);

                if (low[v] > disc[u]) {
                    bridges.add(new int[]{u, v});
                }
            } else {
                low[u] = Math.min(low[u], disc[v]);
            }
        }
    }
}
        // code here
    


//{ Driver Code Starts.

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = Integer.parseInt(sc.nextLine().trim());
        while (t-- > 0) {
            // V and E on separate lines
            int V = Integer.parseInt(sc.nextLine().trim());
            int E = Integer.parseInt(sc.nextLine().trim());

            // Using a 2D array to store edges.
            int[][] edges = new int[E][2];
            for (int i = 0; i < E; i++) {
                // Use split("\\s+") to handle one or more whitespace characters
                String[] parts = sc.nextLine().trim().split("\\s+");
                edges[i][0] = Integer.parseInt(parts[0]);
                edges[i][1] = Integer.parseInt(parts[1]);
            }

            // c and d on separate lines
            int c = Integer.parseInt(sc.nextLine().trim());
            int d = Integer.parseInt(sc.nextLine().trim());

            Solution obj = new Solution();
            boolean result = obj.isBridge(V, edges, c, d);
            System.out.println(result ? "true" : "false");
            System.out.println("~");
        }

        sc.close();
    }
}
// } Driver Code Ends