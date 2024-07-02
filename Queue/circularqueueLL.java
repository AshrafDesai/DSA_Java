package Queue;

public class circularqueueLL {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static class Queue {
        Node head = null;
        Node tail = null;

        public boolean isEmpty() {
            return head == null;
        }

        public void add(int data) {
            Node newNode = new Node(data);
            if (tail == null) {
                tail = head = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }

        public int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            int front = head.data;
            if (head == tail) 
            {
                tail = null;
            }
            head = head.next;
            return front;
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        System.out.println("Peek: " + queue.peek()); // should print 1
        System.out.println("Remove: " + queue.remove()); // should print 1
        System.out.println("Peek after remove: " + queue.peek()); // should print 2

        queue.add(6);
        System.out.println("Peek after adding 6: " + queue.peek()); // should print 2

        while (!queue.isEmpty()) {
            System.out.println("Remove: " + queue.remove());
        }

        System.out.println("Peek when empty: " + queue.peek()); // should print "Queue is Empty" and -1
    }
}
