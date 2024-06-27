package Stack;

import java.util.Stack;

public class SortStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(7);
        stack.push(6);
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);

        System.out.println("Original Stack: " + stack);
        SortStack sort = new SortStack();
        sort.sortStack(stack);
        System.out.println("Sorted Stack: " + stack);
    }

    public void sortedInsert(Stack<Integer> stack, int num) 
    {
        if (stack.isEmpty() || stack.peek() < num) 
        {
            stack.push(num);
            return;
        }
        int temp = stack.pop();
        sortedInsert(stack, num);
        stack.push(temp);
    }

    public void sortStack(Stack<Integer> stack) 
    {
        if (stack.isEmpty()) 
        {
            return;
        }
        int num = stack.pop();
        sortStack(stack);
        sortedInsert(stack, num);
    }
}
