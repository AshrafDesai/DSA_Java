import java.util.Scanner;



public class search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        
        System.out.println("Enter the elements:");
        for(int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        
        System.out.println("\nElements in the array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        int target = 5;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == target)
            {
                System.out.println("Element found at index " + i);
                break;
            }
        }
        
    }
}