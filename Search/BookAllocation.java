package Search;

public class BookAllocation {
    public static boolean isPossible(int[] time, int n, int m, int mid) 
    {
        int studentCount = 1;
        int pageSum = 0;
        for (int i = 0; i < n; i++) 
        {
            if (pageSum + time[i] <= mid) 
            {
                pageSum = pageSum + time[i];
            } 
            else 
            {
                studentCount++;
                if (studentCount > m || time[i] > mid) 
                {
                    return false;
                }
                pageSum = time[i];
            }
        }
        return true;
    }

    public static long bookAllocationt(int n, int m, int[] time)
    {
        int s = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) 
        {
            sum = sum + time[i];
        }
        int e = sum;
        int ans = -1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (isPossible(time, n, m, mid)) {
                ans = mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        
        int n = 4;
        int m = 2;
        int[] time = {12, 34, 67, 90};
        
        long result =bookAllocationt(n, m, time);
        System.out.println("Minimum maximum time: " + result);
    }
}

