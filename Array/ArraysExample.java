import java.util.Scanner;

public class ArraysExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        
        System.out.println("Enter the element:");
        for(int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        
        System.out.println("\nElements in the array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        
        
        if (arr.length > 0) {
            System.out.println("\nAccessing elements:");
            System.out.println("First element: " + arr[0]); 
            if (arr.length > 2) {
                System.out.println("Third element: " + arr[2]); 
            } else {
                System.out.println("Array does not have a third element.");
            }
        } else {
            System.out.println("Array is empty.");
        }
        
        
        System.out.println("\nLength of the array: " + arr.length);
        
        sc.close(); 
    }
}
