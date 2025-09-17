/* Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/

class Solution {
    public static Node findIntersection(Node head1, Node head2) {
        // code here.
       
        Node dummy = new Node(0); 
        Node tail = dummy;
        
        Node ptr1 = head1;
        Node ptr2 = head2;
        
        while (ptr1 != null && ptr2 != null) {
            if (ptr1.data == ptr2.data) {
                
                tail.next = new Node(ptr1.data);
                tail = tail.next;
                
                ptr1 = ptr1.next;
                ptr2 = ptr2.next;
            } else if (ptr1.data < ptr2.data) {
                ptr1 = ptr1.next;
            } else {
                ptr2 = ptr2.next;
            }
        }
        
        return dummy.next;
    }
}