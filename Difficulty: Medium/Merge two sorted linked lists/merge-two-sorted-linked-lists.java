/*
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}
*/

class Solution {
    Node sortedMerge(Node head1, Node head2) {
        // code here
        Node dummy = new Node(-1);
        Node curr = dummy;
        while(head1 != null && head2 != null){
            if(head1.data < head2.data){
                curr.next = head1;
                head1 = head1.next;
            }
            else if(head1.data > head2.data){
                curr.next = head2;
                head2 = head2.next;
            }
            else{
                curr.next = head1;
                head1 = head1.next;
                curr = curr.next;
                curr.next = head2;
                head2 = head2.next;
            }
            curr = curr.next;
        }
        if(head1 != null){
            curr.next = head1;
        }
        if(head2 != null){
            curr.next = head2;
        }
        return dummy.next;
    }
}