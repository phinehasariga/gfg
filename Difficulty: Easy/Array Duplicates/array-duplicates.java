class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {
        // code here
        ArrayList<Integer> duplicates = new ArrayList<>();
        // for(int i=0;i<arr.length;i++){
        //     for(int j=i+1;j<arr.length;j++){
        //         if(arr[i] == arr[j]){
        //             duplicates.add(arr[i]);
        //         }
        //     }
        // }
        Arrays.sort(arr);
        for(int i=1;i<arr.length;i++){
            if(arr[i] == arr[i-1]){
                duplicates.add(arr[i]);
            }
        }
        return duplicates;
    }
}
