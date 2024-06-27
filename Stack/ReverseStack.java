package Stack;

import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);

        System.out.println("Original Stack: " + stack);
        ReverseStack reverse = new ReverseStack();
        reverse.reverseStack(stack);  // Pass the stack object
        System.out.println("Modified Stack: " + stack);
    }

    public void insertAtBottom(Stack<Integer> stack, int element) 
    {
        if (stack.isEmpty()) 
        {
            stack.push(element);
            return;
        }
        int num = stack.pop();
        insertAtBottom(stack, element);
        stack.push(num);
    }

    public void reverseStack(Stack<Integer> stack) 
    {
        if (stack.isEmpty()) 
        {
            return;
        }
        int num = stack.pop();
        reverseStack(stack);
        insertAtBottom(stack, num);
    }
}
