package Recursion;

public class Bubble {
    public static void bubble(int arr[],int n)
    {
        if(n==0 || n==1)
        {
            return;
        }
        for(int i=0;i<n-1;i++)
        {
            if(arr[i]>arr[i+1])
            {
                swap(arr,i);
            }
        }

        bubble(arr, n-1);
    }

    public static void swap(int arr[],int i)
    {
        int temp = arr[i];
        arr[i] = arr[i+1];
        arr[i+1] = temp;
    }
    public static void main(String[] args) {
        int arr[] = {2,5,1,6,9};
        bubble(arr,arr.length);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(" " + arr[i]);
        }
    }
}
