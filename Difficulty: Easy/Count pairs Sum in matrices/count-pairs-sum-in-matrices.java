class Solution {
    int countPairs(int[][] mat1, int[][] mat2, int x) {
        // code here
                List<Integer> list1 = flattenMatrix(mat1);
        List<Integer> list2 = flattenMatrix(mat2);
        
        int count = 0;
        int left = 0;
        int right = list2.size() - 1;
        
        while (left < list1.size() && right >= 0) {
            int sum = list1.get(left) + list2.get(right);
            if (sum == x) {
                int a = list1.get(left);
                int b = list2.get(right);
                int leftCount = 0;
                int rightCount = 0;
                
                // Count duplicates in list1
                while (left < list1.size() && list1.get(left) == a) {
                    left++;
                    leftCount++;
                }
                
                // Count duplicates in list2
                while (right >= 0 && list2.get(right) == b) {
                    right--;
                    rightCount++;
                }
                
                count += leftCount * rightCount;
            } else if (sum < x) {
                left++;
            } else {
                right--;
            }
        }
        
        return count;
    }
    
    private List<Integer> flattenMatrix(int[][] mat) {
        List<Integer> list = new ArrayList<>();
        for (int[] row : mat) {
            for (int num : row) {
                list.add(num);
            }
        }
        return list;
    }
}