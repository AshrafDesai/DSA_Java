
/*Enter the value of n : 4
A A A A 
B B B B 
C C C C 
D D D D 
*/

package Basic;

import java.util.Scanner;

public class Pattern8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                System.out.print((char)('A' + i - 1) + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
