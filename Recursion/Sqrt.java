package Recursion;

import java.util.Scanner;

public class Sqrt {
    public static double sqrt(double n)
    {
        if(n == 0 || n == 1)
        {
            return n;
        }
        double s = 0;
        double e = n;
        double ans = -1;
        while(s<=e)
        {
            double mid = s + (e-s)/2;
            double square = mid * mid;
            if(square==n)
            {
                ans = mid;
                break;
            }
            else if(square<n)
            {
                ans = mid;
                s = mid + 0.1;
            }
            else
            {
                e = mid - 0.1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        double n = sc.nextDouble();
        double ans = sqrt(n);
        System.out.print("Square of " + n + " is: " + ans);
        sc.close();
    }
}
