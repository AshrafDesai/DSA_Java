package Linkedlist;

public class sort012s {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void sortList() 
    {
        int zerocount = 0;
        int onecount = 0;
        int twocount = 0;

        Node temp = head;
       
        while (temp != null) {
            if (temp.data == 0)
            {
                zerocount++;
            } 
            else if (temp.data == 1) 
            {
                onecount++;
            } 
            else if (temp.data == 2) 
            {
                twocount++;
            }
            temp = temp.next;
        }

        temp = head;
        
        while (temp != null) {
            if (zerocount != 0) {
                temp.data = 0;
                zerocount--;
            } else if (onecount != 0) {
                temp.data = 1;
                onecount--;
            } else if (twocount != 0) {
                temp.data = 2;
                twocount--;
            }
            temp = temp.next;
        }
    }

    
    public void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) 
        {
            head = newNode;
        } 
        else 
        {
            Node temp = head;
            while (temp.next != null) 
            {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }


    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        sort012s list = new sort012s();
        list.addNode(1);
        list.addNode(2);
        list.addNode(0);
        list.addNode(1);
        list.addNode(2);
        list.addNode(0);

        System.out.println("Original list:");
        list.printList();

        list.sortList();

        System.out.println("Sorted list:");
        list.printList();
    }
}
