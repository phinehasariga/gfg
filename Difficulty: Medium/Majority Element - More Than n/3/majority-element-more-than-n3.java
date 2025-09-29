class Solution {
    public ArrayList<Integer> findMajority(int[] arr) {
        // Code here
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for(Integer key : map.keySet()){
            if(map.get(key) > arr.length/3){
                res.add(key);
            }
        }
        Collections.sort(res);
        return res;
    }
}