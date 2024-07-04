/*
 * Enter the value of n: 4

A 
B C 
D E F 
G H I J 
 */

package Basic;
import java.util.Scanner;

public class Pattern13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        
        int count = 0; 
        
        for (int i = 0; i <= n; i++) 
        { 
            for (int j = 1; j <= i; j++) 
            {
                System.out.print((char)('A' + count ) + " ");
                count++;
            }
            System.out.println();
        }
        sc.close();
    }
}
