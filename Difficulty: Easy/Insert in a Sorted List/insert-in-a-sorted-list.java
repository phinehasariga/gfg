/*class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }*/

// sortedInsert method should return the head of the modified linked list.
class Solution {
    Node sortedInsert(Node head, int key) {
        // Add your code here.
        
        Node newnode = new Node(key);
        if (head == null || key <= head.data) {
            newnode.next = head;
            return newnode;
        }
        Node curr = head;
        while (curr.next != null && curr.next.data < key) {
            curr = curr.next;
        }
        
        newnode.next = curr.next;
        curr.next = newnode;
        
        
        return head;
    }
}