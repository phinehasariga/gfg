// User function Template for Java

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
    // Return a list containing the inorder traversal of the given tree
    ArrayList<Integer> inOrder(Node root) {
        // Code
        ArrayList<Integer> result = new ArrayList<>();
        if(root == null){
            return result;
        }
        Stack<Node> s1 = new Stack<>();
        Node currnode = root;
        
        while(currnode!=null || !s1.isEmpty()){
            while(currnode != null){
                s1.push(currnode);
                currnode = currnode.left;
            }
            currnode = s1.pop();
            result.add(currnode.data);
            
            currnode = currnode.right;
        }
        return result;
    }
}