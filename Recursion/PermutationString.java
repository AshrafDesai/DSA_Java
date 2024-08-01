package Recursion;

public class PermutationString {
    public static void solve(char[] nums, int index) 
    {
        if (index >= nums.length) 
        {
            System.out.println(new String(nums));
            return;
        }
        for (int j = index; j < nums.length; j++) 
        {
            swap(nums, index, j);
            solve(nums, index + 1);
            swap(nums, index, j);
        }
    }
    public static void swap(char[] arr, int i, int j) 
    {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void permutation(String str) 
    {
        char[] nums = str.toCharArray();
        int index = 0;
        solve(nums, index);
    }

    public static void main(String[] args) 
    {
        permutation("abc");
    }
}
