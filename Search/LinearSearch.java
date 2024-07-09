package Search;
public class LinearSearch {

    public static int linearSearch(int[] array, int key) {
        
        for (int i = 0; i < array.length; i++) 
        {
            
            if (array[i] == key) 
            {
                return i;
            }
        }
        
        return -1;
    }

    public static void main(String[] args) {
        int[] array = { 10, 30, 50, 70, 90, 110 };
        int key = 50;
        int index = linearSearch(array, key);
        
        if (index != -1) 
        {
            System.out.println("Element " + key + " found at index " + index);
        } 
        else 
        {
            System.out.println("Element " + key + " not found in the array");
        }
    } 
}
