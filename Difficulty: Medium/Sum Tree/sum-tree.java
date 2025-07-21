/* A Binary Tree node
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/
class Solution {
    boolean isSumTree(Node root) {
        // Your code here
        if (root == null || (root.left == null && root.right == null)) {
            return true;
        }

        int leftSum = sum(root.left);
        int rightSum = sum(root.right);

        if (root.data == leftSum + rightSum &&
            isSumTree(root.left) &&
            isSumTree(root.right)) {
            return true;
        }

        return false;
    }

    public static int sum(Node root) {
        if (root == null) {
            return 0;
        }

        return root.data + sum(root.left) + sum(root.right);

        
    }
}