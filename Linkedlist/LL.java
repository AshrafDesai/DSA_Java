package Linkedlist;

public class LL 
{
    Node head;
    class Node 
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    public void addfirst(int data) 
    {
        Node newNode = new Node(data);
        if(head == null)
        {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addlast(int data)
    {
        Node newNode = new Node(data);
        if(head == null)
        {
            head = newNode;
            return;
        }

        Node currNode = head;
        while(currNode.next != null)
        {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }
    
    public boolean remove(int data)
    {
        if(head == null) 
        {
            return false;
        }
        if(head.data == data)
        {
            head = head.next;
            return true;
        }
        Node current = head;
        while(current.next != null)
        {
            if(current.next.data == data)
            {
                current.next = current.next.next;
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void deletefirst()
    {
        if(head == null)
        {
            System.out.println("List is empty");
            return;
        }
        head = head.next;
    }

    public void deletelast()
    {
        if(head == null)
        {
            System.out.println("List is empty");
            return;
        }
        if(head.next == null)
        {
            head = null;
            return;
        }
        Node secondlast = head;
        Node lastNode = head.next;
        while(lastNode.next != null)
        {
            lastNode = lastNode.next;
            secondlast = secondlast.next;
        }
        secondlast.next = null;
    }

    public void display() 
    {
        if(head == null)
        {
            System.out.println("List is empty");
            return;
        }
        Node current = head;
        while (current != null) 
        {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("NULL");
    }

    // Main method to test the LinkedList class
    public static void main(String[] args) 
    {
        LL list = new LL();
        list.addfirst(1);
        list.addfirst(2);
        list.addlast(3);
        list.addlast(4);

        System.out.println("Linked List:");
        list.display();

        System.out.println("After deleting first element:");
        list.deletefirst();
        list.display();
        
        System.out.println("After deleting last element:");
        list.deletelast();
        list.display();
    }
}
