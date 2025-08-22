/* Structure of node
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
} */

class Solution {

    // Function to find the data of kth node from
    // the end of a linked list.
    int getKthFromLast(Node head, int k) {
        // Your code here
                if (head == null) return -1;

        Node fast = head;
        Node slow = head;

        // Step 1: Move fast pointer k steps ahead
        for (int i = 0; i < k; i++) {
            if (fast == null) return -1; // k > length of list
            fast = fast.next;
        }

        // Step 2: Move both until fast reaches the end
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        // Now slow is at kth node from the end
        return slow.data;
          
    }
}