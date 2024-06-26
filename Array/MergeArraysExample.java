public class MergeArraysExample {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};

        
        int[] mergedArray = mergeArrays(arr1, arr2);

        
        System.out.println("Merged Array:");
        printArray(mergedArray);
    }

    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int length1 = arr1.length;
        int length2 = arr2.length;
        int[] mergedArray = new int[length1 + length2];

       
        System.arraycopy(arr1, 0, mergedArray, 0, length1);

        
        System.arraycopy(arr2, 0, mergedArray, length1, length2);

        return mergedArray;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
