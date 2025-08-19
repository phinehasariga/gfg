/* Structure of class Node is
class Node
{
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}*/

class Solution {
    public boolean isPalindrome(Node head) {
        // Your code here
        if(head == null || head.next == null) return true;
        
        Node slow = head,fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node secondhalf = reverse(slow);
        
        while(secondhalf != null){
            if(head.data != secondhalf.data){
                return false;
            }
            head = head.next;
            secondhalf = secondhalf.next;
        }
        return true;
    }
    public static Node reverse(Node head){
        Node curr = head;
        Node prev = null;
        while(curr != null){
            Node newnode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = newnode;
        }
        return prev;
    }
}