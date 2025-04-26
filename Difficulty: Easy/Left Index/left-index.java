//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        PrintWriter out = new PrintWriter(System.out);
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            String input_line[] = read.readLine().trim().split("\\s+");
            int arr[]= new int[N];
            for(int i = 0; i < N; i++)
                arr[i] = Integer.parseInt(input_line[i]);
            int X = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            out.println(ob.leftIndex(N, arr, X));
        
out.println("~");
}
        out.flush();
    }
}

// } Driver Code Ends


class Solution {
    static int leftIndex(int N, int arr[], int X) {
        // code here
        for(int i=0;i<=N-1;i++){
            if(arr[i]==X){
                
                 return i;
            }
           
        }
         return -1;
    }
}