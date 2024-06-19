public class revarr {
    public static void main(String[] args) 
    {
        int[] arr = {2,4,6,8,10};

        System.out.println("Original Array:");
        printArray(arr);
        reverseArray(arr);
        System.out.println("Reverse Array:");
        printArray(arr);
    }

    public static void reverseArray(int[] arr)
    {
        int s = 0;
        int e = arr.length - 1;
        while(s<e){
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }
    public static void printArray(int[] arr) {
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
}
