package Queue;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);

        int k = 3;

        System.out.println("Original queue: " + queue);

        ReverseFirstKElement reverseFirstKElement = new ReverseFirstKElement();
        Queue<Integer> modifiedQueue = reverseFirstKElement.modifyQueue(queue, k);

        System.out.println("Modified queue: " + modifiedQueue);
    }
}
