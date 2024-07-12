package Recursion;

import java.util.Scanner;

public class Count {
    public static void count(int n)
    {
        if(n==0)
        {
            return;
        }
        System.out.print(n + " ");
        count(n-1);
        System.out.print("\n");
        System.out.print(n + " ");
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
       
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();
        count(n);
        sc.close();
    }
}
