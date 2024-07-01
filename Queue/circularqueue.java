package Queue;

public class circularqueue {
    public static class Queue {
        int arr[];
        int front;
        int rear;
        int n;

        Queue(int n) {
            arr = new int[n];
            this.n = n;
            front = -1;
            rear = -1;
        }

        public boolean isEmpty() {
            return (rear == -1 && front == -1);
        }

        public boolean isFull() {
            return (rear + 1) % n == front;
        }

        public void add(int data) {
            if (isFull()) {
                System.out.println("Queue is Full");
                return;
            }
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % n;
            arr[rear] = data;
        }

        public int remove() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            int result = arr[front];
            if (front == rear) { 
                front = rear = -1;
            } else {
                front = (front + 1) % n;
            }
            return result;
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            return arr[front];
        }
    }

    public static void main(String[] args) {
        Queue queue = new Queue(5);

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        System.out.println("Peek: " + queue.peek()); 
        System.out.println("Remove: " + queue.remove());
        System.out.println("Peek after remove: " + queue.peek()); 

        queue.add(6);
        System.out.println("Peek after adding 6: " + queue.peek()); 

        while (!queue.isEmpty()) {
            System.out.println("Remove: " + queue.remove());
        }

        System.out.println("Peek when empty: " + queue.peek()); // should print "Queue is Empty" and -1
    }
}
