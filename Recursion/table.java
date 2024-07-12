package Recursion;

import java.util.Scanner;

public class table {

    public static  void mult(int n,int i)
    {
        if(i>10)
        {
            return;
        }
        System.out.println(n + "x" + i + "=" + (n*i));
        mult(n,i+1);
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the value of n:");
        n = sc.nextInt();
        mult(n,1);
        sc.close();
    }
    
}
