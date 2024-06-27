package Stack;

import java.util.Stack;

public class Redundantbraces {
    public static void main(String[] args) {
        Redundantbraces rb = new Redundantbraces();
        String expression = "(a+b)";
        boolean result = rb.findRedundant(expression);
        System.out.println("Expression: " + expression);
        System.out.println("Contains Redundant Braces: " + result);
    }

    public boolean findRedundant(String s) 
    {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) 
        {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '+' || ch == '-' || ch == '*' || ch == '/') 
            
            {
                stack.push(ch);
            } 
            else if (ch == ')') 
            {
                boolean isRedundant = true;
                while (stack.peek() != '(') 
                {
                    char top = stack.pop();
                    if (top == '+' || top == '-' || top == '*' || top == '/') {
                        isRedundant = false;
                    }
                }
                stack.pop(); 
                if (isRedundant) {
                    return true; 
                }
            }
        }
        return false;
    }
}
