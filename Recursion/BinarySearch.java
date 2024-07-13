package Recursion;

public class BinarySearch 
{
    public static boolean binarySearch(int arr[],int s,int e,int k)
    {
        if(s>e)
        {
            return false;
        }
        int mid  = s + (e - s)/2;
        if (arr[mid] == k) {
            return true;
        }
        if(arr[mid] < k)
        {
            return binarySearch(arr, mid+1,e,k);
        }
        else
        {
            return binarySearch(arr, s,mid-1, k);
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10,14,16};
       
        int s = 0;
        int e = arr.length-1;
        int k = 10;
        boolean ans = binarySearch(arr,s,e,k);
        System.out.println(ans);
    }
}
