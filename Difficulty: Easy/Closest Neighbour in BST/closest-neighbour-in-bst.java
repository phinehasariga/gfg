/*
class Node {
    int data;
    Node left, right;

    Node(int x) {
        data = x;
        left = right = null;
    }
} */
class Solution {
    public int findMaxFork(Node root, int k) {
        // code here.
                int result = -1;
        Node current = root;
        while (current != null) {
            if (current.data == k) {
                return k;
            } else if (current.data < k) {
                result = current.data;
                current = current.right;
            } else {
                current = current.left;
            }
        }
        return result;
    }
}