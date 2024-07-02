package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class InterleaveQueueWithSecondHalf {

    public static void interleaveQueue(Queue<Integer> queue) {
        int halfSize = queue.size() / 2;

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < halfSize; i++) 
        {
            stack.push(queue.poll());
        }

        while (!stack.isEmpty()) 
        {
            queue.offer(stack.pop()); 
            
            if (!stack.isEmpty()) 
            {
                queue.offer(queue.poll());
            }
        }
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        queue.offer(5);
        queue.offer(6);
   
        
        System.out.println("Original queue: " + queue);
        
        interleaveQueue(queue);
        
        System.out.println("Interleaved queue: " + queue);
    }
}
