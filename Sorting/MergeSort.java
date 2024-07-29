package Sorting;

import java.util.Arrays;

public class MergeSort {

    public static void merge(int arr[], int s, int e) {
        int mid = s + (e - s) / 2;
        int len1 = mid - s + 1;
        int len2 = e - mid;

        int first[] = new int[len1];
        int second[] = new int[len2];

        int k = s;
        for (int i = 0; i < len1; i++) 
        {
            first[i] = arr[k++];
        }

        int j = mid + 1;
        for (int i = 0; i < len2; i++) 
        {
            second[i] = arr[j++];
        }

        int index1 = 0;
        int index2 = 0;
        k = s; 

        while (index1 < len1 && index2 < len2) 
        {
            if (first[index1] < second[index2]) 
            {
                arr[k++] = first[index1++];
            } 
            else 
            {
                arr[k++] = second[index2++];
            }
        }

        while (index1 < len1) 
        {
            arr[k++] = first[index1++];
        }
        while (index2 < len2) 
        {
            arr[k++] = second[index2++];
        }
    }

    public static void mergeSort(int arr[], int s, int e) 
    {
        if (s >= e) 
        {
            return;
        }
        int mid = s + (e - s) / 2;
        mergeSort(arr, s, mid);
        mergeSort(arr, mid + 1, e);
        merge(arr, s, e);
    }

    public static void main(String[] args) 
    {
        int[] arr = {12, 11, 13, 5, 6, 7};
        System.out.println("Original Array: " + Arrays.toString(arr));

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}
