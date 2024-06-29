package Stack;

public class StackImpl {
    int[] arr;
    int top;
    int size;

    
    public StackImpl(int n) {
        arr = new int[n];
        top = -1;
        size = n;
    }

    public void push(int x) 
    {
        if (top == size - 1) 
        {
            System.out.println("Stack overflow");
            return;
        }
        top++;
        arr[top] = x;
    }
    public void pop() 
    {
        if (top == -1) 
        {
            System.out.println("Stack is Empty");
            return;
        }
        System.out.println("Removing " + arr[top--]);
    }

    
    public int peek() 
    {
        if (top == -1) 
        {
            System.out.println("Stack is Empty");
            return -1;
        }
        return arr[top];
    }

    
    public boolean isEmpty() 
    {
        return (top == -1);
    }

    
    public static void main(String[] args) {
        StackImpl stack = new StackImpl(5);

        stack.push(5);
        stack.push(10);
        stack.push(12);

        System.out.println("Top element is: " + stack.peek());

        stack.pop();
        System.out.println("Top element after pop is: " + stack.peek());

        stack.push(15);

        System.out.println("Is stack empty " + stack.isEmpty());

        stack.pop();
        stack.pop();
        stack.pop();

        System.out.println("Is stack empty after popping all elements " + stack.isEmpty());
    }
}
