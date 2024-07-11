package Sorting;

public class InsertionSort {
    
    public static void insertionSort(int arr[], int n) 
    {
        for (int i = 1; i < n; i++) 
        {
            int temp = arr[i];
            int j = i - 1;
            
            while (j >= 0 && arr[j] > temp) 
            {
                arr[j + 1] = arr[j];
                j--;
            }
            
            arr[j + 1] = temp;
        }
    }

    public static void main(String[] args) 
    {
        int[] arr = {12, 11, 13, 5, 6};
        int n = arr.length;
        
        System.out.println("Before sorting:");
        printArray(arr, n);
        
        insertionSort(arr, n);
        
        System.out.println("After sorting:");
        printArray(arr, n);
    }
    
    public static void printArray(int[] arr, int n) 
    {
        for (int i = 0; i < n; i++) 
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
