package Queue;

import java.util.*;

public class ReverseFirstKElement {
    public Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
        Stack<Integer> s = new Stack<>();

       
        for (int i = 0; i < k; i++) {
            int val = q.peek();
            q.remove();
            s.push(val);
        }

       
        while (!s.isEmpty()) {
            int val = s.pop(); 
            q.add(val);
        }

       
        int t = q.size() - k;
        while (t-- > 0) {
            int val = q.peek();
            q.remove();
            q.add(val);
        }

        return q;
    }
}
