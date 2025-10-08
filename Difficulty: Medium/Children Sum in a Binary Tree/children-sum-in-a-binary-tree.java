/*
class Node{
    int data;
    Node left,right;

    Node(int key)
    {
        data = key;
        left = right = null;
    }
}
*/
class Solution {
    public boolean isSumProperty(Node root) {
        //  code here
        if (root == null || (root.left == null && root.right == null)) {
            return true;
        }

        int leftVal = 0, rightVal = 0;

        if (root.left != null)
            leftVal = root.left.data;

        if (root.right != null)
            rightVal = root.right.data;


        return (root.data == leftVal + rightVal)
                && isSumProperty(root.left)
                && isSumProperty(root.right);
    }
}