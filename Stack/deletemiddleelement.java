package Stack;

import java.util.Stack;

public class deletemiddleelement {

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
        deleteMiddleElement(stack);
        System.out.println("Stack after deleting middle element: " + stack);
    }

    public static void deleteMiddleElement(Stack<Integer> stack) 
    {
        int middleIndex = stack.size() / 2;
        deleteMiddleUtil(stack, middleIndex);
    }

    private static void deleteMiddleUtil(Stack<Integer> stack, int currentIndex) {
        
        if (currentIndex == 0) {
            stack.pop();
            return;
        }

       
        int topElement = stack.pop();
        deleteMiddleUtil(stack, currentIndex - 1);
        stack.push(topElement);
    }
}
