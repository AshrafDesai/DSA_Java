/*
 *  
Enter the value of n:5
1 1 
2 2 2 
3 3 3 3 
4 4 4 4 4 
 */

package Basic;
import java.util.Scanner;
public class Pattern4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n:");
        int n = sc.nextInt();
        
        for(int i=1; i<n; i++)
        {
            for(int j=0; j<=i; j++)
            {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        sc.close();
    }
    
    
}
