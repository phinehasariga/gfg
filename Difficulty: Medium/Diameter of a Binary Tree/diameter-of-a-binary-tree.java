/*
class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {
    private int maxdiameter = 0;
    int diameter(Node root) {
        // Your code here
        height(root);
        return maxdiameter;
    }
    private int height(Node root){
        if(root == null){
            return -1;
        }
        int left = height(root.left);
        int right = height(root.right);
        
        maxdiameter = Math.max(maxdiameter,left+right+2);
        
        return Math.max(left,right)+1;
    }
}