package Search;

public class SqrtIntegerBS {

    public static int binarySearch(int x) {
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

    public double morePrecision(int n, int precision) {
        double ans = binarySearch(n);
        double factor = 1.0;

        for (int i = 0; i < precision; i++) 
        {
            factor /= 10.0;
            for (double j = ans; j * j < n; j += factor) {
                ans = j;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        SqrtIntegerBS sqrtCalculator = new SqrtIntegerBS();

        int number = 37; 
        int precision = 3; 
        double sqrt = sqrtCalculator.morePrecision(number, precision);
        System.out.println("Square root of " + number + " with " + precision + " decimals precision: " + sqrt);
    }
}
