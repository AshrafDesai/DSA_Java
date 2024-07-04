package Linkedlist;
public class cycledetectLL {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    
    public static boolean hasCycle(Node head) 
    {
        if (head == null || head.next == null) {
            return false;
        }

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            if (slow == fast) 
            {
                return true;
            }
            slow = slow.next;
            fast = fast.next.next;
        }

        return false;
    }

    public static void main(String[] args) {
       
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        
        head.next.next.next = new Node(4);
        head.next.next.next.next = head.next;

        boolean hasCycle = hasCycle(head);
        if (hasCycle) {
            System.out.println("The linked list has a cycle.");
        } else {
            System.out.println("The linked list does not have a cycle.");
        }
    }
}