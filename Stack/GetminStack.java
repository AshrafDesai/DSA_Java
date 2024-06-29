package Stack;

import java.util.Stack;

public class GetminStack 
{
    Stack<Integer> stack;
    int mini;

    public GetminStack() 
    {
        stack = new Stack<>();
        mini = Integer.MAX_VALUE;
    }

    public void push(int data) 
    {
        if (stack.isEmpty()) 
        {
            stack.push(data);
            mini = data;
        } 
        else 
        {
            if (data < mini) 
            {
                int val = 2 * data - mini;
                stack.push(val);
                mini = data;
            } else {
                stack.push(data);
            }
        }
    }

    public int pop() 
    {
        if (stack.isEmpty()) 
        {
            System.out.println("Stack is Empty!");
        }

        int curr = stack.pop();
        int poppedValue;

        if (curr < mini) 
        {
            poppedValue = mini;
            mini = 2 * mini - curr;
        } 
        else 
        {
            poppedValue = curr;
        }

        return poppedValue;
    }

    public int getMin() 
    {
        if (stack.isEmpty()) 
        {
            System.out.println("Stack is Empty!");
        }
        return mini;
    }

    public static void main(String[] args) 
    {
        GetminStack minStack = new GetminStack();
        minStack.push(3);
        minStack.push(5);
        minStack.push(2);
        minStack.push(1);

        System.out.println("Minimum element in the stack: " + minStack.getMin()); // Should print 1

        minStack.pop();
        System.out.println("After popping, minimum element in the stack: " + minStack.getMin()); // Should print 2
    }
}
