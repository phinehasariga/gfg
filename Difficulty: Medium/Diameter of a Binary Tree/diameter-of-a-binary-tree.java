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
} */

class Solution {
    int diameter = 0;
    public int diameter(Node root) {
           height(root);
        return diameter;
    }

    private int height(Node root) {
        if (root == null) return 0;

        int lh = height(root.left);
        int rh = height(root.right);

        diameter = Math.max(diameter, lh + rh); // edges count
        return Math.max(lh, rh) + 1;
    }
}