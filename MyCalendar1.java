import java.util.ArrayList;
import java.util.List;

public class MyCalendar1 
{
    private List<int[]> events;
    public MyCalendar1() {
        events = new ArrayList<>();
    }
    
    public boolean book(int start, int end) {
        for (int[] event : events) {
            if (start < event[1] && end > event[0]) {
                return false; 
            }
        }
        events.add(new int[]{start, end});
        return true; 
    }
      
    public static void main(String[] args) {
        MyCalendar1 myCalendar = new MyCalendar1();
        System.out.println(myCalendar.book(10, 20)); // true
        System.out.println(myCalendar.book(15, 25)); // false
        System.out.println(myCalendar.book(20, 30)); // true
    }
}
