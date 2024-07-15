package Recursion;

import java.util.Scanner;

public class power {
    public static int Power(int a,int b)
    {
        if(b==0)
        {
            return 1;
        }
        if(b==1)
        {
            return a;
        }
        int ans = Power(a,b/2);

         /* a^b = a^b/2 * a*b/2 (b is even)*/
        if(b%2==0)
        {
            return ans*ans;
        }
        /* a^b = a * (a^b/2 * a^b/2) */
        else
        {
            return a * ans * ans;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a:");
        int a = sc.nextInt();
        System.out.print("Enter the value of b:");
        int b = sc.nextInt();
        int ans = Power(a,b);
        System.out.println("Result: " + ans);
        sc.close();
    }
}
