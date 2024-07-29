package Sorting;

public class QuickSort {
    public static void quicksort(int arr[], int s, int e) {
        if (s < e) 
        { 
            int p = partition(arr, s, e);
            quicksort(arr, s, p - 1);
            quicksort(arr, p + 1, e);
        }
    }

    public static int partition(int arr[], int s, int e) {
        int pivot = arr[s];
        int count = 0;

        for (int i = s + 1; i <= e; i++) 
        {
            if (arr[i] <= pivot) 
            {
                count++;
            }
        }
        int pivotIndex = s + count;
        swap(arr, s, pivotIndex);

        
        int i = s, j = e;
        while (i < pivotIndex && j > pivotIndex) 
        {
            if (arr[i] <= pivot) 
            {
                i++;
            } 
            else if (arr[j] > pivot) 
            {
                j--;
            } 
            else 
            {
                swap(arr, i, j);
                i++;
                j--;
            }
        }

        return pivotIndex;
    }

    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    
    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};
        quicksort(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
