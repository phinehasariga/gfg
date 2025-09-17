/* Structure of LinkedList
class Node
{
    int data;
    Node next;
    Node(int d)
    {
        data = d;
        next = null;
    }
}
*/
class Solution {
    boolean isCircular(Node head) {
        // Your code here
        if (head == null) {
            return false;
        }
        Node curr = head.next;
        while(curr != null && curr != head){
            curr = curr.next;
        }
        return curr == head;
    }
}