package Stack;

import java.util.Stack;

public class nextsmallerelement {

    public int[] nextSmall(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        for (int i = n - 1; i >= 0; i--) 
        {
            int current = arr[i];
            while (stack.peek() != -1 && stack.peek() >= current) 
            {
                stack.pop();
            }
            result[i] = stack.peek();
            stack.push(current);
        }
        return result;
    }
    public static void main(String[] args) 
    {
        nextsmallerelement nse = new nextsmallerelement();
        int[] arr = {4, 8, 5, 2, 25};
        int[] result = nse.nextSmall(arr);

        System.out.println("Original array: ");
        for (int num : arr) 
        {
            System.out.print(num + " ");
        }

        System.out.println("\nNext smaller elements: ");
        for (int num : result) 
        {
            System.out.print(num + " ");
        }
    }
}
