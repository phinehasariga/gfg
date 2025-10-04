class Solution {
    public List<Integer> frequencyCount(int[] arr) {
        // code here
                int n = arr.length;
        int[] freq = new int[n + 1]; // index 0 unused
        
        
        for (int num : arr) {
            if (num >= 1 && num <= n) {
                freq[num]++;
            }
        }
        
       
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            result.add(freq[i]);
        }
        
        return result;
    }
}
