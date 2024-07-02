package Queue;

public class CircularTour {
    public int tour(int[] petrol, int[] distance) {
        int n = petrol.length;
        int deficit = 0; 
        int balance = 0; 
        int start = 0;  

        for (int i = 0; i < n; i++) 
        {
            balance = balance + petrol[i] - distance[i];
            
            if (balance < 0) {
                deficit = deficit + balance;
                start = i + 1;
                balance = 0;  
            }
        }
        if(deficit + balance  > 0)
        {
            return start;
        }
        else
        {
            return -1;
        }
    }

    public static void main(String[] args) {
        CircularTour tourFinder = new CircularTour();
        
        int[] petrol = { 4, 6, 7, 4 };
        int[] distance = { 6, 5, 3, 5 };
        
        int start = tourFinder.tour(petrol, distance);
        
        if (start == -1) 
        {
            System.out.println("No valid starting point found.");
        } 
        else 
        {
            System.out.println("Starting point to complete the circle: " + start);
        }
    }
}
