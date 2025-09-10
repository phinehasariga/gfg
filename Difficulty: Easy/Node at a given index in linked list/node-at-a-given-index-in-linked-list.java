/*node class of the linked list
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
    public int GetNth(Node head, int index) {
        // Code here
        if(index == 1){
            return head.data;
        }
        Node curr = head;
        for(int i=1;i<index && curr != null ;i++){
                curr = curr.next;
        }
        if (curr == null) {
            return -1;  
        }
        return curr.data;
    }
}