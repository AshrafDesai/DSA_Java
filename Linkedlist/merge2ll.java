package Linkedlist;

public class merge2ll {
    Node head;
    
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node mergeTwoLists(Node first, Node second) {
        if (first == null) {
            return second;
        } 
        if (second == null) {
            return first;
        }

        if (first.data <= second.data) {
            return merge(first, second);
        } else {
            return merge(second, first);
        }
    }

    private Node merge(Node first, Node second) {
        Node curr1 = first;
        Node curr2 = second;
        Node next1 = curr1.next;
        Node next2 = curr2.next;

        while (next1 != null && curr2 != null) {
            if (curr2.data >= curr1.data && curr2.data <= next1.data) {
                curr1.next = curr2;
                next2 = curr2.next;
                curr2.next = next1;

                curr1 = curr2;
                curr2 = next2;
            } else {
                curr1 = next1;
                next1 = next1.next;

                if (next1 == null) {
                    curr1.next = curr2;
                    return first;
                }
            }
        }

        return first;
    }

    
    public void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
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

    
    public Node getHead() {
        return head;
    }

    public static void main(String[] args) {
        merge2ll list1 = new merge2ll();
        list1.addNode(1);
        list1.addNode(3);
        list1.addNode(5);

        merge2ll list2 = new merge2ll();
        list2.addNode(2);
        list2.addNode(4);
        list2.addNode(6);

        System.out.println("List 1:");
        list1.printList();

        System.out.println("List 2:");
        list2.printList();

        merge2ll mergedList = new merge2ll();
        mergedList.head = mergedList.mergeTwoLists(list1.getHead(), list2.getHead());

        System.out.println("Merged list:");
        mergedList.printList();
    }
}