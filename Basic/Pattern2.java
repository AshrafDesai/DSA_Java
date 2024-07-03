/*
 *1 2 3 
4 5 6 
7 8 9  
 */

package Basic;
public class Pattern2 
{
    public static void main(String[] args) 
    {
        int counter = 1;
        
        for (int i = 0; i < 3; i++) 
        {  
            
            for (int j = 0; j < 3; j++) 
            {  
                
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();  
        }
    }
}
