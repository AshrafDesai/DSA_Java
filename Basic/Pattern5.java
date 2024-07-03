/*
 * 

1 
2 3 
4 5 6 
7 8 9 10 
 */

package Basic;
import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int count = 1;

        for(int i = 0; i < 6; i++)
        {
            for(int j = 1; j <i; j++)
            {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
        sc.close();
    }
    
}
