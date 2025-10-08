/*
class Node {
    int data;
    Node left, right;

    Node(int d)
    {
        data = d;
        left = right = null;
    }
} */

class Solution {
    public boolean isBalanced(Node root) {
        // code here
        return check(root)!= -1;
        
    }
    private int check(Node root){
        if(root == null){
            return 0;
        }
        int lh = check(root.left);
        if(lh == -1){
            return -1;
        }
        int rh = check(root.right);
        if(rh == -1){
            return -1;
        }
        
        if (Math.abs(lh - rh) > 1){
            return -1;
        }
        return Math.max(lh, rh) + 1; 
    }
}