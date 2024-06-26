import java.util.Arrays;

public class rotatearray {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        rotatearray solution = new rotatearray();

        int[] arr1 = {1, 2, 3, 4, 5, 6, 7};
        int k1 = 3;
        solution.rotate(arr1, k1);
        System.out.println("Rotated array: " + Arrays.toString(arr1));

        int[] arr2 = {-1, -100, 3, 99};
        int k2 = 2;
        solution.rotate(arr2, k2);
        System.out.println("Rotated array: " + Arrays.toString(arr2)); 
    }
}
