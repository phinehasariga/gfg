/* The structure of linked list is the following
class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}
*/

class Solution {
    // Function to remove duplicates from unsorted linked list.
    public Node removeDuplicates(Node head) {
        // Your code here
        Node curr = head;
        
        while(curr != null){
            Node j = curr;
            while(j.next != null){
                if(j.next.data == curr.data){
                    j.next = j.next.next;
                }
                else{
                    j = j.next;
                }
            }
            curr = curr.next;
        }
        return head;
        
    }
}