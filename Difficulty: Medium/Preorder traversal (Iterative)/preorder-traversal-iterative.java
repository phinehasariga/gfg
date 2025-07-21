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
class Tree {
    // Return a list containing the Preorder traversal of the given tree
    ArrayList<Integer> preOrder(Node root) {
        // Code
        ArrayList<Integer> result = new ArrayList<>();
        if(root == null){
            return result;
        }
        Stack<Node> s1 = new Stack<>();
        s1.push(root);
        while(!s1.isEmpty()){
            Node currnode = s1.pop();
            result.add(currnode.data);
            if(currnode.right != null){
                s1.push(currnode.right);
            }
            if(currnode.left != null){
                s1.push(currnode.left);
            }

        }
        return result;
    }
}