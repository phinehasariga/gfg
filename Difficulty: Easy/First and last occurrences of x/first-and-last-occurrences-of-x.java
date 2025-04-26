//{ Driver Code Starts
// Initial Template for Java

// Initial Template for Java
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {
            int x = Integer.parseInt(br.readLine().trim()); // Inputting the testcases

            String inputLine1[] = br.readLine().trim().split(" ");
            int n = inputLine1.length;
            int arr[] = new int[(int)(n)];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine1[i]);
            }

            Solution obj = new Solution();
            ArrayList<Integer> ans = obj.firstAndLast(x, arr);

            for (Integer val : ans) System.out.print(val + " ");
            System.out.println();
        
System.out.println("~");
}
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    public ArrayList<Integer> firstAndLast(int x, int arr[]) {
        // Code here
                ArrayList<Integer> result = new ArrayList<>();
        int first = findFirst(arr, x);
        int last = findLast(arr, x);
        
        if (first == -1) {
            result.add(-1);
        } else {
            result.add(first);
            result.add(last);
        }
        return result;
    }
    
    private int findFirst(int[] arr, int x) {
        int low = 0;
        int high = arr.length - 1;
        int res = -1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == x) {
                res = mid;
                high = mid - 1;
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return res;
    }
    
    private int findLast(int[] arr, int x) {
        int low = 0;
        int high = arr.length - 1;
        int res = -1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == x) {
                res = mid;
                low = mid + 1;
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return res;
    }
}
