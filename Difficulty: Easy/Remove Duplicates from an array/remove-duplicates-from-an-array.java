class Solution {
    ArrayList<Integer> remDuplicate(int arr[]) {
        // code here
        HashSet<Integer> set = new LinkedHashSet();
        for(int num:arr){
            set.add(num);
        }
        ArrayList<Integer> res = new ArrayList<>();
        for(int num:set){
            res.add(num);
        }
        return res;
    }
}