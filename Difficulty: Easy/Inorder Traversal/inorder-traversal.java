/* A Binary Tree node

class Node {
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
}
*/
class Solution {
    // Function to return a list containing the inorder traversal of the tree.
    ArrayList<Integer> inOrder(Node root) {
        // Code
        ArrayList<Integer> elements = new ArrayList<>();
        helper(root,elements);
        return elements;
    }
    public static void helper(Node root,ArrayList<Integer> elements){
        if(root == null){
            return;
        }
        helper(root.left,elements);
        elements.add(root.data);
        helper(root.right,elements);
    }
}