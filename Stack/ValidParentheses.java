package Stack;
import java.util.Stack;
public class ValidParentheses {
    public static void main(String[] args) {
        String input1 = "()";
        String input2 = "()[]{}";
        String input3 = "(]";
        String input4 = "([)]";
        String input5 = "{[]}";

        System.out.println(isValid(input1));
        System.out.println(isValid(input2)); 
        System.out.println(isValid(input3)); 
        System.out.println(isValid(input4)); 
        System.out.println(isValid(input5)); 
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) 
        {
            char ch = s.charAt(i);

            
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } 
            
            else if (ch == ')' && !stack.isEmpty() && stack.peek() == '(') 
            {
                stack.pop();
            } 
            else if (ch == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } 
            else if (ch == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } 
            
            else 
            {
                return false;
            }
        }        
        return stack.isEmpty();
    }
}
