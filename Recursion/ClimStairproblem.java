package Recursion;

import java.util.Scanner;

public class ClimStairproblem {
    public static int climbStairs(int n) {
        if (n < 0) 
        {
            return 0;
        }
        if (n == 0) 
        {
            return 1; 
        }
        
        return climbStairs(n - 1) + climbStairs(n - 2);
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of stairs: ");
        int n = sc.nextInt();
        int ways = climbStairs(n);
        System.out.println("Number of ways to climb " + n + " stairs: " + ways);
        sc.close();
    }
}
