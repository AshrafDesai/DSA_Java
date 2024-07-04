/*
 * Enter the value of n:4
****
***
**
*
 */

package Basic;
import java.util.Scanner;

public class Pattern17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n:");
        int n = sc.nextInt();

        for(int i = n; i > 0; i--)
        {
            for(int j = 0; j<i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
    
}
