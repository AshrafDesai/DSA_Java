package Search;

import java.util.ArrayList;
import java.util.List;

public class Search_rotated_sorted_Array {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arr1 = new ArrayList<>();
        arr1.add(new ArrayList<>(List.of(7, 8, 1, 3, 5)));
        arr1.add(new ArrayList<>(List.of(12, 15, 18, 2, 4)));

        ArrayList<Integer> arr2 = new ArrayList<>(List.of(8, 2));

        for (int i = 0; i < arr1.size(); i++) {
            int ans = search(arr1.get(i), arr1.get(i).size(), arr2.get(i));
            System.out.println(ans);
        }
    }

    public static int search(ArrayList<Integer> arr, int n, int k) {
        int left = 0;
        int right = n - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr.get(mid) == k) {
                return mid;
            }

            if (arr.get(left) <= arr.get(mid)) {
                if (k >= arr.get(left) && k < arr.get(mid)) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (k > arr.get(mid) && k <= arr.get(right)) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }

        return -1; 
    }
}
