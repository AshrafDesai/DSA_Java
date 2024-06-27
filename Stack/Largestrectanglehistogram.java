package Stack;

import java.util.Stack;
public class Largestrectanglehistogram 
{
    public static void main(String[] args) 
    {
        int[] heights = {2, 1, 5, 6, 2, 3};
        System.out.println("Largest rectangle area: " + largestRectangleArea(heights));
    }
    public static int largestRectangleArea(int[] heights) 
    {
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        int n = heights.length;
        for (int i = 0; i <= n; i++) 
        {
            int h = (i == n ? 0 : heights[i]);
            while (!stack.isEmpty() && heights[stack.peek()] > h) 
            {
                int height = heights[stack.pop()];
                int width = stack.isEmpty() ? i : i - stack.peek() - 1;
                maxArea = Math.max(maxArea, height * width);
            }
            stack.push(i);
        }

        return maxArea;
    }
}
