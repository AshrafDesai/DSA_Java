package Stack;

import java.util.Stack;

public class Insertelementtbottom {

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
        Insertelementtbottom insert = new Insertelementtbottom();
        insert.insertAtBottom(stack, 10); 
        System.out.println("Modified Stack: " + stack);
    }

    public void insertAtBottom(Stack<Integer> stack, int x) 
    {
        if (stack.isEmpty()) 
        {
            stack.push(x);
            return;
        }
        int num = stack.pop();
        insertAtBottom(stack, x);
        stack.push(num);
    }
}
