package Queue;
import java.util.*;
public class FirstNegativeInWindow 
{
    public static List<Integer> firstNegativeInWindow(int[] arr, int k) 
    {
        List<Integer> result = new ArrayList<>();
        Deque<Integer> deque = new LinkedList<>();

        for (int i = 0; i < k; i++) 
        {
            if (arr[i] < 0) 
            {
                deque.addLast(i);
            }
        }

        for (int i = k; i < arr.length; i++) {
            
            if (!deque.isEmpty()) 
            {
                result.add(arr[deque.peekFirst()]);
            } 
            else 
            {
                result.add(0);
            }
            while (!deque.isEmpty() && deque.peekFirst() <= i - k) {
                deque.pollFirst();
            }

            if (arr[i] < 0) 
            {
                deque.addLast(i);
            }
        }

        if (!deque.isEmpty()) 
        {
            result.add(arr[deque.peekFirst()]);
        } 
        else 
        {
            result.add(0);
        }
        return result;
    }

    public static void main(String[] args) 
    {
        int[] arr = {12, -1, -7, 8, 15, 30, 16, 28};
        int k = 2;
        List<Integer> result = firstNegativeInWindow(arr, k);
        System.out.println("First negative integer in every window of size " + k + ": " + result);
    }
}
