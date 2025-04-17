//{ Driver Code Starts
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = Integer.parseInt(sc.nextLine());

        while (t-- > 0) {
            int V = Integer.parseInt(sc.nextLine());
            int E = Integer.parseInt(sc.nextLine());

            List<int[]> edgeList = new ArrayList<>();

            for (int i = 0; i < E; i++) {
                String[] parts = sc.nextLine().split(" ");
                int u = Integer.parseInt(parts[0]);
                int v = Integer.parseInt(parts[1]);
                int w = Integer.parseInt(parts[2]);
                edgeList.add(new int[] {u, v, w});
                edgeList.add(new int[] {v, u, w});
            }

            int[][] edges = new int[edgeList.size()][3];
            for (int i = 0; i < edgeList.size(); i++) {
                edges[i] = edgeList.get(i);
            }

            Solution obj = new Solution();
            int res = obj.findMinCycle(V, edges);

            System.out.println(res);
        }

        sc.close();
    }
}

// } Driver Code Ends


class Solution {
    public int findMinCycle(int V, int[][] edges) {
        // code here
        int minCycle = Integer.MAX_VALUE;
        
        // Build adjacency list
        List<List<int[]>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            int w = edge[2];
            adj.get(u).add(new int[]{v, w});
            adj.get(v).add(new int[]{u, w});
        }
        
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            int w = edge[2];
            
            // Temporarily remove the edge u-v
            // To simulate removal, during Dijkstra's, skip the edge from u to v and v to u
            
            // Dijkstra's algorithm to find the shortest path from u to v, avoiding the current edge
            PriorityQueue<int[]> heap = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
            heap.offer(new int[]{u, 0});
            int[] dist = new int[V];
            Arrays.fill(dist, Integer.MAX_VALUE);
            dist[u] = 0;
            boolean[] visited = new boolean[V];
            
            while (!heap.isEmpty()) {
                int[] current = heap.poll();
                int currentNode = current[0];
                int currentDist = current[1];
                
                if (currentNode == v) {
                    break;
                }
                
                if (visited[currentNode]) {
                    continue;
                }
                visited[currentNode] = true;
                
                for (int[] neighborInfo : adj.get(currentNode)) {
                    int neighbor = neighborInfo[0];
                    int weight = neighborInfo[1];
                    
                    // Skip the edge we are checking
                    if ((currentNode == u && neighbor == v) || (currentNode == v && neighbor == u)) {
                        continue;
                    }
                    
                    if (dist[neighbor] > currentDist + weight) {
                        dist[neighbor] = currentDist + weight;
                        heap.offer(new int[]{neighbor, dist[neighbor]});
                    }
                }
            }
            
            if (dist[v] != Integer.MAX_VALUE) {
                int cycleWeight = dist[v] + w;
                if (cycleWeight < minCycle) {
                    minCycle = cycleWeight;
                }
            }
        }
        
        return minCycle != Integer.MAX_VALUE ? minCycle : -1;
    }
}