class Solution {
    public int minDist(int[] arr, int n, int x, int y) {
        int res = Integer.MAX_VALUE;
        int ix = -1;
        int iy = -1;

        for (int i = 0; i < n; i++) {
            if (arr[i] == x) ix = i;
            if (arr[i] == y) iy = i;
            if (ix != -1 && iy != -1) res = Math.min(res, Math.abs(ix - iy));
        }

        return res == Integer.MAX_VALUE ? -1 : res;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {3, 5, 4, 2, 6, 4, 5, 3, 2};
        int n = arr.length;
        int x = 3;
        int y = 2;
        int result = sol.minDist(arr, n, x, y);
        System.out.println("Minimum distance between " + x + " and " + y + " is " + result);
    }
}
