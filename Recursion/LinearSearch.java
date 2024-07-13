package Recursion;

public class LinearSearch {
    public static boolean linearsearch(int arr[],int n,int k,int i)
    {
        if(i>=n)
        {
            return false;
        }
        if(arr[i] == k)
        {
            return true;
        }
        else
        {
            return linearsearch(arr, n, k,i+1);
        }
    }
    public static void main(String[] args) {
        int arr[] = { 2,4,6,8,10};
        int n = arr.length;
        int k = 8;
        boolean res = linearsearch(arr, n, k, 0);
        System.out.println(res);
    }
}
