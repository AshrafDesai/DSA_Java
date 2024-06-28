package Stack;

import java.util.Stack;

public class CelebrityProblem {

    private boolean knows(int[][] arr, int a, int b) 
    {
        return arr[a][b] == 1;
    }

    public int findCelebrity(int[][] arr, int n) 
    {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            stack.push(i);
        }
        while (stack.size() > 1) 
        {
            int a = stack.pop();
            int b = stack.pop();
            if (knows(arr, a, b)) 
            {
                stack.push(b);
            } 
            else 
            {
                stack.push(a);
            }
        }
        int candidate = stack.pop();
        for (int i = 0; i < n; i++) 
        {
            if (i != candidate && (knows(arr, candidate, i) || !knows(arr, i, candidate))) 
            {
                return -1;
            }
        }
        return candidate;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {0, 1, 1},
            {0, 0, 0},
            {0, 1, 0}
        };
        CelebrityProblem cp = new CelebrityProblem();
        int n = 3; 
        int result = cp.findCelebrity(matrix, n);
        if (result == -1) 
        {
            System.out.println("No celebrity found");
        }  
        else 
        {
            System.out.println("Celebrity is person " + result);
        }
    }
}
