//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());

            ArrayList<Integer> ans = new Solution().nthRowOfPascalTriangle(n);
            printAns(ans);

            System.out.println("~");
        }
    }

    public static void printAns(ArrayList<Integer> ans) {
        for (Integer x : ans) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {

    ArrayList<Integer> nthRowOfPascalTriangle(int n) {
        // code here
                ArrayList<Integer> row = new ArrayList<>();
        if (n == 0) {
            return row;
        }
        row.add(1);
        for (int k = 1; k < n; k++) {
            // Using the formula: C(n-1, k) = C(n-1, k-1) * (n - 1 - k + 1) / k
            // Which simplifies to C(n-1, k) = C(n-1, k-1) * (n - k) / k
            long next = ((long) row.get(k - 1) * (n - k)) / k;
            row.add((int) next);
        }
        return row;
    }
}