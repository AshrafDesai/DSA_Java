package Linkedlist;

public class circularLL {
    Node head;
    
    class Node {
        int data;
        Node next;
        
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            newNode.next = head; 
        } else {
            Node current = head;
            while (current.next != head) {
                current = current.next;
            }
            current.next = newNode;
            newNode.next = head;
            head = newNode;
        }
    }
    
    
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            newNode.next = head;
        } else {
            Node current = head;
            while (current.next != head) {
                current = current.next;
            }
            current.next = newNode;
            newNode.next = head;
        }
    }
    
    
    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        
        if (head.next == head) {
            head = null;
        } else {
            Node current = head;
            while (current.next != head) {
                current = current.next;
            }
            current.next = head.next;
            head = head.next;
        }
    }
    
    
    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        
        Node current = head;
        do {
            System.out.print(current.data + " -> ");
            current = current.next;
        } while (current != head);
        System.out.println("HEAD");
    }
    
    public static void main(String[] args) {
        circularLL list = new circularLL();
        list.addFirst(1);
        list.addFirst(2);
        list.addLast(3);
        list.addLast(4);
        
        System.out.println("Circular Linked List:");
        list.display();
        
        System.out.println("After deleting first element:");
        list.deleteFirst();
        list.display();
    }
}