/*
 * Enter the value of n : 10
1 
2 1 
3 2 1 
4 3 2 1 
5 4 3 2 1 
6 5 4 3 2 1 
7 6 5 4 3 2 1
8 7 6 5 4 3 2 1
9 8 7 6 5 4 3 2 1 
 */

package Basic;

import java.util.Scanner;

public class Pattern7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();
        for(int i = 1; i < n; i++)
        {
            for(int j = 0; j < i; j++)
            {
                System.out.print(( i - j ) + " ");
            }
            System.out.println();
        }
        sc.close();
    }
    
}
