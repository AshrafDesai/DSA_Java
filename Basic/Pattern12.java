/*
 * Enter the value of n:2
A
BB
CCC
 */

package Basic;
import java.util.Scanner;
public class Pattern12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n:");
        int n = sc.nextInt();
        for(int i = 0;i <= n; i++)
        {
            for(int j = 0; j <= i; j++)
            {
                System.out.print((char)('A' + i));
            }
            System.out.println();
        }
        sc.close();
    }
}
