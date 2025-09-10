/*
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
    public static int fractional_node(Node head, int k) {
        // Your code here
        int n = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            n++;
        }
        int targetIndex = (int) Math.ceil((double) n / k);

        
        temp = head;
        for (int i = 1; i < targetIndex; i++) {
            temp = temp.next;
        }

        return temp.data;
    }
}