/* A Binary Tree node
class Node {
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
} */

class Solution {
    // Function to return a list containing the postorder traversal of the tree.
    ArrayList<Integer> postOrder(Node root) {
        // Your code goes here
        ArrayList<Integer> elements = new ArrayList<>();
        helper(root,elements);
        return elements;
    }
    public static void helper(Node root,ArrayList<Integer> elements){
        if(root == null){
            return;
        }
        helper(root.left,elements);
        helper(root.right,elements);
        elements.add(root.data);
    }
    
    
}