package Search;

public class findSqrtBS {

    public static int binarySearch(int x) 
    {
        if (x == 0 || x == 1) 
        {
            return x; 
        }

        int s = 0;
        int e = x;
        int ans = -1;

        while (s <= e) 
        {
            int mid = s + (e - s) / 2;
            long square = (long) mid * mid;

            if (square == x) 
            {
                ans = mid;
                break;
            } 
            else if (square < x) 
            {
                ans = mid; 
                s = mid + 1;
            } 
            else 
            {
                e = mid - 1;
            }
        }
        return ans; 
    }
    public static int sqrtN(long N) {
        return binarySearch((int) N);
    }
    public static void main(String[] args) {
        long number = 25; 
        int sqrt = sqrtN(number);
        System.out.println("Square root of " + number + " is: " + sqrt); // Output: Square root of 16 is: 4
    }
}