package Linkedlist;

public class doubleLL {
    Node head;

    class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public void insertAtHead(int data) {
        Node newNode = new Node(data);
        if (head != null) {
            newNode.next = head;
            head.prev = newNode;
        }
        head = newNode;
    }

    public void insertAtTail(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
    }

    public void delete(int data, int pos) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;
        int count = 1;

        while (temp != null && count != pos) {
            temp = temp.next;
            count++;
        }

        if (temp == null) {
            System.out.println("Position out of bounds");
            return;
        }

        if (temp.prev != null) 
        {
            temp.prev.next = temp.next;
        } 
        else 
        {
            head = temp.next; 
        }

        if (temp.next != null) {
            temp.next.prev = temp.prev;
        }
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        doubleLL dll = new doubleLL();
        dll.insertAtTail(1);
        dll.insertAtTail(2);
        dll.insertAtTail(3);
        dll.insertAtTail(4);
        dll.insertAtTail(5);

        System.out.println("Doubly Linked List:");
        dll.display();
        
        dll.insertAtHead(0);
        System.out.println("After inserting 0 at head:");
        dll.display();
        
        dll.delete(3, 3);
        System.out.println("After deleting node at position 3:");
        dll.display();
    }
}
