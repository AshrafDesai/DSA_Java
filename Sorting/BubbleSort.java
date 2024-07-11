package Sorting;

public class BubbleSort {
    public static void bubbleSort(int arr[], int n) {
        for (int i = 0; i < n - 1; i++) 
        {
            boolean swapped = false;
            for (int j = 0; j < n - i - 1; j++) 
            {
                if (arr[j] > arr[j + 1]) 
                {
                    swap(arr, j, j + 1);
                    swapped = true;
                }
            }
            if(swapped == false)
                break;
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        int n = arr.length;

        bubbleSort(arr, n);

        System.out.println("Sorted array:");
        for (int num : arr) 
        {
            System.out.print(num + " ");
        }
    }
}
