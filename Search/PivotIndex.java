package Search;

public class PivotIndex {
    
    public static int pivotIndex(int[] nums) {
        int totalSum = 0;
        int leftSum = 0;
        for (int num : nums) 
        {
            totalSum = totalSum + num;
        }
        for (int i = 0; i < nums.length; i++) 
        {
            if (leftSum == totalSum - leftSum - nums[i]) 
            {
                return i;
            }
            leftSum = leftSum + nums[i];
        }
        
        
        return -1;
    }

    public static void main(String[] args) 
    {
        
        int[] nums = {1, 7, 3, 6, 5, 6};
        int pivotIndex = pivotIndex(nums);
        System.out.println("Pivot Index: " + pivotIndex); // Output: 3
    }
}
