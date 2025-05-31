class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        // code here
                int n = matrix.length;
        int left = matrix[0][0];
        int right = matrix[n-1][n-1];
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            int count = countLessOrEqual(matrix, mid);
            if (count < k) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
    
    private int countLessOrEqual(int[][] matrix, int target) {
        int count = 0;
        int n = matrix.length;
        int row = 0;
        int col = n - 1;
        
        while (row < n && col >= 0) {
            if (matrix[row][col] <= target) {
                count += col + 1;
                row++;
            } else {
                col--;
            }
        }
        return count;
    }
}