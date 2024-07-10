package Search;

public class first_last_position_of_element {
    
    public static int firstOcc(int[] arr, int key) {
        int left = 0;
        int right = arr.length - 1; 
        int ans = -1;

        while (left <= right) 
        {
            int mid = left + (right - left) / 2;

            if (arr[mid] == key) 
            {
                ans = mid;
                right = mid - 1;
            } 
            else if (key > arr[mid]) 
            {
                left = mid + 1;
            } 
            else 
            {
                right = mid - 1;
            }
        }
        return ans;
    }

    public static int lastOcc(int[] arr, int key) {
        int left = 0;
        int right = arr.length - 1; 
        int ans = -1;

        while (left <= right) 
        {
            int mid = left + (right - left) / 2;

            if (arr[mid] == key) 
            {
                ans = mid;
                left = mid + 1; 
            } 
            else if (key > arr[mid]) 
            {
                left = mid + 1;
            } 
            else 
            {
                right = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 3, 5 };
        int key = 3;

        int firstIndex = firstOcc(array, key);
        int lastIndex = lastOcc(array, key);

        System.out.println("First Occurrence of " + key + ": " + firstIndex);
        System.out.println("Last Occurrence of " + key + ": " + lastIndex);
    }
}
/*
 * _element' 
First Occurrence of 3: 2
Last Occurrence of 3: 3
 */