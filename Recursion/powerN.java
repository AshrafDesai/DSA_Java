package Recursion;

import java.util.Scanner;

public class powerN {

    public static int power(int n)
    {
        if(n == 0)
        {
            return 1;
        }
        
        return 2 * power(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the value of n :");
        n = sc.nextInt();
        int ans = power(n);
        System.out.println(ans);
        sc.close();
    }
    
}
