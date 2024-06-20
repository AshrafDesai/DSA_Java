import java.util.ArrayList;
import java.util.List;



public class MyCalendarThree {
    private List<int[]> events;

    public MyCalendarThree() {
        events = new ArrayList<>();
    }
    public boolean book(int start, int end){
        int activeEvents = 0;

        for(int[] event:events) {
            if(start < event[1] && end > event[0]){
                activeEvents++;
                if(activeEvents>=2){
                    return false;
                }
            }
        }
        events.add(new int[] {start,end});
        return true;
    }
    public static void main(String[] args) {
        MyCalendarThree myCalendarThree = new MyCalendarThree();
        System.out.println(myCalendarThree.book(10,20));
        System.out.println(myCalendarThree.book(15,25));
        System.out.println(myCalendarThree.book(20,30));
        System.out.println(myCalendarThree.book(17,22));
    }
}
