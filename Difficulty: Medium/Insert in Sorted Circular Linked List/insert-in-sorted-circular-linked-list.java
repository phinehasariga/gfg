/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
} */

class Solution {
    public Node sortedInsert(Node head, int data) {
        // code here
                Node newNode = new Node(data);
        
        if (head == null) {
            newNode.next = newNode;
            return newNode;
        }
        
        Node current = head;
        Node prev = null;
        
        do {
            prev = current;
            current = current.next;
            if (data >= prev.data && data <= current.data) {
                break;
            }
        } while (current != head);
        
        if (data < head.data && current == head) {
            Node last = head;
            while (last.next != head) {
                last = last.next;
            }
            newNode.next = head;
            last.next = newNode;
            return newNode;
        } else {
            prev.next = newNode;
            newNode.next = current;
        }
        
        return head;
    }
}