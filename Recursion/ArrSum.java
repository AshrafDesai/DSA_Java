package Recursion;

public class ArrSum {

    public static int arrsum(int arr[],int n)
    {
        if(n <= 0)
        {
            return 0;
        }
        else
        {
            return arr[n-1] + arrsum(arr,n-1);
        }
    }
    public static void main(String[] args) {
        int arr[] = {3,2,5,1,6};
        int n = arr.length;
        int ans = arrsum(arr, n);
        System.out.println("Sum of an array is : " + ans);
    }
    
}
