package Recursion;

public class PowerSetArr {
    
    public static void generateSubsets(int[] nums, int index, int[] subset, int subsetSize) {
       
        printSubset(subset, subsetSize);
        for (int i = index; i < nums.length; i++) 
        {
            subset[subsetSize] = nums[i];
            generateSubsets(nums, i + 1, subset, subsetSize + 1);
        }
    }

    public static void printSubset(int[] subset, int subsetSize) {
        System.out.print("{ ");
        for (int i = 0; i < subsetSize; i++) {
            System.out.print(subset[i] + " ");
        }
        System.out.println("}");
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3}; 
        int[] subset = new int[nums.length];
        System.out.println("Power Set:");
        generateSubsets(nums, 0, subset, 0);
    }
}
