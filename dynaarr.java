import java.util.ArrayList;

public class dynaarr {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(2);
        arr.add(4);
        arr.add(6);
        arr.add(8);

        System.out.println("Elements in the array:");
        for(int i = 0; i < arr.size(); i++)
        {
            System.out.println(arr.get(i));
        }
        System.out.println("First element: " + arr.get(0));
        
        arr.set(1, 5);
        System.out.println("Modified second element: " + arr.get(1));
        for(int i = 0; i < arr.size(); i++)
        {
            System.out.println(arr.get(i));
        }
        System.out.println("Size of the ArrayList: " + arr.size());
    }
}
