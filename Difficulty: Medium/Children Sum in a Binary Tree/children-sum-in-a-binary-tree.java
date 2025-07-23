/*Complete the function below
Node is as follows:
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
    // Function to check whether all nodes of a tree have the value
    // equal to the sum of their child nodes.
    public static int isSumProperty(Node root) {
        // add your code here
        if(root == null || (root.left == null && root.right == null)){
            return 1;
        }
        int left = 0;
        int right = 0;
        if (root.left != null) {
            left = root.left.data;
        }

        // If right child is not null, get its data.
        if (root.right != null) {
            right = root.right.data;
        }
        
        if(root.data == left + right && (isSumProperty(root.left) != 0) && (isSumProperty(root.right) != 0)) {
            
            return 1;
        }
        
        return 0;
    }
    
}