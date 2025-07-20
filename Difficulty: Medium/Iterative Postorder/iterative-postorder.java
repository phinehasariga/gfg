// User function Template for Java

/*
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
*/
class Tree {
    ArrayList<Integer> postOrder(Node node) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        if(node == null){
            return result;
        }
        Stack<Node> s = new Stack<>();
        Stack<Node> s2 = new Stack<>();
        s.push(node);
        
        while(!s.isEmpty()){
            Node currnode = s.pop();
            s2.push(currnode);
            
            if(currnode.left != null){
                s.push(currnode.left);
            }
            if(currnode.right != null){
                s.push(currnode.right);
            }

        }
        while (!s2.isEmpty()) {
            result.add(s2.pop().data);
        }
        return result;
    }
}