package Recursion;

import java.util.Scanner;

public class SayDigit {
    
    public static void sayDigit(int n, String[] arr) 
    {
        if (n == 0) 
        {
            return;
        }
        int digit = n % 10;
        n = n / 10;
        sayDigit(n, arr);
        System.out.print(arr[digit] + " ");
    }
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        
        String[] arr = {"zero", "one", "two", "three", "four", "five",
                        "six", "seven", "eight", "nine"};
        
        sayDigit(n, arr);
        
        sc.close();
    }
}
