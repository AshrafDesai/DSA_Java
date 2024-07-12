package Recursion;
import java.util.*;

public class Factorial {
    public static int factorial(int n) 
    {
        if (n == 0) {
            return 1;
        } 
        else 
        {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n:");
        int n = sc.nextInt();
        int ans = factorial(n);
        System.out.println("Factorial of " + n + " is: " + ans);
        sc.close();
    }
}
