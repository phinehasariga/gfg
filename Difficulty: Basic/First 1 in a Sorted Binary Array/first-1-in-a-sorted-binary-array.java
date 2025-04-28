//{ Driver Code Starts
import java.util.*;


// } Driver Code Ends

// User function Template for Java

class Solution {

    public long firstIndex(int arr[]) {
        int index  = -1;
        // Your code goes here
        int left = 0;
        int right = arr.length-1;
        while(left<=right){
            int mid = left + (right - left)/2;
            if(arr[mid] == 1){
                index = mid;
                right= mid-1;
            }
            else if(arr[mid] < 1){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        return index;
    }
}


//{ Driver Code Starts.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // Consume the newline character
        while (t-- > 0) {
            String input = sc.nextLine();
            String[] parts = input.split(" ");
            int[] arr = new int[parts.length];
            for (int i = 0; i < parts.length; i++) {
                arr[i] = Integer.parseInt(parts[i]);
            }
            Solution ob = new Solution();
            System.out.println(ob.firstIndex(arr));
        
System.out.println("~");
}
        sc.close();
    }
}
// } Driver Code Ends