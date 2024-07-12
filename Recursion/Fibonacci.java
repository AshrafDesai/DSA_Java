package Recursion;

import java.util.Scanner;

public class Fibonacci {

    public static int fibonacci(int n)
    {
        if(n==0)
        {
            return 0;
        }
        if(n == 1)
        {
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
    public static void Print(int n)
    {
        System.out.print("fibonacci series " + n + " terms: ");
        for(int i = 0;i<n;i++)
        {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number n : ");
        int n = sc.nextInt();
        Print(n);
        sc.close();
    }
}
