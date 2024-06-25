package Linkedlist;

public class insertAtSpecPos {

    Node head;

    class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void insertAtHead(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void insertAtPosition(int pos, int data) {
        Node newNode = new Node(data);
        if (pos == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node temp = head;
        int currentPos = 0;
        
        while (temp != null && currentPos < pos - 1) {
            temp = temp.next;
            currentPos++;
        }

        if (temp != null) {
            newNode.next = temp.next;
            temp.next = newNode;
        } else {
            System.out.println("Position out of bounds");
        }
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        insertAtSpecPos list = new insertAtSpecPos();

        list.insertAtHead(10);
        list.insertAtHead(20);
        list.insertAtHead(30);

        list.display(); 

        list.insertAtPosition(2, 25);
        list.display();
        
        list.insertAtPosition(0, 5);
        list.display(); 

        list.insertAtPosition(5, 15);
        list.display();
        
        list.insertAtPosition(10, 35); 
        list.display();
    }
}
