package Queue;

public class queueImpl {
    int[] arr;
    int front;
    int rear;
    int size; 

    
    public queueImpl(int n) 
    {
        arr = new int[n];
        front = -1;
        rear = -1;
        size = n; 
    }

    
    public void push(int x) 
    {
        if (rear == size - 1) 
        {
            System.out.println("Queue overflow");
            return;
        }
        if (front == -1) 
        {
            front = 0;
        }
        rear++;
        arr[rear] = x;
    }

    
    public void pop() 
    {
        if (front == -1 || front > rear) 
        {
            System.out.println("Queue is Empty");
            return;
        }
        System.out.println("Removing " + arr[front]);
        front++;
    }

   
    public int peek() 
    {
        if (front == -1 || front > rear) 
        {
            System.out.println("Queue is Empty");
            return -1;
        }
        return arr[front];
    }

   
    public boolean isEmpty() 
    {
        return (front == -1 || front > rear);
    }

    
    public static void main(String[] args) 
    {
        queueImpl q = new queueImpl(5);

        q.push(5);
        q.push(10);
        q.push(12);

        System.out.println("Front element is: " + q.peek());
        
        q.pop();
        System.out.println("Front element after pop is: " + q.peek());

        q.push(15);

        System.out.println("Is queue empty " + q.isEmpty());

        q.pop();
        q.pop();
        q.pop();

        System.out.println("Is queue empty after popping all elements" + q.isEmpty());
    }
}
