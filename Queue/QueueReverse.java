package Queue;

import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class QueueReverse 
{
    public Queue<Integer> rev(Queue<Integer> q) 
    {
        Stack<Integer> s = new Stack<>();
        while (!q.isEmpty()) 
        {
            int element = q.peek();
            q.remove();
            s.push(element);
        }
        
        while (!s.isEmpty()) 
        {
            int element = s.pop();
            q.add(element);
        }
        
        return q;
    }
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);

        System.out.println("Original queue: " + queue);
        QueueReverse queueReverse = new QueueReverse();
        Queue<Integer> reversedQueue = queueReverse.rev(queue);

        System.out.println("Reversed queue: " + reversedQueue);
    }
}
