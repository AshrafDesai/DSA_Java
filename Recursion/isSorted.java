package Recursion;

public class isSorted {
    public static boolean issorted(int arr[], int i, int n) 
    {
        if (i == n - 1) 
        {
            return true;
        }
        if (arr[i] > arr[i + 1]) 
        {
            return false;
        } 
        else 
        {
            return issorted(arr, i + 1, n);
        }
    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 10, 9};
        /*int arr[] = {2, 4, 6, 9, 8, 10};*/
        int n = arr.length;
        boolean res = issorted(arr, 0, n);
        System.out.println("Is array sorted: " + res);
    }
}
