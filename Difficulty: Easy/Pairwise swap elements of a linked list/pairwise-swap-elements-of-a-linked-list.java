/* node class of the linked list

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

*/

class Solution {
    // Function to pairwise swap elements of a linked list.
    // It should returns head of the modified list
    public Node pairwiseSwap(Node head) {
        // code here
        Node dummy = new Node(0);
        dummy.next = head;
        Node curr = head;
        Node prev =dummy;
        while(curr != null && curr.next != null){
            Node first = curr;
            Node sec = curr.next;
            prev.next = first.next;
            first.next = sec.next;
            sec.next = first;
            prev = first;
            curr = first.next;
        }
        return dummy.next;
    }
}