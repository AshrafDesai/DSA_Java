/*
 * Enter the value of n: 4
1 2 3 4 
1 2 3 4 
1 2 3 4 
1 2 3 4 
 */

package Basic;
import java.util.Scanner;
public class Pattern1 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) 
        {
            for (int j = 1; j <= n; j++) 
            {
                System.out.print(j + " ");
                //System.out.print(n-j+1 + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
