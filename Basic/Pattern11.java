/*
 * ' 
Enter the value of n:3
A B C 
B C D 
C D E 
 */


package Basic;
import java.util.Scanner;
public class Pattern11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n:");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                System.out.print((char)('A' + j + i) + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
