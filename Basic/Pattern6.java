/*
 * Enter the value of n : 4
1 
2 3 
3 4 5 
4 5 6 7 
 */

package Basic;
import java.util.Scanner;

public class Pattern6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
          
            for (int j = 0; j < i; j++) {
                System.out.print((i + j) + " ");
            }
           
            System.out.println();
        }
        sc.close();
    }
}
