public class MyCalendar1 {
    private boolean[] calendar; 
    public MyCalendar1() {
        calendar = new boolean[100]; 
    }

    public boolean book(int start, int end) {
        for (int i = start; i < end; i++) {
            if (calendar[i]) {
                return false; 
            }
        }

        
        for (int i = start; i < end; i++) {
            calendar[i] = true;
        }

        return true; 
    }

    
    public static void main(String[] args) {
        MyCalendar1 myCalendar = new MyCalendar1();
        System.out.println(myCalendar.book(10, 20)); // true
        System.out.println(myCalendar.book(15, 25)); // false
        System.out.println(myCalendar.book(20, 30)); // true
    }
}
