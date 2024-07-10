package Search;

public class PeakElement {

    public static int findPeakElement(int[] arr) 
    {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) 
        {
            int mid = left + (right - left) / 2;

            if (arr[mid] > arr[mid + 1]) 
            {
                right = mid;
            } 
            else 
            {
                left = mid + 1;
            }
        }
        return left; 
    }

    public static void main(String[] args) 
    {
        int[] array = {1, 3, 20, 40, 1, 0};
        int peakIndex = findPeakElement(array);
        System.out.println("Peak element is at index: " + peakIndex);
        System.out.println("Peak element is: " + array[peakIndex]);
    }
}
