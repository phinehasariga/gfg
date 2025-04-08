//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class gfg
{
    
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            String s[] = read.readLine().trim().split("\\s+");
            
            int N = Integer.parseInt(s[0]);
            int K = Integer.parseInt(s[1]);
            
            int arr[] = new int[N];
            
            String st[] = read.readLine().trim().split("\\s+");
            
            for(int i = 0; i < N; i++)
            {
                arr[i] = Integer.parseInt(st[i]);
            }
            
            Solution obj = new Solution();
            
            System.out.println(obj.ternarySearch(arr, N, K));
        
System.out.println("~");
}
    }
}
// } Driver Code Ends



class Solution{

    static int ternarySearch(int arr[], int N, int K)
    {
        // Your code here
        int low = 0, high = N - 1;

        while (low <= high) {
            int mid1 = low + (high - low) / 3;
            int mid2 = high - (high - low) / 3;

            if (arr[mid1] == K) {
                return 1; // Found
            }
            if (arr[mid2] == K) {
                return 1; // Found
            }

            if (K < arr[mid1]) {
                high = mid1 - 1;
            } else if (K > arr[mid2]) {
                low = mid2 + 1;
            } else {
                low = mid1 + 1;
                high = mid2 - 1;
            }
        }

        return -1; // Not found
    
    }
}