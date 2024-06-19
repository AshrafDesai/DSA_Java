import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4}; 
        int[] result = product(arr);
        System.out.println("Product of array except self: " + Arrays.toString(result));
    }

    public static int[] product(int[] arr) {
        int[] left = new int[arr.length];
        int[] right = new int[arr.length];
        int[] ans = new int[arr.length];

        left[0] = 1;
        for (int i = 1; i < arr.length; i++) {
            left[i] = left[i - 1] * arr[i - 1];
        }

        right[arr.length - 1] = 1;
        for (int i = arr.length - 2; i >= 0; i--) {
            right[i] = right[i + 1] * arr[i + 1];
        }

        for (int i = 0; i < arr.length; i++) {
            ans[i] = left[i] * right[i];
        }

        return ans;
    }
}
