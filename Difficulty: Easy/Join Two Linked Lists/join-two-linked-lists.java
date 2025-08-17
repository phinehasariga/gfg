/*
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
}
*/
class Solution {
    public Node joinTheLists(Node head1, Node head2) {
        // code here
        Node curr = head1;
        while(curr.next != null){
            curr = curr.next;
        }
        curr.next = head2;
        return head1;
    }
}
