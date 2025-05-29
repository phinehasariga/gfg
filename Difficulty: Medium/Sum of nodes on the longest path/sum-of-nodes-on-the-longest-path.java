/*
class Node {
    int data;
    Node left, right;

    public Node(int data){
        this.data = data;
    }
} */
class Solution {
    
    private int maxSum = 0;
    private int maxLength = 0;
    
    public int sumOfLongRootToLeafPath(Node root) {
        // code here
                if (root == null) return 0;
        dfs(root, 0, 0);
        return maxSum;
    }
    
    private void dfs(Node node, int currentLength, int currentSum) {
        if (node == null) return;
        
        currentSum += node.data;
        currentLength += 1;
        
        if (node.left == null && node.right == null) {
            if (currentLength > maxLength) {
                maxLength = currentLength;
                maxSum = currentSum;
            } else if (currentLength == maxLength) {
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }
        } else {
            dfs(node.left, currentLength, currentSum);
            dfs(node.right, currentLength, currentSum);
        }
        
    }
}