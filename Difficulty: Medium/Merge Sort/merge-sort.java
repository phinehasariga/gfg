//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {

            ArrayList<Integer> array1 = new ArrayList<Integer>();
            String line = read.readLine();
            String[] tokens = line.split(" ");
            for (String token : tokens) {
                array1.add(Integer.parseInt(token));
            }
            ArrayList<Integer> v = new ArrayList<Integer>();
            int[] arr = new int[array1.size()];
            int idx = 0;
            for (int i : array1) arr[idx++] = i;

            new Solution().mergeSort(arr, 0, arr.length - 1);

            for (int i = 0; i < arr.length; i++) System.out.print(arr[i] + " ");

            System.out.println();

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


class Solution {

    void mergeSort(int arr[], int l, int r) {
        // code here
        if(l<r){
            int mid = l+(r-l)/2;
            mergeSort(arr,l,mid);
            mergeSort(arr,mid+1,r);
            
            conquer(arr,l,mid,r);
        }
    }
    void conquer(int arr[],int low, int mid, int high){
        int[] merged = new int[high-low+1];
        int id1 = low;
        int id2 = mid+1;
        int x = 0;
        while(id1 <= mid && id2 <=high){
            if(arr[id1]<=arr[id2]){
                merged[x++] = arr[id1++];
            }
            else{
                merged[x++] = arr[id2++];
            }
        }
        while(id1<=mid){
            merged[x++] = arr[id1++];
        }
        while(id2<=high){
            merged[x++] = arr[id2++];
        }
        
        for(int i=0,j=low;i<merged.length;i++,j++){
            arr[j] = merged[i];
        }
    }
}
