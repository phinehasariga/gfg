//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class pair  {  
    long first, second;  
    public pair(long first, long second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
}

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            long n = Long.parseLong(br.readLine().trim());
            long a[] = new long[(int)(n)];
            // long getAnswer[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            long k = Long.parseLong(br.readLine().trim());
            
            Solution obj = new Solution();
            pair ans = obj.indexes(a, k);
            if (ans.first == -1 && ans.second == -1)
                System.out.println(-1);
            else
                System.out.println(ans.first+" "+ans.second);
            
        
System.out.println("~");
}
	}
}


// } Driver Code Ends


//User function Template for Java

/*
class pair  {  
    long first, second;  
    public pair(long first, long second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
}
*/

class Solution {
    // public static class pair {
    //     long first, second;

    //     public pair(long first, long second) {
    //         this.first = first;
    //         this.second = second;
    //     }
    // }
    
    public pair indexes(long v[], long x)
    {
        // Your code goes here
        long first = -1, last = -1;
        int left = 0;
        int right = v.length-1;
        while(left<=right){
            int mid = left+(right-left)/2;
            if(v[mid]==x){
               first = mid;
                right = mid-1;
            }
            else if(v[mid]<x){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        left = 0;
        right = v.length-1;
        while(left<=right){
            int mid = left+(right-left)/2;
            if(v[mid]==x){
                last =  mid;
                left=mid+1;
            }
            else if(v[mid]<x){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        return new pair(first, last);
    }
}