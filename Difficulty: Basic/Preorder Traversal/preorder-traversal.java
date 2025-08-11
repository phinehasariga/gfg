class Solution {
    public ArrayList<Integer> preorder(Node root) {
        //  code here
        ArrayList<Integer> elements = new ArrayList<>();
        helper(root,elements);
        return elements;
    }
    public static void helper(Node root,ArrayList<Integer> elements){
        if(root == null){
            return;
        }
        elements.add(root.data);
        helper(root.left,elements);
        helper(root.right,elements);
    }
}