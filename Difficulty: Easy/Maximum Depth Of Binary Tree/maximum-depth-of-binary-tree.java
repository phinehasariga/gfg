// User function Template for Java

/*
// A Binary Tree node
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
    public static int maxDepth(Node root) {
        // code here
        if(root == null){
            return 0;
        }
        int leftheight = maxDepth(root.left);
        int rightheight = maxDepth(root.right);
        int treeheight = Math.max(leftheight,rightheight) + 1;

        return treeheight; 
    }
}
