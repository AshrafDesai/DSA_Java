package Recursion;

public class ReachHome {

    public static void reachHome(int src, int dest) 
    {
        System.out.println("Source: " + src + ", Destination: " + dest);
        if (src == dest) 
        {
            System.out.println("Reached at destination");
            return;
        }
        System.out.println("Current position: " + src);
        src++;
        reachHome(src, dest);
    }

    public static void main(String[] args) {
        int dest = 10;
        int src = 1;
        reachHome(src, dest);
    }
}
