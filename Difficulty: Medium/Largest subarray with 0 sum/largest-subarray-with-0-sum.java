class Solution {
    int maxLength(int arr[]) {
        // code here
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        int len = 0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
            if (sum == 0) {
                len = i + 1; 
            }
            if(map.containsKey(sum)){
                len = Math.max(len,i-map.get(sum));
            }else{
                map.put(sum,i);
            }
        }
        return len;
    }
}