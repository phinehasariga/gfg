/*complete the given function*/

/* class Node{
    int data;
    Node left,right;
    Node(int d)
    {
        data=d;
        left=null;
        right=null;
    }
}*/

class Solution {
    public static boolean isSubtree(Node T, Node S) {
        // add code here.
        if(T == null){
            return false;
        }
        if(T.data == S.data){
            if(isidentical(T,S)){
                return true;
            }
        }
        return isSubtree(T.left,S) || isSubtree(T.right,S);
    }
    public static boolean isidentical(Node t , Node s){
        if(t == null && s== null){
            return true;
        }
        if(t == null || s == null || t.data != s.data){
            return false;
        }
        if(!isidentical(t.left,s.left)){
            return false;
        }
        if(!isidentical(t.right,s.right)){
            return false;
        }
        return true;
    }
    
    
}