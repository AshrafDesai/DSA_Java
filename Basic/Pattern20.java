/*
 * Enter the value of n: 4
      1 
    2 2 
  3 3 3 
4 4 4 4 
 */
package Basic;
import java.util.Scanner;

public class Pattern20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) 
        {
            
            for (int j = i; j < n; j++) {
                System.out.print("  ");
            }
            
            for (int k = 1; k <= i; k++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
