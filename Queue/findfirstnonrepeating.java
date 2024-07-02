package Queue;

import java.util.*;

public class findfirstnonrepeating {
    public String FirstNonRepeating(String A) {
        int[] count = new int[26];
        Queue<Character> q = new LinkedList<>(); 
        StringBuilder result = new StringBuilder(); 

        for (int i = 0; i < A.length(); i++) 
        {
            char ch = A.charAt(i);
            count[ch - 'a']++; 
            q.add(ch); 

          
            while (!q.isEmpty() && count[q.peek() - 'a'] > 1) 
            {
                q.poll();
            }

          
            if (!q.isEmpty()) 
            {
                result.append(q.peek());
            } else {
                result.append('#');
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
       
        findfirstnonrepeating solution = new findfirstnonrepeating();
        String testString = "aabc";
        String result = solution.FirstNonRepeating(testString);
        System.out.println("First non-repeating characters in the stream: " + result);
    }
}
