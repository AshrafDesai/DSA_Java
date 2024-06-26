package Stack;
import java.util.Stack;
public class reverseString {
    public static void main(String[] args)
    {
        String input = "Hello World";
        String reversed = reverseString(input);
        System.out.println(reversed);
    }
    public static String reverseString(String s)
    {
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            stack.push(s.charAt(i));
        }
        StringBuilder reversed = new StringBuilder();
        while(!stack.isEmpty())
        {
            reversed.append(stack.pop());
        }
        return reversed.toString();
    }
}
