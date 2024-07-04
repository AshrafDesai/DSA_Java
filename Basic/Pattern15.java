/*
 *  
Enter the value of n:4

D 
C D 
B C D 
A B C D 
 */

package Basic;
import java.util.Scanner;
public class Pattern15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n:");
        int n = sc.nextInt();
        for(int i = 0; i <=n; i++)
        {
            for(int j = 1; j <= i;j++)
            {
                System.out.print((char)('A' + n - 1 - i + j) + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
