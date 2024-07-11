package Search;

import java.util.Arrays;

public class AggressiveCowProblem {
    public static boolean isPossible(int[] stalls, int k, int mid) {
        int cowCount = 1;
        int lastPosition = stalls[0];

        for (int i = 1; i < stalls.length; i++) {
            if (stalls[i] - lastPosition >= mid) {
                cowCount++;
                lastPosition = stalls[i];
                if (cowCount >= k) {
                    return true;
                }
            }
        }

        return false;
    }

    public static int aggressiveCows(int[] stalls, int k) {
        Arrays.sort(stalls);

        int s = 0;
        int e = stalls[stalls.length - 1] - stalls[0];
        int ans = -1;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (isPossible(stalls, k, mid)) {
                ans = mid;
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] stalls = {1, 2, 4, 8, 9};
        int k = 3;

        int maxMinDistance = aggressiveCows(stalls, k);
        System.out.println("Maximum minimum distance for " + k + " cows: " + maxMinDistance); // Output: 3
    }
}